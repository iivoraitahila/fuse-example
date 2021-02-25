package com.ibm.coh.avustus.data;

import java.util.Date;



public class ArtTypeDTO {
	
	// selected art type
	private String artType;
	private String artSubType;
	private String isFestival;
	private Date premiereDate;
	private String premiereLocation;
	private Integer showCount;
	private Integer crowdCount;
	public String getArtType() {
		return artType;
	}
	public void setArtType(String artType) {
		this.artType = artType;
	}
	public String getIsFestival() {
		return isFestival;
	}
	public void setIsFestival(String isFestival) {
		this.isFestival = isFestival;
	}
	public Date getPremiereDate() {
		return premiereDate;
	}
	public void setPremiereDate(Date premiereDate) {
		this.premiereDate = premiereDate;
	}
	public String getPremiereLocation() {
		return premiereLocation;
	}
	public void setPremiereLocation(String premiereLocation) {
		this.premiereLocation = premiereLocation;
	}
	public Integer getShowCount() {
		return showCount;
	}
	public void setShowCount(Integer showCount) {
		this.showCount = showCount;
	}
	public Integer getCrowdCount() {
		return crowdCount;
	}
	public void setCrowdCount(Integer crowdCount) {
		this.crowdCount = crowdCount;
	}
	public String getArtSubType() {
		return artSubType;
	}
	public void setArtSubType(String artSubType) {
		this.artSubType = artSubType;
	}

}
