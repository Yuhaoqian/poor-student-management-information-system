package edu.sqa.finalproject.poorstudentmis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@MapperScan("edu.sqa.finalproject.poorstudentmis.mapper")
@SpringBootApplication
public class PoorStudentMisApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoorStudentMisApplication.class, args);
	}
	
	
}
