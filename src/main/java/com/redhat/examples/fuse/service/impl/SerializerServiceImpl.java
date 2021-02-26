package com.redhat.examples.fuse.service.impl;

import com.ibm.coh.ApplicantAndApplication;
import com.ibm.coh.EServicesHeaderType;
import com.ibm.coh.PortalUserType;
import com.ibm.coh.avustus.data.GrantApplicationDTO;
import com.redhat.examples.fuse.service.SerializerService;

import org.springframework.stereotype.Service;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

@Service("serializerService")
public class SerializerServiceImpl implements SerializerService {

	public SerializerServiceImpl() {
	}

	public String serialize(ApplicantAndApplication application) {
		
		String result = staticHeader() 
				+ eServicesHeader(application.getHeader()) 
				+ portalUserHeader(application.getUser())
				+ "<FormData><String>"
				+ serializeApplication(application.getApplication()).replace("<", "&amp;lt;").replace(">", "&amp;gt;")
				+ "</String></FormData></_xml:COHForm>";
		
		return result.replace("<", "&lt;").replace("\"", "&quot;");
	}

	private String staticHeader() {
		return "<?xml version=\"1.0\" encoding=\"ISO-10646-UCS-2\"?>"
				+ "<_xml:COHForm xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" "
				+ "xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" "
				+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:_xml=\"http://COHFormsLib/ibm/helsinki/xml\" "
				+ "xmlns:if=\"http://COHFormsLib/COHCoreProcessIF\" xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" "
				+ "xmlns:wr=\"http://www.ibm.com/xmlns/prod/websphere/sca/multipart/wrapper/6.0.0\">";
	}
	
	private String eServicesHeader(EServicesHeaderType header) {
		return "<eServicesHeader>"
				+ "<ServiceId>" + header.getServiceId() + "</ServiceId>"
				+ "<CaseID>" + header.getCaseID() + "</CaseID>"
				+ "<ServiceVersion>" + header.getServiceVersion() + "</ServiceVersion>"
				+ "<FormVersion>" + header.getFormVersion() + "</FormVersion>"
				+ "<FormTitle>" + header.getFormTitle() + "</FormTitle>"
				+ "<Status>" + header.getStatus() + "</Status>"
				+ "<FormTimestamp>" + header.getFormTimestamp() + "</FormTimestamp>"
				+ "<Property key=\"isNew\" value=\"" + (header.isNew() ? "true" : "false") + "\"/>"
				+ "</eServicesHeader>";
	}
	
	private String portalUserHeader(PortalUserType user) {
		return "<PortalUser>"
				+ "<LastName>" + user.getLastName() + "</LastName>"
				+ "<FirstName>" + user.getFirstName() + "</FirstName>"
				+ "<PersonID>" + user.getPersonID() + "</PersonID>"
				+ (user.getStreetAddress() == null ? "<StreetAddress/>" : "<StreetAddress>" + user.getStreetAddress() + "</StreetAddress>")
				+ (user.getPostalCode() == null ? "<PostalCode/>" : "<PostalCode>" + user.getPostalCode() + "</PostalCode>")
				+ (user.getPostalName() == null ? "<PostalName/>" : "<PostalName>" + user.getPostalName() + "</PostalName>")
				+ "<Email>" + user.getEmail() + "</Email>"
				+ "<AccessUserID>" + user.getAccessUserID() + "</AccessUserID>"
				+ "</PortalUser>";
	}
	
	private String serializeApplication(GrantApplicationDTO application) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		XMLEncoder encoder = new XMLEncoder(bos);
		encoder.writeObject(application);
		encoder.close();
		String payload = "";
		try {
			payload = bos.toString("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return payload;
	}

}
