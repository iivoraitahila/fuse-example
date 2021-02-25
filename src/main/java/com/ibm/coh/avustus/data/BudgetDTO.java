package com.ibm.coh.avustus.data;

import java.util.List;
import java.util.ArrayList;

public class BudgetDTO {
	
	// Transaction has no 'UI-related' properties
	
	private List<List<Transaction>> presetIncomes;
	private List<List<Transaction>> otherIncomes;
	private List<List<Transaction>> presetExpenses;
	private List<List<Transaction>> otherExpenses;
	
	private Integer lastYearIncomes;
	private Integer lastYearExpenses;
	
	private Integer otherSoughtSubsidiesAmount;
	private Integer otherGrantedSubsidiesAmount;
	
	private String otherSoughtSubsidiesProvider;
	private String otherGrantedSubsidiesProvider;
	
	public List<List<Transaction>> getPresetIncomes() {
		if (presetIncomes == null) presetIncomes = new ArrayList<List<Transaction>>();
		return presetIncomes;
	}
	public void setPresetIncomes(List<List<Transaction>> presetIncomes) {
		this.presetIncomes = presetIncomes;
	}
	public List<List<Transaction>> getOtherIncomes() {
		if (otherIncomes == null) otherIncomes = new ArrayList<List<Transaction>>();
		return otherIncomes;
	}
	public void setOtherIncomes(List<List<Transaction>> otherIncomes) {
		this.otherIncomes = otherIncomes;
	}
	public List<List<Transaction>> getPresetExpenses() {
		if (presetExpenses == null) presetExpenses = new ArrayList<List<Transaction>>();
		return presetExpenses;
	}
	public void setPresetExpenses(List<List<Transaction>> presetExpenses) {
		this.presetExpenses = presetExpenses;
	}
	public List<List<Transaction>> getOtherExpenses() {
		if (otherExpenses == null) otherExpenses = new ArrayList<List<Transaction>>();
		return otherExpenses;
	}
	public void setOtherExpenses(List<List<Transaction>> otherExpenses) {
		this.otherExpenses = otherExpenses;
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
	
	public Integer getOtherSoughtSubsidiesAmount() {
		return otherSoughtSubsidiesAmount;
	}
	public void setOtherSoughtSubsidiesAmount(Integer otherSoughtSubsidiesAmount) {
		this.otherSoughtSubsidiesAmount = otherSoughtSubsidiesAmount;
	}
	
	public Integer getOtherGrantedSubsidiesAmount() {
		return otherGrantedSubsidiesAmount;
	}
	public void setOtherGrantedSubsidiesAmount(Integer otherGrantedSubsidiesAmount) {
		this.otherGrantedSubsidiesAmount = otherGrantedSubsidiesAmount;
	}

	public String getOtherSoughtSubsidiesProvider() {
		return otherSoughtSubsidiesProvider;
	}
	public void setOtherSoughtSubsidiesProvider(String otherSoughtSubsidiesProvider) {
		this.otherSoughtSubsidiesProvider = otherSoughtSubsidiesProvider;
	}
	
	public String getOtherGrantedSubsidiesProvider() {
		return otherGrantedSubsidiesProvider;
	}
	public void setOtherGrantedSubsidiesProvider(String otherGrantedSubsidiesProvider) {
		this.otherGrantedSubsidiesProvider = otherGrantedSubsidiesProvider;
	}
	
	
	
	
	
	
}