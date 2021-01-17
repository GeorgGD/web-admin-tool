package com.webAdminTool.controllers;

import java.util.List;

import com.webAdminTool.dto.ProjectPost;
import com.webAdminTool.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class ProjectManager {

	@Autowired
	ProjectService projectService;

	/**
	 * Sets up the blog manager panel
	 * @param model The model from the request
	 * @return The view	
	 */
	@RequestMapping("/projectManager")
	public String projectManagerPanel(Model model) {
		List<ProjectPost> blogEntries = projectService.getAllPosts();
		String table = createTable(blogEntries);
		model.addAttribute("table", table);
		return "blogManager";
	}
	
	/**
	 * For a given list of blog posts create an html table in string form
	 * @param blogEntries The blog posts
	 * @return The table	
	 */
	private String createTable(List<ProjectPost> projectEntries) {		
		String tableStart = "<table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\"><thead><tr><th>ID</th><th>Title</th><th>Date</th><th>Edit</th></tr></thead><tfoot><tr><th>ID</th><th>Title</th><th>Date</th><th>Edit</th></tr></tfoot><tbody>";
		String tableEnd = "</tbody></table>";

		if(projectEntries == null || projectEntries.size() == 0)
			return tableStart + tableEnd;
		
		for(ProjectPost projectPost : projectEntries) {
			tableStart = tableStart + projectPost.toString();
		}
		tableStart = tableStart + tableEnd;
		
		return tableStart;
	}
}
