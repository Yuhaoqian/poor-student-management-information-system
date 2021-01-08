package edu.sqa.finalproject.poorstudentmis.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Star {
	private String star_id;
	private String s_id;
	private String ptr_id;//指向的文章
	private Date star_time;//收藏的时间
	private String is_top;//是否置顶
	public Star() {
		super();
	}
	public Star(String star_id, String s_id, String ptr_id, Date star_time, String is_top) {
		super();
		this.star_id = star_id;
		this.s_id = s_id;
		this.ptr_id = ptr_id;
		this.star_time = star_time;
		this.is_top = is_top;
	}
	public String getStar_id() {
		return star_id;
	}
	public void setStar_id(String star_id) {
		this.star_id = star_id;
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getPtr_id() {
		return ptr_id;
	}
	public void setPtr_id(String ptr_id) {
		this.ptr_id = ptr_id;
	}
	public String getStar_time() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(star_time);
		return dateStr;
	}
	public void setStar_time(Date star_time) {
		this.star_time = star_time;
	}
	public String getIs_top() {
		return is_top;
	}
	public void setIs_top(String is_top) {
		this.is_top = is_top;
	}
	@Override
	public String toString() {
		return "Star [star_id=" + star_id + ", s_id=" + s_id + ", ptr_id=" + ptr_id + ", star_time=" + star_time
				+ ", is_top=" + is_top + "]";
	}
	
}
