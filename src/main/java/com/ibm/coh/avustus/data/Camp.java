package com.ibm.coh.avustus.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Camp {
	private String organizer;
	private String location;
	private Date startDate;
	private Date endDate;
	private Integer duration;
	private String description;
	private Integer womenUnder29Count;
	private Integer menUnder29Count;
	private Integer totalUnder29Sum;
	private Integer days;
	
	private List<Transaction> presetIncomes;
	private List<Transaction> otherIncomes;
	private List<Transaction> presetExpenses;
	private List<Transaction> otherExpenses;
	

	public Camp(){
		
	}
	
	public Camp(Camp toCopy) {
		if(toCopy.getDays() != null) setDays(new Integer(toCopy.getDays()));
		if(toCopy.getDescription() != null) setDescription(new String(toCopy.getDescription()));
		if(toCopy.getDuration() != null) setDuration(new Integer(toCopy.getDuration()));
		if(toCopy.getEndDate() != null) setEndDate((Date)toCopy.getEndDate().clone());
		if(toCopy.getLocation() != null) setLocation(new String(toCopy.getLocation()));
		if(toCopy.getMenUnder29Count() != null) setMenUnder29Count(new Integer(toCopy.getMenUnder29Count()));
		if(toCopy.getOrganizer() != null) setOrganizer(new String(toCopy.getOrganizer()));
		if(toCopy.getOtherExpenses() != null) setOtherExpenses(Transaction.copyList(toCopy.getOtherExpenses()));
		if(toCopy.getOtherIncomes() != null) setOtherIncomes(Transaction.copyList(toCopy.getOtherIncomes()));
		if(toCopy.getPresetExpenses() != null) setPresetExpenses(Transaction.copyList(toCopy.getPresetExpenses()));
		if(toCopy.getPresetIncomes() != null) setPresetIncomes(Transaction.copyList(toCopy.getPresetIncomes()));
		if(toCopy.getStartDate() != null) setStartDate((Date)toCopy.getStartDate().clone());
//		if(toCopy.getTotalUnder29Count() != null) setTotalUnder29Count(new Integer(toCopy.getTotalUnder29Count()));
		if(toCopy.getWomenUnder29Count() != null) setWomenUnder29Count(new Integer(toCopy.getWomenUnder29Count()));
		if(toCopy.getTotalUnder29Sum() != null) setTotalUnder29Sum(new Integer(toCopy.getTotalUnder29Sum()));
		
	}

	public List<Transaction> getIncomes(){
		List<Transaction> allIncomes = new ArrayList<Transaction>();
		allIncomes.addAll(getPresetIncomes());
		allIncomes.addAll(getOtherIncomes());
		return allIncomes;
	}
	
	public List<Transaction> getExpenses(){
		List<Transaction> allExpenses = new ArrayList<Transaction>();
		allExpenses.addAll(getPresetExpenses());
		allExpenses.addAll(getOtherExpenses());
		return allExpenses;
	}
	
	public String addNewIncome(){
		getOtherIncomes().add(new Transaction());
		return "";
	}
	
	public Double getIncomeTotal(){
		List<Transaction> incomes = getIncomes();
		Iterator<Transaction> iter = incomes.iterator();
		double sum = 0;
		while(iter.hasNext()){
			Transaction transaction = (Transaction)iter.next();
			if(transaction.getAmount() != null)
				sum += transaction.getAmount();
		}
		
		return sum;
		
	}
	
	public Double getExpenseTotal(){
		List<Transaction> expenses = getExpenses();
		Iterator<Transaction> iter = expenses.iterator();
		double sum = 0;
		while(iter.hasNext()){
			Transaction transaction = (Transaction)iter.next();
			if(transaction.getAmount() != null)
				sum += transaction.getAmount();
		}
		
		return sum;
		
	}
	
	public Integer getTotalUnder29Sum() {
		if(getMenUnder29Count()!=null && getWomenUnder29Count()!=null){
			Integer sum = 0;
			sum = getMenUnder29Count() + getWomenUnder29Count();
			return sum;
		}else{
			return totalUnder29Sum;
		}
	}
	
	/* Standard getters and setters */
	
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getWomenUnder29Count() {
		return womenUnder29Count;
	}
	public void setWomenUnder29Count(Integer womenUnder29Count) {
		this.womenUnder29Count = womenUnder29Count;
	}
	public Integer getMenUnder29Count() {
		return menUnder29Count;
	}
	public void setMenUnder29Count(Integer menUnder29Count) {
		this.menUnder29Count = menUnder29Count;
	}
//	public void setTotalUnder29Count(Integer totalUnder29Count) {
//		this.totalUnder29Count = totalUnder29Count;
//	}
//	public Integer getTotalUnder29Count() {
//		return totalUnder29Count;
//	}
	public void setTotalUnder29Sum(Integer totalUnder29Sum) {
		this.totalUnder29Sum = totalUnder29Sum;
	}

	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	public List<Transaction> getPresetIncomes() {
		if(presetIncomes == null) presetIncomes = new ArrayList<Transaction>();
		return presetIncomes;
	}
	public void setPresetIncomes(List<Transaction> presetIncomes) {
		this.presetIncomes = presetIncomes;
	}
	public List<Transaction> getOtherIncomes() {
		if(otherIncomes == null) otherIncomes = new ArrayList<Transaction>();
		return otherIncomes;
	}
	public void setOtherIncomes(List<Transaction> incomes) {
		this.otherIncomes = incomes;
	}
	public List<Transaction> getPresetExpenses() {
		if(presetExpenses == null) presetExpenses = new ArrayList<Transaction>();
		return presetExpenses;
	}
	public void setPresetExpenses(List<Transaction> presetExpenses) {
		this.presetExpenses = presetExpenses;
	}
	public List<Transaction> getOtherExpenses() {
		if(otherExpenses == null) otherExpenses = new ArrayList<Transaction>();
		return otherExpenses;
	}
	public void setOtherExpenses(List<Transaction> expenses) {
		this.otherExpenses = expenses;
	}
	
	
}
