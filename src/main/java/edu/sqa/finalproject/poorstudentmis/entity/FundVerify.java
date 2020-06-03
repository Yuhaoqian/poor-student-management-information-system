package edu.sqa.finalproject.poorstudentmis.entity;

public class FundVerify {
	private int fa_id;
	private String f_name;
	private String u_name;
	private int fa_flag;
	private String fa_reviewer;
	public String getVerify() {
		if (fa_flag == 0)
			return "等待审核";
		else
			return "已通过审核";
	}
	public int getFa_id() {
		return fa_id;
	}
	public void setFa_id(int fa_id) {
		this.fa_id = fa_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
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
