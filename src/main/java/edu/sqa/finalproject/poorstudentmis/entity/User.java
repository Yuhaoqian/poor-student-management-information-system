package edu.sqa.finalproject.poorstudentmis.entity;

public class User {
	private String u_id;
	private String u_name;
	private String u_password;
	private int u_power=1; // 1 是普通权限；0 是管理员权限
	
	public User() {
		super();
	}

	public User(String u_id, String u_name, String u_password, int u_power) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_password = u_password;
		this.u_power = u_power;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public int getU_power() {
		return u_power;
	}

	public void setU_power(int u_power) {
		this.u_power = u_power;
	}

	
	
	
}
