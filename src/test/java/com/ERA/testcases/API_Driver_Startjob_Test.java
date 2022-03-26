package com.ERA.testcases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Driver_Startjob_Test extends Base{

	@Test(dataProvider = "driverdata", priority = 1)
	
	public void driverLogin(String Name,String MobileNumber,String RequestId,String JoborderId) throws IOException {

		String driverBaseURL = (String) new com.ERA.testcases.API_GetBaseURLTest().GetrdriverBaseUrl();
		String access_token = (String) new com.ERA.testcases.API_Driver_Login_Test(). driverLogin();

////////////////////////////////Get Request///////////////////////////////////	
		RestAssured.baseURI =driverBaseURL + "/api/v1/fleetjobs";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest
				.queryParam("access_token", access_token)
				.queryParam("gx", "30.239421666666665")
				.queryParam("jobId", JoborderId)
				.queryParam("gy", "31.483515000000004")
				.queryParam("recoveryQrCode", "12345678901234562")
				.get("/startjob");

////////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		System.out.println("responsebody is  - " + responsebody1);
		JsonPath path = new JsonPath(responsebody1);
		boolean Success = path.get("success");
		Assert.assertEquals(Success, true);
		////////////////////////////////objectdata ////////////////
		// workbook object
		XSSFWorkbook workbook = new XSSFWorkbook();

		// spreadsheet object
		XSSFSheet spreadsheet
			= workbook.createSheet("DriverAccessToken");

		// creating a row object
		XSSFRow row;
String s=String.valueOf(RequestId);
		// This data needs to be written (Object[])
		Map<String, Object[]> Requestetails
			= new TreeMap<String, Object[]>();
System.out.println("//////////////////name is "+Name);
			Requestetails.put(
			"1",
			new Object[] { "Name", "MobileNumber", "RequestId","JoborderId" ,"access_token"});
			
			
			Requestetails.put(
					"2",
					new Object[] { Name, MobileNumber,RequestId,JoborderId,access_token });
					
	

		Set<String> keyid = Requestetails.keySet();

		int rowid = 0;

		// writing the data into the sheets...

		for (String key : keyid) {

			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = Requestetails.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String)obj);
			}
		}

		// .xlsx is the format for Excel Sheets...
		// writing the workbook into the file...
		FileOutputStream out = new FileOutputStream(
			new File("C:\\Users\\amira\\eclipse-workspace\\Automater\\src\\test\\testdata\\driverAccessToken.xlsx"));

		workbook.write(out);
		out.close();
	




	
		
	}
}
