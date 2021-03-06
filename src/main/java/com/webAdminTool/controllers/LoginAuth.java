package com.webAdminTool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Meant to handle login authentication
 * @author Georgios Davakos
 * @since 2020-12-24
 */
@Controller
public class LoginAuth {

	/**
	 * Maps to the login view
	 * @return The view	
	 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}    
}
