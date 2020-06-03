package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FundAF { // Fund Application Form
	private Integer fa_id;
	private String sid; // 学生id
	private int fid; // 项目id
	private Long fa_time; // 申请时间
	private int fa_flag; // 审核通过标志
	private String fa_reviewer; // 审核人
	
	public FundAF(Integer fa_id, String sid, int fid, Long fa_time, int fa_flag, String fa_reviewer) {
		super();
		this.fa_id = fa_id;
		this.sid = sid;
		this.fid = fid;
		this.fa_time = fa_time;
		this.fa_flag = fa_flag;
		this.fa_reviewer = fa_reviewer;
	}
	public String getTimeStr() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(fa_time);
		return df.format(date);
	}
	public Integer getFa_id() {
		return fa_id;
	}
	public void setFa_id(Integer fa_id) {
		this.fa_id = fa_id;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public Long getFa_time() {
		return fa_time;
	}
	public void setFa_time(Long fa_time) {
		this.fa_time = fa_time;
	}
	public int getFa_flag() {
		return fa_flag;
	}
	public void setFa_flag(int fa_flag) {
		this.fa_flag = fa_flag;
	}
	public String getFa_reviewer() {
		return fa_reviewer;
	}
	public void setFa_reviewer(String fa_reviewer) {
		this.fa_reviewer = fa_reviewer;
	}
	
}
