package com.ERA.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class GetOtpTest {

	@Test
	 public String  getotp(String Name,String number) 
	{  
		String mkjf="%2B"+number;
		
		RestAssured.baseURI="http://eraapi2.dev.arabiansystems.com/api/userlogin";
		RestAssured.urlEncodingEnabled = false;
		RequestSpecification httpRequest=RestAssured.given();
		Response res = httpRequest.queryParam("mobileNumber",mkjf).get("/GetUserOTPMessage"); 
		String responsebody1=res.getBody().asString();
		JsonPath jpath = new JsonPath(responsebody1);
		String data = jpath.getString("data");
		System.out.println("dat is  - "+data);
		
		return data;
		 
		
	}

	
	}

