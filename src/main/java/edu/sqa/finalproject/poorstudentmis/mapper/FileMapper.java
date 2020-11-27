package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.MyFile;

public interface FileMapper {
	public void save(MyFile file);//保存文件
	public List<MyFile> getAllFile();//获取所有的文件
}
