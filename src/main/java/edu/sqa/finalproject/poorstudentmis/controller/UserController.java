package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.sqa.finalproject.poorstudentmis.entity.PoorStu;
import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.NoticeMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.PoorStudentMapper2;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.UserMapper;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private StudentMapper stuMapper;
	@Autowired
	private PoorStudentMapper2 poostudentmapper;
	@Autowired
	private NoticeMapper noticeMapper;
	@RequestMapping("login")
	public String showLogin(HttpServletRequest request) {
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		System.out.println("u=="+u);
		if(u != null) {
			PoorStu p = poostudentmapper.findById(u.getU_id());
			session.setAttribute("avatar_url",p.getAvatar_url());//获取头像
			System.out.println(p.getAvatar_url());
			//直接显示首页 HomeServlet
			return "redirect:/home";
		}
		return "login";
	}
	@ResponseBody
	@RequestMapping("handle_login")
	public Map<String, Object> handleLogin(HttpServletRequest request, String id, String password) {
		Map<String, Object> map = new HashMap<String, Object>();
		User u = userMapper.findByIdAndPwd(id, password);
		if (u == null) {
			map.put("message", "用户或密码错误！");
		} else {
			map.put("message", "登录成功！");
			//创建session对象  
			//如果第一次请求会自动创建session对象，并且会把sessionid返回给浏览器通过cookie形式保存
			//之后得请求就不会再创建了，直接根据sessionid找到对应得对象
			HttpSession session = request.getSession();
			System.out.println("sessionid="+session.getId());
			session.setAttribute("user", u);
			session.setAttribute("userName",u.getU_name());
			session.setAttribute("password",u.getU_password());	
			session.setAttribute("power",u.getU_power());
			System.out.println(u.toString());
			System.out.println("power:"+u.getU_power());
			Integer noticeNum = noticeMapper.getNum();
			session.setAttribute("noticeNum",noticeNum);//设置消息数
			PoorStu p = poostudentmapper.findById(u.getU_id());
			System.out.println("用户为"+u.toString());
			System.out.println(p.toString());
			session.setAttribute("avatar_url",p.getAvatar_url());//获取头像
			System.out.println("头像为"+p.getAvatar_url());
			System.out.println("登录成功，用户名为"+u.getU_name());
			map.put("name", u.getU_name());
			map.put("id", id);
			map.put("power", u.getU_power());
		}
		return map;
	}

	@ResponseBody
	@RequestMapping("handle_register")
	public Map<String, Object> handleRegister(HttpServletRequest request,User u) {
		HttpSession session = request.getSession();
		Map<String, Object> map = new HashMap<String, Object>();
		// 在注册之前 先查询用户名是否已经被注册过了
		// 如果用户名已经被注册 则返回相应消息给前端
		// 没有被使用 则返回注册成功消息给前端
		User uu = userMapper.findById(u.getU_id());
		if (uu != null)
			map.put("message", "该账号已被注册！");
		else {
			userMapper.insert(u);
			
//			stuMapper.insert(new Student(u.getU_id(), u.getU_name()));
			PoorStu p = new PoorStu(u.getU_id(),u.getU_name());
			poostudentmapper.insert(p);
			session.setAttribute("avatar_url",p.getAvatar_url());	
			map.put("message", "注册成功！请登录");
		}
		return map;
	}
}
