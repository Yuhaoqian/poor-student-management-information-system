package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VolA {
	private Integer va_id;
	private String sid; // 学生id
	private Integer vid; // 项目id
	private Date va_time; // 申请时间
	private Integer va_flag; // 审核通过标志
	private String va_reviewer; // 审核人
	
	
	public VolA( String sid, Integer vid, Date va_time, Integer va_flag, String va_reviewer) {
		super();
		this.sid = sid;
		this.vid = vid;
		this.va_time = va_time;
		this.va_flag = va_flag;
		this.va_reviewer = va_reviewer;
	}
	public Integer getVa_id() {
		return va_id;
	}
	public void setVa_id(Integer va_id) {
		this.va_id = va_id;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public Integer getFid() {
		return vid;
	}
	public void setFid(Integer vid) {
		this.vid = vid;
	}
	public String getVa_time() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(va_time);
		return dateStr;
	}
	public void setVa_time(Date va_time) {
		this.va_time = va_time;
	}
	public Integer getVa_flag() {
		return va_flag;
	}
	public void setVa_flag(Integer va_flag) {
		this.va_flag = va_flag;
	}
	public String getVa_reviewer() {
		return va_reviewer;
	}
	public void setVa_reviewer(String va_reviewer) {
		this.va_reviewer = va_reviewer;
	}
	@Override
	public String toString() {
		return "VolA [va_id=" + va_id + ", sid=" + sid + ", vid=" + vid + ", va_time=" + va_time + ", va_flag="
				+ va_flag + ", va_reviewer=" + va_reviewer + "]";
	}
	
}
