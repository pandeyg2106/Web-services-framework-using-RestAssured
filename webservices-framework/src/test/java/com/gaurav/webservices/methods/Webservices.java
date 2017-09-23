package com.gaurav.webservices.methods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class Webservices {
	
	public static Response Post(String URI, String stringJSON){
		
		RequestSpecification requestspecificification = RestAssured.given().body(stringJSON);
		requestspecificification.contentType(ContentType.JSON);
		Response response = requestspecificification.post(URI);
		return response;
	}
	
	public static Response Get(String URI){
		RequestSpecification requestspecification = RestAssured.given();
		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.get(URI);
		return response;
	}
	
	public static Response Put(String URI, String stringJSON){
		
		RequestSpecification requestspecification = RestAssured.given().body(stringJSON);
		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.put(URI);
		return response;
	}

	public static Response Delete(String URI){
		
		RequestSpecification requestspecification = RestAssured.given();
		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.delete(URI);
		return response;
	}
	
}
