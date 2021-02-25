package com.ibm.coh.avustus.data;

import java.util.Date;

public class ProjecTDO {
	
	private String projectName;
	private String projectDescription;
	private Date showStartDate;
	private Date showEndDate;
	private Integer showCount;
	private String showLocation;
	
	private Integer participantsGroup1;
	private Integer participantsGroup2;
	private Integer participantsGroup3;
	private Integer participantsGroup4;
	
	private Integer amountStart;
	private Integer amountEnd;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public Date getShowStartDate() {
		return showStartDate;
	}
	public void setShowStartDate(Date showStartDate) {
		this.showStartDate = showStartDate;
	}
	public Date getShowEndDate() {
		return showEndDate;
	}
	public void setShowEndDate(Date showEndDate) {
		this.showEndDate = showEndDate;
	}
	public Integer getShowCount() {
		return showCount;
	}
	public void setShowCount(Integer showCount) {
		this.showCount = showCount;
	}
	public String getShowLocation() {
		return showLocation;
	}
	public void setShowLocation(String showLocation) {
		this.showLocation = showLocation;
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
	public Integer getAmountStart() {
		return amountStart;
	}
	public void setAmountStart(Integer amountStart) {
		this.amountStart = amountStart;
	}
	public Integer getAmountEnd() {
		return amountEnd;
	}
	public void setAmountEnd(Integer amountEnd) {
		this.amountEnd = amountEnd;
	}

}
