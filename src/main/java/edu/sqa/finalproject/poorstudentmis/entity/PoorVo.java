package edu.sqa.finalproject.poorstudentmis.entity;

public class PoorVo {
	Integer rank;//排行
	String stu_id;//学生id
	String s_name;//学生姓名
	Integer score;//积分
	String avatar_url;
	
	
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	public PoorVo() {
		super();
	}
	public PoorVo(Integer rank, String s_id, String s_name, Integer score) {
		super();
		this.rank = rank;
		this.stu_id = s_id;
		this.s_name = s_name;
		this.score = score;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getS_id() {
		return stu_id;
	}
	public void setS_id(String s_id) {
		this.stu_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "PoorVo [rank=" + rank + ", stu_id=" + stu_id + ", s_name=" + s_name + ", score=" + score
				+ ", avatar_url=" + avatar_url + "]";
	}
	
	

}
