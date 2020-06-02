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

import edu.sqa.finalproject.poorstudentmis.entity.Work;
import edu.sqa.finalproject.poorstudentmis.mapper.WorkMapper;

@Controller
public class WorkController {
	@Autowired
	private WorkMapper workMapper;
//	@RequestMapping("work_back")
//	public ModelAndView showWork() {
////		Work w = workMapper.findById(1);
////		System.out.println(w);
//		List<Work> works = workMapper.getWorkList();
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("work");
//		mav.addObject("works", works);
//		return mav;
//	}
	@RequestMapping("add_work")
	public String addWork() {
		return "add_work";
	}
	@RequestMapping("handle_add_work")
	public String handleAdd(String w_name, String w_abs, String w_position, String w_money, MultipartFile w_img) {
		// Work work 接受表单中传来的参数，new一个Work对象
		// w_id，不需要设置，这是自增字段
		Work work = new Work(null, w_name, w_abs, null, w_position, Double.parseDouble(w_money), w_img.getOriginalFilename());
		work.setW_time(System.currentTimeMillis());
		// 暂时不需要别的检验机制，直接添加进数据库
		workMapper.save(work);
		// 把图片保存到img/uploads/work中
		try {
			String folder = ClassUtils.getDefaultClassLoader().getResource("static/img/uploads/work").getPath();
			byte[] bytes = w_img.getBytes();
			Path path = Paths.get(folder + "/" + w_img.getOriginalFilename());
			Files.write(path, bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/work_manage";

	}
	@RequestMapping("del_all_work")
	public String delAll() {
		workMapper.delAll();
		workMapper.reset();
		return "redirect:/work_manage";
	}
	@RequestMapping("del_work")
	public String del(Integer w_id) {
		workMapper.delById(w_id);
		return "redirect:/work_manage";
	}
}
