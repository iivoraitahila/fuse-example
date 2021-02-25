package com.ibm.coh.applicantregistry.ws.data;

public class PersonContactDTO {
	
	private String name;
	private String address;
	private String postalCode;
	private String city;
	private String email;
	private String phone;
	private String role;
	
	private String surname;
	private Integer yearOfBirth;
	private String occupation;
	private String education;
	private String homeTown;
	private String hetu;
	private Double amount;
	private Integer count;
	
	// when opening, need to know whether had come from register -> was readonly
	private boolean readOnlyWhenSaved;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isReadOnlyWhenSaved() {
		return readOnlyWhenSaved;
	}
	public void setReadOnlyWhenSaved(boolean readOnlyWhenSaved) {
		this.readOnlyWhenSaved = readOnlyWhenSaved;
	}
	public String getHetu() {
		return hetu;
	}
	public void setHetu(String hetu) {
		this.hetu = hetu;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

}
