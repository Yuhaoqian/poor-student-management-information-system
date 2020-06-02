package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Work;

public interface WorkMapper {
	public void save(Work work);
	public Work findById(Integer id);
	public List<Work> getWorkList();
	public void delAll();
	public void reset();
	public void delById(Integer id);
}
