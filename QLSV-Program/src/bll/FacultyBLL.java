package bll;

import java.util.List;

import dal.FacultyDAL;
import entity.Faculty;

public class FacultyBLL implements BaseBLL<Faculty>{
	FacultyDAL facultyDAL;
	
	public FacultyBLL() {
		facultyDAL = new FacultyDAL();
	}
	@Override
	public List<Faculty> getAll() {
		
		return facultyDAL.getAll();
	}

	@Override
	public Faculty getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Faculty object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Faculty object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Faculty> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
