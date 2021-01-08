package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notice {
	private Integer n_id;
	private String n_title;
	private Date n_time;
	private String n_href;
	private Integer n_isread;
	
	public Notice() {
		super();
	}
	public Notice(Integer n_id, String n_title, Date n_time, String n_href, Integer n_isread) {
		super();
		this.n_id = n_id;
		this.n_title = n_title;
		this.n_time = n_time;
		this.n_href = n_href;
		this.n_isread = n_isread;
	}
	public Integer getN_id() {
		return n_id;
	}
	public void setN_id(Integer n_id) {
		this.n_id = n_id;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_time() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(n_time);
		return dateStr;
	}
	public void setN_time(Date n_time) {
		this.n_time = n_time;
	}
	public String getN_href() {
		return n_href;
	}
	public void setN_href(String n_href) {
		this.n_href = n_href;
	}
	public Integer getN_isread() {
		return n_isread;
	}
	public void setN_isread(Integer n_isread) {
		this.n_isread = n_isread;
	}
	@Override
	public String toString() {
		return "Notice [n_id=" + n_id + ", n_title=" + n_title + ", n_time=" + n_time + ", n_href=" + n_href
				+ ", n_isread=" + n_isread + "]";
	}
	
}
