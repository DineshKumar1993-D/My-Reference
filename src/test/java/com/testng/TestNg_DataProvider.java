package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg_DataProvider {

	@Test(dataProvider = "test")
	public void loginMethod(String username, String password) {

		System.out.println(username + " " + password);
	}

	@DataProvider(name = "test")
	public Object[][] testData() {

		return new Object[][] {

				{ "java@123", "3767787" }, { "python@123", "32467674" } };

	}

}
