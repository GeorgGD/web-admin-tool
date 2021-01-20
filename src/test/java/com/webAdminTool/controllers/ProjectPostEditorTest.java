package com.webAdminTool.controllers;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import com.webAdminTool.dto.ProjectPost;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.MapBindingResult;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.DEFAULT)
public class ProjectPostEditorTest {

	@Autowired
	private ProjectPostEditor postEditor;
	private Model model;
	private MapBindingResult errors;
	private ProjectPost post;
	
	@Before
	public void setup() {
		model = new ExtendedModelMap();
		errors = new MapBindingResult(new HashMap<String, String>(), "dummy");

		post = new ProjectPost();
		post.setID(1);
		post.setTitle("test");
		post.setShort_desc("A unit test");
		post.setPost("a short unit test");
		post.setPost_date("21/01/18");
	}

	@Test
	public void rootRedirectTest() {
		String expectedString = "redirect:/dashboard/projectManager";
		String actualString = postEditor.rootRedirect();

		assertEquals(expectedString, actualString);
	}

	@Test
	public void addProjectPostTest() {
		String expectedView = "postEdit";
		String actualView = postEditor.addProjectPost(post);
		assertEquals(expectedView, actualView);
	}

	@Test
	public void createPostTest() {
		String expectedView = "redirect:/dashboard/projectManager";		
		String actualView = postEditor.createPost(post, errors);

		assertEquals(expectedView, actualView);
		postEditor.deletePost(1);
	}

	@Test
	public void editPostTest() {
		postEditor.createPost(post, errors);
		String expectedView = "postEdit";
		String actualView = postEditor.editPost(post, 1, model);

		assertEquals(expectedView, actualView);
		postEditor.deletePost(1);
	}
}
