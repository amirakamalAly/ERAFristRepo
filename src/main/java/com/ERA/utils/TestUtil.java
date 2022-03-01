package com.ERA.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.activity.InvalidActivityException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestUtil {

	public static final String Testdat_sheet_path = "C:\\Users\\amira\\eclipse-workspace\\Automater"+"\\src\\test\\testdata\\B511EA00.xlsx";

	static XSSFCell cell;
	static XSSFWorkbook book;
	public static Object[][] getTestData(String sheetName)

	{
		FileInputStream file = null;
		try {
			file = new FileInputStream(Testdat_sheet_path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			book = new XSSFWorkbook(file);
			} catch (InvalidActivityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = book.getSheet(sheetName);

		int Rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[Rows][cols];

		for (int i = 0; i < Rows; i++) {

			XSSFRow row = sheet.getRow(i);
			
			
			for (int k = 0; k < cols; k++) {
				XSSFCell cell = row.getCell(k);
				CellType cellType = cell.getCellType();
				System.out.println(cellType);
				data[i][k] = sheet.getRow(i + 1).getCell(k);
				
				System.out.println(i);

				System.out.println(k);

				System.out.print(data[i][k]);
			}

		}
		return data;
	}
}
