package com.ibm.coh.avustus.data;

import java.util.List;



public class BusinessDTO {
	
	private String businessDescription;
	private String businessDescriptionIdea;
	private String businessDescriptionImprove;
	private String businessDescriptionEffects;
	private String businessDescriptionTrial;
	private String businessDescriptionTraining;
	private String isBusiness;
	
	private String activitiesDescription;
	private String activitiesTarget;
	private String mission;
	private String vision;
	private String diversity;
	private String accessibility;
	private String participation;
	private String functionalQuality;
	private String targetGroups;
	private String cooperationPartner;	
	
	private Integer personnelAll;
	private Integer personnelPermanent;
	private Integer personnelParttime;
	private Integer personnelVoluntary;
	
	private Integer studentsEarlyAll;
	private Integer studentsEarlyBoys;
	private Integer studentsEarlyGirls;
	private Integer studentsLargeAll;
	private Integer studentsLargeBoys;
	private Integer studentsLargeGirls;
	private Integer studentsAdvancedAll;
	private Integer studentsAdvancedBoys;
	private Integer studentsAdvancedGirls;
	private Integer studentsBasicAll;
	private Integer studentsBasicBoys;
	private Integer studentsBasicGirls;
	

	private Integer lessonsEarly;
	private Integer lessonsLarge;
	private Integer lessonsAdvanced;
	private Integer lessonsBasic;

	private Integer teachersAll;
	private String wayToTakePupils;
	private String individualisation;
	private String freeStudentPlaces;
	private String selfAssessment;
	private String feedbackFromParents;
	
	private List<String> location;
	
	private Integer personMembersCommunityAll;
	private Integer personMembersSubAssociationAll;
	private Integer personMembersSubdivisionAll;
	private Integer communityMembersCommunityAll;
	private Integer communityMembersSubAssociationAll;
	private Integer communityMembersSubdivisionAll;
	private Integer personMembersCommunityCitizens;
	private Integer personMembersSubAssociationCitizens;
	private Integer personMembersSubdivisionCitizens;
	private Integer communityMembersCommunityCitizens;
	private Integer communityMembersSubAssociationCitizens;
	private Integer communityMembersSubdivisionCitizens;
	private Integer personMembersCommunityForeignLanguage;
	private Integer personMembersSubAssociationForeignLanguage;
	private Integer personMembersCommunityImmigrants;
	private Integer communityMembersCommunityImmigrants;
	private Integer personMembersSubAssociationImmigrants;
	private Integer communityMembersSubAssociationImmigrants;
	private Integer personMembersSubdivisionImmigrants;
	private Integer communityMembersSubdivisionImmigrants;
	
	private Double personMembershipFee;
	private Double communityMembershipFee;
	
	private Integer premisesSquareArea;
	private Double premisesFee;
	private String businessType;
	
	private Integer personnelRegular;
	private Integer personnelArt;
	private Integer personnelAdministration;
	private Integer personnelWorkYears;
	
	private Integer personMembersAll;
	private Integer communityMembersAll;
	private Integer personMembersCitizens;
	private Integer communityMembersCitizens;
	
	private Integer showYear;
	private Integer showGuests;
	private Integer showCount;
	private Integer showCountHelsinki;
	private Integer showAudience;
	private Integer showAudienceHelsinki;
	private Integer showPremierCount;
	private Integer showTicketCount;
	
	private Integer lastYearIncomes;
	private Integer lastYearExpenses;	
	
	private Integer studentsPersonnelTotal;
	private Integer studentsPersonnelTeachers;
	private Integer studentsPersonnelAdministration;

	private Integer studentsCountBasic;
	private Integer studentsCountArt;
	private Integer studentsCountGeneral;
	private Integer studentsCountAdvanced;
	private Integer studentsLessonsBasic;
	private Integer studentsLessonsArt;
	private Integer studentsLessonsGeneral;
	private Integer studentsLessonsAdvanced;
	private String studentsFeeBasic;
	private String studentsFeeArt;
	private String studentsFeeGeneral;
	private String studentsFeeAdvanced;
//	private Integer studentsGroupsBasic;
//	private Integer studentsGroupsArt;
//	private Integer studentsGroupsOther;
	private String studentsProjects;
	
	private List<SportType> sports;
	private List<SportType> sports1;
	private List<SupportedUse> previousSupportedUse;
	
	private Integer genre1Type1Count;
	private Integer genre1Type2Count;
	private Double genre1Type1Amount;
	private Double genre1Type2Amount;
	private Integer genre2Type1Count;
	private Integer genre2Type2Count;
	private Double genre2Type1Amount;
	private Double genre2Type2Amount;
	private Integer genre3Type1Count;
	private Integer genre3Type2Count;
	private Double genre3Type1Amount;
	private Double genre3Type2Amount;
	private Integer genre4Type1Count;
	private Integer genre4Type2Count;
	private Double genre4Type1Amount;
	private Double genre4Type2Amount;
	
	private Double memberFees1Amount;
	private Double memberFees2Amount;
	
	//private List<MembersDTO> activeMembersCount;
	private Integer instructorCount;
	private Integer trainedInstructorCount;
	
	private String equality;
	private boolean equalitySelection;
	private String community;
	private boolean communitySelection;
	private String environmental;
	private boolean environmentalSelection;
	private String excersice;
	private boolean excersiceSelection;
	private String dailyactivity;
	private boolean dailyactivitySelection;

	
	public String getIsBusiness() {
		return isBusiness;
	}
	public void setIsBusiness(String isBusiness) {
		this.isBusiness = isBusiness;
	}
	public Integer getPersonMembersCommunityAll() {
		return personMembersCommunityAll;
	}
	public void setPersonMembersCommunityAll(Integer personMembersCommunityAll) {
		this.personMembersCommunityAll = personMembersCommunityAll;
	}
	public Integer getPersonMembersSubAssociationAll() {
		return personMembersSubAssociationAll;
	}
	public void setPersonMembersSubAssociationAll(
			Integer personMembersSubAssociationAll) {
		this.personMembersSubAssociationAll = personMembersSubAssociationAll;
	}
	public Integer getPersonMembersSubdivisionAll() {
		return personMembersSubdivisionAll;
	}
	public void setPersonMembersSubdivisionAll(Integer personMembersSubdivisionAll) {
		this.personMembersSubdivisionAll = personMembersSubdivisionAll;
	}
	public Integer getCommunityMembersCommunityAll() {
		return communityMembersCommunityAll;
	}
	public void setCommunityMembersCommunityAll(Integer communityMembersCommunityAll) {
		this.communityMembersCommunityAll = communityMembersCommunityAll;
	}
	public Integer getCommunityMembersSubAssociationAll() {
		return communityMembersSubAssociationAll;
	}
	public void setCommunityMembersSubAssociationAll(
			Integer communityMembersSubAssociationAll) {
		this.communityMembersSubAssociationAll = communityMembersSubAssociationAll;
	}
	public Integer getCommunityMembersSubdivisionAll() {
		return communityMembersSubdivisionAll;
	}
	public void setCommunityMembersSubdivisionAll(
			Integer communityMembersSubdivisionAll) {
		this.communityMembersSubdivisionAll = communityMembersSubdivisionAll;
	}
	public Integer getPersonMembersCommunityCitizens() {
		return personMembersCommunityCitizens;
	}
	public void setPersonMembersCommunityCitizens(
			Integer personMembersCommunityCitizens) {
		this.personMembersCommunityCitizens = personMembersCommunityCitizens;
	}
	public Integer getPersonMembersSubAssociationCitizens() {
		return personMembersSubAssociationCitizens;
	}
	public void setPersonMembersSubAssociationCitizens(
			Integer personMembersSubAssociationCitizens) {
		this.personMembersSubAssociationCitizens = personMembersSubAssociationCitizens;
	}
	public Integer getPersonMembersSubdivisionCitizens() {
		return personMembersSubdivisionCitizens;
	}
	public void setPersonMembersSubdivisionCitizens(
			Integer personMembersSubdivisionCitizens) {
		this.personMembersSubdivisionCitizens = personMembersSubdivisionCitizens;
	}
	public Integer getCommunityMembersCommunityCitizens() {
		return communityMembersCommunityCitizens;
	}
	public void setCommunityMembersCommunityCitizens(
			Integer communityMembersCommunityCitizens) {
		this.communityMembersCommunityCitizens = communityMembersCommunityCitizens;
	}
	public Integer getCommunityMembersSubAssociationCitizens() {
		return communityMembersSubAssociationCitizens;
	}
	public void setCommunityMembersSubAssociationCitizens(
			Integer communityMembersSubAssociationCitizens) {
		this.communityMembersSubAssociationCitizens = communityMembersSubAssociationCitizens;
	}
	public Integer getCommunityMembersSubdivisionCitizens() {
		return communityMembersSubdivisionCitizens;
	}
	public void setCommunityMembersSubdivisionCitizens(
			Integer communityMembersSubdivisionCitizens) {
		this.communityMembersSubdivisionCitizens = communityMembersSubdivisionCitizens;
	}
	public Double getPersonMembershipFee() {
		return personMembershipFee;
	}
	public void setPersonMembershipFee(Double personMembershipFee) {
		this.personMembershipFee = personMembershipFee;
	}
	public Double getCommunityMembershipFee() {
		return communityMembershipFee;
	}
	public void setCommunityMembershipFee(Double communityMembershipFee) {
		this.communityMembershipFee = communityMembershipFee;
	}
	public String getBusinessDescription() {
		return businessDescription;
	}
	public void setBusinessDescription(String businessDescription) {
		this.businessDescription = businessDescription;
	}
	public String getBusinessDescriptionIdea() {
		return businessDescriptionIdea;
	}
	public String getBusinessDescriptionImprove() {
		return businessDescriptionImprove;
	}
	public String getBusinessDescriptionEffects() {
		return businessDescriptionEffects;
	}
	public String getBusinessDescriptionTrial() {
		return businessDescriptionTrial;
	}
	public String getBusinessDescriptionTraining() {
		return businessDescriptionTraining;
	}
	public void setBusinessDescriptionIdea(String businessDescriptionIdea) {
		this.businessDescriptionIdea = businessDescriptionIdea;
	}
	public void setBusinessDescriptionImprove(String businessDescriptionImprove) {
		this.businessDescriptionImprove = businessDescriptionImprove;
	}
	public void setBusinessDescriptionEffects(String businessDescriptionEffects) {
		this.businessDescriptionEffects = businessDescriptionEffects;
	}
	public void setBusinessDescriptionTrial(String businessDescriptionTrial) {
		this.businessDescriptionTrial = businessDescriptionTrial;
	}
	public void setBusinessDescriptionTraining(String businessDescriptionTraining) {
		this.businessDescriptionTraining = businessDescriptionTraining;
	}
	public List<String> getLocation() {
		return location;
	}
	public void setLocation(List<String> location) {
		this.location = location;
	}
	public Integer getPremisesSquareArea() {
		return premisesSquareArea;
	}
	public void setPremisesSquareArea(Integer premisesSquareArea) {
		this.premisesSquareArea = premisesSquareArea;
	}
	public Double getPremisesFee() {
		return premisesFee;
	}
	public void setPremisesFee(Double premisesFee) {
		this.premisesFee = premisesFee;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public Integer getPersonnelRegular() {
		return personnelRegular;
	}
	public void setPersonnelRegular(Integer personnelRegular) {
		this.personnelRegular = personnelRegular;
	}
	public Integer getPersonnelArt() {
		return personnelArt;
	}
	public void setPersonnelArt(Integer personnelArt) {
		this.personnelArt = personnelArt;
	}
	public Integer getPersonnelAdministration() {
		return personnelAdministration;
	}
	public void setPersonnelAdministration(Integer personnelAdministration) {
		this.personnelAdministration = personnelAdministration;
	}
	public Integer getPersonnelWorkYears() {
		return personnelWorkYears;
	}
	public void setPersonnelWorkYears(Integer personnelWorkYears) {
		this.personnelWorkYears = personnelWorkYears;
	}
	public Integer getPersonMembersAll() {
		return personMembersAll;
	}
	public void setPersonMembersAll(Integer personMembersAll) {
		this.personMembersAll = personMembersAll;
	}
	public Integer getCommunityMembersAll() {
		return communityMembersAll;
	}
	public void setCommunityMembersAll(Integer communityMembersAll) {
		this.communityMembersAll = communityMembersAll;
	}
	public Integer getPersonMembersCitizens() {
		return personMembersCitizens;
	}
	public void setPersonMembersCitizens(Integer personMembersCitizens) {
		this.personMembersCitizens = personMembersCitizens;
	}
	public Integer getCommunityMembersCitizens() {
		return communityMembersCitizens;
	}
	public void setCommunityMembersCitizens(Integer communityMembersCitizens) {
		this.communityMembersCitizens = communityMembersCitizens;
	}
	public Integer getPersonMembersCommunityForeignLanguage() {
		return personMembersCommunityForeignLanguage;
	}
	public void setPersonMembersCommunityForeignLanguage(
			Integer personMembersCommunityForeignLanguage) {
		this.personMembersCommunityForeignLanguage = personMembersCommunityForeignLanguage;
	}
	public Integer getPersonMembersSubAssociationForeignLanguage() {
		return personMembersSubAssociationForeignLanguage;
	}
	public void setPersonMembersSubAssociationForeignLanguage(
			Integer personMembersSubAssociationForeignLanguage) {
		this.personMembersSubAssociationForeignLanguage = personMembersSubAssociationForeignLanguage;
	}
	public Integer getShowYear() {
		return showYear;
	}
	public void setShowYear(Integer showYear) {
		this.showYear = showYear;
	}
	public Integer getShowGuests() {
		return showGuests;
	}
	public void setShowGuests(Integer showGuests) {
		this.showGuests = showGuests;
	}
	public Integer getShowCount() {
		return showCount;
	}
	public void setShowCount(Integer showCount) {
		this.showCount = showCount;
	}
	public Integer getShowCountHelsinki() {
		return showCountHelsinki;
	}
	public void setShowCountHelsinki(Integer showCountHelsinki) {
		this.showCountHelsinki = showCountHelsinki;
	}
	public Integer getShowAudience() {
		return showAudience;
	}
	public void setShowAudience(Integer showAudience) {
		this.showAudience = showAudience;
	}
	public Integer getShowAudienceHelsinki() {
		return showAudienceHelsinki;
	}
	public void setShowAudienceHelsinki(Integer showAudienceHelsinki) {
		this.showAudienceHelsinki = showAudienceHelsinki;
	}
	public Integer getShowPremierCount() {
		return showPremierCount;
	}
	public void setShowPremierCount(Integer showPremierCount) {
		this.showPremierCount = showPremierCount;
	}
	public Integer getShowTicketCount() {
		return showTicketCount;
	}
	public void setShowTicketCount(Integer showTicketCount) {
		this.showTicketCount = showTicketCount;
	}
	public Integer getStudentsPersonnelTotal() {
		return studentsPersonnelTotal;
	}
	public void setStudentsPersonnelTotal(Integer studentsPersonnelTotal) {
		this.studentsPersonnelTotal = studentsPersonnelTotal;
	}
	public Integer getStudentsPersonnelTeachers() {
		return studentsPersonnelTeachers;
	}
	public void setStudentsPersonnelTeachers(Integer studentsPersonnelTeachers) {
		this.studentsPersonnelTeachers = studentsPersonnelTeachers;
	}
	public Integer getStudentsPersonnelAdministration() {
		return studentsPersonnelAdministration;
	}
	public void setStudentsPersonnelAdministration(
			Integer studentsPersonnelAdministration) {
		this.studentsPersonnelAdministration = studentsPersonnelAdministration;
	}
	public Integer getStudentsCountBasic() {
		return studentsCountBasic;
	}
	public void setStudentsCountBasic(Integer studentsCountBasic) {
		this.studentsCountBasic = studentsCountBasic;
	}
	public Integer getStudentsCountArt() {
		return studentsCountArt;
	}
	public void setStudentsCountArt(Integer studentsCountArt) {
		this.studentsCountArt = studentsCountArt;
	}
	public Integer getStudentsCountGeneral() {
		return studentsCountGeneral;
	}
	public void setStudentsCountGeneral(Integer studentsCountGeneral) {
		this.studentsCountGeneral = studentsCountGeneral;
	}
	public Integer getStudentsCountAdvanced() {
		return studentsCountAdvanced;
	}
	public void setStudentsCountAdvanced(Integer studentsCountAdvanced) {
		this.studentsCountAdvanced = studentsCountAdvanced;
	}
	public Integer getStudentsLessonsBasic() {
		return studentsLessonsBasic;
	}
	public void setStudentsLessonsBasic(Integer studentsLessonsBasic) {
		this.studentsLessonsBasic = studentsLessonsBasic;
	}
	public Integer getStudentsLessonsArt() {
		return studentsLessonsArt;
	}
	public void setStudentsLessonsArt(Integer studentsLessonsArt) {
		this.studentsLessonsArt = studentsLessonsArt;
	}
	public Integer getStudentsLessonsGeneral() {
		return studentsLessonsGeneral;
	}
	public void setStudentsLessonsGeneral(Integer studentsLessonsGeneral) {
		this.studentsLessonsGeneral = studentsLessonsGeneral;
	}
	public Integer getStudentsLessonsAdvanced() {
		return studentsLessonsAdvanced;
	}
	public void setStudentsLessonsAdvanced(Integer studentsLessonsAdvanced) {
		this.studentsLessonsAdvanced = studentsLessonsAdvanced;
	}
	public String getStudentsFeeBasic() {
		return studentsFeeBasic;
	}
	public void setStudentsFeeBasic(String studentsFeeBasic) {
		this.studentsFeeBasic = studentsFeeBasic;
	}
	public String getStudentsFeeArt() {
		return studentsFeeArt;
	}
	public void setStudentsFeeArt(String studentsFeeArt) {
		this.studentsFeeArt = studentsFeeArt;
	}
	public String getStudentsFeeGeneral() {
		return studentsFeeGeneral;
	}
	public void setStudentsFeeGeneral(String studentsFeeGeneral) {
		this.studentsFeeGeneral = studentsFeeGeneral;
	}
	public String getStudentsFeeAdvanced() {
		return studentsFeeAdvanced;
	}
	public void setStudentsFeeAdvanced(String studentsFeeAdvanced) {
		this.studentsFeeAdvanced = studentsFeeAdvanced;
	}
//	public Integer getStudentsGroupsBasic() {
//		return studentsGroupsBasic;
//	}
//	public void setStudentsGroupsBasic(Integer studentsGroupsBasic) {
//		this.studentsGroupsBasic = studentsGroupsBasic;
//	}
//	public Integer getStudentsGroupsArt() {
//		return studentsGroupsArt;
//	}
//	public void setStudentsGroupsArt(Integer studentsGroupsArt) {
//		this.studentsGroupsArt = studentsGroupsArt;
//	}
//	public Integer getStudentsGroupsOther() {
//		return studentsGroupsOther;
//	}
//	public void setStudentsGroupsOther(Integer studentsGroupsOther) {
//		this.studentsGroupsOther = studentsGroupsOther;
//	}
	public String getStudentsProjects() {
		return studentsProjects;
	}
	public void setStudentsProjects(String studentsProjects) {
		this.studentsProjects = studentsProjects;
	}
	public Integer getGenre1Type1Count() {
		return genre1Type1Count;
	}
	public void setGenre1Type1Count(Integer genre1Type1Count) {
		this.genre1Type1Count = genre1Type1Count;
	}
	public Integer getGenre1Type2Count() {
		return genre1Type2Count;
	}
	public void setGenre1Type2Count(Integer genre1Type2Count) {
		this.genre1Type2Count = genre1Type2Count;
	}
	public Double getGenre1Type1Amount() {
		return genre1Type1Amount;
	}
	public void setGenre1Type1Amount(Double genre1Type1Amount) {
		this.genre1Type1Amount = genre1Type1Amount;
	}
	public Double getGenre1Type2Amount() {
		return genre1Type2Amount;
	}
	public void setGenre1Type2Amount(Double genre1Type2Amount) {
		this.genre1Type2Amount = genre1Type2Amount;
	}
	public Integer getGenre2Type1Count() {
		return genre2Type1Count;
	}
	public void setGenre2Type1Count(Integer genre2Type1Count) {
		this.genre2Type1Count = genre2Type1Count;
	}
	public Integer getGenre2Type2Count() {
		return genre2Type2Count;
	}
	public void setGenre2Type2Count(Integer genre2Type2Count) {
		this.genre2Type2Count = genre2Type2Count;
	}
	public Double getGenre2Type1Amount() {
		return genre2Type1Amount;
	}
	public void setGenre2Type1Amount(Double genre2Type1Amount) {
		this.genre2Type1Amount = genre2Type1Amount;
	}
	public Double getGenre2Type2Amount() {
		return genre2Type2Amount;
	}
	public void setGenre2Type2Amount(Double genre2Type2Amount) {
		this.genre2Type2Amount = genre2Type2Amount;
	}
	public Integer getGenre3Type1Count() {
		return genre3Type1Count;
	}
	public void setGenre3Type1Count(Integer genre3Type1Count) {
		this.genre3Type1Count = genre3Type1Count;
	}
	public Integer getGenre3Type2Count() {
		return genre3Type2Count;
	}
	public void setGenre3Type2Count(Integer genre3Type2Count) {
		this.genre3Type2Count = genre3Type2Count;
	}
	public Double getGenre3Type1Amount() {
		return genre3Type1Amount;
	}
	public void setGenre3Type1Amount(Double genre3Type1Amount) {
		this.genre3Type1Amount = genre3Type1Amount;
	}
	public Double getGenre3Type2Amount() {
		return genre3Type2Amount;
	}
	public void setGenre3Type2Amount(Double genre3Type2Amount) {
		this.genre3Type2Amount = genre3Type2Amount;
	}
	public Integer getGenre4Type1Count() {
		return genre4Type1Count;
	}
	public void setGenre4Type1Count(Integer genre4Type1Count) {
		this.genre4Type1Count = genre4Type1Count;
	}
	public Integer getGenre4Type2Count() {
		return genre4Type2Count;
	}
	public void setGenre4Type2Count(Integer genre4Type2Count) {
		this.genre4Type2Count = genre4Type2Count;
	}
	public Double getGenre4Type1Amount() {
		return genre4Type1Amount;
	}
	public void setGenre4Type1Amount(Double genre4Type1Amount) {
		this.genre4Type1Amount = genre4Type1Amount;
	}
	public Double getGenre4Type2Amount() {
		return genre4Type2Amount;
	}
	public void setGenre4Type2Amount(Double genre4Type2Amount) {
		this.genre4Type2Amount = genre4Type2Amount;
	}
	
	/** Member fees in euros */
	public Double getMemberFees1Amount() {
		return memberFees1Amount;
	}
	/** Member fees in euros */
	public void setMemberFees1Amount(Double memberFees1Amount) {
		this.memberFees1Amount = memberFees1Amount;
	}
	/** Member fees in euros */
	public Double getMemberFees2Amount() {
		return memberFees2Amount;
	}
	/** Member fees in euros */
	public void setMemberFees2Amount(Double memberFees2Amount) {
		this.memberFees2Amount = memberFees2Amount;
	}
	/** Active members in number of persons ("aktiiviharrastajat").
	 * @return list of members DTO */
//	public List<MembersDTO> getActiveMembersCount() {
	//	return activeMembersCount;
	//}
	/** Active members in number of persons ("aktiiviharrastajat")
	 * @param list of members DTO */
	//public void setActiveMembersCount(List<MembersDTO> activeMembersCount) {
		//this.activeMembersCount = activeMembersCount;
	//}
	/** Instructors in number of persons ("Valmentaja / ohjaaja") */
	public Integer getInstructorCount() {
		return instructorCount;
	}
	/** Instructors in number of persons ("Valmentaja / ohjaaja") */
	public void setInstructorCount(Integer instructorCount) {
		this.instructorCount = instructorCount;
	}
	/** Trained instructors in number of persons ("Valmentaja / ohjaaja") */
	public Integer getTrainedInstructorCount() {
		return trainedInstructorCount;
	}
	/** Instructors in number of persons ("Valmentaja / ohjaaja") */
	public void setTrainedInstructorCount(Integer trainedInstructorCount) {
		this.trainedInstructorCount = trainedInstructorCount;
	}
	public List<SportType> getSports() {
		return sports;
	}
	public void setSports(List<SportType> sports) {
		this.sports = sports;
	}
	public List<SportType> getSports1() {
		return sports1;
	}
	public void setSports1(List<SportType> sports1) {
		this.sports1 = sports1;
	}
	public List<SupportedUse> getPreviousSupportedUse() {
		return previousSupportedUse;
	}
	public void setPreviousSupportedUse(List<SupportedUse> previousSupportedUse) {
		this.previousSupportedUse = previousSupportedUse;
	}
	public Integer getPersonMembersCommunityImmigrants() {
		return personMembersCommunityImmigrants;
	}
	public void setPersonMembersCommunityImmigrants(
			Integer personMembersCommunityImmigrants) {
		this.personMembersCommunityImmigrants = personMembersCommunityImmigrants;
	}
	public Integer getCommunityMembersCommunityImmigrants() {
		return communityMembersCommunityImmigrants;
	}
	public void setCommunityMembersCommunityImmigrants(
			Integer communityMembersCommunityImmigrants) {
		this.communityMembersCommunityImmigrants = communityMembersCommunityImmigrants;
	}
	public Integer getPersonMembersSubAssociationImmigrants() {
		return personMembersSubAssociationImmigrants;
	}
	public void setPersonMembersSubAssociationImmigrants(
			Integer personMembersSubAssociationImmigrants) {
		this.personMembersSubAssociationImmigrants = personMembersSubAssociationImmigrants;
	}
	public Integer getCommunityMembersSubAssociationImmigrants() {
		return communityMembersSubAssociationImmigrants;
	}
	public void setCommunityMembersSubAssociationImmigrants(
			Integer communityMembersSubAssociationImmigrants) {
		this.communityMembersSubAssociationImmigrants = communityMembersSubAssociationImmigrants;
	}
	public Integer getPersonMembersSubdivisionImmigrants() {
		return personMembersSubdivisionImmigrants;
	}
	public void setPersonMembersSubdivisionImmigrants(
			Integer personMembersSubdivisionImmigrants) {
		this.personMembersSubdivisionImmigrants = personMembersSubdivisionImmigrants;
	}
	public Integer getCommunityMembersSubdivisionImmigrants() {
		return communityMembersSubdivisionImmigrants;
	}
	public void setCommunityMembersSubdivisionImmigrants(
			Integer communityMembersSubdivisionImmigrants) {
		this.communityMembersSubdivisionImmigrants = communityMembersSubdivisionImmigrants;
	}
	
	public String getMission() {
		return mission;
	}
	public void setMission(String mission) {
		this.mission = mission;
	}
	public String getVision() {
		return vision;
	}
	public void setVision(String vision) {
		this.vision = vision;
	}
	public String getDiversity() {
		return diversity;
	}
	public void setDiversity(String diversity) {
		this.diversity = diversity;
	}
	public String getAccessibility() {
		return accessibility;
	}
	public void setAccessibility(String accessibility) {
		this.accessibility = accessibility;
	}
	public String getParticipation() {
		return participation;
	}
	public void setParticipation(String participation) {
		this.participation = participation;
	}
	public String getFunctionalQuality() {
		return functionalQuality;
	}
	public void setFunctionalQuality(String functionalQuality) {
		this.functionalQuality = functionalQuality;
	}
	public String getTargetGroups() {
		return targetGroups;
	}
	public void setTargetGroups(String targetGroups) {
		this.targetGroups = targetGroups;
	}
	public String getCooperationPartner() {
		return cooperationPartner;
	}
	public void setCooperationPartner(String cooperationPartner) {
		this.cooperationPartner = cooperationPartner;
	}
	public Integer getPersonnelAll() {
		return personnelAll;
	}
	public void setPersonnelAll(Integer personnelAll) {
		this.personnelAll = personnelAll;
	}
	public Integer getPersonnelPermanent() {
		return personnelPermanent;
	}
	public void setPersonnelPermanent(Integer personnelPermanent) {
		this.personnelPermanent = personnelPermanent;
	}
	public Integer getPersonnelParttime() {
		return personnelParttime;
	}
	public void setPersonnelParttime(Integer personnelParttime) {
		this.personnelParttime = personnelParttime;
	}
	public Integer getPersonnelVoluntary() {
		return personnelVoluntary;
	}
	public void setPersonnelVoluntary(Integer personnelVoluntary) {
		this.personnelVoluntary = personnelVoluntary;
	}
	public Integer getStudentsEarlyAll() {
		return studentsEarlyAll;
	}
	public void setStudentsEarlyAll(Integer studentsEarlyAll) {
		this.studentsEarlyAll = studentsEarlyAll;
	}
	public Integer getStudentsEarlyBoys() {
		return studentsEarlyBoys;
	}
	public void setStudentsEarlyBoys(Integer studentsEarlyBoys) {
		this.studentsEarlyBoys = studentsEarlyBoys;
	}
	public Integer getStudentsEarlyGirls() {
		return studentsEarlyGirls;
	}
	public void setStudentsEarlyGirls(Integer studentsEarlyGirls) {
		this.studentsEarlyGirls = studentsEarlyGirls;
	}
	public Integer getStudentsLargeAll() {
		return studentsLargeAll;
	}
	public void setStudentsLargeAll(Integer studentsLargeAll) {
		this.studentsLargeAll = studentsLargeAll;
	}
	public Integer getStudentsLargeBoys() {
		return studentsLargeBoys;
	}
	public void setStudentsLargeBoys(Integer studentsLargeBoys) {
		this.studentsLargeBoys = studentsLargeBoys;
	}
	public Integer getStudentsLargeGirls() {
		return studentsLargeGirls;
	}
	public void setStudentsLargeGirls(Integer studentsLargeGirls) {
		this.studentsLargeGirls = studentsLargeGirls;
	}
	public Integer getStudentsAdvancedAll() {
		return studentsAdvancedAll;
	}
	public void setStudentsAdvancedAll(Integer studentsAdvancedAll) {
		this.studentsAdvancedAll = studentsAdvancedAll;
	}
	public Integer getStudentsAdvancedBoys() {
		return studentsAdvancedBoys;
	}
	public void setStudentsAdvancedBoys(Integer studentsAdvancedBoys) {
		this.studentsAdvancedBoys = studentsAdvancedBoys;
	}
	public Integer getStudentsAdvancedGirls() {
		return studentsAdvancedGirls;
	}
	public void setStudentsAdvancedGirls(Integer studentsAdvancedGirls) {
		this.studentsAdvancedGirls = studentsAdvancedGirls;
	}
	public Integer getStudentsBasicAll() {
		return studentsBasicAll;
	}
	public void setStudentsBasicAll(Integer studentsBasicAll) {
		this.studentsBasicAll = studentsBasicAll;
	}
	public Integer getStudentsBasicBoys() {
		return studentsBasicBoys;
	}
	public void setStudentsBasicBoys(Integer studentsBasicBoys) {
		this.studentsBasicBoys = studentsBasicBoys;
	}
	public Integer getStudentsBasicGirls() {
		return studentsBasicGirls;
	}
	public void setStudentsBasicGirls(Integer studentsBasicGirls) {
		this.studentsBasicGirls = studentsBasicGirls;
	}
	public Integer getLessonsEarly() {
		return lessonsEarly;
	}
	public void setLessonsEarly(Integer lessonsEarly) {
		this.lessonsEarly = lessonsEarly;
	}
	public Integer getLessonsLarge() {
		return lessonsLarge;
	}
	public void setLessonsLarge(Integer lessonsLarge) {
		this.lessonsLarge = lessonsLarge;
	}
	public Integer getLessonsAdvanced() {
		return lessonsAdvanced;
	}
	public void setLessonsAdvanced(Integer lessonsAdvanced) {
		this.lessonsAdvanced = lessonsAdvanced;
	}
	public Integer getLessonsBasic() {
		return lessonsBasic;
	}
	public void setLessonsBasic(Integer lessonsBasic) {
		this.lessonsBasic = lessonsBasic;
	}
	public Integer getTeachersAll() {
		return teachersAll;
	}
	public void setTeachersAll(Integer teachersAll) {
		this.teachersAll = teachersAll;
	}
	public String getWayToTakePupils() {
		return wayToTakePupils;
	}
	public void setWayToTakePupils(String wayToTakePupils) {
		this.wayToTakePupils = wayToTakePupils;
	}
	public String getIndividualisation() {
		return individualisation;
	}
	public void setIndividualisation(String individualisation) {
		this.individualisation = individualisation;
	}
	public String getFreeStudentPlaces() {
		return freeStudentPlaces;
	}
	public void setFreeStudentPlaces(String freeStudentPlaces) {
		this.freeStudentPlaces = freeStudentPlaces;
	}
	public String getSelfAssessment() {
		return selfAssessment;
	}
	public void setSelfAssessment(String selfAssessment) {
		this.selfAssessment = selfAssessment;
	}
	public String getFeedbackFromParents() {
		return feedbackFromParents;
	}
	public void setFeedbackFromParents(String feedbackFromParents) {
		this.feedbackFromParents = feedbackFromParents;
	}
	public String getActivitiesDescription() {
		return activitiesDescription;
	}
	public void setActivitiesDescription(String activitiesDescription) {
		this.activitiesDescription = activitiesDescription;
	}
	public String getActivitiesTarget() {
		return activitiesTarget;
	}
	public void setActivitiesTarget(String activitiesTarget) {
		this.activitiesTarget = activitiesTarget;
	}
	public Integer getLastYearIncomes() {
		return lastYearIncomes;
	}
	public void setLastYearIncomes(Integer lastYearIncomes) {
		this.lastYearIncomes = lastYearIncomes;
	}
	public Integer getLastYearExpenses() {
		return lastYearExpenses;
	}
	public void setLastYearExpenses(Integer lastYearExpenses) {
		this.lastYearExpenses = lastYearExpenses;
	}
	
	public String getEquality() {
		return equality;
	}

	public void setEquality(String equality) {
		this.equality = equality;
	}
	
	public boolean getEqualitySelection() {
		return equalitySelection;
	}

	public void setEqualitySelection(boolean equalitySelection) {
		this.equalitySelection = equalitySelection;
	}
	
	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}
	
	public boolean getCommunitySelection() {
		return communitySelection;
	}

	public void setCommunitySelection(boolean communitySelection) {
		this.communitySelection = communitySelection;
	}
	
	public String getEnvironmental() {
		return environmental;
	}

	public void setEnvironmental(String environmental) {
		this.environmental = environmental;
	}
	
	public boolean getEnvironmentalSelection() {
		return environmentalSelection;
	}

	public void setEnvironmentalSelection(boolean environmentalSelection) {
		this.environmentalSelection = environmentalSelection;
	}
	
	public String getExcersice() {
		return excersice;
	}

	public void setExcersice(String excersice) {
		this.excersice = excersice;
	}
	
	public boolean getExcersiceSelection() {
		return excersiceSelection;
	}

	public void setExcersiceSelection(boolean excersiceSelection) {
		this.excersiceSelection = excersiceSelection;
	}
	
	public String getDailyactivity() {
		return dailyactivity;
	}

	public void setDailyactivity(String dailyactivity) {
		this.dailyactivity = dailyactivity;
	}
	
	public boolean getDailyactivitySelection() {
		return dailyactivitySelection;
	}

	public void setDailyactivitySelection(boolean dailyactivitySelection) {
		this.dailyactivitySelection = dailyactivitySelection;
	}
	
}
