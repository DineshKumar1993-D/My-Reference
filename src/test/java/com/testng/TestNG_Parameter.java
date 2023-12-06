package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter {

	@Parameters({ "user" })
	@Test
	public void username(@Optional("java") String name) {

		System.out.println(name);

	}

	@Parameters({ "password" })
	@Test()
	public void password(String password) {

		System.out.println(password);

	}

}
