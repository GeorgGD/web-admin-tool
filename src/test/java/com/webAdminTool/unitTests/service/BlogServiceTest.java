package com.webAdminTool.unitTests.service;

import static org.junit.Assert.assertEquals;

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
}
