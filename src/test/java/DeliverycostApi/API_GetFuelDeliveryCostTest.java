package DeliverycostApi;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ERA.base.Base;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_GetFuelDeliveryCostTest extends Base {

	@Test(dataProvider = "loginUsers", priority = 11)
	public void GeteliveryCost(String Name, String number) throws IOException {

		String URLL = (String) new driverApi.API_GetBaseURLTest().GetBaseUrl();
		String Token = (String) new API_GetTokenValueTest().GetToken(Name, number);
		String FullRequestURL = URLL + "/api/Request/GetDeliveryRequestCost";
		System.out.println(FullRequestURL);
		RequestSpecification httpRequest = RestAssured.given();
/////////////////////////////header///////////////////////////////////////////////
		httpRequest.header("Authorization", "Bearer " + Token);
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("language", "en");
		httpRequest.contentType("application/json");
		
////////////////////////////////body///////////////////////////////////
		Response response = httpRequest.queryParam("PickUpLocationLatitude", "30.032864062078666")
				.queryParam("PickUpLocationLangtitude", "31.41001235693693").queryParam("FuelTypeId", "2")
				.queryParam("ServiceId", "2").queryParam("selectedFuelAmount", "20").get(FullRequestURL);
		
		
////////////////////////////////response///////////////////////////////////
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
