package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Question;
import edu.sqa.finalproject.poorstudentmis.entity.Student;

public interface QuestionMapper {
	List<Question> getAllQuestion();//获取所有问题
	Integer insertQ(Question q);
	Question getQuestionById(int q_id);
	public void delById(Integer id);
	void modifyReply(int q_id, String r_content, String name);
}

