package com.ibm.coh.avustus.data;

public class Address {

	private String location;
	private String street;
	private String city;
	private String postalCode;
	
	public Address() {
		
	}
	
	public Address(Address address) {
		if(address.getLocation() != null) setLocation(new String(address.getLocation()));
		if(address.getStreet() != null) setStreet(new String(address.getStreet()));
		if(address.getCity() != null) setCity(new String(address.getCity()));
		if(address.getPostalCode() != null) setPostalCode(new String(address.getPostalCode()));
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
