package com.webAdminTool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAuth {

	@RequestMapping("/login")
	public String index() {
		return "dashboard";
	}
}
