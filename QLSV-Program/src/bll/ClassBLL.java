package bll;

import java.util.List;

import dal.ClassDAL;
import entity.Class;

public class ClassBLL implements BaseBLL<Class>{
	
	ClassDAL classDAL;
	public ClassBLL() {
		classDAL = new ClassDAL();
	}
	@Override
	public List<Class> getAll() {
		return classDAL.getAll();
	}

	@Override
	public Class getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Class object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Class object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Class> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
