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
	void changeISps(String s_id);//更新s_id学生的贫困生状态
}
