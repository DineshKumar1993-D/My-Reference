package com.testng;

import org.testng.annotations.Test;

public class TestNG_Depends {

	@Test
	public void aMethod() {
//		int b=5/0;
//		System.out.println(b);
		System.out.println("A Method");
	}
	@Test(dependsOnMethods = "cMethod")
	public void bMethod() {
		System.out.println("B Method");
	}
	@Test(dependsOnMethods = "aMethod")
	public void cMethod() {
		System.out.println("C Method");
	}

}
