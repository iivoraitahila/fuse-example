package com.ibm.coh.avustus.data;

import java.util.Date;

public class Bill {

	private String number;
	private Date date;
	private Double amount;
	private String copyAs;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCopyAs() {
		return copyAs;
	}
	public void setCopyAs(String copyAs) {
		this.copyAs = copyAs;
	}
	
	
}
