package com.ERA.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetOtpTest {

	@Test
	public String getotp(String Name, String number) throws IOException {

		String URLL = (String) new com.ERA.testcases.API_GetBaseURLTest().GetBaseUrl();
////////////////////////////////Get Request///////////////////////////////////	
		String mobileNumwithCode = "%2B" + number;
		System.out.println("mobileNumwithCode is  - " + mobileNumwithCode);
		RestAssured.baseURI = URLL + "/api/userlogin";
		RestAssured.urlEncodingEnabled = false;
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest.queryParam("mobileNumber", mobileNumwithCode).get("/GetUserOTPMessage");

////////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		JsonPath jpath = new JsonPath(responsebody1);
		String data = jpath.getString("data");
		System.out.println("verfication code is  - " + data);

		return data;
	}
}
