package com.webAdminTool.repository;

import com.webAdminTool.dto.BlogPost;

import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository <BlogPost, Integer>{
	
}
