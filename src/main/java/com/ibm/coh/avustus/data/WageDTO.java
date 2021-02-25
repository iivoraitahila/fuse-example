package com.ibm.coh.avustus.data;

public class WageDTO {

	private Double employeeSalaryExpenses;
	private Double socialAndInsuranceExpenses;
	private Double employeeTravelExpenses;
	
	public Double getEmployeeTravelExpenses() {
		return employeeTravelExpenses;
	}
	public void setEmployeeTravelExpenses(Double employeeTravelExpenses) {
		this.employeeTravelExpenses = employeeTravelExpenses;
	}
	public Double getSocialAndInsuranceExpenses() {
		return socialAndInsuranceExpenses;
	}
	public void setSocialAndInsuranceExpenses(Double socialAndInsuranceExpenses) {
		this.socialAndInsuranceExpenses = socialAndInsuranceExpenses;
	}
	public Double getEmployeeSalaryExpenses() {
		return employeeSalaryExpenses;
	}
	public void setEmployeeSalaryExpenses(Double employeeSalaryExpenses) {
		this.employeeSalaryExpenses = employeeSalaryExpenses;
	}
}
