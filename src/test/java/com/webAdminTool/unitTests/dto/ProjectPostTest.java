package com.webAdminTool.dto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProjectPostTest {

	@Test
	public void getSetIdDTest() {
		int id = 10;
		ProjectPost project = new ProjectPost();

		project.setID(id);
		int actualId = project.getID();

		assertEquals(id, actualId);
	}

	@Test
	public void getSetTitle() {
		String title = "test";
		ProjectPost project = new ProjectPost();

		project.setTitle(title);
		String actualTitle = project.getTitle();
		assertEquals(title, actualTitle);
	}

	@Test
	public void getSetShort_desc() {
		String short_desc = "short desc";
		ProjectPost project = new ProjectPost();

		project.setShort_desc(short_desc);
		String actualShort_desc = project.getShort_desc();
		assertEquals(short_desc, actualShort_desc);		
	}

	@Test
	public void getSetProject_post() {
		String project_post = "project post";
		ProjectPost project = new ProjectPost();

		project.setPost(project_post);
		String actualProject_post = project.getPost();
		assertEquals(project_post, actualProject_post);
	}

	@Test
	public void getSetDate() {
		String post_date = "21-01-12";
		ProjectPost project = new ProjectPost();

		project.setPost_date(post_date);
		String actualDate = project.getPost_date();
		assertEquals(post_date, actualDate);
	}
}
