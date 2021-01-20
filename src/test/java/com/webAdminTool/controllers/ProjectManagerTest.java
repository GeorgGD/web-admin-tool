package com.webAdminTool.controllers;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.MapBindingResult;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectManagerTest {

	@Autowired
	private ProjectManager projectManager;

	private Model model;
	private MapBindingResult errors;
	
	@Before
	public void setup() {
		model = new ExtendedModelMap();
		errors = new MapBindingResult(new HashMap<String, String>(), "dummy");	 
	}

	@Test
	public void projectManagerPanelTest() {
		String expectedView = "blogManager";
		String actualView = projectManager.projectManagerPanel(model);

		assertEquals(expectedView, actualView);

		String expectedTable = "<table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\"><thead><tr><th>ID</th><th>Title</th><th>Date</th><th>Edit</th></tr></thead><tfoot><tr><th>ID</th><th>Title</th><th>Date</th><th>Edit</th></tr></tfoot><tbody></tbody></table>";
		String actualTable = (String) model.getAttribute("table");

		assertEquals(expectedTable, actualTable);

		String expectedAddPost = "projectManager/addProjectPost";
		String actualAddPost = (String) model.getAttribute("addPost");
		
		assertEquals(expectedAddPost, actualAddPost);

		String expectedPosts = "Project";
		String actualPosts = (String) model.getAttribute("posts");

		assertEquals(expectedPosts, actualPosts);

		String expectedTitle = "Project Manager";
		String actualTitle = (String) model.getAttribute("title");

		assertEquals(expectedTitle, actualTitle);
	}
}
