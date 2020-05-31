package edu.sqa.finalproject.poorstudentmis.entity;

public class Fund {
	private int f_id;
	private String f_name;
	private String f_abs;
	private double f_amount; // 资助金额
	private Long f_time; // 发布时间
	private String f_img;
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
	
}
