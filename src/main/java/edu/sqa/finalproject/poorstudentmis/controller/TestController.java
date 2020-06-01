package edu.sqa.finalproject.poorstudentmis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("test")
	public String show(String a) {
		System.out.println(a);
		return "test";
	}
}
