package edu.sqa.finalproject.poorstudentmis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	@RequestMapping(value={"/","home"})
	public String showHome(String isLogin, String isAdmin, ModelMap modelMap) {
		if (isAdmin == null || !isAdmin.equals("0"))
			modelMap.addAttribute("pos", "display:none;");
		if (isLogin == null)
			modelMap.addAttribute("notLogin", "display:none;");
		else {
			modelMap.addAttribute("Login", "display:none");
			modelMap.addAttribute("s_id", isLogin);
		}
		
		System.out.println(isLogin);
		System.out.println(isAdmin);
		return "index";
	}

	@RequestMapping("show_fund") 
	public String showFund() {
		return "fund";
	}
}
