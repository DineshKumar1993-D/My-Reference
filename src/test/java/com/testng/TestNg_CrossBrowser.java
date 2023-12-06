package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class TestNg_CrossBrowser extends Base_Class {

	@Parameters({ "browser" })
	@BeforeClass
	public void browserMethods(String browser) {

		if (browser.equals("chrome")) {

			System.out.println("chrome");

		} else if (browser.equals("edge")) {

			System.out.println("edge");
		}

	}

	@Test
	public void loginMethod() {

		System.out.println("FaceBook Login");

	}

	@AfterClass
	public void closeBrowser() {

		System.out.println("Close");

	}

}
