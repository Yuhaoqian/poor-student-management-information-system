package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.WorkAF;
import edu.sqa.finalproject.poorstudentmis.entity.WorkVO;

public interface WorkApplyMapper {
	public void save(WorkAF waf);
	public List<WorkVO> getAllApplyWorkById(String u_id);

}
