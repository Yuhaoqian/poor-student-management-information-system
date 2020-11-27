package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vol {
	Integer vid;
	String name;//活动名称
	String abs;//简介
	String address;//地址
	String img;//图片
	Integer num;//需要的人数
	Integer anum;//已经报名人数
	String stime;//服务时间
	Date btime;//开始时间
	Date etime;//结束时间
	Date rtime;//发布时间\
	

	public Vol() {
		super();
	}
	public Vol( String name, String abs, String address, String img, Integer num, Integer anum,
			String stime, Date btime, Date etime, Date rtime) {
		super();
		this.name = name;
		this.abs = abs;
		this.address = address;
		this.img = img;
		this.num = num;
		this.anum = anum;
		this.stime = stime;
		this.btime = btime;
		this.etime = etime;
		this.rtime = rtime;
	}
	
	
	public Vol(String name, String abs, Date rtime) {
		super();
		this.name = name;
		this.abs = abs;
		this.rtime = rtime;
	}


	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getAnum() {
		return anum;
	}
	public void setAnum(Integer anum) {
		this.anum = anum;
	}
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
	public String getBtime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(btime);
		return dateStr;
	}
	public void setBtime(Date btime) {
		this.btime = btime;
	}
	public String getEtime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(etime);
		return dateStr;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	public String getRtime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(rtime);
		return dateStr;
	}
	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}
	
	@Override
	public String toString() {
		return "Vol [vid=" + vid + ", name=" + name + ", abs=" + abs + ", address=" + address + ", img=" + img
				+ ", num=" + num + ", anum=" + anum + ", stime=" + stime + ", btime=" + btime + ", etime=" + etime
				+ ", rtime=" + rtime + "]";
	}	
}
