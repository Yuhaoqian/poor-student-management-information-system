package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.mapper.FundMapper;

@Controller
public class ManageInterfaceController {
	@Autowired
	private FundMapper fundMapper;
	
	@RequestMapping("fund_manage")
	public ModelAndView showManageInterface() {
		List<Fund> funds = fundMapper.getFundList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/fund_manage");
		mav.addObject("funds", funds);
		return mav;
	}

	@RequestMapping("manage")
	public String showFundManage() {
		return "mis/manage_interface";
	}

	@RequestMapping("work_manage")
	public String showWorkManage() {
		return "mis/work_manage";
	}

	@RequestMapping("stu_manage")
	public String showStuManage() {
		return "mis/stu_manage";
	}
}
