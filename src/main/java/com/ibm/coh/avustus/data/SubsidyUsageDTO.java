package com.ibm.coh.avustus.data;

import java.util.List;

public class SubsidyUsageDTO{

	private Subsidy subsidy;
	private List<Transaction> presetUsage;
	private List<Transaction> otherUsage;
	public Subsidy getSubsidy() {
		return subsidy;
	}
	public void setSubsidy(Subsidy subsidy) {
		this.subsidy = subsidy;
	}
	public List<Transaction> getPresetUsage() {
		return presetUsage;
	}
	public void setPresetUsage(List<Transaction> presetUsage) {
		this.presetUsage = presetUsage;
	}
	public List<Transaction> getOtherUsage() {
		return otherUsage;
	}
	public void setOtherUsage(List<Transaction> otherUsage) {
		this.otherUsage = otherUsage;
	}
	

	
}
