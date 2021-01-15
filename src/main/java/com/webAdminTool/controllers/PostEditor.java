package com.webAdminTool.controllers;

import com.webAdminTool.dto.BlogPost;
import com.webAdminTool.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blogManager")
public class PostEditor {

	// Some JPA handler variable
	@Autowired
	BlogService blogService;

	/**
	 * Redirects to the blog editor
	 * @param blogPost The blog post
	 * @return The view
	 */
	@RequestMapping("/addBlogPost")
	public String addBlogPost(@ModelAttribute("postData") BlogPost blogPost) {
		return "postEdit";
	}
	
	/**
	 * Creates a 
	 */
	@RequestMapping("/createPost")
	public String createPost() {

		return "blogManager";
	}
}
