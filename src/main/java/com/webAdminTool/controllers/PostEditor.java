package com.webAdminTool.controllers;

import com.webAdminTool.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class PostEditor {

	// Some JPA handler variable
	@Autowired
	BlogService blogService;

}
