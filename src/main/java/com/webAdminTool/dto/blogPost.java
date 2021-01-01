package com.webAdminTool.dto;

public class blogPost {

	private int ID;
	private String title;
	private String short_desc;
	private String blog_post;
	private String date;

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

	public String getBlog_post() {
		return blog_post;
	}

	public void setBlog_post(String blog_post) {
		this.blog_post = blog_post;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}
