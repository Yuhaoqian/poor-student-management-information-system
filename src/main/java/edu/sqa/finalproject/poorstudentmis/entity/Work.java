package edu.sqa.finalproject.poorstudentmis.entity;

public class Work {
	private int w_id;
	private String w_name;
	private String w_abs;
	private Long w_time;
	private String w_position; // 地点
	private double w_money;
	private String w_img;
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
	
}
