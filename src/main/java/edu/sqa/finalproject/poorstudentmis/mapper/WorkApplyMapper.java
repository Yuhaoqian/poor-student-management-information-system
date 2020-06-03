package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.WorkAF;
import edu.sqa.finalproject.poorstudentmis.entity.WorkVO;
import edu.sqa.finalproject.poorstudentmis.entity.WorkVerify;

public interface WorkApplyMapper {
	public void save(WorkAF waf);
	public List<WorkVO> getAllApplyWorkById(String u_id);
	public List<WorkVerify> getAllVerifyWork();
}
