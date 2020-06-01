package edu.sqa.finalproject.poorstudentmis.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.mapper.FundMapper;

@Controller
public class FundController {
	@Autowired
	private FundMapper fundMapper;
	@RequestMapping("fund")
	public ModelAndView showFund() {
//		Fund fund = fundMapper.findById(1);
		List<Fund> funds = fundMapper.getFundList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("fund");
		mav.addObject("funds", funds);
		return mav;
	}

	@RequestMapping("add_fund")
	public String addFund() {
		return "add_fund";
	}

	@RequestMapping("handle_add_fund")
	public String handleAdd(String f_name, String f_abs, String f_amount, MultipartFile f_img) {
		// Fund f 接受表单中传来的参数，new一个Fund对象
		// f_id，不需要设置，这是自增字段
		Fund fund = new Fund(null, f_name, f_abs, Double.parseDouble(f_amount), null, f_img.getOriginalFilename());
		fund.setF_time(System.currentTimeMillis());
		// 暂时不需要别的检验机制，直接添加进数据库
		fundMapper.save(fund);
		// 把图片保存到img/uploads/fund中
		try {
			String folder = ClassUtils.getDefaultClassLoader().getResource("static/img/uploads/fund").getPath();
			byte[] bytes = f_img.getBytes();
			Path path = Paths.get(folder + "/" + f_img.getOriginalFilename());
			Files.write(path, bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "add_fund";
	}
}
