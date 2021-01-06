package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Vol;

public interface VolMapper {
	List<Vol> getAllVol();//获取所有问题
	Vol findById(Integer vid);
	public void delById(Integer id);
	public void delAll();
	public void reset();
	void save(Vol vol);


}
