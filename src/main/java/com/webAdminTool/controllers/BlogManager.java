package com.webAdminTool.controllers;

import java.util.ArrayList;
import java.util.List;

import com.webAdminTool.dto.BlogPost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * A controller for handling all blog related services
 * @author Georgios Davakos
 * @since 2021-01-07
 */
@Controller
@RequestMapping("/dashboard")
public class BlogManager {

	// Some JPA handler variable
	
	/**
	 * Sets up the blog manager panel
	 * @param model The model from the request
	 * @return The view	
	 */
	@RequestMapping("/blog")
	public String blogManagerPanel(Model model) {
		// Call server for blog post entries

		// Create a table with all the entries
		List<BlogPost> blogEntries = new ArrayList<>();
		String table = createTable(blogEntries);
		model.addAttribute("table", table);
		return "blogManager";
	}

	/**
	 * For a given list of blog posts create an html table in string form
	 * @param blogEntries The blog posts
	 * @return The table	
	 */
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
