package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.PoorStu;
import edu.sqa.finalproject.poorstudentmis.entity.PoorVo;
import edu.sqa.finalproject.poorstudentmis.entity.Student;

public interface PoorStudentMapper2 {
	PoorStu findById(String stu_id);//根据学号查找
	List<PoorStu> getStuList();
	List<PoorVo> getScoreTop();//取出前n个
	List<PoorStu> getPoorStuList();//获取学生列表
	Integer insert(PoorStu stu);//插入学生
	void modify1(PoorStu stu);//修改基础信息
	void modify2(String stu_id,Double s_income,Double s_outcome,String s_info,String s_other,Integer poor_level);
	void modifyAvatar(String stu_id,String avatar_url);//修改头像
	public void delAll();
	public void reset();
	public void delById(String s_id);
	void changeISps(String s_id);//更新s_id学生的贫困生状态
	void verify(String s_id);//更新s_id学生的贫困生状态
	public void verifyAll();

}
