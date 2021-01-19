package com.webAdminTool.integrationTests.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.webAdminTool.dto.BlogPost;
import com.webAdminTool.service.BlogService;

import org.junit.Test;

public class BlogServiceTest {


	public BlogPost initPost() {
		BlogPost post = new BlogPost();
		post.setID(1);
		post.setTitle("test");
		post.setShort_desc("A unit test");
		post.setPost("a short unit test");
		post.setPost_date("21/01/18");

		return post;
	}
	
	@Test
	public void createBlogPostTest() {
		BlogService blogService = new BlogService();
		blogService.createBlogPost(initPost());
		BlogPost actualPost = blogService.getBlogPost(initPost().getID());

		assertEquals(initPost().getShort_desc(), actualPost.getShort_desc());
		assertEquals(initPost().getPost(), actualPost.getPost());		
	}

	@Test
	public void updateBlogPostTest() {
		String txt = "New text";
		BlogService blogService = new BlogService();
		blogService.createBlogPost(initPost());

		BlogPost expectedPost = blogService.getBlogPost(initPost().getID());
		expectedPost.setPost(txt);
		blogService.updateBlogPost(expectedPost);

		BlogPost actualPost = blogService.getBlogPost(initPost().getID());
		assertEquals(expectedPost.getPost(), actualPost.getPost());
	}

	@Test
	public void getAllPostsTest() {
		int expectedSize = 2;
		int expectedID = 20;
		BlogService blogService = new BlogService();
		blogService.createBlogPost(initPost());
		BlogPost secondPost = initPost();
		secondPost.setID(expectedID);
		blogService.createBlogPost(secondPost);


		List<BlogPost> posts = blogService.getAllPosts();

		assertEquals(expectedSize, posts.size());
		assertEquals(expectedID, posts.get(2).getID());

		blogService.deleteBlogPost(1);
		blogService.deleteBlogPost(20);

		posts = blogService.getAllPosts();
		expectedSize = 0;
		assertEquals(expectedSize, posts.size());
	}
}
