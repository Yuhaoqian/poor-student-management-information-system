package edu.sqa.finalproject.poorstudentmis.controller;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import edu.sqa.finalproject.poorstudentmis.entity.Fund;
import edu.sqa.finalproject.poorstudentmis.entity.MyFile;
import edu.sqa.finalproject.poorstudentmis.mapper.FileMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.PoorStudentMapper2;
import edu.sqa.finalproject.poorstudentmis.mapper.ScoreMapper;
import edu.sqa.finalproject.poorstudentmis.utils.OssManagerUtil;

@Controller
public class DownloadController {
	@Autowired
	FileMapper fileMapper;
	@RequestMapping("download")
	public String showDownload(ModelMap modelMap) {
		List<MyFile> files = fileMapper.getAllFile();
		System.out.println(files.toString());
		modelMap.addAttribute("files", files);
		return "service/download";
	}
	@RequestMapping("del_file")
	public String del(Integer id) {
		fileMapper.delById(id);
		return "redirect:/file_manage";
	}
	
	@RequestMapping("handle_add_file")
	public String handleAdd(String title,  MultipartFile f) {
		try {
			String fileName = f.getOriginalFilename();
		    String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
		    fileName = UUID.randomUUID().toString().replace("-", "") + "." + suffix;
		    String url = OssManagerUtil.uploadImage(fileName,f.getInputStream().available(),f.getInputStream());
		    //获取url
		    System.out.println(url);
			MyFile file = new MyFile(title,url,new Date(System.currentTimeMillis()));	
			// 暂时不需要别的检验机制，直接添加进数据库
			fileMapper.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return "redirect:/file_manage";
	}

}
