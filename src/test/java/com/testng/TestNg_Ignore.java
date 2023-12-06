package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNg_Ignore {

	// Ignore way 1
	@Ignore
	@Test
	public void amazonUrl() {
		System.out.println("Amazon.com");

	}
	//way 2
	@Test(enabled = false)
	public void flipkartUrl() {
		System.out.println("Flipkart.com");

	}
	@Test
	public void twitterUrl() {
		System.out.println("Twitter.com");

	}

}
