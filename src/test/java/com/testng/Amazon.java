package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {

	@BeforeSuite
	public void setUp() {

		System.out.println("SetProperty");
	}

	@BeforeTest
	public void browserLaunch() {

		System.out.println("chrome");
	}

	@BeforeClass
	public void launchUrl() {

		System.out.println("Amazon Application");
	}

	@BeforeMethod
	public void login() {

		System.out.println("Amazon login");
	}

	@Test
	public void searchMobiles() {

		System.out.println("Samsung");
	}

	@Test
	public void searchLaptop() {

		System.out.println("Dell");
	}

	@AfterMethod
	public void validateMainPage() {

		System.out.println("Asserts Validation");
	}

	@AfterClass
	public void logOut() {

		System.out.println("Logout");
	}

	@AfterTest
	public void deleteCookies() {

		System.out.println("Delete cookies");
	}

	@AfterSuite
	public void closeBrowser() {

		System.out.println("Close Browser");
	}
}
