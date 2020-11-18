package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.entity.FundVO;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.Work;
import edu.sqa.finalproject.poorstudentmis.entity.WorkVO;
import edu.sqa.finalproject.poorstudentmis.mapper.FundApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.FundMapper;
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

	@RequestMapping(value = { "/", "home" })
	public String showHome(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);

//		if (isAdmin == null || !isAdmin.equals("0"))
//			modelMap.addAttribute("pos", "display:none;");
//		if (isLogin == null)
//			modelMap.addAttribute("notLogin", "display:none;");
//		else {
//			modelMap.addAttribute("Login", "display:none");
//			modelMap.addAttribute("s_id", isLogin);
//		}

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
		if (u != null) { // 如果u不为空
			modelMap.addAttribute("Login", "display:none");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
		} else { // 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:none;");
		}
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

		if (u != null) { // 如果u不为空
			modelMap.addAttribute("Login", "display:none");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
		} else { // 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:none;");
		}
		return "work";
	}

	@RequestMapping("policy")
	public String showPolicy(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		if (u != null) { // 如果u不为空
			modelMap.addAttribute("Login", "display:none");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
		} else { // 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("notLogin", "display:none;");
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
		if (u != null) { // 如果u不为空
			modelMap.addAttribute("Login", "display:none");
			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
				modelMap.addAttribute("pos", "display:none;");
			workVOs = workApplyMapper.getAllApplyWorkById(u.getU_id());
			fundVOs = fundApplyMapper.getAllApplyFundById(u.getU_id());
			modelMap.addAttribute("workVOs", workVOs);
			modelMap.addAttribute("fundVOs", fundVOs);
		} else {
			// 如果u为空， 不显示后台，及个人信息按钮
			modelMap.addAttribute("notLogin", "display:none;");
			modelMap.addAttribute("pos", "display:none;");
		}
//		if (workVOs.size() == 0 && fundVOs.size() == 0)
//			return "redirect:/home";
		return "application";
	}
}
