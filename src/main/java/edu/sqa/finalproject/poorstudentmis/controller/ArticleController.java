package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.ArrayList;
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

import edu.sqa.finalproject.poorstudentmis.entity.Article;
import edu.sqa.finalproject.poorstudentmis.entity.Category;
import edu.sqa.finalproject.poorstudentmis.entity.Comment;
import edu.sqa.finalproject.poorstudentmis.entity.Star;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.ArticleMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.StarMapper;

@Controller
public class ArticleController {
	@Autowired
	ArticleMapper articleMapper;
	@Autowired
	StarMapper starMapper;
	@RequestMapping("show_article")
	public String showArticle(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		modelMap.addAttribute("u", u);

		List<Article> articles = articleMapper.getAllArticle();
		// 置顶文章，最多五篇
		List<Article> top_articles = new ArrayList<>();
		// 剩余文章
		List<Article> as = new ArrayList<>();

		for (int i = 0; i < articles.size(); ++i) {
			Article a = articles.get(i);
			if (top_articles.size() < 5 && a.getTop() == 1) {
				top_articles.add(a);
			} else {
				as.add(a);
			}
		}
		System.out.println(as.size());
		modelMap.addAttribute("as", as);
		modelMap.addAttribute("top", top_articles);
		// 分类
		List<Category> categories = articleMapper.getAllCategory();
		modelMap.addAttribute("categories", categories);
		
		// 最热
		List<Article> hot = articleMapper.getHotestArticle();
		modelMap.addAttribute("hot", hot);

		// 最新
		List<Article> latest = articleMapper.getLatestArticle();
		modelMap.addAttribute("latest", latest);


		return "article/article";
	}
	@RequestMapping("category")
	public String showArticleByCategory(HttpServletRequest request, Integer id, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		
		System.out.println(id);
		Category category = articleMapper.getCategoryById(id);
		modelMap.addAttribute("category", category.getName());
		
		List<Article> as = articleMapper.getArticleByCategoryId(id);
		modelMap.addAttribute("as", as);
		
		// 分类
		List<Category> categories = articleMapper.getAllCategory();
		modelMap.addAttribute("categories", categories);
		
		// 最热
		List<Article> hot = articleMapper.getHotestArticle();
		modelMap.addAttribute("hot", hot);

		// 最新
		List<Article> latest = articleMapper.getLatestArticle();
		modelMap.addAttribute("latest", latest);

		return "article/category";
	}
	@RequestMapping("keyword")
	public String showArticleByKeyword(HttpServletRequest request, String s, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		modelMap.addAttribute("keyword", s);

		System.out.println(s);
		List<Article> as = articleMapper.getArticleByKeyword("%" + s + "%");
		System.out.println(as.size());
		modelMap.addAttribute("as", as);

		// 分类
		List<Category> categories = articleMapper.getAllCategory();
		modelMap.addAttribute("categories", categories);
		
		// 最热
		List<Article> hot = articleMapper.getHotestArticle();
		modelMap.addAttribute("hot", hot);

		// 最新
		List<Article> latest = articleMapper.getLatestArticle();
		modelMap.addAttribute("latest", latest);
		return "article/keyword";
	}
	@RequestMapping("detail")
	public String showDetail(HttpServletRequest request, Integer id, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println("u==" + u);
		modelMap.addAttribute("u", u);
		Article a = articleMapper.getArticleById(id);
		modelMap.addAttribute("a", a);
		
		articleMapper.view(id); // 访问量+1
		
		// 判断该用户是否收藏
		if (u != null) {
			Star star = starMapper.findBySidAndAid(u.getU_id(), id);
			if (star != null) {
				modelMap.addAttribute("star", 1);
			} else {
				modelMap.addAttribute("star", 0);
			}

		}
		
		// 评论
		List<Comment> comments = articleMapper.getCommentByArticleId(id);
		modelMap.addAttribute("comments", comments);
		
		// 分类
		List<Category> categories = articleMapper.getAllCategory();
		modelMap.addAttribute("categories", categories);
		
		// 最热
		List<Article> hot = articleMapper.getHotestArticle();
		modelMap.addAttribute("hot", hot);

		// 最新
		List<Article> latest = articleMapper.getLatestArticle();
		modelMap.addAttribute("latest", latest);
		
		
		return "article/detail";
	}
	
	@ResponseBody
	@RequestMapping("like")
	public Map<String, Object> handleLike(HttpServletRequest request, Integer id) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		
		Map<String, Object> map = new HashMap<String, Object>();
		articleMapper.like(id);
		map.put("message", "点赞成功");
		return map;
	}
	@ResponseBody
	@RequestMapping("star")
	public Map<String, Object> handleStar(HttpServletRequest request, Integer id) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");

		
		Map<String, Object> map = new HashMap<String, Object>();
		
		if(u == null) {
			// 未登录，显示登录页面
			map.put("message", "请先登录");
			return map;
		}
		articleMapper.star(id); // 收藏数+1
		// 还需要把点赞记录插入数据表star中
		Article a = articleMapper.getArticleById(id);
		Star star = new Star(u.getU_id(), a.getId(), a.getTitle());
		System.out.println(star);
		starMapper.save(star);
		map.put("message", "收藏成功");
		return map;
	}
	@ResponseBody
	@RequestMapping("comment")
	public Map<String, Object> handleComment(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");

		
		Map<String, Object> map = new HashMap<String, Object>();
		
		if(u == null) {
			// 未登录，显示登录页面
			map.put("message", "请先登录");
			return map;
		}
		System.out.println(request.getParameter("content"));
		System.out.println(request.getParameter("article_id"));

		Comment comment = new Comment(u.getU_id(), u.getU_name(), request.getParameter("content"), Integer.parseInt(request.getParameter("article_id")));
		articleMapper.save_comment(comment);
		map.put("message", "评论成功");
		return map;
	}	
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
