package com.baseclass;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class {

	public static List<String> list = new ArrayList<String>();

	public static WebDriver driver;

	public static WebDriver browseLaunch(String browser) {

		// Chrome, chrome, CHROME, ChRoMe

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pdine\\eclipse-workspace\\CBE_Project_Nov23\\Driver_New\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\pdine\\eclipse-workspace\\CBE_Project_Nov23\\Driver_New\\chromedriver.exe");

			driver = new EdgeDriver();

		}
		return driver;
	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static void sendValues(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void closeWindow() {

		driver.close();
	}

	public static void quitBrowser() {

		driver.quit();
	}

	public static void printScreen(String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(
				"C:\\Users\\pdine\\eclipse-workspace\\CBE_Project_Nov23\\Scrrenshot\\" + filename + ".png");

		FileUtils.copyFile(source, destination);
	}

	public static void data_Read() throws IOException {

		File f = new File("C:\\Users\\pdine\\eclipse-workspace\\CBE_Project_Nov23\\Data_Set\\Data_Read.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);

		Sheet sheet = wb.getSheetAt(0);

		int rowsize = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowsize; i++) {

			Row row = sheet.getRow(i);

			int cellsize = row.getPhysicalNumberOfCells();

			// for (int j = 0; j < cellsize; j++) {

			Cell cell = row.getCell(0);

			CellType typeofcell = cell.getCellType();

			if (typeofcell.equals(CellType.STRING)) {

				String value = cell.getStringCellValue();

				list.add(value);

			} else if (typeofcell.equals(CellType.NUMERIC)) {

				double value1 = cell.getNumericCellValue();

				int value2 = (int) value1;

				System.out.println(value2);
				// }
			}
		}

		// System.out.println(list);
//
		String string = list.get(2);

		// System.out.println(string);
	}

	public static void main(String[] args) {
		
		
	}
}
