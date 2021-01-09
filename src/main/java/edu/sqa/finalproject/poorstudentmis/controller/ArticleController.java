package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sqa.finalproject.poorstudentmis.entity.Article;
import edu.sqa.finalproject.poorstudentmis.entity.Question;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.ArticleMapper;

@Controller
public class ArticleController {
	@Autowired
	ArticleMapper articleMapper;
	@RequestMapping("handle_add_article")
	public String HandleAsk(HttpServletRequest request, String title, String category, String top, String content) {
		//获取当前
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		if(u == null) {
			// 未登录，显示登录页面
			return "login";
		}
	
		Integer istop = top != null ? 1 : 0;
		Article article = new Article(title, content, istop, Integer.parseInt(category), u.getU_id());
		Integer ans = articleMapper.save(article);
		if(ans > 0) {
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败");
		}
		return "redirect:/article_manage";
		//处理问题提交
	}
	
	@RequestMapping("handle_article_del")
	public String del(Integer id) {
		articleMapper.delById(id);
		return "redirect:/article_manage";
	}
}
