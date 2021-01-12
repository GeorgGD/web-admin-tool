package com.webAdminTool.dto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlogPostTest {

	@Test
	public void getSetIdDTest() {
		int id = 10;
		BlogPost blog = new BlogPost();

		blog.setID(id);
		int actualId = blog.getID();

		assertEquals(id, actualId);
	}

	@Test
	public void getSetTitle() {
		String title = "test";
		BlogPost blog = new BlogPost();

		blog.setTitle(title);
		String actualTitle = blog.getTitle();
		assertEquals(title, actualTitle);
	}
}
