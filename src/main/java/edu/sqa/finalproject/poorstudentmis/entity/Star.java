package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Star {
	private Integer star_id;
	private String s_id;
	private Integer a_id;//指向的文章
	private String a_title;//文章标题
	private Date star_time;//收藏的时间
	private Integer is_top;//是否置顶
	
	
	public Star() {
		super();
	}
	public Star(Integer star_id, String s_id, Integer a_id, String a_title, Date star_time, Integer is_top) {
		super();
		this.star_id = star_id;
		this.s_id = s_id;
		this.a_id = a_id;
		this.a_title = a_title;
		this.star_time = star_time;
		this.is_top = is_top;
	}
	
	public Star(String s_id, Integer a_id, String a_title) {
		super();
		this.s_id = s_id;
		this.a_id = a_id;
		this.a_title = a_title;
		this.star_time = new Date();
		this.is_top = 0;
	}
	@Override
	public String toString() {
		return "Star [star_id=" + star_id + ", s_id=" + s_id + ", a_id=" + a_id + ", a_title=" + a_title
				+ ", star_time=" + star_time + ", is_top=" + is_top + "]";
	}
	public Integer getA_id() {
		return a_id;
	}
	public void setA_id(Integer a_id) {
		this.a_id = a_id;
	}
	public String getA_title() {
		return a_title;
	}
	public void setA_title(String a_title) {
		this.a_title = a_title;
	}
	public Integer getStar_id() {
		return star_id;
	}
	public void setStar_id(Integer star_id) {
		this.star_id = star_id;
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getStar_time() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(star_time);
		return dateStr;
	}
	public void setStar_time(Date star_time) {
		this.star_time = star_time;
	}
	public Integer getIs_top() {
		return is_top;
	}
	public void setIs_top(Integer is_top) {
		this.is_top = is_top;
	}
}
