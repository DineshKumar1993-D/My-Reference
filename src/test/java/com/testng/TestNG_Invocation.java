package com.testng;

import org.testng.annotations.Test;

public class TestNG_Invocation {

	@Test(invocationCount = 2)
	public void laptop() {
		System.out.println("Hp");
	}

	@Test()
	public void mobile() {
		System.out.println("Poco");
	}
	@Test(dependsOnMethods = "laptop()")
	public void product() {
		System.out.println("Bags");

	}

}
