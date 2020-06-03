package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkAF {
	private Integer wa_id;
	private String sid; // 学生id
	private int fid; // 项目id
	private Long wa_time; // 申请时间
	private int wa_flag; // 审核通过标志
	private String wa_reviewer; // 审核人
	public String getVerify() {
		if (wa_flag == 0)
			return "等待审核";
		else
			return "已通过审核";
	}
	public WorkAF(Integer wa_id, String sid, int fid, Long wa_time, int wa_flag, String wa_reviewer) {
		super();
		this.wa_id = wa_id;
		this.sid = sid;
		this.fid = fid;
		this.wa_time = wa_time;
		this.wa_flag = wa_flag;
		this.wa_reviewer = wa_reviewer;
	}
	public String getTimeStr() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(wa_time);
		return df.format(date);
	}
	public Integer getWa_id() {
		return wa_id;
	}
	public void setWa_id(Integer wa_id) {
		this.wa_id = wa_id;
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
	public Long getWa_time() {
		return wa_time;
	}
	public void setWa_time(Long wa_time) {
		this.wa_time = wa_time;
	}
	public int getWa_flag() {
		return wa_flag;
	}
	public void setWa_flag(int wa_flag) {
		this.wa_flag = wa_flag;
	}
	public String getwa_reviewer() {
		return wa_reviewer;
	}
	public void setwa_reviewer(String wa_reviewer) {
		this.wa_reviewer = wa_reviewer;
	}
	
}
