package com.gaurav.utils;

public enum EndpointURL {
	
/*	ADD_COUNTRY("/countries/details"),
	UPDATE_COUNTRY("/countries/update/details"),
	GET_COUNTRY_BY_ID("/country/get/all"),
	DELETE_COUNTRY("/country/"),*/
	GET_COUNTRIES("/country/get/all");
	
	String resourcepath;
	
	private EndpointURL(String resourcepath) {
		this.resourcepath = resourcepath;
	}
	
	public String getResourcePath(){
		return this.resourcepath;
	}
	
	public String getResourcePath(String data){
		return this.resourcepath+data;
	}

}
