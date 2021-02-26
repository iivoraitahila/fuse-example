package com.redhat.examples.fuse.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import fi.hel.avustus.json.Application;
import fi.hel.avustus.json.Header;
import fi.hel.avustus.json.User;

public class SubventionRequest {

	private final Header header;
	private final User user;
	private final Application application;

	@JsonCreator
	public SubventionRequest(
			@JsonProperty("header") Header header,
			@JsonProperty("user") User user,
			@JsonProperty("application") Application application) {
		this.header = header;
		this.user = user;
		this.application = application;
		System.out.println("MOI " + user.getFirstName());
	}

	public Header getHeader() {
		return header;
	}

	public User getUser() {
		return user;
	}

	public Application getApplication() {
		return application;
	}

}
