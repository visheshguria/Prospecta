package com.prospecta.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {
	
	@JsonProperty("API")
	private String api;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("Auth")
	private String auth;
	
	@JsonProperty("Https")
	private boolean hTTps;
	
	@JsonProperty("Cors")
	private String cors;
	
	@JsonProperty("Category")
	private String category;

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public boolean ishTTps() {
		return hTTps;
	}

	public void sethTTps(boolean hTTps) {
		this.hTTps = hTTps;
	}

	public String getCors() {
		return cors;
	}

	public void setCors(String cors) {
		this.cors = cors;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Entry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entry(String api, String description, String auth, boolean hTTps, String cors, String category) {
		super();
		this.api = api;
		this.description = description;
		this.auth = auth;
		this.hTTps = hTTps;
		this.cors = cors;
		this.category = category;
	}
	
	
	
}
