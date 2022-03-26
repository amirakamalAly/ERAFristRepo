package com.ERA.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Driver_savemissingfieldvalue_Test extends Base{

	@Test(dataProvider = "access_token", priority = 1)
	
	public void savemissingfieldvalue(String Name,String MobileNumber,String RequestId,String JoborderId,String access_token) throws IOException {

		String driverBaseURL = (String) new com.ERA.testcases.API_GetBaseURLTest().GetrdriverBaseUrl();
	//	String access_token = (String) new com.ERA.testcases.API_Driver_Login_Test(). driverLogin();

////////////////////////////////Get Request///////////////////////////////////	
		RestAssured.baseURI =driverBaseURL + "/api/v1/fleetjobs";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest
				.queryParam("access_token", access_token)
				.queryParam("gx", "30.239421666666665")
				.queryParam("jobId", JoborderId)
				.queryParam("gy", "31.483515000000004")
				.queryParam("fieldName", "make")
				.queryParam("fieldValue", "2")
				.get("/savemissingfieldvalue");

////////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
		JsonPath path = new JsonPath(responsebody1);
		boolean Success = path.get("success");
		
		Assert.assertEquals(Success, true);
		
	}
}
