package com.webAdminTool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginAuth {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}    
}
