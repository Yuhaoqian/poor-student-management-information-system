package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Work {
	private Integer w_id;
	private String w_name;
	private String w_abs;
	private Long w_time;
	private String w_position; // 地点
	private double w_money;
	private String w_img;
	public String getTimeStr() {
		// 将long类型的时间戳 转换为yyyy-mm-dd hh:mm
		// 创建日期格式化对象 抽象类和接口 不可以通过new来实例化
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(this.w_time);
		return df.format(date);
	}
	public Integer getW_id() {
		return w_id;
	}
	public void setW_id(Integer w_id) {
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
	public Long getW_time() {
		return w_time;
	}
	public void setW_time(Long w_time) {
		this.w_time = w_time;
	}
	public String getW_position() {
		return w_position;
	}
	public void setW_position(String w_position) {
		this.w_position = w_position;
	}
	public double getW_money() {
		return w_money;
	}
	public void setW_money(double w_money) {
		this.w_money = w_money;
	}
	public String getW_img() {
		return w_img;
	}
	public void setW_img(String w_img) {
		this.w_img = w_img;
	}
	public Work(Integer w_id, String w_name, String w_abs, Long w_time, String w_position, double w_money, String w_img) {
		super();
		this.w_id = w_id;
		this.w_name = w_name;
		this.w_abs = w_abs;
		this.w_time = w_time;
		this.w_position = w_position;
		this.w_money = w_money;
		this.w_img = w_img;
	}
	
}
