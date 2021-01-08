package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Notice;
import edu.sqa.finalproject.poorstudentmis.entity.Score;
import edu.sqa.finalproject.poorstudentmis.entity.Star;


public interface ScoreMapper {
	List<Score> getAllScore(String s_id);//获取某个学生所有的积分明细
	Star findById(Integer vid);
	public void delById(Integer id);
	public void delAll();
	public void reset();
	void save(Star vol);


}
