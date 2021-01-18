package com.webAdminTool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The following controller handles redirection from the dashboard meny
 * @author Georgios Davakos
 * @since 2020-12-24
 */
@Controller
public class LandingPage {

	/**
	 * Maps to the main view of the web admin tool
	 * @return The view	
	 */
	@GetMapping("/dashboard")
	public String index() {
		return "dashboard";
	}

	/**
	 *
	 */
	@RequestMapping("/")
	public String rootRedirect() {
		return "redirect:/dashboard";
	}
}
