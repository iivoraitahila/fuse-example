package com.ibm.coh.avustus.data;

import com.ibm.coh.applicantregistry.ws.data.ContactInformationDTO;


public class GrantApplicationDTO {
	
	private ContactInformationDTO contactInformation;
	private BusinessDTO business;
	private SubsidiesDTO subsidies;
	private OtherDTO other;
	private ArtTypeDTO arttype;
	private BudgetDTO budget;
//	private GrantDTO grant;
	//private MembersDTO members;
	private ProjecTDO project;
	private AdditionalSubsidyDTO additionalSubsidy;
	private CompensationDTO compensation;
	//private PremisesDTO premises;
	//private LivBusinessDTO livBusiness;
	//private LivHandicapDTO livHandicap;
	private LivMapDTO livMap;
	//private LivRentalDTO livRental;
	//private CampBackingBeanDTO camp;
	//private ClubDTO club;
	private WageDTO wage;
	//private RentDTO rent;
	private AttachmentsDTO attachments; 
	private boolean isFormAvailableByDate;
	private boolean isFormUpdate;
	
	public ContactInformationDTO getContactInformation() {
		return this.contactInformation;
	}
	public BusinessDTO getBusiness() {
		return business;
	}
	public void setBusiness(BusinessDTO business) {
		this.business = business;
	}
	public void setContactInformation(ContactInformationDTO contactInformation) {
		this.contactInformation = contactInformation;
	}
	public SubsidiesDTO getSubsidies() {
		return subsidies;
	}
	public void setSubsidies(SubsidiesDTO subsidies) {
		this.subsidies = subsidies;
	}
	public OtherDTO getOther() {
		return other;
	}
	public void setOther(OtherDTO other) {
		this.other = other;
	}
	
	public ArtTypeDTO getArttype() {
		return arttype;
	}
	public void setArttype(ArtTypeDTO arttype) {
		this.arttype = arttype;
	}
	public BudgetDTO getBudget() {
		return budget;
	}
	public void setBudget(BudgetDTO budget) {
		this.budget = budget;
	}

	public ProjecTDO getProject() {
		return project;
	}
	public void setProject(ProjecTDO project) {
		this.project = project;
	}
	public AdditionalSubsidyDTO getAdditionalSubsidy() {
		return additionalSubsidy;
	}
	public void setAdditionalSubsidy(AdditionalSubsidyDTO additionalSubsidy) {
		this.additionalSubsidy = additionalSubsidy;
	}
	public CompensationDTO getCompensation() {
		return compensation;
	}
	public void setCompensation(CompensationDTO compensation) {
		this.compensation = compensation;
	}
	/**public PremisesDTO getPremises() {
		return premises;
	}
	public void setPremises(PremisesDTO premises) {
		this.premises = premises;
	}**/
	public AttachmentsDTO getAttachments() {
		return attachments;
	}
	public void setAttachments(AttachmentsDTO attachments) {
		this.attachments = attachments;
	}


	public void setLivMap(LivMapDTO livMap) {
		this.livMap = livMap;
	}

	public WageDTO getWage() {
		return wage;
	}
	public void setWage(WageDTO wage) {
		this.wage = wage;
	}

	public boolean isFormAvailableByDate() {
		return isFormAvailableByDate;
	}
	public void setFormAvailableByDate(boolean isFormAvailableByDate) {
		this.isFormAvailableByDate = isFormAvailableByDate;
	}
	public boolean isFormUpdate() {
		return isFormUpdate;
	}
	public void setFormUpdate(boolean isFormUpdate) {
		this.isFormUpdate = isFormUpdate;
	}

}
