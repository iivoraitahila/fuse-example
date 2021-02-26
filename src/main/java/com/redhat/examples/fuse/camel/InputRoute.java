package com.redhat.examples.fuse.camel;

import com.ibm.coh.ApplicantAndApplication;
import com.ibm.odsservice.ODSServicePort;
import com.ibm.odsservice.UpdateCitizenCaseStatusResponse;
import com.redhat.examples.fuse.model.SubventionRequest;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.dataformat.soap.SoapJaxbDataFormat;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class InputRoute extends RouteBuilder {

  @Autowired
  private Environment environment;

  @Override
  public void configure() {
    restConfiguration()
        .bindingMode(RestBindingMode.json)
        .dataFormatProperty("prettyPrint", "true")
        .enableCORS(true)
        .port(environment.getProperty("api.port", "8080"))
        .contextPath("/api");

    rest("/subventions").description("Subventions")
        .consumes("application/json")
        .produces("application/json")

        .post().description("Request a subvention")
        .type(SubventionRequest.class)
        .outType(ApplicantAndApplication.class)
        .to("direct:save-application");

    rest("/responses")
        .post()
        .to("direct:process-response");

    from("direct:save-application")
        .id("application-save")
        .streamCaching()
        .to("bean:dtoTransformerService?method=transform")
        .to("bean:serializerService?method=serialize")
        .errorHandler(deadLetterChannel("activemq:failures")) // TODO: aiheuttaa lisävirheen
        .to("bean:subventionRequestBuilder?method=createSubvention")
        .setHeader(CxfConstants.OPERATION_NAME, constant("saveApplication"))
        .setHeader(CxfConstants.OPERATION_NAMESPACE, constant("http://service.filenet.subvention.p8.tieto.com"))
        .to("cxf://https://avustushyte.hel.fi/SubventionService/subventionService"
            + "?serviceClass=com.tieto.p8.subvention.filenet.service.SubventionService"
            + "&wsdlURL=/wsdl/subventionService.wsdl");
    //.marshal().string("UTF-8"); //ISO-10646-UCS-2
//        .to("bean:orderService?method=place")
//        .wireTap("direct:send-to-web-service")
//        .to("mock:result");

    from("direct:rejected")
        .log("rejected")
        .transform().constant("REJECTED")
        .to("mock:result");

    SoapJaxbDataFormat soap = new SoapJaxbDataFormat("com.ibm.odsservice", new ServiceInterfaceStrategy(ODSServicePort.class, false));
    UpdateCitizenCaseStatusResponse response = new UpdateCitizenCaseStatusResponse();
    response.setUpdateCitizenCaseStatusReturn(1);

    from("cxf:bean:responseEndpoint")
        .log("Received a response")
        .unmarshal(soap)
        .log("${body}")
        .to("activemq:responses")
        .transform().constant(response)
        .marshal(soap)
        .to("mock:result");

    from("activemq:responses")
        .choice()
          .when()
            .simple("${body.caseId} starts with 'avustusasiointi'")
            .log("Calling endpoint avustusasiointi")
            .marshal().json(JsonLibrary.Jackson)
            .convertBodyTo(String.class) // just for visualization purposes
            .inOnly("activemq:avustusasiointi-archive")

            .process(exchange -> {
              exchange.getOut().getHeaders().clear();
              exchange.getOut().setBody(exchange.getIn().getBody());
            })
            .setHeader(Exchange.HTTP_METHOD, constant(org.apache.camel.component.http.HttpMethods.POST))
            .inOnly("http://drupal-avustusasiointi-fuse-example.apps.arodevtest.hel.fi/api/")
        .otherwise()
            .log("Couldn't find the matching endpoint")
            .marshal().json(JsonLibrary.Jackson) // just for visualization purposes
            .convertBodyTo(String.class)
            .inOnly("activemq:unprocessed")
        .end()
        .to("mock:result");

    from("direct:process-response")
        .log("Received a response")
        .log("${body}")
        .to("mock:result");

  }

}
