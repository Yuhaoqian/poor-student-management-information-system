package edu.sqa.finalproject.poorstudentmis;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {
	@Autowired
	StudentMapper stuMapper;
	
	@Test
	public void insert() {
		System.out.println(123);
		Student stu = stuMapper.findById("172219605220");
		System.out.println(stu);
//		Student stu = new Student(s_id, s_name, s_nation, s_sex, s_birth, s_major, s_phone, s_address, s_income, s_res, s_info, s_other)
//		int row = stuMapper.insert("172219605220", "123");
//		System.out.println(stu);
	}
}
