package com.webAdminTool.controllers;

import javax.validation.Valid;

import com.webAdminTool.dto.BlogPost;
import com.webAdminTool.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard/blogManager")
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
	public String createPost(@Valid @ModelAttribute("postData") BlogPost blogPost, BindingResult result, Model model) {
		
		return "redirect:/dashboard/blogManager";
	}
}
