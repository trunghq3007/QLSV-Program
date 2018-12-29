package bll;

import java.util.List;

import dal.SubjectDAL;
import entity.Subject;

public class SubjectBLL implements BaseBLL<Subject>{
	
	SubjectDAL subjectDAL;
	
	public SubjectBLL() {
		// TODO Auto-generated constructor stub
		subjectDAL = new SubjectDAL();
	}

	@Override
	public List<Subject> getAll() {
		// TODO Auto-generated method stub
		return subjectDAL.getAll();
	}

	@Override
	public Subject getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Subject sub) {
		// TODO Auto-generated method stub
		return subjectDAL.insert(sub);
	}

	@Override
	public int update(Subject sub) {
		// TODO Auto-generated method stub
		return subjectDAL.update(sub);
	}

	@Override
	public int delete(String name) {
		// TODO Auto-generated method stub
		return subjectDAL.delete(name);
	}

	@Override
	public List<Subject> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
