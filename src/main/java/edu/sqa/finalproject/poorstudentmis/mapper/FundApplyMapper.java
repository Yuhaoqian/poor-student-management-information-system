package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.FundAF;
import edu.sqa.finalproject.poorstudentmis.entity.FundVO;

public interface FundApplyMapper {
	public void save(FundAF faf);
	public List<FundVO> getAllApplyFundById(String u_id);

}
