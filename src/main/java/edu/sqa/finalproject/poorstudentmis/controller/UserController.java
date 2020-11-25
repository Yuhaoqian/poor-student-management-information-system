package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.UserMapper;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private StudentMapper stuMapper;

	@RequestMapping("login")
	public String showLogin(HttpServletRequest request) {
		//判断session中是否有user对象 有则说明登录成功过 直接显示首页
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		System.out.println("u=="+u);
		if(u != null) {
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
			System.out.println("登录成功，用户名为"+u.getU_name());
			map.put("name", u.getU_name());
			map.put("id", id);
			map.put("power", u.getU_power());
		}
		return map;
	}

	@ResponseBody
	@RequestMapping("handle_register")
	public Map<String, Object> handleRegister(User u) {
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
			map.put("message", "注册成功！请登录");
		}
		return map;
	}
	
//	@ResponseBody
//	@RequestMapping("logout")
//	public String handleLogout(HttpSession session) {
//		System.out.println("用户登出");
//        //session失效
//        session.invalidate();
//        return "login";
//	}
}
