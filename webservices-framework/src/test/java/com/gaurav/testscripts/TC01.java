package com.gaurav.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gaurav.pojoclasses.GetCountriesResponse;
import com.gaurav.utils.EndpointURL;
import com.gaurav.utils.URL;
import com.gaurav.webservices.methods.Webservices;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jayway.restassured.response.Response;

public class TC01 {
	
	Response response;
	@BeforeClass
	public void setup(){
		
		
	}
	@Test
	public void verifyGetCountries(){
		
		GetCountriesResponse getCountriesResponse = new GetCountriesResponse();
		Gson gson = new GsonBuilder().create();

		String url = URL.fixedurl+EndpointURL.GET_COUNTRIES.getResourcePath();
		//System.out.println(url);
		response = Webservices.Get(url);
		System.out.println(response.asString());
		if(response.getStatusCode()==200){
			getCountriesResponse = gson.fromJson(response.getBody().asString(), GetCountriesResponse.class);
			
			for(int i=0;i<getCountriesResponse.getRestResponse().getResult().size();i++){

				System.out.println(getCountriesResponse.getRestResponse().getResult().get(i).getName());
			}			
		}
			
	}
}
