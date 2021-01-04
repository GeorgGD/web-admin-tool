package com.webAdminTool.controllers;

import java.util.ArrayList;
import java.util.List;

import com.webAdminTool.dto.BlogPost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/dashboard")
public class BlogManager {

	// Some JDBC handler variable
	@RequestMapping("/blog")
	public String blogManagerPanel(Model model) {
		// Call server for blog post entries

		// Create a table with all the entries
		List<BlogPost> blogEntries = new ArrayList<>();
		String table = createTable(blogEntries);
		model.addAttribute("table", table);
		return "blogManager";
	}
}
