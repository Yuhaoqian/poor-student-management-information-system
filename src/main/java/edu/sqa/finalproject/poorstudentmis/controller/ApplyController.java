package edu.sqa.finalproject.poorstudentmis.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sqa.finalproject.poorstudentmis.entity.FundAF;
import edu.sqa.finalproject.poorstudentmis.entity.FundVerify;
import edu.sqa.finalproject.poorstudentmis.entity.Student;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.VolA;
import edu.sqa.finalproject.poorstudentmis.entity.WorkAF;
import edu.sqa.finalproject.poorstudentmis.entity.WorkVerify;
import edu.sqa.finalproject.poorstudentmis.mapper.FundApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.StudentMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.UserMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.VolApplyMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkApplyMapper;

@Controller
public class ApplyController {
	@Autowired
	FundApplyMapper faMapper;
	@Autowired
	WorkApplyMapper waMapper;
	@Autowired
	private VolApplyMapper volApplyMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	StudentMapper studentMapper;
	
	@RequestMapping("handle_apply_fund")
	public String handleApplyFund(HttpServletRequest request, int f_id) {
		// f_id通过前台传过来，s_id在session中，fa_time为申请时间（系统生成），fa_flag（默认为0，没有通过审核）,fa_reviwer一开始是没有的
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		if(u == null) return "login";
		Student s = studentMapper.findById(u.getU_id());
		if(s.getS_isps() != 2) {
			return "redirect:/authen";//先进行认证
		}
		int fid = f_id;
		String sid = u.getU_id();
		int fa_flag = 0;
		long fa_time = System.currentTimeMillis();
		String fa_reviwer = "无";
		FundAF faf = new FundAF(null, sid, fid, fa_time, fa_flag, fa_reviwer);
		System.out.println(faf);
		faMapper.save(faf);
		return "redirect:/application";
	}
	@RequestMapping("handle_apply_work")
	public String handleApplyWork(HttpServletRequest request, int w_id) {
		// f_id通过前台传过来，s_id在session中，fa_time为申请时间（系统生成），fa_flag（默认为0，没有通过审核）,fa_reviwer一开始是没有的
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		if(u == null) return "login";
		Student s = studentMapper.findById(u.getU_id());
		if(s.getS_isps() != 2) {
			return "redirect:/authen";//先进行认证
		}
		int wid = w_id;
		String sid = u.getU_id();
		int wa_flag = 0;
		long wa_time = System.currentTimeMillis();
		String wa_reviwer = "无";
		WorkAF waf = new WorkAF(null, sid, wid, wa_time, wa_flag, wa_reviwer);
		System.out.println(waf);
		waMapper.save(waf);
		return "redirect:/application";
	}
	@RequestMapping("handle_apply_vol")
	public String handleApplyVol(HttpServletRequest request, int vid) {
		// f_id通过前台传过来，s_id在session中，fa_time为申请时间（系统生成），fa_flag（默认为0，没有通过审核）,fa_reviwer一开始是没有的
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		if(u == null) return "login";
		String sid = u.getU_id();
		int va_flag = 0;
		Date d = new Date();
		Timestamp timeStamp = new Timestamp(d.getTime());
		String va_reviwer = "无";
		VolA voa = new VolA(sid,vid,timeStamp,va_flag,va_reviwer);
		volApplyMapper.save(voa);
		System.out.println(voa.toString()+"保存成功啦！！");
		return "redirect:/application";
	}	
}
