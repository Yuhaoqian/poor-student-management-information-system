package edu.sqa.finalproject.poorstudentmis.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.portable.InputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import edu.sqa.finalproject.poorstudentmis.utils.OssManagerUtil;

@Controller
public class TestOssController {
	
	@RequestMapping("testo")
	public String test() {
		return "testo";
	}
	
	@RequestMapping("upload")
	public String test2(MultipartFile file) throws IOException {
		String fileName = file.getOriginalFilename();
	    String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
	    fileName = UUID.randomUUID().toString().replace("-", "") + "." + suffix;
	    String url = OssManagerUtil.uploadImage(fileName,file.getInputStream().available(),file.getInputStream());
	    //获取url
	    String ans = OssManagerUtil.getUrl(fileName);
	    System.out.println(ans);
	    return "index";
	}
}
