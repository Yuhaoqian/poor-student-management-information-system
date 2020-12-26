package edu.sqa.finalproject.poorstudentmis.mapper;

import java.util.List;

import edu.sqa.finalproject.poorstudentmis.entity.VolA;
import edu.sqa.finalproject.poorstudentmis.entity.VolVO;
import edu.sqa.finalproject.poorstudentmis.entity.VolVerify;

public interface VolApplyMapper {
	public void save(VolA voa);
	public List<VolVO> getAllVolById(String u_id);
	public List<VolVerify> getAllVerifyVol();
	public void verify(String name, int id);
	public void verifyAll(String name);
}
