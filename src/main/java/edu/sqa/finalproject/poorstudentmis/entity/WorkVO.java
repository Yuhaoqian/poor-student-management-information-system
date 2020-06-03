package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkVO {
	private int wa_flag;
	private String wa_reviewer;
	private int w_id;
	private String w_name;
	private String w_abs;
	private long w_time;
	public String getTimeStr() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(w_time);
		return df.format(date);
	}
	public String getVerify() {
		if (wa_flag == 0)
			return "等待审核";
		else
			return "已通过审核";
	}
	public int getWa_flag() {
		return wa_flag;
	}
	public void setWa_flag(int wa_flag) {
		this.wa_flag = wa_flag;
	}
	public String getWa_reviewer() {
		return wa_reviewer;
	}
	public void setWa_reviewer(String wa_reviewer) {
		this.wa_reviewer = wa_reviewer;
	}
	public int getW_id() {
		return w_id;
	}
	public void setW_id(int w_id) {
		this.w_id = w_id;
	}
	public String getW_name() {
		return w_name;
	}
	public void setW_name(String w_name) {
		this.w_name = w_name;
	}
	public String getW_abs() {
		return w_abs;
	}
	public void setW_abs(String w_abs) {
		this.w_abs = w_abs;
	}
	public long getW_time() {
		return w_time;
	}
	public void setW_time(long w_time) {
		this.w_time = w_time;
	}
	
}
