package edu.sqa.finalproject.poorstudentmis.mapper;

import edu.sqa.finalproject.poorstudentmis.entity.User;

public interface UserMapper {
	Integer insert(User user);
	User findById(String id);
	User findByIdAndPwd(String id, String password);
}
