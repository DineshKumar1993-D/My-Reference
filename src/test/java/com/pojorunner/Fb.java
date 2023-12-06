package com.pojorunner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class Fb extends Base_Class {

	//public static WebDriver driver;
	
	public static void fb_Login() throws InterruptedException, IOException {

		PageObjectManager pom = new PageObjectManager(driver);

		browseLaunch("chrome");

		launchUrl("https://www.facebook.com/");

		Thread.sleep(1500);

	//	data_Read();

	//	WebElement send = driver.findElement(By.id("email"));

		sendValues(pom.getInstanceLogin().getUsername(),"hi656gfg");

	//	sendValues(send, list.get(3));
	}

//	public static void main(String[] args) throws InterruptedException, IOException {
//
//		fb_Login();
//	}
}