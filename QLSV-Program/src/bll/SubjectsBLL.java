package bll;

import java.util.List;

import dal.SubjectsDAL;
import entity.Subjects;

public class SubjectsBLL implements BaseBLL<Subjects>{
	SubjectsDAL subjectsDAL;
	
	public SubjectsBLL() {
		subjectsDAL = new SubjectsDAL();
	}
	@Override
	public List<Subjects> getAll() {
		return subjectsDAL.getAll();
	}

	@Override
	public Subjects getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Subjects object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Subjects object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Subjects> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
