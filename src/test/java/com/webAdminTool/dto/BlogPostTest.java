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

	@Test
	public void getSetShort_desc() {
		String short_desc = "short desc";
		BlogPost blog = new BlogPost();

		blog.setShort_desc(short_desc);
		String actualShort_desc = blog.getShort_desc();
		assertEquals(short_desc, actualShort_desc);		
	}

	@Test
	public void getSetBlog_post() {
		String blog_post = "blog post";
		BlogPost blog = new BlogPost();

		blog.setBlog_post(blog_post);
		String actualBlog_post = blog.getBlog_post();
		assertEquals(blog_post, actualBlog_post);
	}

	@Test
	public void getSetDate() {
		String post_date = "21-01-12";
		BlogPost blog = new BlogPost();

		blog.setPost_Date(post_date);
		String actualDate = blog.getPost_Date();
		assertEquals(post_date, actualDate);
	}
}
