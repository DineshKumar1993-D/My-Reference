package com.dataset;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\pdine\\eclipse-workspace\\CBE_Project_Nov23\\Data_Set\\Data_Write.xlsx");

		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fi);
		
	//	wb.createSheet("Data3").createRow(0).createCell(0).setCellValue("Email");
		
		wb.getSheet("Data3").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("Data3").getRow(0).createCell(2).setCellValue("User");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		
		System.out.println("Success");
		
		wb.close();
	}

}
