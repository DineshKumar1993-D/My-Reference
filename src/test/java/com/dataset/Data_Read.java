package com.dataset;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.baseclass.Base_Class;

public class Data_Read extends Base_Class {

	public static WebDriver driver;

	public static void data_Read() throws IOException {

		List<String> list = new ArrayList<String>();

		File f = new File("C:\\Users\\pdine\\eclipse-workspace\\CBE_Project_Nov23\\Data_Set\\Data_Read.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);

		Sheet sheet = wb.getSheetAt(0);

		int rowsize = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowsize; i++) {

			Row row = sheet.getRow(i);

			int cellsize = row.getPhysicalNumberOfCells();

			 for (int j = 0; j < cellsize; j++) {

			Cell cell = row.getCell(j);

			CellType typeofcell = cell.getCellType();

			if (typeofcell.equals(CellType.STRING)) {

				String value = cell.getStringCellValue();

				list.add(value);

			} else if (typeofcell.equals(CellType.NUMERIC)) {

				double value1 = cell.getNumericCellValue();

				int value2 = (int) value1;

				System.out.println(value2);
				 }
			}
		}
	
		System.out.println(list);
		
		String st = list.get(2);
		
		System.out.println(st);
	}

////	public static void main(String[] args) throws Throwable {
////		data_Read();
//	}
}

