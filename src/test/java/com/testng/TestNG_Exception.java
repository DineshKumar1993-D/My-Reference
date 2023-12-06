package com.testng;

import org.testng.annotations.Test;

public class TestNG_Exception {

	@Test(expectedExceptions = ArithmeticException.class)
	public void aMethod() {

		int a = 10 / 0;

		System.out.println("A Method");
	}

	@Test
	public void bMethod() {

		System.out.println("B Method");
	}

}
