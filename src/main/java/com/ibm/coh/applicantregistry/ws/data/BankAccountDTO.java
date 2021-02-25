package com.ibm.coh.applicantregistry.ws.data;

public class BankAccountDTO {
	private String iban;
	// when opening, need to know whether had come from register -> was readonly
	private boolean readOnlyWhenSaved;
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public boolean isReadOnlyWhenSaved() {
		return readOnlyWhenSaved;
	}
	public void setReadOnlyWhenSaved(boolean readOnly) {
		this.readOnlyWhenSaved = readOnly;
	} 
	
}
