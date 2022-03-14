package com.ERA.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private static Workbook workbook;
	private static Workbook workbook2;

	public static Map<String, String> getMapTestData() throws IOException {
		Map<String, String> testData = new HashMap<String, String>();
		try {
			FileInputStream fileInputStream = new FileInputStream("");
			workbook2 = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook2.getSheetAt(0);
			int lastRowNumber = sheet.getLastRowNum();

			for (int i = 0; i <= lastRowNumber; i++) {
				Row row = sheet.getRow(i);
				Cell keyCell = row.getCell(0);
				String key = keyCell.getStringCellValue().trim();
				Cell valuecell = row.getCell(1);
				String value = valuecell.getStringCellValue().trim();
				testData.put(key, value);
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return testData;
	}

	public static List<Map<String, String>> getMapTestDataInMap() throws IOException {
		List<Map<String, String>> testDataAllRow = null;
		Map<String, String> testData = null;
		try {
			String rowHeader;
			FileInputStream fileInputStream = new FileInputStream(
					"D:\\Automater\\src\\test\\testdata\\Book3.xlsx");
			workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheetAt(0);
			int lastRowNumber = sheet.getLastRowNum();
			// System.out.println(lastRowNumber);
			int lastColNumber = sheet.getRow(0).getLastCellNum();

			// System.out.println("lastcoulm count="+lastColNumber);

			List<String> list = new ArrayList<String>();
			for (int i = 0; i < lastColNumber; i++) {
				Row row = sheet.getRow(0);

				// System.out.println("row =get frist item from Excel sheet ");

				Cell cell = row.getCell(i);

				// System.out.println(" header="+cell);

				rowHeader = cell.getStringCellValue().trim();

				list.add(rowHeader);
			}
			testDataAllRow = new ArrayList<Map<String, String>>();
			for (int j = 1; j <= lastRowNumber; j++) {
				Row row = sheet.getRow(j);
				testData = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
				for (int k = 1; k < lastColNumber; k++) {
					Cell cell = row.getCell(k);
					String colValue = cell.getStringCellValue().trim();
					String str = colValue.replaceAll("[&]", "");

					testData.put((String) list.get(k), str);
				}
				testDataAllRow.add(testData);
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return testDataAllRow;
	}

};