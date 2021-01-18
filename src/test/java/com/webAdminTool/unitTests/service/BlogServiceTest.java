package com.webAdminTool.unitTests.service;

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
		
	}
}
