package edu.sqa.finalproject.poorstudentmis.controller;

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
import org.springframework.web.servlet.ModelAndView;

import edu.sqa.finalproject.poorstudentmis.entity.Article;
import edu.sqa.finalproject.poorstudentmis.entity.Category;
import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.entity.FundVerify;
import edu.sqa.finalproject.poorstudentmis.entity.MyFile;
import edu.sqa.finalproject.poorstudentmis.entity.Notice;
import edu.sqa.finalproject.poorstudentmis.entity.PoorStu;
import edu.sqa.finalproject.poorstudentmis.entity.Question;
import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.Vol;
import edu.sqa.finalproject.poorstudentmis.entity.VolVerify;
import edu.sqa.finalproject.poorstudentmis.entity.Work;
import edu.sqa.finalproject.poorstudentmis.entity.WorkVerify;
import edu.sqa.finalproject.poorstudentmis.mapper.ArticleMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.FileMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.FundApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.FundMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.NoticeMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.PoorStudentMapper2;
import edu.sqa.finalproject.poorstudentmis.mapper.QuestionMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.VolApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.VolMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkMapper;

@Controller
public class ManageInterfaceController {
	@Autowired
	private FundMapper fundMapper;
	@Autowired
	private WorkMapper workMapper;
	@Autowired
	private StudentMapper stuMapper;
	
	@Autowired
	private PoorStudentMapper2 psMapper;
	@Autowired
	private VolMapper volMapper;
	@Autowired
	FundApplyMapper faMapper;
	@Autowired
	WorkApplyMapper waMapper;
	@Autowired
	VolApplyMapper vaMapper;
	@Autowired
	QuestionMapper questionMapper;
	@Autowired
	FileMapper fileMapper;
	@Autowired
	ArticleMapper articleMapper;
	@Autowired
	NoticeMapper NoticeMapper;
	@RequestMapping("article_manage")
	public ModelAndView showArticleManage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Article> articles = articleMapper.getAllArticle();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/article_manage");
		mav.addObject("articles", articles);
		mav.addObject("u_name", u.getU_name());
		return mav;
	}
	@RequestMapping("write_article")
	public ModelAndView showWriteArticle(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Category> categories = articleMapper.getAllCategory();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/write_article");
		mav.addObject("u_name", u.getU_name());
		mav.addObject("categories", categories);
		return mav;
	}
	@RequestMapping("vol_manage")
	public ModelAndView showVolManage(HttpServletRequest request) {
		// 因为有了过滤器，所以进到后台的一定是已经登陆的用户，不需要再判断session中有没有user了。
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Vol> vols = volMapper.getAllVol();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/vol_manage");
		mav.addObject("vols", vols);
		mav.addObject("u_name", u.getU_name());
		return mav;
	}
	@RequestMapping("fund_manage")
	public ModelAndView showFundManage(HttpServletRequest request) {
		// 因为有了过滤器，所以进到后台的一定是已经登陆的用户，不需要再判断session中有没有user了。
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Fund> funds = fundMapper.getFundList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/fund_manage");
		mav.addObject("funds", funds);
		mav.addObject("u_name", u.getU_name());
		return mav;
	}

	@RequestMapping("work_manage")
	public ModelAndView showWorkManage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Work> works = workMapper.getWorkList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/work_manage");
		mav.addObject("works", works);
		mav.addObject("u_name", u.getU_name());

		return mav;	
	}
	@RequestMapping("file_manage")
	public ModelAndView showFileManage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<MyFile> files = fileMapper.getAllFile();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/file_manage");
		mav.addObject("files", files);
		mav.addObject("u_name", u.getU_name());
		return mav;	
	}
	@RequestMapping("ps_verify")
	public ModelAndView showPoorStudentManage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<PoorStu> stus = psMapper.getPoorStuList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/ps_verify");
		mav.addObject("stus", stus);
		mav.addObject("u_name", u.getU_name());

		return mav;	
	}
	@RequestMapping("reject_ps")
	public String reject(String stu_id) {
		psMapper.reject(stu_id);
		return "redirect:/ps_verify";
	}
	@RequestMapping("verify_all_ps")
	public String handlePsVerify(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		stuMapper.verifyAll();
		System.out.println("success");
		return "redirect:/ps_verify";
	}
	@RequestMapping("handle_ps_verify")
	public String handlePoorStudentVerify(HttpServletRequest request, String stu_id, Integer poor_level) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println(stu_id);
		psMapper.verify(stu_id, poor_level);
//		System.out.println("poor_level:" + poor_level);
		System.out.println("success");
		return "redirect:/ps_verify";
	}
	@RequestMapping("stu_manage")
	public ModelAndView showStuManage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
//		List<Student> stus = stuMapper.getStuList();
		List<PoorStu> stus = psMapper.getStuList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/stu_manage");
		mav.addObject("stus", stus);
		mav.addObject("u_name", u.getU_name());

		return mav;
	}
	@RequestMapping("notice")
	public String showNotice(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		modelMap.addAttribute("u_name", u.getU_name());
		return "mis/post_notice";
	}
	@ResponseBody
	@RequestMapping("handle_post_notice")
	public Map<String, Object> HandleAsk(HttpServletRequest request) {

		Map<String, Object> map = new HashMap<String, Object>();
		
		String n_title = request.getParameter("title");
		String n_href = request.getParameter("link");
		
		Notice notice = new Notice(n_title, n_href);
		NoticeMapper.save(notice);
		System.out.println(n_title);
		System.out.println(n_href);
		map.put("msg", "success");

		return map;
		//处理问题提交
	}
	@RequestMapping("question_reply")
	public ModelAndView showQuestionReply(HttpServletRequest request, ModelMap modelMap) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Question> questions = questionMapper.getAllQuestion();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/question_reply");
		mav.addObject("questions", questions);
		mav.addObject("u_name", u.getU_name());
		return mav;
	}
	@RequestMapping("handle_question_del")
	public String del(Integer q_id) {
		questionMapper.delById(q_id);
		return "redirect:/question_reply";
	}
	@RequestMapping("fund_verify")
	public String showFundVerify(HttpServletRequest request, ModelMap modelMap) {
		List<FundVerify> fvs = faMapper.getAllVerifyFund();

		modelMap.addAttribute("fvs", fvs);

		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		modelMap.addAttribute("u_name", u.getU_name());
		return "mis/fund_verify";
	}
	@RequestMapping("handle_fund_verify")
	public String handleFundVerify(HttpServletRequest request, int fa_id) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println(fa_id);
		faMapper.verify(u.getU_name(), fa_id);
		System.out.println("success");
		return "redirect:/fund_verify";
	}
	@RequestMapping("verify_all_fund")
	public String handleFundVerify(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		faMapper.verifyAll(u.getU_name());
		System.out.println("success");
		return "redirect:/fund_verify";
	}
	@RequestMapping("work_verify")
	public String showWorkVerify(HttpServletRequest request, ModelMap modelMap) {
		List<WorkVerify> wvs = waMapper.getAllVerifyWork();
		modelMap.addAttribute("wvs", wvs);
		
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		modelMap.addAttribute("u_name", u.getU_name());
		return "mis/work_verify";
	}
	@RequestMapping("handle_work_verify")
	public String handleWorkVerify(HttpServletRequest request, int wa_id) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println(wa_id);
		waMapper.verify(u.getU_name(), wa_id);
		System.out.println("success");
		return "redirect:/work_verify";
	}
	@RequestMapping("verify_all_work")
	public String handleWorkVerify(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		waMapper.verifyAll(u.getU_name());
		System.out.println("success");
		return "redirect:/work_verify";
	}
	@RequestMapping("vol_verify")
	public String showVolVerify(HttpServletRequest request, ModelMap modelMap) {
		List<VolVerify> vvs = vaMapper.getAllVerifyVol();
		modelMap.addAttribute("vvs", vvs);
		
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		modelMap.addAttribute("u_name", u.getU_name());
		return "mis/vol_verify";
	}
	@RequestMapping("handle_vol_verify")
	public String handleVolVerify(HttpServletRequest request, int va_id) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println(va_id);
		vaMapper.verify(u.getU_name(), va_id);
		System.out.println("success");
		return "redirect:/vol_verify";
	}
	@RequestMapping("verify_all_vol")
	public String handleVolVerify(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		vaMapper.verifyAll(u.getU_name());
		System.out.println("success");
		return "redirect:/vol_verify";
	}
	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		//删除session里面得user对象
		session.removeAttribute("user");//根据key删除对应的数据
		session.removeAttribute("userName");
		session.removeAttribute("password");
		session.removeAttribute("power");
		session.removeAttribute("avatar_url");
		session.removeAttribute("noticeMapper");
		return "redirect:/login";
	}
}
