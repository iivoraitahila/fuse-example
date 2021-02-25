package com.ibm.coh.avustus.data;

import java.util.Date;
import java.util.List;

public class SubsidiesDTO {
	
	private List<Subsidy> subsidies;
	private List<Subsidy> otherSubsidies;
	private Subsidy subsidy;
	private String premises;
	private String loans;
	
	private String artType;
	private String subsidyTypeArt;
	
	private List<SubsidyUsageDTO> subsidyUsage;
	private List<SupportedUse> supportedUse;
	
	private Integer participantsGroup1;
	private Integer participantsGroup2;
	private Integer participantsGroup3;
	private Integer participantsGroup4;
	

	private boolean livBusinessSelection;
	private boolean livSupportSelection;
	private boolean livRentalSelection;
	private boolean livMapSelection;
	private boolean livHandicapSelection;
	
	private Double livBusinessSelectionAmount;

	private Double amount1;
	private Double amount2;
	
	private Integer grantYear1;
	private Integer grantYear2;
	private Integer grantYear3;
	private Double grantSum1;
	private Double grantSum2;
	private Double grantSum3;
	private String allowPublish;
	private String stateArtistGrant;
	private String accomplishements;
	private String developmentActivities;
	private String goalsOfDevelopmentActivities;
	private String developmentActivitiesParticipation;
	private String developmentActivitiesBenefits;
	private String developmentActivitiesStrength;
	
	public List<Subsidy> getSubsidies() {
		return subsidies;
	}
	public void setSubsidies(List<Subsidy> subsidies) {
		this.subsidies = subsidies;
	}
	public List<Subsidy> getOtherSubsidies() {
		return otherSubsidies;
	}
	public void setOtherSubsidies(List<Subsidy> otherSubsidies) {
		this.otherSubsidies = otherSubsidies;
	}
	public String getPremises() {
		return premises;
	}
	public void setPremises(String premises) {
		this.premises = premises;
	}
	public String getLoans() {
		return loans;
	}
	public void setLoans(String loans) {
		this.loans = loans;
	}
	public Subsidy getSubsidy() {
		if (this.subsidy == null) this.subsidy = new Subsidy();
		return subsidy;
	}
	public void setSubsidy(Subsidy subsidy) {
		this.subsidy = subsidy;
	}
	public String getArtType() {
		return artType;
	}
	public void setArtType(String artType) {
		this.artType = artType;
	}
	public String getSubsidyTypeArt() {
		return subsidyTypeArt;
	}
	public void setSubsidyTypeArt(String subsidyTypeArt) {
		this.subsidyTypeArt = subsidyTypeArt;
	}
	public Integer getParticipantsGroup1() {
		return participantsGroup1;
	}
	public void setParticipantsGroup1(Integer participantsGroup1) {
		this.participantsGroup1 = participantsGroup1;
	}
	public Integer getParticipantsGroup2() {
		return participantsGroup2;
	}
	public void setParticipantsGroup2(Integer participantsGroup2) {
		this.participantsGroup2 = participantsGroup2;
	}
	public Integer getParticipantsGroup3() {
		return participantsGroup3;
	}
	public void setParticipantsGroup3(Integer participantsGroup3) {
		this.participantsGroup3 = participantsGroup3;
	}
	public Integer getParticipantsGroup4() {
		return participantsGroup4;
	}
	public void setParticipantsGroup4(Integer participantsGroup4) {
		this.participantsGroup4 = participantsGroup4;
	}
	public boolean isLivBusinessSelection() {
		return livBusinessSelection;
	}
	public void setLivBusinessSelection(boolean livBusinessSelection) {
		this.livBusinessSelection = livBusinessSelection;
	}
	public boolean isLivSupportSelection() {
		return livSupportSelection;
	}
	public void setLivSupportSelection(boolean livSupportSelection) {
		this.livSupportSelection = livSupportSelection;
	}
	public boolean isLivRentalSelection() {
		return livRentalSelection;
	}
	public void setLivRentalSelection(boolean livRentalSelection) {
		this.livRentalSelection = livRentalSelection;
	}
	public boolean isLivMapSelection() {
		return livMapSelection;
	}
	public void setLivMapSelection(boolean livMapSelection) {
		this.livMapSelection = livMapSelection;
	}
	public boolean isLivHandicapSelection() {
		return livHandicapSelection;
	}
	public void setLivHandicapSelection(boolean livHandicapSelection) {
		this.livHandicapSelection = livHandicapSelection;
	}
	public Double getLivBusinessSelectionAmount() {
		return livBusinessSelectionAmount;
	}
	public void setLivBusinessSelectionAmount(Double livBusinessSelectionAmount) {
		this.livBusinessSelectionAmount = livBusinessSelectionAmount;
	}
	public Double getAmount1() {
		return amount1;
	}
	public void setAmount1(Double amount1) {
		this.amount1 = amount1;
	}
	public Double getAmount2() {
		return amount2;
	}
	public void setAmount2(Double amount2) {
		this.amount2 = amount2;
	}
	public Integer getGrantYear1() {
		return grantYear1;
	}
	public void setGrantYear1(Integer grantYear1) {
		this.grantYear1 = grantYear1;
	}
	public Integer getGrantYear2() {
		return grantYear2;
	}
	public void setGrantYear2(Integer grantYear2) {
		this.grantYear2 = grantYear2;
	}
	public Integer getGrantYear3() {
		return grantYear3;
	}
	public void setGrantYear3(Integer grantYear3) {
		this.grantYear3 = grantYear3;
	}
	public Double getGrantSum1() {
		return grantSum1;
	}
	public void setGrantSum1(Double grantSum1) {
		this.grantSum1 = grantSum1;
	}
	public Double getGrantSum2() {
		return grantSum2;
	}
	public void setGrantSum2(Double grantSum2) {
		this.grantSum2 = grantSum2;
	}
	public Double getGrantSum3() {
		return grantSum3;
	}
	public void setGrantSum3(Double grantSum3) {
		this.grantSum3 = grantSum3;
	}
	public String getAllowPublish() {
		return allowPublish;
	}
	public void setAllowPublish(String allowPublish) {
		this.allowPublish = allowPublish;
	}
	public String getStateArtistGrant() {
		return stateArtistGrant;
	}
	public void setStateArtistGrant(String stateArtistGrant) {
		this.stateArtistGrant = stateArtistGrant;
	}
	public String getAccomplishements() {
		return accomplishements;
	}
	public void setAccomplishements(String accomplishements) {
		this.accomplishements = accomplishements;
	}
	public List<SubsidyUsageDTO> getSubsidyUsage() {
		return subsidyUsage;
	}
	public void setSubsidyUsage(List<SubsidyUsageDTO> subsidyUsage) {
		this.subsidyUsage = subsidyUsage;
	}
	public List<SupportedUse> getSupportedUse() {
		return supportedUse;
	}
	public void setSupportedUse(List<SupportedUse> supportedUse) {
		this.supportedUse = supportedUse;
	}
	public String getDevelopmentActivities() {
		return developmentActivities;
	}
	public void setDevelopmentActivities(String developmentActivities) {
		this.developmentActivities = developmentActivities;
	}
	public String getGoalsOfDevelopmentActivities() {
		return goalsOfDevelopmentActivities;
	}
	public void setGoalsOfDevelopmentActivities(String goalsOfDevelopmentActivities) {
		this.goalsOfDevelopmentActivities = goalsOfDevelopmentActivities;
	}
	public String getDevelopmentActivitiesParticipation() {
		return developmentActivitiesParticipation;
	}
	public void setDevelopmentActivitiesParticipation(
			String developmentActivitiesParticipation) {
		this.developmentActivitiesParticipation = developmentActivitiesParticipation;
	}
	public String getDevelopmentActivitiesBenefits() {
		return developmentActivitiesBenefits;
	}
	public void setDevelopmentActivitiesBenefits(
			String developmentActivitiesBenefits) {
		this.developmentActivitiesBenefits = developmentActivitiesBenefits;
	}
	public String getDevelopmentActivitiesStrength() {
		return developmentActivitiesStrength;
	}
	public void setDevelopmentActivitiesStrength(
			String developmentActivitiesStrength) {
		this.developmentActivitiesStrength = developmentActivitiesStrength;
	}
	@Override
	public String toString() {
		return "SubsidiesDTO ["
				+ (subsidies != null ? "subsidies=" + subsidies + ", " : "")
				+ (otherSubsidies != null ? "otherSubsidies=" + otherSubsidies
						+ ", " : "")
				+ (subsidy != null ? "subsidy=" + subsidy + ", " : "")
				+ (premises != null ? "premises=" + premises + ", " : "")
				+ (loans != null ? "loans=" + loans + ", " : "")
				+ (artType != null ? "artType=" + artType + ", " : "")
				+ (subsidyTypeArt != null ? "subsidyTypeArt=" + subsidyTypeArt
						+ ", " : "")
				+ (subsidyUsage != null ? "subsidyUsage=" + subsidyUsage + ", "
						: "")
				+ (supportedUse != null ? "supportedUse=" + supportedUse + ", "
						: "")
				+ (participantsGroup1 != null ? "participantsGroup1="
						+ participantsGroup1 + ", " : "")
				+ (participantsGroup2 != null ? "participantsGroup2="
						+ participantsGroup2 + ", " : "")
				+ (participantsGroup3 != null ? "participantsGroup3="
						+ participantsGroup3 + ", " : "")
				+ (participantsGroup4 != null ? "participantsGroup4="
						+ participantsGroup4 + ", " : "")
				+ "livBusinessSelection="
				+ livBusinessSelection
				+ ", livSupportSelection="
				+ livSupportSelection
				+ ", livRentalSelection="
				+ livRentalSelection
				+ ", livMapSelection="
				+ livMapSelection
				+ ", livHandicapSelection="
				+ livHandicapSelection
				+ ", "
				+ (livBusinessSelectionAmount != null ? "livBusinessSelectionAmount="
						+ livBusinessSelectionAmount + ", "
						: "")
				+ (amount1 != null ? "amount1=" + amount1 + ", " : "")
				+ (amount2 != null ? "amount2=" + amount2 + ", " : "")
				+ (grantYear1 != null ? "grantYear1=" + grantYear1 + ", " : "")
				+ (grantYear2 != null ? "grantYear2=" + grantYear2 + ", " : "")
				+ (grantYear3 != null ? "grantYear3=" + grantYear3 + ", " : "")
				+ (grantSum1 != null ? "grantSum1=" + grantSum1 + ", " : "")
				+ (grantSum2 != null ? "grantSum2=" + grantSum2 + ", " : "")
				+ (grantSum3 != null ? "grantSum3=" + grantSum3 + ", " : "")
				+ (allowPublish != null ? "allowPublish=" + allowPublish + ", "
						: "")
				+ (stateArtistGrant != null ? "stateArtistGrant="
						+ stateArtistGrant + ", " : "")
				+ (accomplishements != null ? "accomplishements="
						+ accomplishements + ", " : "")
				+ (developmentActivities != null ? "developmentActivities="
						+ developmentActivities + ", " : "")
				+ (goalsOfDevelopmentActivities != null ? "goalsOfDevelopmentActivities="
						+ goalsOfDevelopmentActivities + ", "
						: "")
				+ (developmentActivitiesParticipation != null ? "developmentActivitiesParticipation="
						+ developmentActivitiesParticipation + ", "
						: "")
				+ (developmentActivitiesBenefits != null ? "developmentActivitiesBenefits="
						+ developmentActivitiesBenefits + ", "
						: "")
				+ (developmentActivitiesStrength != null ? "developmentActivitiesStrength="
						+ developmentActivitiesStrength
						: "") + "]";
	}
	

}
