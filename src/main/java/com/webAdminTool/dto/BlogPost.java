package com.webAdminTool.dto;

public class BlogPost {

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

	// Creates a row for a table entry
	public String toString() {
		return "<tr>"+"<td>"+ID+"</td><td>"+title+"</td><td>"+date+"</td><td class=\"text-center\"><a href=\"edit?id="+ID+"\"><i class=\"fas fa-info-circle text-orange\"></i></a></td>";
	}		
}
