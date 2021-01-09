package edu.sqa.finalproject.poorstudentmis.controller;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import edu.sqa.finalproject.poorstudentmis.entity.Notice;
import edu.sqa.finalproject.poorstudentmis.entity.PoorStu;
import edu.sqa.finalproject.poorstudentmis.entity.PoorVo;
import edu.sqa.finalproject.poorstudentmis.entity.Question;
import edu.sqa.finalproject.poorstudentmis.entity.Score;
import edu.sqa.finalproject.poorstudentmis.entity.Star;
import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.NoticeMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.PoorStudentMapper2;
import edu.sqa.finalproject.poorstudentmis.mapper.QuestionMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.ScoreMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.StarMapper;
import edu.sqa.finalproject.poorstudentmis.utils.OssManagerUtil;

@Controller
public class CenterController {
	
	@Autowired
	PoorStudentMapper2 poorStudentMapper;
	@Autowired
	StarMapper starMapper;
	@Autowired
	NoticeMapper noticeMapper;
	@Autowired
	ScoreMapper scoreMapper;
	@Autowired
	QuestionMapper questionMapper;
	//显示账户设置页面
	@RequestMapping("showSet")
	public String showCenter(HttpServletRequest request,ModelMap modelMap) {
		
		List<PoorStu> ps = poorStudentMapper.getStuList();
		System.out.println(ps.toString());
		System.out.println("========正在调用showSet========");
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		if(u == null) {
			return "login";
//			mav.setViewName("login");
//			return mav;
		}
		//获取学生信息
		System.out.println("u=="+u.getU_id());
		PoorStu p = poorStudentMapper.findById(u.getU_id());
		System.out.println(p.toString());
		
		String s_info = p.getS_info();
		if(s_info == "" || s_info == null) {
			s_info = "0,0,0,0,0,0,0,0,0,0,0,0";
		}
		String[] ls = s_info.split(",");
		modelMap.addAttribute("stu", p);
		modelMap.addAttribute("stu",p);
		modelMap.addAttribute("b1",ls[0]);
		modelMap.addAttribute("b2",ls[1]);
		modelMap.addAttribute("b3",ls[2]);
		modelMap.addAttribute("b4",ls[3]);
		modelMap.addAttribute("b5",ls[4]);
		modelMap.addAttribute("b6",ls[5]);
		modelMap.addAttribute("c1",ls[6]);
		modelMap.addAttribute("c2",ls[7]);
		modelMap.addAttribute("c3",ls[8]);
		modelMap.addAttribute("c4",ls[9]);
		modelMap.addAttribute("c5",ls[10]);
		modelMap.addAttribute("d1",ls[11]);
		return "user/setinfo";
//		return "test";
	}
	//显示收藏页面
	@RequestMapping("showStar")
	public String showStar(HttpServletRequest request,ModelMap modelMap) {
		
		System.out.println("正在调用showStar");
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		System.out.println("u=="+u);
		if(u == null) {
			//直接显示首页 HomeServlet
			return "login";
		}
		List<Star> stars = starMapper.getAllStarById(u.getU_id());//获取所有搜藏的页面
		System.out.println(stars.toString());
		modelMap.addAttribute("star", stars);
		return "user/star";
	}	
	//显示消息页面
	@RequestMapping("showMessage")
	public String showMessage(HttpServletRequest request,ModelMap modelMap) {
		System.out.println("正在调用所有公告");
		List<Notice> ns = noticeMapper.getAllNotice();
		System.out.println(ns.toString());
		System.out.println("正在调用showMessage");
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		System.out.println("u=="+u);
		if(u == null) {
			//直接显示首页 HomeServlet
			return "login";
		}
		System.out.println(u.getU_id());//获取用户id
		modelMap.addAttribute("notice", ns);
		
//		List<Question> qs = questionMapper.getAllQuestion();
		List<Question> qs = questionMapper.getAllQuestionById("172219605201");
		
		System.out.println("正在打印本人提出的所有问题"+qs.toString());
		modelMap.addAttribute("question",qs);
		return "user/notice";
	}
	//显示积分页面
	@RequestMapping("showScore")
	public String showScore(HttpServletRequest request,ModelMap modelMap) {
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		System.out.println("u=="+u);
		if(u == null) {
			//直接显示首页 HomeServlet
			return "login";
		}
		System.out.println("正在调用所有积分明细");
		List<Score> scores = scoreMapper.getAllScore(u.getU_id());
		System.out.println(scores.toString());
		System.out.println("正在调用showScore");
		List<PoorVo> ps = poorStudentMapper.getScoreTop(6);
		for(int i=0;i<ps.size();i++) {
			ps.get(i).setRank(i+1);
		}
		System.out.println("排行榜："+ps.toString());
		modelMap.addAttribute("score", scores);
		modelMap.addAttribute("rank", ps);
		return "user/score";
	}	
	@RequestMapping("showTest")
	public String showTest(HttpServletRequest request) {
		
		return "test";
	}
	//修改基础信息
	@RequestMapping("modify_stu_info1")
	public String modifyInfo1(String stu_id,String s_name,String s_sex,String s_major,String s_email,String s_phone ,ModelMap modelMap) {
		System.out.println("正在调用modify_stu_info1=====");
		System.out.println(stu_id+"\t"+s_name);
		System.out.println(s_sex+"\n"+s_major+"\n"+s_email+"\n"+s_phone);
		PoorStu p = new PoorStu(stu_id,s_name,s_sex,s_major,s_email,s_phone);
		System.out.println(p);
		poorStudentMapper.modify1(p);
		modelMap.addAttribute("stu", p);
		return "redirect:/showSet";//重定向
	}
	//修改贫困认定
	@RequestMapping("modify_stu_info2")
	public String modifyInfo2(HttpServletRequest request,Double a1,Double a2,Integer b1,Integer b2,Integer b3,
			Integer b4,Integer b5,Integer b6,Integer c1,Integer c2,Integer c3,
			Integer c4,Integer c5,Integer d1,String s_other,ModelMap modelMap) {
		//
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		System.out.println("u=="+u);
		if(u==null) {
			return "login";
		}
		Integer poor_level = 1;
		Integer sumb = b1+b2+b3+b4+b5+b6;
		Integer sumc = c1+c2+c3+c4+c5;
		Integer sum = sumb+sumc+d1;
		
		if(a1 <= 800 && a2 <=300) {
			poor_level = 3;
			if(sum == 0) {
				poor_level = 2;
			}
		}else if(a1 <=1000 && a2 <=400) {
			poor_level = 2;
			if(sum == 0) {
				poor_level = 1;
			}else if(sumb != 0) {
				poor_level = 3;
			}
		}else {
			poor_level = 1;
			if(sumb != 0 || d1 != 0) {//
				poor_level = 2;
			}
		}
		String s_info = b1+","+b2+","+b3+","+b4+","+b5+","+b6+","+c1+","+c2+","+c3+","+c4+","+c5+","+d1;
		System.out.println("+++++++++++++++++++++");
		System.out.println(s_info);
		System.out.println("贫困等级为: "+poor_level);
		poorStudentMapper.modify2(u.getU_id(), a1, a2, s_info, s_other, poor_level);
		System.out.println(a1+"\t"+a2);
		System.out.println(b1+b2+b3+b4+b5+b6);
		System.out.println(c1+c2+c3+c4+c5);
		System.out.println(d1);
		return "redirect:/showSet";//重定向
//		return "user/setinfo::pkrd";
	}
	//修改头像
	@RequestMapping("modifyAvatar")
	 public String modifyAvatar(HttpSession session, @RequestParam("avatar") MultipartFile avatar) {
        User user = (User) session.getAttribute("user");

		try {
	        System.out.println(avatar);
			String fileName = avatar.getOriginalFilename();
			System.out.println(fileName);
		    String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
		    fileName = UUID.randomUUID().toString().replace("-", "") + "." + suffix;
		    String avatar_url;
		    avatar_url = OssManagerUtil.uploadImage(fileName,avatar.getInputStream().available(),avatar.getInputStream());
			 System.out.println(avatar_url);
			 poorStudentMapper.modifyAvatar(user.getU_id(), avatar_url);//修改头像
		} catch (IOException e) {
			e.printStackTrace();
		}
        return "redirect:/showSet";
	}
	//取消收藏置顶
	@RequestMapping("handel_cancel_top")
	 public String CancelTop(Integer star_id) {
		System.out.println("收藏文章的id为"+star_id);
		return "redirect:/showStar";
	}
	
}
