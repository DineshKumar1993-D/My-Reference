package com.adactin.runner;

import org.junit.AfterClass;


import org.junit.BeforeClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdef", plugin = { "pretty",

		"html:Reports/Cucumber_Html_Report", "json:Reports/Cucumber_json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html" }, monochrome = true, tags = "@smoketest")
// dryRun=true
// strict=true)

public class Adactin_Runner extends Base_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		browseLaunch("chrome");

	}

	@AfterClass
	public static void tearDown() {

		quitBrowser();
	}

}
