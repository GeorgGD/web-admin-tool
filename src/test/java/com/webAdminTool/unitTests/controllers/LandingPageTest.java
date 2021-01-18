package com.webAdminTool.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LandingPageTest {

	@Test
	public void indexTest() {
		LandingPage landingPage = new LandingPage();

		String actualView = landingPage.index();
		String expectedView = "dashboard";
		assertEquals(expectedView, actualView);
	}
}
