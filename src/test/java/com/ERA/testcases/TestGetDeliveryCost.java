package com.ERA.testcases;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class TestGetDeliveryCost {
		 public void  ValidateOTP(String Name,String MobileNumber) 
	{  
		System.out.println("get otp for mobile number from excel sheet "+ MobileNumber );
		
		String numberr = "20"+MobileNumber;
		
		String getotp=(String) new GetOtpTest().getotp(Name, numberr);
		System.out.println("MobileNumber is  - "+numberr);
		System.out.println("OTP code is  - "+getotp);
		
		RestAssured.baseURI="http://eraapi2.dev.arabiansystems.com/api/userlogin/ValidateOTPMessage";
		//RestAssured.urlEncodingEnabled = false;
		RequestSpecification request=RestAssured.given();
		
		request.header("Content-Type","application/json");
		JSONObject json=new JSONObject();
		//json.put("mobileNumber","numberr");
		//json.put("otpCode","getotp");
		
		request.body(json.toJSONString());
		Response response=request.post("http://eraapi2.dev.arabiansystems.com/api/userlogin/ValidateOTPMessage");
		int code=response.getStatusCode();
		Assert.assertEquals(code, 200);
		
	//	System.out.println("verfication code is  - "+data);
		
		
		
		 
		
	}

	
	}


