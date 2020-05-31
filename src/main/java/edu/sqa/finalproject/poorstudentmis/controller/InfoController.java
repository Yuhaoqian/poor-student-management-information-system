package edu.sqa.finalproject.poorstudentmis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sqa.finalproject.poorstudentmis.entity.Student;

@Controller
public class InfoController {
	@RequestMapping("info")
	public String showInfo() {
		return "info";
	}
	
	@RequestMapping("modify_info")
	public String modifyInfo(Student student) {
		System.out.println(student.toString());
		return "info";
	}

}
