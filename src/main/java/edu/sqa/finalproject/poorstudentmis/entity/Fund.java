package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fund {
	private Integer f_id;
	private String f_name;
	private String f_abs;
	private double f_amount; // 资助金额
	private Long f_time; // 发布时间
	private String f_img;
	
	public Fund(Integer f_id, String f_name, String f_abs, double f_amount, Long f_time, String f_img) {
		super();
		this.f_id = f_id;
		this.f_name = f_name;
		this.f_abs = f_abs;
		this.f_amount = f_amount;
		this.f_time = f_time;
		this.f_img = f_img;
	}
	public String getTimeStr() {
		// 将long类型的时间戳 转换为yyyy-mm-dd hh:mm
		// 创建日期格式化对象 抽象类和接口 不可以通过new来实例化
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date(this.f_time);
		return df.format(date);
	}
	public int getF_id() {
		return f_id;
	}
	public void setF_id(Integer f_id) {
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
	public double getF_amount() {
		return f_amount;
	}
	public void setF_amount(double f_amount) {
		this.f_amount = f_amount;
	}
	public Long getF_time() {
		return f_time;
	}
	public void setF_time(Long f_time) {
		this.f_time = f_time;
	}
	public String getF_img() {
		return f_img;
	}
	public void setF_img(String f_img) {
		this.f_img = f_img;
	}
	@Override
	public String toString() {
		return "Fund [f_id=" + f_id + ", f_name=" + f_name + ", f_abs=" + f_abs + ", f_amount=" + f_amount + ", f_time="
				+ f_time + ", f_img=" + f_img + "]";
	}
	
}