package com.ibm.coh.applicantregistry.ws.data;



public class ContactInformationDTO {
	
	private OrganizationDTO organization;
	private OrganizationDTO loadedOrganization;
	private Integer applicationYear;
	private boolean[] selectedPersonContactsMap;
	private boolean[] selectedEmployeesMap;
	private boolean[] selectedBankAccountsMap;
	//private boolean basicInfoReadOnly = false;
	//private boolean hasValidationErrors = false;
	private String fax;
	private String email;
	private String webpages;
	
	private String applicantType;
	private String applicantTypeOther;
	private PersonContactDTO privatePerson;
	private Integer projectNumber;
	private String projectName;
	
	private Integer groupCount1;
	private Integer groupCount2;
	
	private boolean isNewCompany;
	private boolean termsAccepted;
	private boolean isDataPopulated;
	
	private String bankOwnerName;
	private String bankOwnerHetu;
	
	public OrganizationDTO getOrganization() {
		return this.organization;
	}
	public void setOrganization(OrganizationDTO organization) {
		this.organization = organization;
	}
	public Integer getApplicationYear() {
		return applicationYear;
	}
	public void setApplicationYear(Integer applicationYear) {
		this.applicationYear = applicationYear;
	}
	public boolean[] getSelectedPersonContactsMap() {
		return selectedPersonContactsMap;
	}
	public void setSelectedPersonContactsMap(boolean[] selectedPersonContactsMap) {
		this.selectedPersonContactsMap = selectedPersonContactsMap;
	}
	public boolean[] getSelectedEmployeesMap() {
		return selectedEmployeesMap;
	}
	public void setSelectedEmployeesMap(boolean[] selectedEmployeesMap) {
		this.selectedEmployeesMap = selectedEmployeesMap;
	}
	public boolean[] getSelectedBankAccountsMap() {
		return selectedBankAccountsMap;
	}
	public void setSelectedBankAccountsMap(boolean[] selectedBankAccountsMap) {
		this.selectedBankAccountsMap = selectedBankAccountsMap;
	}
	/**
	public boolean isBasicInfoReadOnly() {
		return basicInfoReadOnly;
	}
	public void setBasicInfoReadOnly(boolean basicInfoReadOnly) {
		this.basicInfoReadOnly = basicInfoReadOnly;
	}
	public boolean isHasValidationErrors() {
		return hasValidationErrors;
	}
	public void setHasValidationErrors(boolean hasValidationErrors) {
		this.hasValidationErrors = hasValidationErrors;
	}**/
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebpages() {
		return webpages;
	}
	public void setWebpages(String webpages) {
		this.webpages = webpages;
	}
	public Integer getProjectNumber() {
		return projectNumber;
	}
	public void setProjectNumber(Integer projectNumber) {
		this.projectNumber = projectNumber;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Integer getGroupCount1() {
		return groupCount1;
	}
	public void setGroupCount1(Integer groupCount1) {
		this.groupCount1 = groupCount1;
	}
	public Integer getGroupCount2() {
		return groupCount2;
	}
	public void setGroupCount2(Integer groupCount2) {
		this.groupCount2 = groupCount2;
	}
	public String getApplicantType() {
		return applicantType;
	}
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}
	public String getApplicantTypeOther() {
		return applicantTypeOther;
	}
	public void setApplicantTypeOther(String applicantTypeOther) {
		this.applicantTypeOther = applicantTypeOther;
	}
	public PersonContactDTO getPrivatePerson() {
		return privatePerson;
	}
	public void setPrivatePerson(PersonContactDTO privatePerson) {
		this.privatePerson = privatePerson;
	}
	public OrganizationDTO getLoadedOrganization() {
		return loadedOrganization;
	}
	public void setLoadedOrganization(OrganizationDTO loadedOrganization) {
		this.loadedOrganization = loadedOrganization;
	}
	public boolean isNewCompany() {
		return isNewCompany;
	}
	public void setNewCompany(boolean isNewCompany) {
		this.isNewCompany = isNewCompany;
	}
	public boolean isDataPopulated() {
		return isDataPopulated;
	}
	public void setDataPopulated(boolean isDataPopulated) {
		this.isDataPopulated = isDataPopulated;
	}
	public boolean isTermsAccepted() {
		return termsAccepted;
	}
	public void setTermsAccepted(boolean termsAccepted) {
		this.termsAccepted = termsAccepted;
	}

	public String getBankOwnerName() {
		return bankOwnerName;
	}
	public String getBankOwnerHetu() {
		return bankOwnerHetu;
	}
	public void setBankOwnerName(String bankOwnerName) {
		this.bankOwnerName = bankOwnerName;
	}
	public void setBankOwnerHetu(String bankOwnerHetu) {
		this.bankOwnerHetu = bankOwnerHetu;
	}
	
	
}
