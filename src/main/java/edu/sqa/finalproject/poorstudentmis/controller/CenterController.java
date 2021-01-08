package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sqa.finalproject.poorstudentmis.entity.PoorStu;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.PoorStudentMapper2;

@Controller
public class CenterController {
	
	@Autowired
	PoorStudentMapper2 poorStudentMapper;
	//显示账户设置页面
	@RequestMapping("showSet")
	public String showCenter(HttpServletRequest request) {
		
		List<PoorStu> ps = poorStudentMapper.getStuList();
		System.out.println(ps.toString());
		System.out.println("========正在调用showSet========");
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		if(u == null) {
			//直接显示首页 HomeServlet
			return "login";
		}
		//获取学生信息
		System.out.println("u=="+u.getU_id());
		PoorStu p = poorStudentMapper.findById(u.getU_id());
		System.out.println(p.toString());
		
		return "user/setinfo";
//		return "test";
	}
	//显示收藏页面
	@RequestMapping("showStar")
	public String showStar(HttpServletRequest request) {
		System.out.println("正在调用showStar");
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		System.out.println("u=="+u);
		if(u == null) {
			//直接显示首页 HomeServlet
			return "login";
		}
		return "user/star";
	}	
	//显示消息页面
	@RequestMapping("showMessage")
	public String showMessage(HttpServletRequest request) {
		System.out.println("正在调用showMessage");
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		System.out.println("u=="+u);
		if(u == null) {
			//直接显示首页 HomeServlet
			return "login";
		}
		return "user/notice";
	}
	//显示积分页面
	@RequestMapping("showScore")
	public String showScore(HttpServletRequest request) {
		System.out.println("正在调用showCenter");
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		System.out.println("u=="+u);
		if(u == null) {
			//直接显示首页 HomeServlet
			return "login";
		}
		return "user/score";
	}	
	@RequestMapping("showTest")
	public String showTest(HttpServletRequest request) {
		
		return "test";
	}
}
