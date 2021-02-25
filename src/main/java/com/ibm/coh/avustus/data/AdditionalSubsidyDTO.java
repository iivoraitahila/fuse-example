package com.ibm.coh.avustus.data;

import java.util.Date;

public class AdditionalSubsidyDTO {

	private String use;
	private Double amount;
	private String literalAmount;
	private Date startDate;
	private Date endDate;
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
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
}
