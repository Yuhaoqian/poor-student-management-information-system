package edu.sqa.finalproject.poorstudentmis;

import java.sql.Connection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {
	@Autowired
	UserMapper userMapper;

	@Test
	public void insert() {
		System.out.println(123);
		User u = userMapper.findByIdAndPwd("172219605220", "123");
		System.out.println(u);
	}
}
