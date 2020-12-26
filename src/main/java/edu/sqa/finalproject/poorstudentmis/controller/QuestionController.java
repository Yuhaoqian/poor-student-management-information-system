package edu.sqa.finalproject.poorstudentmis.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.sqa.finalproject.poorstudentmis.entity.Question;
import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.QuestionMapper;

@Controller
public class QuestionController {
	@Autowired
	QuestionMapper questionMapper;
	
	@RequestMapping("question")
	public String showVol(HttpServletRequest request,ModelMap modelMap) {
		// 显示留言列表
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
		System.out.println("我在这里==============question");
		List<Question> lists = questionMapper.getAllQuestion();
		System.out.println(lists);
		modelMap.addAttribute("qList", lists);
		return "question";
	}
	@RequestMapping("ask")
	public String showAsk(HttpServletRequest request,ModelMap modelMap) {
		// 发表留言 表单页面
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
		return "ask";
	}
	@RequestMapping("handle_ask")
	public String HandleAsk(HttpServletRequest request, String title, String content) {
		// 提交留言
		System.out.println("处理啊");
		//获取当前
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		if(u == null) {
			// 未登录，显示登录页面
			return "login";
		}
		System.out.println("u=="+u);
		String sid = u.getU_id();
		System.out.println(sid);
		Date d = new Date();
		Timestamp timeStamp = new Timestamp(d.getTime());
		Question q = new Question(sid,title,content,timeStamp);
		System.out.println("哈哈哈哈哈哈");
		System.out.println(q.toString());
		Integer ans = questionMapper.insertQ(q);
		if(ans > 0) {
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败");
		}
		return "ask";
		//处理问题提交
	}
	
	// -------------------------------Answer section----------------------------------
	@RequestMapping("ans")
	public String showAns(HttpServletRequest request,ModelMap modelMap) {
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
		return "ans";
	}
	@RequestMapping("handle_ans.do")
	public String HandleAns(HttpServletRequest request, int q_id, ModelMap modelMap) {
		// 查看问题答案
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
		Question q = questionMapper.getQuestionById(q_id);
		modelMap.addAttribute("q", q);
		return "ans";
	}
	@ResponseBody
	@RequestMapping("show_reply")
	public Map<String, Object> showQuestion(Integer q_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		Question question = questionMapper.getQuestionById(q_id);
		map.put("r_content", question.getR_content());
		return map;
	}
	@ResponseBody
	@RequestMapping("modify_reply")
	public Map<String, Object> handleModifyReply(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		
		Map<String, Object> map = new HashMap<String, Object>();
		Integer q_id = Integer.parseInt(request.getParameter("q_id"));
		String r_content = request.getParameter("r_content");
		System.out.println(r_content);
		questionMapper.modifyReply(q_id, r_content, u.getU_name());
		map.put("message", "修改成功！");
		return map;
	}
}
