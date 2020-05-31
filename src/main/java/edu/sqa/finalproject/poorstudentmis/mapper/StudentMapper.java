package edu.sqa.finalproject.poorstudentmis.mapper;

import edu.sqa.finalproject.poorstudentmis.entity.Student;

public interface StudentMapper {
	Student findById(String id);
	Integer insert(Student stu);
	void modify(Student stu);
}
