package com.testng;

import org.testng.annotations.Test;

public class TestNg_Group {

	@Test(groups = "A")
	public void login() {

		System.out.println("Amazon");

	}

	@Test(groups = "B")
	public void searchLaptop() {

		System.out.println("Hp");

	}

	@Test(groups = { "A", "B" })
	public void searchBooks() {

		System.out.println("Java");

	}

}
