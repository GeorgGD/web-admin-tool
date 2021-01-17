package com.webAdminTool.service;

import java.util.ArrayList;
import java.util.List;

import com.webAdminTool.dto.ProjectPost;
import com.webAdminTool.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository blogRepo;

	/**
	 * Retrieves all blog posts
	 * @return A list with all blog posts	
	 */
	public List<ProjectPost> getAllPosts() {
		List<ProjectPost> posts = new ArrayList<>();
		blogRepo.findAll().forEach(posts::add);
		return posts;
	}

	/**
	 * Retrieves a single blog post
	 * @param id The id of the blog post
	 * @return The blog post	
	 */
	public ProjectPost getProjectPost(Integer id) {
		return blogRepo.findById(id).get();
	}

	/**
	 * Creates a blog post
	 * @param blog The blog post	
	 */
	public void createProjectPost(ProjectPost blog) {
		blogRepo.save(blog);
	}

	/**
	 * Updates a blog post
	 * @param blog The updated blog post	
	 */
	public void updateProjectPost(ProjectPost blog) {
		blogRepo.save(blog);
	}

	/**
	 * Deletes a blog post
	 * @param id The id of the blog post	
	 */
	public void deleteProjectPost(Integer id) {
		blogRepo.deleteById(id);
	}
}
