package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;

@Controller
public class TestController {
	@Autowired
	private StudentMapper stuMapper;
	@ResponseBody
	@RequestMapping("test")
	public Map<String, Object> handleAddStu(Student newStu) {
		Map<String, Object> map = new HashMap<String, Object>();
		Student s = stuMapper.findById(newStu.getS_id());
		if (s == null) {
			map.put("message", "该学号已存在！");
		} else {
			System.out.println(newStu);
//			stuMapper.insert(newStu);
			map.put("message", "添加成功！");
		}
		return map;
	}
	
	@RequestMapping("test2")
	public String test() {
		return "mis/motherpage";
	}
}
