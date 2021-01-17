package com.webAdminTool.controllers;

import java.util.List;

import javax.validation.Valid;

import com.webAdminTool.dto.BlogPost;
import com.webAdminTool.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dashboard/blogManager")
public class PostEditor {

	@Autowired
	BlogService blogService;

	/**
	 * Redirects to the root mapping of this controller
	 */	
	@RequestMapping("/")
	public String rootRedirect() {
		return "redirect:/dashboard/blogManager";
	}
	
	/**
	 * Redirects to the blog editor
	 * @param blogPost The blog post
	 * @return The view
	 */
	@RequestMapping("/addBlogPost")
	public String addBlogPost(@ModelAttribute("postData") BlogPost blogPost) {
		blogPost.setID(nextAvailableID());
		return "postEdit";
	}
	
	/**
	 * Creates a blog post
	 * @param blogPost The blog post to create
	 * @param errors Any errors in the blog post
	 * @return The view	
	 */
	@RequestMapping("/createPost")
	public String createPost(@Valid @ModelAttribute("postData") BlogPost blogPost, BindingResult errors) {
		if(errors.hasErrors())
			return "postEdit";
		
		blogService.createBlogPost(blogPost);
		return "redirect:/dashboard/blogManager";
	}

	/**
	 * Edits the given blog post
	 * @param blogPost The blog post
	 * @param id The id of the blog post
	 * @param model The model in the response body
	 * @return The view	
	 */	
	@RequestMapping("/edit")
	public String editPost(@ModelAttribute("postData") BlogPost blogPost, @RequestParam("id") int id, Model model) {
		model.addAttribute("postData", blogService.getBlogPost(id));
		return "postEdit";
	}

	/**
	 * Deletes the blog post with the given ID
	 * @param id The id of the blog post
	 * @return The view	
	 */
	@RequestMapping("/delete")
	public String deletePost(@RequestParam("id") int id) {
		blogService.deleteBlogPost(id);
		return "redirect:/dashboard/blogManager";
	}
	
	/**
	 * Provides the smallest available ID
	 * @return An available ID	
	 */
	private int nextAvailableID() {
		List<BlogPost> posts = blogService.getAllPosts();
		if(posts == null || posts.size() == 0)
			return 1;
		else {
			int size = posts.size();
			int availableID = size + 1;
			return availableID;
		}
	}
}
