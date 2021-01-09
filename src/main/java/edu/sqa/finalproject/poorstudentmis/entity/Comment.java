package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {
	private Integer id;
	private String sid;
	private String name;
	private String content;
	private Date created_time;
	private Integer article_id;
	private String avatar_url;
	
	
	public Comment(String sid, String name, String content, Integer article_id) {
		super();
		this.sid = sid;
		this.name = name;
		this.content = content;
		this.article_id = article_id;
		this.created_time = new Date();
	}
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(Integer id, String sid, String name, String content, Date created_time, Integer article_id) {
		super();
		this.id = id;
		this.sid = sid;
		this.name = name;
		this.content = content;
		this.created_time = created_time;
		this.article_id = article_id;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", sid=" + sid + ", name=" + name + ", content=" + content + ", created_time="
				+ created_time + ", article_id=" + article_id + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreated_time() {
		
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateStr=sdf.format(created_time);
	    return dateStr;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
		
	}
	public Integer getArticle_id() {
		return article_id;
	}
	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	
}
