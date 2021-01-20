package com.webAdminTool.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.webAdminTool.dto.ProjectPost;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectServiceTest {

	@Autowired
	private ProjectService projectService;

		public ProjectPost initPost() {
		ProjectPost post = new ProjectPost();
		post.setID(1);
		post.setTitle("test");
		post.setShort_desc("A unit test");
		post.setPost("a short unit test");
		post.setPost_date("21/01/18");

		return post;
	}
	
	@Test
	public void createProjectPostTest() {
		projectService.createProjectPost(initPost());
		ProjectPost actualPost = projectService.getProjectPost(initPost().getID());

		assertEquals(initPost().getShort_desc(), actualPost.getShort_desc());
		assertEquals(initPost().getPost(), actualPost.getPost());

		projectService.deleteProjectPost(initPost().getID());
	}

	@Test
	public void updateProjectPostTest() {
		String txt = "New text";
		projectService.createProjectPost(initPost());

		ProjectPost expectedPost = projectService.getProjectPost(initPost().getID());
		expectedPost.setPost(txt);
		projectService.updateProjectPost(expectedPost);

		ProjectPost actualPost = projectService.getProjectPost(initPost().getID());
		assertEquals(expectedPost.getPost(), actualPost.getPost());

		projectService.deleteProjectPost(initPost().getID());
	}

	@Test
	public void getAllPostsTest() {
		int expectedSize = 2;
		int expectedID = 20;
		projectService.createProjectPost(initPost());
		ProjectPost secondPost = initPost();
		secondPost.setID(expectedID);
		projectService.createProjectPost(secondPost);


		List<ProjectPost> posts = projectService.getAllPosts();
	    
		assertEquals(expectedSize, posts.size());
		assertEquals(expectedID, posts.get(1).getID());

		projectService.deleteProjectPost(1);
		projectService.deleteProjectPost(20);

		posts = projectService.getAllPosts();
		expectedSize = 0;
		assertEquals(expectedSize, posts.size());
	}
}
