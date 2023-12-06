package com.testng;

import org.testng.ITestListener;
import org.testng.annotations.Test;


public class TestNG_Parallel {

	@Test
	public void login() throws InterruptedException {

		Thread.sleep(1000);

		System.out.println("Facebook");

	}

	@Test
	public void searchMobile() throws InterruptedException {

		Thread.sleep(1000);

		System.out.println("Vivo");

	}

}
