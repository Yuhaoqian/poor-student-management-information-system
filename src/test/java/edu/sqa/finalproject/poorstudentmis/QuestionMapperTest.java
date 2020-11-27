package edu.sqa.finalproject.poorstudentmis;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.sqa.finalproject.poorstudentmis.entity.Question;
import edu.sqa.finalproject.poorstudentmis.entity.User;
import edu.sqa.finalproject.poorstudentmis.mapper.QuestionMapper;
import edu.sqa.finalproject.poorstudentmis.mapper.UserMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionMapperTest {
	@Autowired
	QuestionMapper questionMapper;

	@Test
	public void getAll() {
		System.out.println("测试，我在这里! ");
		List<Question> lists = questionMapper.getAllQuestion();
		System.out.println(lists);
	}
}

