package com.redhat.examples.fuse.camel;

import com.ibm.coh.ApplicantAndApplication;
import com.redhat.examples.fuse.model.OrderRequest;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
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

    rest("/orders").description("Orders")
        .consumes("application/json")
        .produces("application/json")

        .post().description("Places an order")
        .type(OrderRequest.class)
        .outType(ApplicantAndApplication.class)
        .to("direct:place-order");

    from("direct:place-order")
        .id("order-place")
        .streamCaching()
        .to("bean:dtoTransformerService?method=transform")
        .to("bean:serializerService?method=serialize")
        //.bean(SubventionRequestBuilder.class)
        .errorHandler(deadLetterChannel("activemq:failures"))
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
        .log("I don't like Marcelo")
        .transform().constant("REJECTED")
        .to("mock:result");

    from("cxf:bean:responseEndpoint")
        .log("Received a response")
        .convertBodyTo(String.class)
        .inOnly("activemq:responses")
        .transform().constant("" +
        "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
        "   <soapenv:Header/>\n" +
        "   <soapenv:Body>\n" +
        "      <p574:updateCitizenCaseStatusResponse xmlns:p574=\"http://odsservice.ibm.com\">\n" +
        "         <updateCitizenCaseStatusReturn>1</updateCitizenCaseStatusReturn>\n" +
        "      </p574:updateCitizenCaseStatusResponse>\n" +
        "   </soapenv:Body>\n" +
        "</soapenv:Envelope>")
        .to("mock:result");

    from("activemq:responses")
        .choice()
          .when()
            .xpath("starts-with(//caseId, 'avustusasiointi')")
            .log("Calling endpoint avustusasiointi")
            .inOnly("activemq:avustusasiointi-archive")
          .otherwise()
            .inOnly("activemq:unprocessed")
        .end()
        .to("mock:result");

  }

}
