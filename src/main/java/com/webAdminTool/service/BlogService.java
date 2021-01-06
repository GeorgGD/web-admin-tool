package com.webAdminTool.service;

import java.util.ArrayList;
import java.util.List;

import com.webAdminTool.dto.BlogPost;
import com.webAdminTool.repository.BlogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepo;

	public List<BlogPost> getAllPosts() {
		List<BlogPost> posts = new ArrayList<>();
		blogRepo.findAll().forEach(posts::add);
		return posts;
	}

	public BlogPost getBlogPost(Integer id) {
		return blogRepo.findById(id).get();
	}
		
}
