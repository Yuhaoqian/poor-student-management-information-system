package edu.sqa.finalproject.poorstudentmis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sqa.finalproject.poorstudentmis.entity.FundAF;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.WorkAF;
import edu.sqa.finalproject.poorstudentmis.mapper.FundApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkApplyMapper;

@Controller
public class ApplyController {
	@Autowired
	FundApplyMapper faMapper;
	@Autowired
	WorkApplyMapper waMapper;
	@RequestMapping("handle_apply_fund")
	public String handleApplyFund(HttpServletRequest request, int f_id) {
		// f_id通过前台传过来，s_id在session中，fa_time为申请时间（系统生成），fa_flag（默认为0，没有通过审核）,fa_reviwer一开始是没有的
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		int fid = f_id;
		String sid = u.getU_id();
		int fa_flag = 0;
		long fa_time = System.currentTimeMillis();
		String fa_reviwer = "无";
		FundAF faf = new FundAF(null, sid, fid, fa_time, fa_flag, fa_reviwer);
		System.out.println(faf);
		faMapper.save(faf);
		return "redirect:/home";
	}
	@RequestMapping("handle_apply_work")
	public String handleApplyWork(HttpServletRequest request, int w_id) {
		// f_id通过前台传过来，s_id在session中，fa_time为申请时间（系统生成），fa_flag（默认为0，没有通过审核）,fa_reviwer一开始是没有的
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		int wid = w_id;
		String sid = u.getU_id();
		int wa_flag = 0;
		long wa_time = System.currentTimeMillis();
		String wa_reviwer = "无";
		WorkAF waf = new WorkAF(null, sid, wid, wa_time, wa_flag, wa_reviwer);
		System.out.println(waf);
		waMapper.save(waf);
		return "redirect:/home";
	}
}
