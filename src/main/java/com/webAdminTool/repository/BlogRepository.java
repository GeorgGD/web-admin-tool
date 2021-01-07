package com.webAdminTool.repository;

import com.webAdminTool.dto.BlogPost;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Meant for connecting to external database 
 */
@Repository
public interface BlogRepository extends CrudRepository <BlogPost, Integer>{
	
}
