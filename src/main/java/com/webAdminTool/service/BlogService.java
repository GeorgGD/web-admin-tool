package com.webAdminTool.service;

import java.util.ArrayList;
import java.util.List;

import com.webAdminTool.dto.BlogPost;
import com.webAdminTool.repository.BlogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Handles all communications to external server
 * @author Georgios Davakos
 * @since 2021-01-07
 */
@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepo;

	/**
	 * Retrieves all blog posts
	 * @return A list with all blog posts	
	 */
	public List<BlogPost> getAllPosts() {
		List<BlogPost> posts = new ArrayList<>();
		blogRepo.findAll().forEach(posts::add);
		return posts;
	}

	/**
	 * Retrieves a single blog post
	 * @param id The id of the blog post
	 * @return The blog post	
	 */
	public BlogPost getBlogPost(Integer id) {
		return blogRepo.findById(id).get();
	}

	/**
	 * Creates a blog post
	 * @param blog The blog post	
	 */
	public void createBlogPost(BlogPost blog) {
		blogRepo.save(blog);
	}

	/**
	 * Updates a blog post
	 * @param blog The updated blog post	
	 */
	public void updateBlogPost(BlogPost blog) {
		blogRepo.save(blog);
	}

	/**
	 * Deletes a blog post
	 * @param id The id of the blog post	
	 */
	public void deleteBlogPost(Integer id) {
		blogRepo.deleteById(id);
	}
}
