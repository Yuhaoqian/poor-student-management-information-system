package edu.sqa.finalproject.poorstudentmis.entity;

public class PoorStu {
	private String stu_id;//学生id
	private String s_name;//学生姓名
	private String s_sex;//学生性别
	private String s_major;//专业
	private String s_phone;//电话
	private String s_email;//邮箱
	private double s_income;//家庭收入
	private double s_outcome;//月花费
	private int poor_level;//贫困等级
	private int score;//积分
	private String avatar_url;//头像地址
	private String s_info;//问卷中的单元按钮
	private String s_other;//其他信息
	private Integer s_ischeck;//后台是否审核
	public PoorStu() {
		super();
	}
	public PoorStu(String stu_id,String s_name) {
		super();
		this.stu_id = stu_id;
		this.s_name = s_name;
	}
	public PoorStu(String stu_id,String s_name,String s_sex,String s_major,String s_email,String s_phone) {
		super();
		this.stu_id = stu_id;
		this.s_name = s_name;
		this.s_sex = s_sex;
		this.s_major = s_major;
		this.s_email = s_email;
		this.s_phone = s_phone;
		this.s_info = "0,0,0,0,0,0,0,0,0,0,0,0";
		this.s_ischeck = -1;//默认值为-1
	}
	
	
	public Integer getS_ischeck() {
		return s_ischeck;
	}
	public void setS_ischeck(Integer s_ischeck) {
		this.s_ischeck = s_ischeck;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_sex() {
		return s_sex;
	}
	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
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
	public String getS_email() {
		return s_email;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}
	public double getS_income() {
		return s_income;
	}
	public void setS_income(double s_income) {
		this.s_income = s_income;
	}
	public double getS_outcome() {
		return s_outcome;
	}
	public void setS_outcome(double s_outcome) {
		this.s_outcome = s_outcome;
	}
	public int getPoor_level() {
		return poor_level;
	}
	public void setPoor_level(int poor_level) {
		this.poor_level = poor_level;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
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
		return "PoorStu [stu_id=" + stu_id + ", s_name=" + s_name + ", s_sex=" + s_sex + ", s_major=" + s_major
				+ ", s_phone=" + s_phone + ", s_email=" + s_email + ", s_income=" + s_income + ", s_outcome="
				+ s_outcome + ", poor_level=" + poor_level + ", score=" + score + ", avatar_url=" + avatar_url
				+ ", s_info=" + s_info + ", s_other=" + s_other + "]";
	}
}
