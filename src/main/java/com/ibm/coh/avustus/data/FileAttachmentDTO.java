package com.ibm.coh.avustus.data;

public class FileAttachmentDTO {
	
	private String description;
	private boolean descriptionEditable = false;
	// if has filename (submitted forms), will be shown when opened
	private String fileName;
	private boolean isRequired;
	private boolean byMail;
	// backend-specific id
	private int fileType;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDescriptionEditable() {
		return descriptionEditable;
	}
	public void setDescriptionEditable(boolean descriptionEditable) {
		this.descriptionEditable = descriptionEditable;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public boolean isRequired() {
		return isRequired;
	}
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}
	public boolean isByMail() {
		return byMail;
	}
	public void setByMail(boolean byMail) {
		this.byMail = byMail;
	}
	public int getFileType() {
		return fileType;
	}
	public void setFileType(int fileType) {
		this.fileType = fileType;
	}

}
