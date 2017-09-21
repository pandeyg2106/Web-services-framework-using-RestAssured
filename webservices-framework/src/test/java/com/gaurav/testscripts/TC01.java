package com.gaurav.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gaurav.pojoclass.GetCountries;
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
		
		Gson gson = new GsonBuilder().create();
		GetCountries[] getCountries;
		String url = URL.fixedurl + EndpointURL.GET_COUNTRIES.getResourcePath();
		response = Webservices.Get(url);
		System.out.println(response.getBody().asString());
		if(response.getStatusCode() == 200){
			getCountries = gson.fromJson(response.getBody().asString(), GetCountries[].class);
			for(int i=1;i<=getCountries.length;i++){
				System.out.println(getCountries[i].getAlpha3Code());
			}			
		}
			
	}	

}
