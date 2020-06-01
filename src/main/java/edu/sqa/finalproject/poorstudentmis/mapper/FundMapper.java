package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;

public interface FundMapper {
	public void save(Fund f);
	public Fund findById(Integer id);
	public List<Fund> getFundList();
	public void delAll();
	public void reset();
	public void delById(Integer id);
}
