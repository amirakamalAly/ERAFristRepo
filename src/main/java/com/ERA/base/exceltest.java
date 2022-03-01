package com.ERA.base;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.ERA.utils.ExcelUtility;

public class exceltest {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("startssssssssssssss");
List <Map<String,String>> testDataInMap=ExcelUtility.getMapTestDataInMap(); 

 	
System.out.println(testDataInMap.get(0).get("Name"));
System.out.println(testDataInMap.get(0).get("MobileNumber"));
	}

}
