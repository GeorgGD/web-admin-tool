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

	// For a given list of blogPosts create an html table in string form
	private String createTable(List<BlogPost> blogEntries) {
		if(blogEntries.size() == 0)
			return "";

		String tableStart = "<table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\"><thead><tr><th>ID</th><th>Title</th><th>Date</th><th>Edit</th></tr></thead><tfoot><tr><th>ID</th><th>Title</th><th>Date</th><th>Edit</th></tr></tfoot><tbody>";
		String tableEnd = "</tbody></table>";

		for(BlogPost blogPost : blogEntries) {
			tableStart = tableStart + blogPost.toString();
		}
		tableStart = tableStart + tableEnd;
		
		return tableStart;
	}
}
