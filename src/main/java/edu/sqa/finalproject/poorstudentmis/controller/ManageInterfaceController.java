package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.Work;
import edu.sqa.finalproject.poorstudentmis.mapper.FundMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkMapper;

@Controller
public class ManageInterfaceController {
	@Autowired
	private FundMapper fundMapper;
	@Autowired
	private WorkMapper workMapper;
	@Autowired
	private StudentMapper stuMapper;
	@RequestMapping("fund_manage")
	public ModelAndView showFundManage(HttpServletRequest request) {
		// 因为有了过滤器，所以进到后台的一定是已经登陆的用户，不需要再判断session中有没有user了。
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Fund> funds = fundMapper.getFundList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/fund_manage");
		mav.addObject("funds", funds);
		mav.addObject("u_name", u.getU_name());
		return mav;
	}

	@RequestMapping("work_manage")
	public ModelAndView showWorkManage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Work> works = workMapper.getWorkList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/work_manage");
		mav.addObject("works", works);
		mav.addObject("u_name", u.getU_name());

		return mav;	}

	@RequestMapping("stu_manage")
	public ModelAndView showStuManage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Student> stus = stuMapper.getStuList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/stu_manage");
		mav.addObject("stus", stus);
		mav.addObject("u_name", u.getU_name());

		return mav;
	}
	
	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		//删除session里面得user对象
		session.removeAttribute("user");//根据key删除对应的数据
		return "redirect:/login";
	}
}
