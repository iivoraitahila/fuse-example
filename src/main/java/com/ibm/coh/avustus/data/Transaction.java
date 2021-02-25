package com.ibm.coh.avustus.data;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

	private Double amount;
	private String description;
	private boolean isPredefined = false;
	
	public Transaction(){
		
	}
	
	public Transaction(Transaction toCopy) {
		if(toCopy.getAmount() != null) setAmount(new Double(toCopy.getAmount()));
		if(toCopy.getDescription() != null) setDescription(new String(toCopy.getDescription()));
		setIsPredefined(toCopy.getIsPredefined());
	}

	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getIsPredefined() {
		return isPredefined;
	}
	public void setIsPredefined(boolean isPredefined) {
		this.isPredefined = isPredefined;
	}
	public static List<Transaction> copyList(List<Transaction> transactions) {
		ArrayList<Transaction> copy = new ArrayList<Transaction>();
		
		for(Transaction transaction : transactions){
			copy.add(new Transaction(transaction));
		}
		
		return copy;
	}
	
	
	
	
}
