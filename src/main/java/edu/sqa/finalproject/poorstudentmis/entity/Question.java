package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question {
	private Integer q_id;
	private String sid;
	private String title;
	private String content;
	private Date time;//日期
	private String r_content;
	private String r_reviewer;
	private Date r_time;
	private Integer tag_id;
	
	

	public Question() {
		super();
	}
	public Question(String sid, String title, String content, Date time) {
		super();
		this.sid = sid;
		this.title = title;
		this.content = content;
		
		this.time = time;
	}
	
	public Question(Integer q_id, String sid, String title, String content, Date time, String r_content,
			String r_reviewer, Date r_time, Integer tag_id) {
		super();
		this.q_id = q_id;
		this.sid = sid;
		this.title = title;
		this.content = content;
		this.time = time;
		this.r_content = r_content;
		this.r_reviewer = r_reviewer;
		this.r_time = r_time;
		this.tag_id = tag_id;
	}
	public Integer getTag_id() {
		return tag_id;
	}
	public void setTag_id(Integer tag_id) {
		this.tag_id = tag_id;
	}
	public Integer getQ_id() {
		return q_id;
	}
	public void setQ_id(Integer q_id) {
		this.q_id = q_id;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
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
	public String getTime() {
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateStr=sdf.format(time);
	    return dateStr;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public String getR_reviewer() {
		return r_reviewer;
	}
	public void setR_reviewer(String r_reviewer) {
		this.r_reviewer = r_reviewer;
	}
	public String getR_time() {
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String dateStr=sdf.format(r_time);
		 return dateStr;
	}
	public void setR_time(Date r_time) {
		this.r_time = r_time;
	}
	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", sid=" + sid + ", title=" + title + ", content=" + content + ", time="
				+ time + ", r_content=" + r_content + ", r_reviewer=" + r_reviewer + ", r_time=" + r_time + ", tag_id="
				+ tag_id + "]";
	}
	
	
}
