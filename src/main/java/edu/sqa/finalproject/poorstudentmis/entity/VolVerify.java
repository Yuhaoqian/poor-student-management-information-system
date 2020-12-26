package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VolVerify {
	
	private int va_id;
	private String u_name;
	private int va_flag;
	private String va_reviewer;
	private String name;
	private String abs;
	private long va_time;
	public String getTimeStr() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(va_time);
		return df.format(date);
	}
	public String getVerify() {
		if (va_flag == 0)
			return "等待审核";
		else
			return "已通过审核";
	}
	public int getVa_flag() {
		return va_flag;
	}
	public void setVa_flag(int va_flag) {
		this.va_flag = va_flag;
	}
	public String getVa_reviewer() {
		return va_reviewer;
	}
	public void setVa_reviewer(String va_reviewer) {
		this.va_reviewer = va_reviewer;
	}
	public int getVa_id() {
		return va_id;
	}
	public void setVa_id(int va_id) {
		this.va_id = va_id;
	}
	public String getName() {
		return name;
	}
	public String getAbs() {
		return abs;
	}
	public void setAbs(String abs) {
		this.abs = abs;
	}
	public long getVa_time() {
		return va_time;
	}
	public void setVa_time(long va_time) {
		this.va_time = va_time;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	
	
	
}
