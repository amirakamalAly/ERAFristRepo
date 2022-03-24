package com.ERA.testcases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetTokenValue extends Base {

	@Test(dataProvider = "loginUsers", priority = 10)
	public String ValidateOTP(String Name, String number) {
		System.out.println("get otp for mobile number from excel sheet " + number);
		String numberr = "20" + number;
		String getotp = (String) new GetOtpTest().getotp(Name, numberr);
		
		RequestSpecification request1 = RestAssured.given();
		RestAssured.urlEncodingEnabled = false;
		request1.header("Content-Type", "application/json");
		request1.header("language", "en");
		request1.contentType("application/json");
		String FullNumber = "+20" + number;
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("mobileNumber", FullNumber);
		map.put("otpCode", getotp);
		request1.body(map);
		Response response = request1.post("http://eraapi2.dev.arabiansystems.com/api/userlogin/ValidateOTPMessage");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println(response.asString());
		String responseBody = response.asString();
		JsonPath path = new JsonPath(responseBody);
		String Token = path.get("data.token");
		System.out.println("TokenValue" + Token);
		return Token;

	}

}
