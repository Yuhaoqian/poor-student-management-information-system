package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.UserMapper;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private StudentMapper stuMapper;

	@RequestMapping("login")
	public String showLogin() {
		return "login";
	}
	@ResponseBody
	@RequestMapping("handle_login")
	public Map<String, Object> handleLogin(String id, String password) {
		Map<String, Object> map = new HashMap<String, Object>();
		User u = userMapper.findByIdAndPwd(id, password);
		if (u == null) {
			map.put("message", "用户或密码错误！");
		} else {
			map.put("message", "登录成功！");
			map.put("name", u.getU_name());
			map.put("id", id);
			map.put("power", u.getU_power());
		}
		return map;
	}

	@ResponseBody
	@RequestMapping("handle_register")
	public Map<String, Object> handleRegister(User u) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 在注册之前 先查询用户名是否已经被注册过了
		// 如果用户名已经被注册 则返回相应消息给前端
		// 没有被使用 则返回注册成功消息给前端
		User uu = userMapper.findById(u.getU_id());
		if (uu != null)
			map.put("message", "该账号已被注册！");
		else {
			userMapper.insert(u);
			stuMapper.insert(new Student(u.getU_id(), u.getU_name()));
			map.put("message", "注册成功！");
		}
		return map;
	}
	
}
