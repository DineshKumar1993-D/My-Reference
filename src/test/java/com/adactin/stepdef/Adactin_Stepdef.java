package com.adactin.stepdef;

import org.openqa.selenium.WebDriver;


import com.adactin.runner.Adactin_Runner;
import com.baseclass.Base_Class;
import com.configuration.Configuration_Reader;
import com.filereader.FileReaderManager;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_Stepdef extends Base_Class {

	PageObjectManager pom = new PageObjectManager(driver);
	
	

	@Given("^launch The Url Of Adactin Application$")
	public void launch_The_Url_Of_Adactin_Application() throws Throwable {

		//launchUrl("https://adactinhotelapp.com/");
		
//		Configuration_Reader  con = new Configuration_Reader();
//		
//		String url = con.getUrl();
		
//		String url = FileReaderManager.getInstanceFR().getInstanceCR().getUrl();
//		
//		launchUrl(url);

	}

//	@When("^user Enters The Username In The Inputbox$")
//	public void user_Enters_The_Username_In_The_Inputbox() throws Throwable {
//	  
//		sendValues(pom.getInstanceLogin().getUsername(), "Sathish1826");
//		
//	}
//	
//	@When("^user Enters The Password In The Inputbox$")
//	public void user_Enters_The_Password_In_The_Inputbox() throws Throwable {
//	    
//		sendValues(pom.getInstanceLogin().getPassword(), "Sathish3456");
//	}

	@When("^user Enters The Username \"([^\"]*)\" In The Inputbox$")
	public void user_Enters_The_Username_In_The_Inputbox(String Usernames) throws Throwable {

		sendValues(pom.getInstanceLogin().getUsername(), Usernames);

	}

	@When("^user Enters The Password \"([^\"]*)\" In The Inputbox$")
	public void user_Enters_The_Password_In_The_Inputbox(String Passwords) throws Throwable {

		sendValues(pom.getInstanceLogin().getPassword(), Passwords);
	}

	@Then("^user Clicks The Loginbutton and Its Navigates In The Searchhotel Page$")
	public void user_Clicks_The_Loginbutton_and_Its_Navigates_In_The_Searchhotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceLogin().getLogi());

	}

}
