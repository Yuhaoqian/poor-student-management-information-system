package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Notice;
import edu.sqa.finalproject.poorstudentmis.entity.Star;


public interface NoticeMapper {
	List<Notice> getAllNotice();//获取搜藏的文章
	Star findById(Integer vid);
	public void delById(Integer id);
	public void delAll();
	public void reset();
	void save(Star vol);


}
