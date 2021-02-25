package com.ibm.coh.avustus.data;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	private String iban;
	private boolean readOnly = true;
	// when opening, need to know whether had come from register -> was readonly
	private boolean readOnlyWhenSaved;
	
	public BankAccount(){
		
	}
	
	public BankAccount(BankAccount account) {
		if(account.getIban() != null) setIban(new String(account.getIban()));
		setReadOnly(account.getReadOnly());
		setReadOnlyWhenSaved(account.isReadOnlyWhenSaved());
		
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public boolean getReadOnly() {
		return readOnly;
	}
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	public boolean isReadOnlyWhenSaved() {
		return readOnlyWhenSaved;
	}
	public void setReadOnlyWhenSaved(boolean readOnlyWhenSaved) {
		this.readOnlyWhenSaved = readOnlyWhenSaved;
	}
	public static List<BankAccount> copyList(List<BankAccount> bankAccounts) {
		ArrayList<BankAccount> copy = new ArrayList<BankAccount>();
		
		for(BankAccount account : bankAccounts){
			copy.add(new BankAccount(account));
		}
		
		return copy;
	} 
	
	
	

}
