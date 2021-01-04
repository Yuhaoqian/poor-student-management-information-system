package edu.sqa.finalproject.poorstudentmis.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.entity.Vol;
import edu.sqa.finalproject.poorstudentmis.mapper.VolMapper;
import edu.sqa.finalproject.poorstudentmis.utils.OssManagerUtil;

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
	@RequestMapping("del_all_vol")
	public String delAll() {
		volMapper.delAll();
		volMapper.reset();
		return "redirect:/vol_manage";
	}
	@RequestMapping("del_vol")
	public String del(Integer vid) {
		volMapper.delById(vid);
		return "redirect:/vol_manage";
	}
	@RequestMapping("handle_add_vol")
	public String handleAdd(String v_name, String v_abs, String v_position, String num, MultipartFile v_img, String stime, String btime, String etime) throws ParseException, IOException {
		// Work work 接受表单中传来的参数，new一个Work对象
		// w_id，不需要设置，这是自增字段
		
		System.out.println("time: " + stime);
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	    Date bdate = df.parse(btime.replaceAll("T", " ") + ":00");
	    Date edate = df.parse(etime.replaceAll("T", " ") + ":00");
	    Date now = new Date();
	    
	    String fileName = v_img.getOriginalFilename();
	    String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
	    fileName = UUID.randomUUID().toString().replace("-", "") + "." + suffix;
	    String url = OssManagerUtil.uploadImage(fileName,v_img.getInputStream().available(),v_img.getInputStream());
	    //获取url
	    System.out.println(url);
	    Vol vol = new Vol(v_name, v_abs, v_position, url, Integer.parseInt(num), 0, stime, bdate, edate, now);
		// 暂时不需要别的检验机制，直接添加进数据库
		volMapper.save(vol);
	    

		return "redirect:/vol_manage";

	}
}
