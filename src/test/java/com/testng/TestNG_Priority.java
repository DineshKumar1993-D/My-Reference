package com.testng;

import org.testng.annotations.Test;

public class TestNG_Priority {

	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}
	@Test(priority = 1)
	public void searchMobile() {
		System.out.println("Mobile");
	}
	@Test(priority = 3)
	public void logout() {
		System.out.println("logout");

	}
	@Test
	public void closeBrowser() {
		System.out.println("Close");
	}

}
