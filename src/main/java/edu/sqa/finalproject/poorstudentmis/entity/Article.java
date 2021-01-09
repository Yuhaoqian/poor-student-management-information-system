package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Article {
	private Integer id;
	private String title;
	private String content;
	private String excerpt;
	private Date created_time;
	private Integer category_id;
	private String category;
	private Integer views;
	private Integer like;
	private Integer star;

	private Integer top;
	private String sid;
	private String s_name;
	private String avatar_url;
	
	
	public Article() {
		super();
	}
	




	public Article(Integer id, String title, String content, String excerpt, Date created_time, Integer category_id,
			String category, Integer views, Integer like, Integer star, Integer top, String sid, String s_name,
			String avatar_url) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.excerpt = excerpt;
		this.created_time = created_time;
		this.category_id = category_id;
		this.category = category;
		this.views = views;
		this.like = like;
		this.star = star;
		this.top = top;
		this.sid = sid;
		this.s_name = s_name;
		this.avatar_url = avatar_url;
	}





	public Article(String title, String content, Integer top, Integer category_id, String sid) {
		super();
		this.title = title;
		this.content = content;
		this.excerpt = content.length() > 100 ? content.substring(0, 64) : content;
		this.created_time = new Date();
		this.top = top;
		this.category_id = category_id;
		this.sid = sid;

	}


	public Integer getCategory_id() {
		return category_id;
	}


	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}





	public String getAvatar_url() {
		return avatar_url;
	}


	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public String getCreated_time() {
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateStr=sdf.format(created_time);
	    return dateStr;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getExcerpt() {
		return excerpt;
	}
	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Integer getLike() {
		return like;
	}
	public void setLike(Integer like) {
		this.like = like;
	}
	public Integer getTop() {
		return top;
	}
	public void setTop(Integer top) {
		this.top = top;
	}
	


	public Integer getStar() {
		return star;
	}





	public void setStar(Integer star) {
		this.star = star;
	}





	public Article(Integer id, String title, String content, String excerpt, Date created_time, Integer category_id,
			String category, Integer views, Integer like, Integer top, String sid, String s_name) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.excerpt = excerpt;
		this.created_time = created_time;
		this.category_id = category_id;
		this.category = category;
		this.views = views;
		this.like = like;
		this.top = top;
		this.sid = sid;
		this.s_name = s_name;
	}


	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", excerpt=" + excerpt
				+ ", created_time=" + created_time + ", category_id=" + category_id + ", category=" + category
				+ ", views=" + views + ", like=" + like + ", top=" + top + ", sid=" + sid + ", s_name=" + s_name + "]";
	}






}
