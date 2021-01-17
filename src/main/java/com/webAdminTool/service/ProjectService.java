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
	private ProjectRepository projectRepo;

	/**
	 * Retrieves all project posts
	 * @return A with list all project posts	
	 */
	public List<ProjectPost> getAllPosts() {
		List<ProjectPost> posts = new ArrayList<>();
		projectRepo.findAll().forEach(posts::add);
		return posts;
	}

	/**
	 * Retrieves a single project post
	 * @param id The id of the project post
	 * @return The project post	
	 */
	public ProjectPost getProjectPost(Integer id) {
		return projectRepo.findById(id).get();
	}

	/**
	 * Creates a project post
	 * @param project The project post	
	 */
	public void createProjectPost(ProjectPost project) {
		projectRepo.save(project);
	}

	/**
	 * Updates a project post
	 * @param project The updated project post	
	 */
	public void updateProjectPost(ProjectPost project) {
		projectRepo.save(project);
	}

	/**
	 * Deletes a project post
	 * @param id The id of the project post	
	 */
	public void deleteProjectPost(Integer id) {
		projectRepo.deleteById(id);
	}
}
