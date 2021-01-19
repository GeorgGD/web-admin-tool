package com.webAdminTool.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.webAdminTool.dto.BlogPost;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogServiceTest {

	@Autowired
	BlogService blogService;

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
		blogService.createBlogPost(initPost());
		BlogPost actualPost = blogService.getBlogPost(initPost().getID());

		assertEquals(initPost().getShort_desc(), actualPost.getShort_desc());
		assertEquals(initPost().getPost(), actualPost.getPost());

		blogService.deleteBlogPost(initPost().getID());
	}

	@Test
	public void updateBlogPostTest() {
		String txt = "New text";
		blogService.createBlogPost(initPost());

		BlogPost expectedPost = blogService.getBlogPost(initPost().getID());
		expectedPost.setPost(txt);
		blogService.updateBlogPost(expectedPost);

		BlogPost actualPost = blogService.getBlogPost(initPost().getID());
		assertEquals(expectedPost.getPost(), actualPost.getPost());

		blogService.deleteBlogPost(initPost().getID());
	}

	@Test
	public void getAllPostsTest() {
		int expectedSize = 2;
		int expectedID = 20;
		blogService.createBlogPost(initPost());
		BlogPost secondPost = initPost();
		secondPost.setID(expectedID);
		blogService.createBlogPost(secondPost);


		List<BlogPost> posts = blogService.getAllPosts();
	    
		assertEquals(expectedSize, posts.size());
		assertEquals(expectedID, posts.get(1).getID());

		blogService.deleteBlogPost(1);
		blogService.deleteBlogPost(20);

		posts = blogService.getAllPosts();
		expectedSize = 0;
		assertEquals(expectedSize, posts.size());
	}
}
