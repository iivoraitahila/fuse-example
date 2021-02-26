package com.redhat.examples.fuse.service.impl;

import com.ibm.coh.ApplicantAndApplication;
import com.ibm.coh.EServicesHeaderType;
import com.ibm.coh.PortalUserType;
import com.ibm.coh.applicantregistry.ws.data.ContactInformationDTO;
import com.ibm.coh.applicantregistry.ws.data.OrganizationDTO;
import com.ibm.coh.applicantregistry.ws.data.PersonContactDTO;
import com.ibm.coh.avustus.data.AttachmentsDTO;
import com.ibm.coh.avustus.data.BusinessDTO;
import com.ibm.coh.avustus.data.FileAttachmentDTO;
import com.ibm.coh.avustus.data.GrantApplicationDTO;
import com.ibm.coh.avustus.data.SubsidiesDTO;
import com.ibm.coh.avustus.data.Subsidy;
import com.redhat.examples.fuse.model.*;
import com.redhat.examples.fuse.service.DtoTransformerService;

import fi.hel.avustus.json.*;

import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@Service("dtoTransformerService")
public class DtoTransformerServiceImpl implements DtoTransformerService {

	public DtoTransformerServiceImpl() {
	}

	public ApplicantAndApplication transform(SubventionRequest orderRequest) {
		
	
		
		System.out.println("TRANSFORMING");
		
		ApplicantAndApplication target = new ApplicantAndApplication();
		GrantApplicationDTO grant = new GrantApplicationDTO();
		target.setApplication(grant);
		
		target.setHeader(transformHeader(orderRequest));
		target.setUser(transformUser(orderRequest));
		
		SubsidiesDTO subsidies = new SubsidiesDTO();
		subsidies.setGrantYear1(orderRequest.getApplication().getSubsidies().getGrantYear1());
		subsidies.setGrantYear2(orderRequest.getApplication().getSubsidies().getGrantYear2());
		subsidies.setGrantYear3(orderRequest.getApplication().getSubsidies().getGrantYear3());
		subsidies.setLoans(orderRequest.getApplication().getSubsidies().getLoans());
		List<Subsidy> appSubs = new ArrayList<Subsidy>();
		for (AppliedSubsidy s : orderRequest.getApplication().getSubsidies().getAppliedSubsidies()) {
			Subsidy sDto = new Subsidy();
			sDto.setAmount(s.getAmount());
			sDto.setType(s.getType().toString());
			appSubs.add(sDto);
		}
		subsidies.setSubsidies(appSubs);
		subsidies.setPremises(orderRequest.getApplication().getSubsidies().getPremises());
		Subsidies s = new Subsidies();
		s.setUseOfPrevious(orderRequest.getApplication().getSubsidies().getUseOfPrevious());
		AttachmentsDTO attDto = new AttachmentsDTO();
		List<FileAttachmentDTO> fDtos = new ArrayList<FileAttachmentDTO>();
		for (File f : orderRequest.getApplication().getAttachments().getFiles()) {
			FileAttachmentDTO fDto = new FileAttachmentDTO();
			// bymail
			fDto.setDescription(f.getDescription());
			if (f.getDescriptionEditable()!=null) {
				fDto.setDescriptionEditable(f.getDescriptionEditable());
			}
			//fDto.setFileName(f.getfileName());
			fDto.setFileType(f.getFileType() != null ? f.getFileType() : 0);
			if (f.getRequired()!=null) {
				fDto.setRequired(f.getRequired());
			}
			else {
				fDto.setRequired(false);
			}
			fDtos.add(fDto);
		}
		attDto.setFiles(fDtos);
		attDto.setOther(orderRequest.getApplication().getAttachments().getOtherInformation());
		BusinessDTO bDto = new BusinessDTO();
		Business b = orderRequest.getApplication().getBusiness();
		bDto.setBusinessDescription(b.getBusinessDescription());
        bDto.setCommunityMembersSubAssociationCitizens(b.getCommunityMembersSubAssociationCitizens());
		bDto.setCommunityMembersSubdivisionAll(b.getCommunityMembersSubdivisionAll());
		bDto.setCommunityMembersSubdivisionCitizens(b.getCommunityMembersSubdivisionCitizens());
		bDto.setIsBusiness(b.getIsBusiness());
		bDto.setPersonMembersCommunityAll(b.getPersonMembersCommunityAll());
		bDto.setPersonMembersCommunityCitizens(b.getPersonMembersCommunityCitizens());
		bDto.setPersonMembersSubAssociationAll(b.getPersonMembersSubAssociationAll());
		bDto.setPersonMembersSubdivisionCitizens(b.getPersonMembersSubdivisionCitizens());
		bDto.setPersonMembershipFee(b.getPersonMembershipFee());
		
		target.setApplication(grant);
		grant.setSubsidies(subsidies);
		grant.setAttachments(attDto);
		grant.setBusiness(bDto);
		ContactInformationDTO cDto = new ContactInformationDTO();
		ContactInformation c = orderRequest.getApplication().getContactInformation();
		cDto.setApplicationYear(c.getApplicationYear());
		// td
		OrganizationDTO oDto = new OrganizationDTO();
		Organization o = new Organization();
		oDto.setAbbreviation(o.getAbbreviation());
		// td
		cDto.setOrganization(oDto);
		PersonContactDTO priv = new PersonContactDTO();
		priv.setReadOnlyWhenSaved(orderRequest.getApplication().getContactInformation().getPrivatePerson().getReadOnlyWhenSaved());
		cDto.setPrivatePerson(priv);
		
		return target;
	}

	private EServicesHeaderType transformHeader(SubventionRequest form) {
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
		
		if ("ECONOMICGRANTAPPLICATION".equals(rh.getServiceId())) {
			header.setCaseID("avustusasiointi-"+rh.getCaseId());
		}
		else {
			header.setCaseID(rh.getCaseId());
		}
		header.setFormTimestamp(xmlGregCal);
		header.setFormTitle("Avustushakemus"); 
		header.setFormVersion("1.0");
		header.setNew("true".equals(rh.getProperties().get(0).getValue()));
		header.setServiceId(rh.getServiceId());
		header.setServiceVersion("1.0");
		header.setStatus(rh.getStatus());
		return header;
	}
	
	private PortalUserType transformUser(SubventionRequest form) {
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
