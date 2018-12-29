package bll;

import java.util.List;

import dal.MarkDAL;
import entity.Mark;

public class MarkBLL implements BaseBLL<Mark>{
	
	MarkDAL markDAL;
	
	public MarkBLL() {
		markDAL = new MarkDAL();
	}

	@Override
	public List<Mark> getAll() {
		// TODO Auto-generated method stub
		return markDAL.getAll();
	}

	@Override
	public Mark getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Mark mark) {
		// TODO Auto-generated method stub
		return markDAL.insert(mark);
	}

	@Override
	public int update(Mark mark) {
		// TODO Auto-generated method stub
		return markDAL.update(mark);
	}

	@Override
	public int delete(String MaSV) {
		// TODO Auto-generated method stub
		return markDAL.delete(MaSV);
	}

	@Override
	public List<Mark> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
