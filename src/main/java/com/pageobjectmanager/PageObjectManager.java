package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.pom.Login;

public class PageObjectManager {

	// Declare the object as private

	// Generate Getters

	// Initialize the object inside the constructor

	public  WebDriver driver;

	private Login login;

	public Login getInstanceLogin() {
		login = new Login(driver);
		return login;
	}

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(this.driver, driver);
	}

}
