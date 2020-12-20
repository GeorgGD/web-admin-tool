package com.webAdminTool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAuth {

	@RequestMapping(value = "")
	public String index() {
		return "index";
	}
}
