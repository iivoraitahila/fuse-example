package com.ibm.coh.avustus.data;

import java.util.Date;
import java.util.List;

public class CompensationDTO {

	private String letterNumber;
	private Date letterDate;
	private Date compensationStart;
	private Date compensationEnd;
	private Double amount;
	private String studentName;
	private String parentName;
	private String parentAddress;
	
	// Bill data, no UI information - no DTO
	private List<Bill> bills;

	public String getLetterNumber() {
		return letterNumber;
	}

	public void setLetterNumber(String letterNumber) {
		this.letterNumber = letterNumber;
	}

	public Date getLetterDate() {
		return letterDate;
	}

	public void setLetterDate(Date letterDate) {
		this.letterDate = letterDate;
	}

	public Date getCompensationStart() {
		return compensationStart;
	}

	public void setCompensationStart(Date compensationStart) {
		this.compensationStart = compensationStart;
	}

	public Date getCompensationEnd() {
		return compensationEnd;
	}

	public void setCompensationEnd(Date compensationEnd) {
		this.compensationEnd = compensationEnd;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentAddress() {
		return parentAddress;
	}

	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

}
