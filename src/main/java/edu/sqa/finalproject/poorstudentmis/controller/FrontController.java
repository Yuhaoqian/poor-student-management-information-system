package edu.sqa.finalproject.poorstudentmis.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.entity.FundVO;
import edu.sqa.finalproject.poorstudentmis.entity.Question;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.Vol;
import edu.sqa.finalproject.poorstudentmis.entity.VolA;
import edu.sqa.finalproject.poorstudentmis.entity.VolVO;
import edu.sqa.finalproject.poorstudentmis.entity.Work;
import edu.sqa.finalproject.poorstudentmis.entity.WorkVO;
import edu.sqa.finalproject.poorstudentmis.mapper.FundApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.FundMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.QuestionMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.VolApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.VolMapper;
//import edu.sqa.finalproject.poorstudentmis.mapper.VolMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkMapper;

@Controller
public class FrontController {
	@Autowired
	private FundMapper fundMapper;
	@Autowired
	private WorkMapper workMapper;
	@Autowired
	private WorkApplyMapper workApplyMapper;
	@Autowired
	private FundApplyMapper fundApplyMapper;
	@Autowired
	private VolApplyMapper volApplyMapper;
	

	@RequestMapping(value = { "/", "home" })
	public String showHome(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		if (u != null) { // 用户已经登录
			modelMap.addAttribute("Login", "display:inline-block");
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:inline-block;");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
		} else { // 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("Login", "display:none");
			modelMap.addAttribute("notLogin", "display:inline-block;");
			modelMap.addAttribute("pos", "display:none;");
		}
		return "index";
	}

	@RequestMapping("fund")
	public String showFund(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		if (u != null) { // 用户已经登录
			modelMap.addAttribute("Login", "display:inline-block");
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:inline-block;");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
		} else { // 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("Login", "display:none");
			modelMap.addAttribute("notLogin", "display:inline-block;");
			modelMap.addAttribute("pos", "display:none;");
		}
		
		List<Fund> funds = fundMapper.getFundList();
		int len = funds.size();
		List<Fund> latest = null;
		List<Fund> past = null;

		if (len >= 2) {
			latest = funds.subList(0, 2);
			past = funds.subList(2, len);
		} else
			latest = funds;
		modelMap.addAttribute("latest", latest);
		modelMap.addAttribute("past", past);
		return "fund";
	}

	@RequestMapping("work")
	public String showWork(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);

		List<Work> works = workMapper.getWorkList();
		int len = works.size();
		List<Work> latest = null;
		List<Work> more = null;

		if (len >= 3) {
			latest = works.subList(0, 3);
			if (len >= 6)
				more = works.subList(3, 6);
			else
				more = works.subList(3, len);
		} else {
			latest = works;
		}
		modelMap.addAttribute("latest", latest);
		modelMap.addAttribute("more", more);
		if (u != null) { // 用户已经登录
			modelMap.addAttribute("Login", "display:inline-block");
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:inline-block;");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
		} else { // 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("Login", "display:none");
			modelMap.addAttribute("notLogin", "display:inline-block;");
			modelMap.addAttribute("pos", "display:none;");
		}
		return "work";
	}

	@RequestMapping("policy")
	public String showPolicy(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		if (u != null) { // 用户已经登录
			modelMap.addAttribute("Login", "display:inline-block");
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:inline-block;");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
		} else { // 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("Login", "display:none");
			modelMap.addAttribute("notLogin", "display:inline-block;");
			modelMap.addAttribute("pos", "display:none;");
		}
		return "policy";
	}

	@RequestMapping("application")
	public String showApplication(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		List<WorkVO> workVOs = null;
		List<FundVO> fundVOs = null;
		List<VolVO> volVOs = null;
		if (u != null) { // 如果u不为空
			modelMap.addAttribute("Login", "display:inline-block");
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:inline-block;");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
			workVOs = workApplyMapper.getAllApplyWorkById(u.getU_id());
			fundVOs = fundApplyMapper.getAllApplyFundById(u.getU_id());
			volVOs = volApplyMapper.getAllVolById(u.getU_id());
			System.out.println(volVOs.toString());
			System.out.println("我在这里1!!");
			modelMap.addAttribute("workVOs", workVOs);
			modelMap.addAttribute("fundVOs", fundVOs);
			modelMap.addAttribute("volVOs", volVOs);
		} else {
			// 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("Login", "display:none");
			modelMap.addAttribute("notLogin", "display:inline-block;");
			modelMap.addAttribute("pos", "display:none;");
		}
		return "application";
	}
	//显示优秀榜样
	@RequestMapping("list")
	public String showList(HttpServletRequest request,ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		if (u != null) { // 用户已经登录
			modelMap.addAttribute("Login", "display:inline-block");
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:inline-block;");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
		} else { // 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("Login", "display:none");
			modelMap.addAttribute("notLogin", "display:inline-block;");
			modelMap.addAttribute("pos", "display:none;");
		}
		return "list";
	}
	//认证通知页面
	@RequestMapping("authen")
	public String showAuth(HttpServletRequest request,ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		if (u != null) { // 用户已经登录
			modelMap.addAttribute("Login", "display:inline-block");
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:inline-block;");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
		} else { // 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("Login", "display:none");
			modelMap.addAttribute("notLogin", "display:inline-block;");
			modelMap.addAttribute("pos", "display:none;");
		}
		return "authen";
	}
}
