package edu.sqa.finalproject.poorstudentmis.controller;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.Vol;
import edu.sqa.finalproject.poorstudentmis.mapper.VolMapper;

@Controller
public class VolController {
	@Autowired
	private VolMapper volMapper;
	
	@RequestMapping("vol")
	public String showVol(HttpServletRequest request,ModelMap modelMap) {
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
		System.out.println("show-vol在这里！");
		List<Vol> list = volMapper.getAllVol();
		System.out.println("这里获取志愿列表"+list);
		modelMap.addAttribute("vList", list);
		return "vol";
	}
	
	@RequestMapping("vol_detail")
	public String showVolDetail(HttpServletRequest request,Integer vid, ModelMap modelMap) throws ParseException {
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
		
		System.out.println("vid = "+vid);
		Vol v = volMapper.findById(vid);
		System.out.println("获取到志愿活动"+v.toString());
		modelMap.addAttribute("vol", v);
		
		//截至时间
		String string = v.getEtime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date etime = sdf.parse(string);
        
        //开始时间
        String string2 = v.getBtime();
        Date btime = sdf.parse(string2);
        
        // 日期字符串
        Instant instant = etime.toInstant();
        LocalDate en = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        Instant instant2 = btime.toInstant();
        LocalDate start = instant2.atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate now = LocalDate.now();
        
        long inter = en.toEpochDay() - start.toEpochDay();//整个日期
        long inter2 = now.toEpochDay() - start.toEpochDay();//已过时间
        if(inter2 > inter) inter2 = inter;
        double d = inter2*1.0/inter;
        System.out.println("整个时间：" + inter );
        System.out.println("剩余日期：" + inter2 ); 
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数   
        String s = df.format(d);//返回的是String类型 
        String ans = s.substring(2)+"%";
        System.out.println("per : "+ans);
        Integer num1 = v.getNum();//计划招募
        Integer num2 = v.getAnum();//已经招募
        if(num2 > num1) num2 = num1;
        double d2 = num2*1.0/num1;
        String s2 = df.format(d2);//返回的是String类型 
        String ans2 = s2.substring(2)+"%";
        
        System.out.println("per2 : "+ans2);
        modelMap.addAttribute("per1", ans);
        modelMap.addAttribute("per2", ans2);
        modelMap.addAttribute("days", inter-inter2);
		return "vol_detail";
	}

	@RequestMapping("tygc")
	public String showTygc(HttpServletRequest request,ModelMap modelMap) {
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
		return "tygc";
	}
}
