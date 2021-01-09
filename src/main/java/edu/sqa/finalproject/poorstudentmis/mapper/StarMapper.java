package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Star;


public interface StarMapper {
	List<Star> getAllStar();//获取搜藏的文章
	List<Star> getAllStarById(String s_id);//获取搜藏的文章
	Star findById(Integer vid);
	public void delById(Integer id);
	public void delAll();
	public void reset();
	
	
	void save(Star star);
	Star findBySidAndAid(String s_id, Integer a_id);


}
