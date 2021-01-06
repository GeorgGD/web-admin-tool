package com.webAdminTool.repository;

import com.webAdminTool.dto.BlogPost;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BlogRepository extends CrudRepository <BlogPost, Integer>{
	
}
