package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Student;

public interface StudentMapper {
	Student findById(String id);
	List<Student> getStuList();
	Integer insert(Student stu);
	void modify(Student stu);
	public void delAll();
	public void reset();
	public void delById(String s_id);
}
