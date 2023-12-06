package com.testng;

import org.testng.annotations.Test;

public class TesNG_TimeOut {

	@Test(timeOut = 1000)
	public void aMethod() throws InterruptedException {
		
		Thread.sleep(1500);
		
		System.out.println("A Method");
	}
	@Test()
	public void bMethod() {
		System.out.println("B Method");
	}
	@Test(dependsOnMethods = "aMethod")
	public void cMethod() {
		System.out.println("C Method");
	}

}
