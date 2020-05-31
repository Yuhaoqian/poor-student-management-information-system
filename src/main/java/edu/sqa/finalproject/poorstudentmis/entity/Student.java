package edu.sqa.finalproject.poorstudentmis.entity;

import java.util.Date;

public class Student {
	private String s_id;
	private String s_name;
	private String s_nation;
	private String s_sex;
	private String s_birth;
	private String s_major;
	private String s_phone;
	private String s_address;
	private double s_income;
	private String s_res;
	private String s_info;
	private String s_other;
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_nation() {
		return s_nation;
	}
	public void setS_nation(String s_nation) {
		this.s_nation = s_nation;
	}
	public String getS_sex() {
		return s_sex;
	}
	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
	}
	public String getS_birth() {
		return s_birth;
	}
	public void setS_birth(String s_birth) {
		this.s_birth = s_birth;
	}
	public String getS_major() {
		return s_major;
	}
	public void setS_major(String s_major) {
		this.s_major = s_major;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	public double getS_income() {
		return s_income;
	}
	public void setS_income(double s_income) {
		this.s_income = s_income;
	}
	public String getS_res() {
		return s_res;
	}
	public void setS_res(String s_res) {
		this.s_res = s_res;
	}
	public String getS_info() {
		return s_info;
	}
	public void setS_info(String s_info) {
		this.s_info = s_info;
	}
	public String getS_other() {
		return s_other;
	}
	public void setS_other(String s_other) {
		this.s_other = s_other;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_nation=" + s_nation + ", s_sex=" + s_sex
				+ ", s_birth=" + s_birth + ", s_major=" + s_major + ", s_phone=" + s_phone + ", s_address=" + s_address
				+ ", s_income=" + s_income + ", s_res=" + s_res + ", s_info=" + s_info + ", s_other=" + s_other + "]";
	}
	public Student(String s_id, String s_name, String s_nation, String s_sex, String s_birth, String s_major,
			String s_phone, String s_address, double s_income, String s_res, String s_info, String s_other) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_nation = s_nation;
		this.s_sex = s_sex;
		this.s_birth = s_birth;
		this.s_major = s_major;
		this.s_phone = s_phone;
		this.s_address = s_address;
		this.s_income = s_income;
		this.s_res = s_res;
		this.s_info = s_info;
		this.s_other = s_other;
	}
	public Student(String s_id, String s_name) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_nation = "";
		this.s_sex = "";
		this.s_birth = "";
		this.s_major = "";
		this.s_phone = "";
		this.s_address = "";
		this.s_income = 0;
		this.s_res = "";
		this.s_info = "";
		this.s_other = "";
	}
}
