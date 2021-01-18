package com.webAdminTool.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LoginAuthTest {

	@Test
	public void loginTest() {
		LoginAuth loginAuth = new LoginAuth();
		String actualView = loginAuth.login();

		String expectedView = "login";
		assertEquals(expectedView, actualView);
	}
}
