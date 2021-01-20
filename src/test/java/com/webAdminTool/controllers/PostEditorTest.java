package com.webAdminTool.controllers;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import com.webAdminTool.dto.BlogPost;

import org.junit.Before;
import org.junit.FixMethodOrder;
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
@FixMethodOrder
public class PostEditorTest {

	@Autowired
	private PostEditor postEditor;
	private Model model;
	private MapBindingResult errors;
	private BlogPost post;
	
	@Before
	public void setup() {
		model = new ExtendedModelMap();
		errors = new MapBindingResult(new HashMap<String, String>(), "dummy");

		post = new BlogPost();
		post.setID(1);
		post.setTitle("test");
		post.setShort_desc("A unit test");
		post.setPost("a short unit test");
		post.setPost_date("21/01/18");
	}

	@Test
	public void rootRedirectTest() {
		String expectedString = "redirect:/dashboard/blogManager";
		String actualString = postEditor.rootRedirect();

		assertEquals(expectedString, actualString);
	}
}
