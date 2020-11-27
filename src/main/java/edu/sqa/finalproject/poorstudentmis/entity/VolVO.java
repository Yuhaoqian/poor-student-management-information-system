package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VolVO {
	private int va_flag;
	private String va_reviewer;
	private int vid;
	private String name;
	private String abs;
	private Date etime;
	public int getVa_flag() {
		return va_flag;
	}
	public String getVerify() {
		if (va_flag == 0)
			return "等待审核";
		else
			return "已通过审核";
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
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbs() {
		return abs;
	}
	public void setAbs(String abs) {
		this.abs = abs;
	}
	public String getEtime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(etime);
		return dateStr;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	@Override
	public String toString() {
		return "VolVO [va_flag=" + va_flag + ", va_reviewer=" + va_reviewer + ", vid=" + vid + ", name=" + name
				+ ", abs=" + abs + ", etime=" + etime + "]";
	}
	
	
}

