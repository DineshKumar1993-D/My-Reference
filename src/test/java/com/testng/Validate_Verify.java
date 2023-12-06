package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validate_Verify {
	@Test
	public void testCase() {

		System.out.println("==Hard Assert==");

		String expected = "Java";

		String actual = "java";

//		Assert.assertEquals(expected, actual);
//
//		Assert.assertEquals(expected, actual);
//
//		Assert.assertEquals(expected, actual);

		System.out.println("==Soft Assert==");
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(expected, actual);
		
		soft.assertEquals(expected, actual);
		
		soft.assertEquals(expected, actual);
		
		soft.assertAll();

	}

}
