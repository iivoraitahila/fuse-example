package com.ibm.coh.applicantregistry.ws.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class OrganizationDTO {
	
	private String registerNumber;
	private String organizationCode;
	private String name;
	private String abbreviation;
	private Date registerDate;
	private Integer registrationYear;
	private String homeTown;
	private String personName;
	private List<PersonContactDTO> contactPersons;// = new ArrayList<PersonContactDTO>();
	private List<PersonContactDTO> employees;// = new ArrayList<PersonContactDTO>();
	//PersonContactDTO[] contactPersons = null;
	private List<BankAccountDTO> bankAccounts;// = new ArrayList<String>();
	private String fax;
	private String email;
	private String phone;
	private String webPages;
	
	public OrganizationDTO() {
		//LOGGER.info("OrganizationDTO constructor");
		this.contactPersons = new ArrayList<PersonContactDTO>();
		this.employees = new ArrayList<PersonContactDTO>();
		this.bankAccounts = new ArrayList<BankAccountDTO>();
		
	}
	
	public String getRegisterNumber() {
		//LOGGER.info("OrganizationDTO getreg");
		return this.registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		//LOGGER.info("OrganizationDTO setreg");
		this.registerNumber = registerNumber;
	}
	public String getOrganizationCode() {
		//LOGGER.info("OrganizationDTO getoc");
		return organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		//LOGGER.info("OrganizationDTO setoc");
		this.organizationCode = organizationCode;
	}
	public String getName() {
		//LOGGER.info("OrganizationDTO getname");
		return name;
	}
	public void setName(String name) {
		//LOGGER.info("OrganizationDTO setname");
		this.name = name;
	}
	public String getAbbreviation() {
		//LOGGER.info("OrganizationDTO getabb");
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		//LOGGER.info("OrganizationDTO setabb");
		this.abbreviation = abbreviation;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		//LOGGER.info("OrganizationDTO setregdate");
		this.registerDate = registerDate;
	}
	public Integer getRegistrationYear() {
		return registrationYear;
	}
	public void setRegistrationYear(Integer registrationYear) {
		//LOGGER.info("OrganizationDTO setregy");
		this.registrationYear = registrationYear;
	}
	public String getHomeTown() {
		//LOGGER.info("OrganizationDTO getht");
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		//LOGGER.info("OrganizationDTO setht");
		this.homeTown = homeTown;
	}
	/**
	public List<PersonContactDTO> getContactPersons() {
		return contactPersons;
	}
	public void setContactPersons(List<PersonContactDTO> contactPersons) {
		this.contactPersons = contactPersons;
	}**/
	public List<PersonContactDTO> getEmployees() {
		//LOGGER.info("OrganizationDTO getempl");
		//if (this.employees == null) this.employees = new ArrayList<PersonContactDTO>();
		return employees;
	}
	public void setEmployees(List<PersonContactDTO> employees) {
		
		this.employees = employees;
	}
	public List<BankAccountDTO> getBankAccounts() {
		
		return bankAccounts;
	}
	public void setBankAccounts(List<BankAccountDTO> bankAccounts) {
		//LOGGER.info("OrganizationDTO setBAs");
		//if (this.bankAccounts == null) this.bankAccounts = new ArrayList<String>();
		this.bankAccounts = bankAccounts;
	}
	public void addContactPerson(PersonContactDTO contactPerson) {
		
		this.contactPersons.add(contactPerson);
	}
	public void addEmployee(PersonContactDTO employee) {
		
		this.employees.add(employee); 
	}
	public void addBankAccount(BankAccountDTO bankAccount) {
		
		this.bankAccounts.add(bankAccount); 
	}
	public void setContactPersons(List<PersonContactDTO> contactPersons) {

		this.contactPersons = contactPersons;
	}
	public List<PersonContactDTO> getContactPersons() {
		//LOGGER.info("OrganizationDTO getCPs");
		//if (this.contactPersons == null) this.contactPersons = new ArrayList<PersonContactDTO>();
		return contactPersons;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebPages() {
		return webPages;
	}

	public void setWebPages(String webPages) {
		this.webPages = webPages;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	
}
