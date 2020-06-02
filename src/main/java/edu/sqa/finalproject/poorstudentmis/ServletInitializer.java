package edu.sqa.finalproject.poorstudentmis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("edu.sqa.finalproject.poorstudentmis.mapper")
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("edu.sqa.finalproject.poorstudentmis")
@ServletComponentScan

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PoorStudentMisApplication.class);
	}

}
