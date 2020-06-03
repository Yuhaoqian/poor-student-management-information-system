package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.FundAF;
import edu.sqa.finalproject.poorstudentmis.entity.FundVO;
import edu.sqa.finalproject.poorstudentmis.entity.FundVerify;

public interface FundApplyMapper {
	public void save(FundAF faf);
	public List<FundVO> getAllApplyFundById(String u_id);
	public List<FundVerify> getAllVerifyFund();
	public void verify(String name, int id);
	public void verifyAll(String name);
}
