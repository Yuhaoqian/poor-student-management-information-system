package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Notice;
import edu.sqa.finalproject.poorstudentmis.entity.Score;
import edu.sqa.finalproject.poorstudentmis.entity.Star;


public interface ScoreMapper {
	List<Score> getAllScore(String s_id);//获取某个学生所有的积分明细
	//Score findById(String s_id);//查询
	public void delById(Integer id);//根据id删除
	public void delAll();//删除所有
	public void modifyIsRead(Integer id);//标为已读
	public void modifyAllIsRead();//清空未读信息
	public void save(Score s);
	void save(Star vol);


}
