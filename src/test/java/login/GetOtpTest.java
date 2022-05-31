package login;

import java.io.IOException;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetOtpTest {

	@Test
	public String getotp(String name ,String numberr ) throws IOException {

	String URLL = (String) new driverApi.API_GetBaseURLTest().GetBaseUrl();
////////////////////////////////Get Request///////////////////////////////////	
		String mobileNumwithCode = "%2B" + numberr;
		System.out.println("mobileNumwithCode is  - " + mobileNumwithCode);
	//	RestAssured.baseURI = URLL + "/api/userlogin";
		RestAssured.baseURI = URLL + "/api/userlogin";
		RestAssured.urlEncodingEnabled = false;
		RequestSpecification httpRequest = RestAssured.given();
		
		
		Response res = httpRequest.queryParam("mobileNumber", mobileNumwithCode).get("/GetUserOTPMessage");

////////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody1 " + responsebody1);
		JsonPath jpath = new JsonPath(responsebody1);
		String data = jpath.getString("data");
		System.out.println("verfication code is  - " + data);

		return data;
	}
}
