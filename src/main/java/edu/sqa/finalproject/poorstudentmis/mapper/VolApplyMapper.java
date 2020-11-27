package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.FundVO;
import edu.sqa.finalproject.poorstudentmis.entity.VolA;
import edu.sqa.finalproject.poorstudentmis.entity.VolVO;

public interface VolApplyMapper {
	public void save(VolA voa);
	public List<VolVO> getAllVolById(String u_id);
}
