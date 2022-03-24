package com.ERA.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ERA.base.Base;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_GetTowingDeliveryCostTest extends Base {

	@Test(dataProvider = "loginUsers", priority = 11)
	public void GeteliveryCost(String Name, String number) throws IOException {
		String URLL = (String) new com.ERA.testcases.API_GetBaseURLTest().GetBaseUrl();
		String Token = (String) new API_GetTokenValueTest().GetToken(Name, number);
		String FullRequestURL = URLL + "/api/Request/GetDeliveryRequestCost";
		System.out.println(FullRequestURL);

////////////////////////////////header///////////////////////////////////
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Authorization", "Bearer " + Token);
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("language", "en");
		httpRequest.contentType("application/json");

////////////////////////////////GetRequest///////////////////////////////////
		Response response = httpRequest.queryParam("PickUpLocationLatitude", "30.02506733314542")
				.queryParam("PickUpLocationLangtitude", "31.40756249427795")
				.queryParam("DropOffLocationLatitude", "29.9963607410152")
				.queryParam("DropOffLocationLangtitude", "31.403703466057774").queryParam("SubServiceId", "2")
				.get(FullRequestURL);

////////////////////////////////Response///////////////////////////////////
		String responsebody1 = response.getBody().asString();
		System.out.println(responsebody1);
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);
		JsonPath path = new JsonPath(responsebody1);
		int totalTripCost = path.get("data.totalTripCost");
		Assert.assertNotNull(totalTripCost);
		System.out.println("totalTripCost Value is " + totalTripCost);

	}

}
