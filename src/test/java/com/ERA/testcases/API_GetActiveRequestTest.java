package com.ERA.testcases;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ERA.base.Base;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_GetActiveRequestTest extends Base {

	

	@Test(dataProvider = "loginUsers", priority = 11)
	public void GetActiveRequest(String Name, String number) throws IOException {
		String URLL = (String) new com.ERA.testcases.API_GetBaseURLTest().GetBaseUrl();
		String Token = (String) new API_GetTokenValueTest().GetToken(Name, number);
		String FullRequestURL = URLL + "/api/Request/GetActiveRequest";
		System.out.println(FullRequestURL);

////////////////////////////////header///////////////////////////////////
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Authorization", "Bearer " + Token);
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("language", "en");
		httpRequest.contentType("application/json");

////////////////////////////////GetRequest///////////////////////////////////
		Response response = httpRequest.get(FullRequestURL);

////////////////////////////////Response///////////////////////////////////
		String responsebody1 = response.getBody().asString();
		System.out.println(responsebody1);
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);
		JsonPath path = new JsonPath(responsebody1);
		int RequestId = path.get("data.activeRequest.id");
		String s=String.valueOf(RequestId);
		Assert.assertNotNull(RequestId);
		// Java program to write data in excel sheet using java code

	

		
				// workbook object
				XSSFWorkbook workbook = new XSSFWorkbook();

				// spreadsheet object
				XSSFSheet spreadsheet
					= workbook.createSheet("Requestetails");

				// creating a row object
				XSSFRow row;

				// This data needs to be written (Object[])
				Map<String, Object[]> Requestetails
					= new TreeMap<String, Object[]>();
System.out.println("//////////////////name is "+Name);
					Requestetails.put(
					"1",
					new Object[] { "Name", "MobileNumber", "RequestId" });
					
					
					Requestetails.put(
							"2",
							new Object[] { Name, number, s });
							
			

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
					new File("C:\\Users\\amira\\eclipse-workspace\\Automater\\src\\test\\testdata\\Request.xlsx"));

				workbook.write(out);
				out.close();
			
		

		

	}

}
