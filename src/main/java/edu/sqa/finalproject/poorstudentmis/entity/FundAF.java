package edu.sqa.finalproject.poorstudentmis.entity;

public class FundAF { // Fund Application Form
	private int fa_id;
	private int sid; // 学生id
	private int fid; // 项目id
	private Long fa_time; // 申请时间
	private int fa_flag; // 审核通过标志
	private String fa_reviwer; // 审核人
	public int getFa_id() {
		return fa_id;
	}
	public void setFa_id(int fa_id) {
		this.fa_id = fa_id;
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
	public String getFa_reviwer() {
		return fa_reviwer;
	}
	public void setFa_reviwer(String fa_reviwer) {
		this.fa_reviwer = fa_reviwer;
	}
	
}
