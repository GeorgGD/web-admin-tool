package com.webAdminTool.controllers;

import java.util.List;

import com.webAdminTool.dto.BlogPost;
import com.webAdminTool.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	BlogService blogService;

	/**
	 * Sets up the blog manager panel
	 * @param model The model from the request
	 * @return The view	
	 */
	@RequestMapping("/blogManager")
	public String blogManagerPanel(Model model) {
		List<BlogPost> blogEntries = blogService.getAllPosts();
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
		String tableStart = "<table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\"><thead><tr><th>ID</th><th>Title</th><th>Date</th><th>Edit</th></tr></thead><tfoot><tr><th>ID</th><th>Title</th><th>Date</th><th>Edit</th></tr></tfoot><tbody>";
		String tableEnd = "</tbody></table>";

		if(blogEntries == null || blogEntries.size() == 0)
			return tableStart + tableEnd;
		
		for(BlogPost blogPost : blogEntries) {
			tableStart = tableStart + blogPost.toString();
		}
		tableStart = tableStart + tableEnd;
		
		return tableStart;
	}
}
