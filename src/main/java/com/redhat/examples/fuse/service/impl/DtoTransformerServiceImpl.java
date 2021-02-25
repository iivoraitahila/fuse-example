package com.redhat.examples.fuse.service.impl;

import com.ibm.coh.ApplicantAndApplication;
import com.ibm.coh.EServicesHeaderType;
import com.ibm.coh.PortalUserType;
import com.ibm.coh.applicantregistry.ws.data.ContactInformationDTO;
import com.ibm.coh.avustus.data.GrantApplicationDTO;
import com.ibm.coh.avustus.data.GrantDTO;
import com.ibm.coh.avustus.data.SubsidiesDTO;
import com.redhat.examples.fuse.model.*;
import com.redhat.examples.fuse.service.DtoTransformerService;
import com.redhat.examples.fuse.service.OrderService;

import fi.hel.avustus.json.Header;
import fi.hel.avustus.json.User;

import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@Service("dtoTransformerService")
public class DtoTransformerServiceImpl implements DtoTransformerService {

	//  private Map<Integer, Product> productsMap;
//	private OrderRequest source;

	public DtoTransformerServiceImpl() {
	}

	public ApplicantAndApplication transform(OrderRequest orderRequest) {
		
		//TODO ääkkösten enkoodaus
		
		System.out.println("TRANSFORMING");
		
		ApplicantAndApplication target = new ApplicantAndApplication();
		GrantApplicationDTO grant = new GrantApplicationDTO();
		target.setApplication(grant);
		
		target.setHeader(transformHeader(orderRequest));
		target.setUser(transformUser(orderRequest));
		
		
		
		SubsidiesDTO subsidies = new SubsidiesDTO();
		subsidies.setGrantYear1(orderRequest.getApplication().getSubsidies().getGrantYear1());
//		subsidies.setOtherSubsidies(otherSubsidies);
		
		
		
		target.setApplication(grant);
		grant.setSubsidies(subsidies);
		
		return target;
	}

	private EServicesHeaderType transformHeader(OrderRequest form) {
		Header rh = form.getHeader();
		EServicesHeaderType header = new EServicesHeaderType();
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
		XMLGregorianCalendar xmlGregCal = null;
		try {
			Date date = format.parse(rh.getFormTimestamp());
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(date);
			xmlGregCal =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		header.setCaseID(rh.getCaseId());
		header.setFormTimestamp(xmlGregCal);
		header.setFormTitle("Avustushakemus"); 
		header.setFormVersion("1.0");
		header.setNew("true".equals(rh.getProperties().get(0).getValue()));
		header.setServiceId(rh.getServiceId());
		header.setServiceVersion("1.0");
		header.setStatus(rh.getStatus());
		return header;
	}
	
	private PortalUserType transformUser(OrderRequest form) {
		User ru = form.getUser();
		PortalUserType user = new PortalUserType();
		user.setAccessUserID(ru.getUserId());
		user.setEmail(ru.getEmail());
		user.setFirstName(ru.getFirstName());
		user.setLastName(ru.getLastName());
		user.setPersonID(ru.getUserId());
		user.setPostalCode(null);
		user.setPostalName(null);
		user.setStreetAddress(null);
		return user;
	}

}
