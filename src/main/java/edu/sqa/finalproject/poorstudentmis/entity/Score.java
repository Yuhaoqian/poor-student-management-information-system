package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Score {
	private Integer id;
	private String s_id;//学生id
	private String content;//内容
	private Date time;//收藏的时间
	private Integer cnt;//奖励积分数
	private Integer isread;//是否已读
	
	public Score() {
		super();
	}
	public Score(String s_id, String content, Date time, Integer cnt, Integer isread) {
		super();
		this.s_id = s_id;
		this.content = content;
		this.time = time;
		this.cnt = cnt;
		this.isread = isread;
	}
	
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	@Override
	public String toString() {
		return "Score [id=" + id + ", content=" + content + ", time=" + time + ", cnt=" + cnt + ", isread=" + isread
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	public Integer getIsread() {
		return isread;
	}
	public void setIsread(Integer isread) {
		this.isread = isread;
	}
	
}
