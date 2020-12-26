package edu.sqa.finalproject.poorstudentmis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.entity.FundVerify;
import edu.sqa.finalproject.poorstudentmis.entity.MyFile;
import edu.sqa.finalproject.poorstudentmis.entity.Question;
import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.VolVerify;
import edu.sqa.finalproject.poorstudentmis.entity.Work;
import edu.sqa.finalproject.poorstudentmis.entity.WorkVerify;
import edu.sqa.finalproject.poorstudentmis.mapper.FileMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.FundApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.FundMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.QuestionMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.VolApplyMapper;
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
	FundApplyMapper faMapper;
	@Autowired
	WorkApplyMapper waMapper;
	@Autowired
	VolApplyMapper vaMapper;
	@Autowired
	QuestionMapper questionMapper;
	@Autowired
	FileMapper fileMapper;
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
		List<Student> stus = stuMapper.getPoorStuList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/ps_verify");
		mav.addObject("stus", stus);
		mav.addObject("u_name", u.getU_name());

		return mav;	
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
	public String handlePoorStudentVerify(HttpServletRequest request, String s_id) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		System.out.println(s_id);
		stuMapper.verify(s_id);
		System.out.println("success");
		return "redirect:/ps_verify";
	}
	@RequestMapping("stu_manage")
	public ModelAndView showStuManage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		List<Student> stus = stuMapper.getStuList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mis/stu_manage");
		mav.addObject("stus", stus);
		mav.addObject("u_name", u.getU_name());

		return mav;
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
		return "redirect:/login";
	}
}
