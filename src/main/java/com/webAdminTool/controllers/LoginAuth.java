package com.webAdminTool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginAuth {

/*	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String redirect() {
		return "dashboard";
	}*/
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/test")
	public String test() {
		return "dashboard";
	}
}
