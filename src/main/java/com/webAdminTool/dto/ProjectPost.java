package com.webAdminTool.dto;

/**
 * Represents a project post
 * @author Georgios Davakos
 * @since 2021-01-07
 */
public class ProjectPost {

	private int ID;
	private String title;
	private String short_desc;
	private String post;
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

	public String getPost_Date() {
		return post_date;
	}

	public void setPost_Date(String post_date) {
		this.post_date = post_date;
	}

	
}
