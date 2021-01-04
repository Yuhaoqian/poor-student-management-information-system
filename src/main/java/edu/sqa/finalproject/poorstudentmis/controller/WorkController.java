package edu.sqa.finalproject.poorstudentmis.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.Work;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkMapper;
import edu.sqa.finalproject.poorstudentmis.utils.OssManagerUtil;

@Controller
public class WorkController {
	@Autowired
	private WorkMapper workMapper;
	
	@RequestMapping("more_work")
	public String showMoreWork(HttpServletRequest request, ModelMap modelMap) {
		List<Work> works = workMapper.getWorkList();
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		modelMap.addAttribute("works", works);
//		if (u != null) { // 如果u不为空
//			modelMap.addAttribute("Login", "display:none");
//			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
//				modelMap.addAttribute("pos", "display:none;");
//		} else { // 如果u为空， 不显示后台，及个人信息按钮
//			modelMap.addAttribute("notLogin", "display:none;");
//			modelMap.addAttribute("pos", "display:none;");
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
		return "more_work";
	}
	@RequestMapping("work_info")
	public String showWorkInfo(int w_id, HttpServletRequest request, ModelMap modelMap) {
		Work work = workMapper.findById(w_id);
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		modelMap.addAttribute("work", work);
//		if (u != null) { // 如果u不为空
//			modelMap.addAttribute("Login", "display:none");
//			if (u.getU_power() == 1) // 如果权限为1（普通用户），不显示后台
//				modelMap.addAttribute("pos", "display:none;");
//		} else { // 如果u为空， 不显示后台，及个人信息按钮
//			modelMap.addAttribute("notLogin", "display:none;");
//			modelMap.addAttribute("pos", "display:none;");
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
		return "work_info";
	}
//	@RequestMapping("work_back")
//	public ModelAndView showWork() {
////		Work w = workMapper.findById(1);
////		System.out.println(w);
//		List<Work> works = workMapper.getWorkList();
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("work");
//		mav.addObject("works", works);
//		return mav;
//	}
	@RequestMapping("add_work")
	public String addWork() {
		return "add_work";
	}
	@RequestMapping("handle_add_work")
	public String handleAdd(String w_name, String w_abs, String w_position, String w_money, MultipartFile w_img) {
		try {
			System.out.println(w_img);
			String fileName = w_img.getOriginalFilename();
			System.out.println(fileName);
		    String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
		    fileName = UUID.randomUUID().toString().replace("-", "") + "." + suffix;
		    String url = OssManagerUtil.uploadImage(fileName,w_img.getInputStream().available(),w_img.getInputStream());
		    //获取url
		    System.out.println(url);
		    
			// Fund f 接受表单中传来的参数，new一个Fund对象
			// f_id，不需要设置，这是自增字段
			Work work = new Work(null, w_name, w_abs, null, w_position, Double.parseDouble(w_money), url);
			work.setW_time(System.currentTimeMillis());
			// 暂时不需要别的检验机制，直接添加进数据库
			workMapper.save(work);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/work_manage";

	}
	@RequestMapping("del_all_work")
	public String delAll() {
		workMapper.delAll();
		workMapper.reset();
		return "redirect:/work_manage";
	}
	@RequestMapping("del_work")
	public String del(Integer w_id) {
		workMapper.delById(w_id);
		return "redirect:/work_manage";
	}
}
