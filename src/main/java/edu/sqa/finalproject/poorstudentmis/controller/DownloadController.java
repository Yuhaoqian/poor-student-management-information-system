package edu.sqa.finalproject.poorstudentmis.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sqa.finalproject.poorstudentmis.entity.MyFile;
import edu.sqa.finalproject.poorstudentmis.mapper.FileMapper;

@Controller
public class DownloadController {
	@Autowired
	FileMapper fileMapper;
	
	@RequestMapping("download")
	public String showDownload(ModelMap modelMap) {
		List<MyFile> files = fileMapper.getAllFile();
		System.out.println(files.toString());
		modelMap.addAttribute("files", files);
		return "download";
	}

}
