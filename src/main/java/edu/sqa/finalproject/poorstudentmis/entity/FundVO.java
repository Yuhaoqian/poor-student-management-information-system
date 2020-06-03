package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FundVO {
	private int fa_flag;
	private String fa_reviewer;
	private int f_id;
	private String f_name;
	private String f_abs;
	private long f_time;
	public String getTimeStr() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(f_time);
		return df.format(date);
	}
	public String getVerify() {
		if (fa_flag == 0)
			return "等待审核";
		else
			return "已通过审核";
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
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getF_abs() {
		return f_abs;
	}
	public void setF_abs(String f_abs) {
		this.f_abs = f_abs;
	}
	public long getF_time() {
		return f_time;
	}
	public void setF_time(long f_time) {
		this.f_time = f_time;
	}
	
	
}
