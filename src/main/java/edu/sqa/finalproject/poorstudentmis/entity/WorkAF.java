package edu.sqa.finalproject.poorstudentmis.entity;

public class WorkAF {
	private int wa_id;
	private int sid; // 学生id
	private int fid; // 项目id
	private Long wa_time; // 申请时间
	private int wa_flag; // 审核通过标志
	private String wa_reviwer; // 审核人
	public int getWa_id() {
		return wa_id;
	}
	public void setWa_id(int wa_id) {
		this.wa_id = wa_id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
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
	public String getWa_reviwer() {
		return wa_reviwer;
	}
	public void setWa_reviwer(String wa_reviwer) {
		this.wa_reviwer = wa_reviwer;
	}
	
}
