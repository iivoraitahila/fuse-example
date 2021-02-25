package com.ibm.coh;

import com.ibm.coh.avustus.data.GrantApplicationDTO;

/**
 * The main object that is serialized for the SOAP call
 *
 */
public class ApplicantAndApplication {

	private EServicesHeaderType header;
	private PortalUserType user;
	private GrantApplicationDTO application;
	
	
	public EServicesHeaderType getHeader() {
		return header;
	}
	public void setHeader(EServicesHeaderType header) {
		this.header = header;
	}
	public PortalUserType getUser() {
		return user;
	}
	public void setUser(PortalUserType user) {
		this.user = user;
	}
	public GrantApplicationDTO getApplication() {
		return application;
	}
	public void setApplication(GrantApplicationDTO application) {
		this.application = application;
	}
	
	
}
