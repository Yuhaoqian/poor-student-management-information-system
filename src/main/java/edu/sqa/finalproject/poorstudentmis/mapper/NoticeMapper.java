package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Notice;
import edu.sqa.finalproject.poorstudentmis.entity.Star;


public interface NoticeMapper {
	List<Notice> getAllNotice();//获取所有
	Star findById(Integer vid);
	public void delById(Integer n_id);
	public void delAll();
	public void modifyIsRead(Integer n_id);//标为已读
	public void modifyAllIsRead();//清空未读信息
	public Integer getNum();//获取未读的公告数木
	public void reset();
	void save(Star vol);


}
