package edu.sqa.finalproject.poorstudentmis.entity;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFile {
	private Integer id;
	private String title;
	private String url;
	private Date rtime;//发布时间
	
	public MyFile() {
		super();
	}
	
	public MyFile(String title, String url, Date rtime) {
		super();
		this.title = title;
		this.url = url;
		this.rtime = rtime;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRtime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(rtime);
		return dateStr;
	}
	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}
	@Override
	public String toString() {
		return "File [id=" + id + ", title=" + title + ", url=" + url + ", rtime=" + rtime + "]";
	}
	
	
}

