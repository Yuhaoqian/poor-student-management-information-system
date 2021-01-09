package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.Question;
import edu.sqa.finalproject.poorstudentmis.entity.Student;

public interface QuestionMapper {
	List<Question> getAllQuestion();//获取所有问题
	List<Question> getAllQuestionById(String sid);//获取某个用户的所有问题
	Integer insertQ(Question q);
	Question getQuestionById(int q_id);
	public void delById(Integer q_id);
	public void delAll();//删除所有
	void modifyReply(int q_id, String r_content, String name);
}

