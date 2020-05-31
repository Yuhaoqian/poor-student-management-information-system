package edu.sqa.finalproject.poorstudentmis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;

@Controller
public class InfoController {
	@Autowired
	private StudentMapper stuMapper;

	@RequestMapping("info")
	public ModelAndView showInfo() {
		Student stu = stuMapper.findById("172219605220");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("info");
		mav.addObject("stu", stu);
		return mav;
	}

	@RequestMapping("modify_info")
	public String modifyInfo(Student newStu) {
		System.out.println(newStu.toString());
		// 1. 查看stu表中是否有该学生
		Student stu = stuMapper.findById(newStu.getS_id());
		// 2. 如果没有，插入该学生
		if (stu == null)
			stuMapper.insert(newStu);
		else {
			// 3. 如果有，把学生的所有信息改为当前Student对象中的数据
			stuMapper.modify(newStu);
		}
		return "info";
	}

}
