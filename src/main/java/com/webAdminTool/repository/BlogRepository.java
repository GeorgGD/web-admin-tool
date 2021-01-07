package com.webAdminTool.repository;

import com.webAdminTool.dto.BlogPost;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Meant for connecting to external database
 * @author Georgios Davakos
 * @since 2021-01-07 
 */
@Repository
public interface BlogRepository extends CrudRepository <BlogPost, Integer>{
	
}
