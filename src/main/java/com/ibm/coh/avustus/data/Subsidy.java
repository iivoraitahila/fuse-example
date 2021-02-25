package com.ibm.coh.avustus.data;

import java.util.Date;
import java.util.List;

//import javax.faces.model.SelectItem;

//import com.ibm.coh.eservicescommon.jsf.helpers.components.SelectionList;

public class Subsidy {

	private String name;
	private String location;
	private String type;
	private Double amount;
	private String literalAmount;
	private String community;
	private Integer year;
	private Double amountLastYear;
	private String authority;
	private String usage;
	private String useOfPrevious;
	private Date startDate;
	private Date endDate;
	private String description;
	
	private String projectName;
	private Integer amountEventdays;
	private Integer amountShows;
	private Integer estimatedVisitors;
	private String placePremier;
	private Date datePremier;
	
	private String isFestival; 
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getLiteralAmount() {
		return literalAmount;
	}
	public void setLiteralAmount(String literalAmount) {
		this.literalAmount = literalAmount;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Double getAmountLastYear() {
		return amountLastYear;
	}
	public void setAmountLastYear(Double amountLastYear) {
		this.amountLastYear = amountLastYear;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getUseOfPrevious() {
		return useOfPrevious;
	}
	public void setUseOfPrevious(String useOfPrevious) {
		this.useOfPrevious = useOfPrevious;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAmountEventdays() {
		return amountEventdays;
	}
	public void setAmountEventdays(Integer amountEventdays) {
		this.amountEventdays = amountEventdays;
	}
	public Integer getAmountShows() {
		return amountShows;
	}
	public void setAmountShows(Integer amountShows) {
		this.amountShows = amountShows;
	}
	public Integer getEstimatedVisitors() {
		return estimatedVisitors;
	}
	public void setEstimatedVisitors(Integer estimatedVisitors) {
		this.estimatedVisitors = estimatedVisitors;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getPlacePremier() {
		return placePremier;
	}
	public void setPlacePremier(String placePremier) {
		this.placePremier = placePremier;
	}
	public Date getDatePremier() {
		return datePremier;
	}
	public void setDatePremier(Date datePremier) {
		this.datePremier = datePremier;
	}
	public String getIsFestival() {
		return isFestival;
	}
	public void setIsFestival(String isFestival) {
		this.isFestival = isFestival;
	}
	
	/**public List<SelectItem> getFestivalSelections(){
		return SelectionList.createSelectItems("/properties/pages/subsidy.properties", "com.ibm.coh.avustus.nl.subsidy", "selectionItems_isFestival");
	}**/
	@Override
	public String toString() {
		return "Subsidy ["
				+ (name != null ? "name=" + name + ", " : "")
				+ (location != null ? "location=" + location + ", " : "")
				+ (type != null ? "type=" + type + ", " : "")
				+ (amount != null ? "amount=" + amount + ", " : "")
				+ (literalAmount != null ? "literalAmount=" + literalAmount
						+ ", " : "")
				+ (community != null ? "community=" + community + ", " : "")
				+ (year != null ? "year=" + year + ", " : "")
				+ (amountLastYear != null ? "amountLastYear=" + amountLastYear
						+ ", " : "")
				+ (authority != null ? "authority=" + authority + ", " : "")
				+ (usage != null ? "usage=" + usage + ", " : "")
				+ (useOfPrevious != null ? "useOfPrevious=" + useOfPrevious
						+ ", " : "")
				+ (startDate != null ? "startDate=" + startDate + ", " : "")
				+ (endDate != null ? "endDate=" + endDate + ", " : "")
				+ (description != null ? "description=" + description + ", "
						: "")
				+ (projectName != null ? "projectName=" + projectName + ", "
						: "")
				+ (amountEventdays != null ? "amountEventdays="
						+ amountEventdays + ", " : "")
				+ (amountShows != null ? "amountShows=" + amountShows + ", "
						: "")
				+ (estimatedVisitors != null ? "estimatedVisitors="
						+ estimatedVisitors + ", " : "")
				+ (placePremier != null ? "placePremier=" + placePremier + ", "
						: "")
				+ (datePremier != null ? "datePremier=" + datePremier + ", "
						: "")
				+ (isFestival != null ? "isFestival=" + isFestival : "") + "]";
	}
	
	
}
