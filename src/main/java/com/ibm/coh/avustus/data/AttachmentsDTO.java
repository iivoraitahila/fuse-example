package com.ibm.coh.avustus.data;

import java.util.List;

public class AttachmentsDTO {
	
	private String other;
	private List<FileAttachmentDTO> files;
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public List<FileAttachmentDTO> getFiles() {
		return files;
	}
	public void setFiles(List<FileAttachmentDTO> files) {
		this.files = files;
	}
	

}
