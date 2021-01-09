package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Star;


public interface StarMapper {
	List<Star> getAllStar();//获取搜藏的文章
	List<Star> getAllStarById(String s_id);//获取搜藏的文章
	Star findById(Integer vid);
	public void modifyTop(Integer star_id);//置顶变为不置顶。不置顶变为置顶
	public void delById(Integer star_id);//删除文章
	public void delAll();//删除所有收藏文章
	public void reset();
	void save(Star vol);


}
