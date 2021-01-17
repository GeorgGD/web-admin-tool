package com.webAdminTool.controllers;

import java.util.List;

import javax.validation.Valid;

import com.webAdminTool.dto.ProjectPost;
import com.webAdminTool.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dashboard/projectManager")
public class ProjectPostEditor {

	@Autowired
	ProjectService projectService;

	/**
	 * Redirects to the root mapping of this controller
	 */	
	@RequestMapping("/")
	public String rootRedirect() {
		return "redirect:/dashboard/projectManager";
	}
	
	/**
	 * Redirects to the project editor
	 * @param projectPost The project post
	 * @return The view
	 */
	@RequestMapping("/addProjectPost")
	public String addProjectPost(@ModelAttribute("postData") ProjectPost projectPost) {
		projectPost.setID(nextAvailableID());
		return "postEdit";
	}
	
	/**
	 * Creates a project post
	 * @param projectPost The project post to create
	 * @param errors Any errors in the project post
	 * @return The view	
	 */
	@RequestMapping("/createPost")
	public String createPost(@Valid @ModelAttribute("postData") ProjectPost projectPost, BindingResult errors) {
		if(errors.hasErrors())
			return "postEdit";
		
		projectService.createProjectPost(projectPost);
		return "redirect:/dashboard/projectManager";
	}

	/**
	 * Edits the given project post
	 * @param projectPost The project post
	 * @param id The id of the project post
	 * @param model The model in the response body
	 * @return The view	
	 */	
	@RequestMapping("/edit")
	public String editPost(@ModelAttribute("postData") ProjectPost projectPost, @RequestParam("id") int id, Model model) {
		model.addAttribute("postData", projectService.getProjectPost(id));
		return "postEdit";
	}

	/**
	 * Deletes the project post with the given ID
	 * @param id The id of the project post
	 * @return The view	
	 */
	@RequestMapping("/delete")
	public String deletePost(@RequestParam("id") int id) {
		projectService.deleteProjectPost(id);
		return "redirect:/dashboard/projectManager";
	}
	
	/**
	 * Provides the smallest available ID
	 * @return An available ID	
	 */
	private int nextAvailableID() {
		List<ProjectPost> posts = projectService.getAllPosts();
		if(posts == null || posts.size() == 0)
			return 1;
		else {
			int size = posts.size();
			int availableID = size + 1;
			return availableID;
		}
	}
}
