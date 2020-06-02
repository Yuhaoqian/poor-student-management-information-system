package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.entity.Work;
import edu.sqa.finalproject.poorstudentmis.mapper.FundMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkMapper;

@Controller
public class ManageInterfaceController {
	@Autowired
	private FundMapper fundMapper;
	@Autowired
	private WorkMapper workMapper;
	@RequestMapping("fund_manage")
	public ModelAndView showFundManage() {
		List<Fund> funds = fundMapper.getFundList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/fund_manage");
		mav.addObject("funds", funds);
		return mav;
	}

	@RequestMapping("manage")
	public String showManageInterface() {
		return "mis/manage_interface";
	}

	@RequestMapping("work_manage")
	public ModelAndView showWorkManage() {
		List<Work> works = workMapper.getWorkList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/work_manage");
		mav.addObject("works", works);
		return mav;	}

	@RequestMapping("stu_manage")
	public String showStuManage() {
		return "mis/stu_manage";
	}
}
