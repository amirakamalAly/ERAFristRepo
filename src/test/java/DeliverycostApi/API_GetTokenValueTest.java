package DeliverycostApi;

import java.io.IOException;
import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ERA.base.Base;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import login.GetOtpTest;

public class API_GetTokenValueTest extends Base {

	@Test(dataProvider = "loginUsers", priority = 10)
	public String GetToken(String Name, String number) throws IOException {

		String URLL = (String) new driverApi.API_GetBaseURLTest().GetBaseUrl();

		System.out.println("get otp for mobile number from excel sheet " + number);
		String numberr = "20" + number;
		String getotp = (String) new GetOtpTest().getotp(Name, numberr);
/////////////////////////////header///////////////////////////////////////////////
		RequestSpecification request1 = RestAssured.given();
		RestAssured.urlEncodingEnabled = false;
		request1.header("Content-Type", "application/json");
		request1.header("language", "en");
		request1.contentType("application/json");
		String FullNumber = "+20" + number;
////////////////////////////////body///////////////////////////////////
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("mobileNumber", FullNumber);
		map.put("otpCode", getotp);
		request1.body(map);
/////////////////////////////////////response//////////////////////////////////////////
		Response response = request1.post(URLL + "/api/userlogin/ValidateOTPMessage");
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
