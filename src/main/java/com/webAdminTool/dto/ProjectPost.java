package com.webAdminTool.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

/**
 * Represents a project post
 * @author Georgios Davakos
 * @since 2021-01-07
 */
@Entity
@Table(name="ProjectPosts")
public class ProjectPost {

	@Id
	@Positive
	private int ID;	
	@NotBlank(message = "Can't be empty!")
	private String title;
	@NotBlank(message = "Can't be empty!")
	private String short_desc;
	private String post;
	@NotBlank(message = "Can't be empty!")
	private String post_date;

	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShort_desc() {
		return short_desc;
	}

	public void setShort_desc(String short_desc) {
		this.short_desc = short_desc;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPost_date() {
		return post_date;
	}

	public void setPost_date(String post_date) {
		this.post_date = post_date;
	}

	
}
