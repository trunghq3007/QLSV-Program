package bll;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dal.FacultyDAL;
import entity.Faculty;

public class FacultyBLL implements BaseBLL<Faculty> {
	FacultyDAL facultyDAL;

	public FacultyBLL() {
		this.facultyDAL = new FacultyDAL();
	}

	@Override
	public List<Faculty> getAll() {
		try {
			return facultyDAL.getAll();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Faculty>();
	}

	@Override
	public Faculty getByCode(String code) {
		try {
			return facultyDAL.getByCode(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new Faculty();
	}

	@Override
	public boolean insert(Faculty object) {
		try {
			return facultyDAL.insert(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public boolean update(Faculty object) {
		try {
			return facultyDAL.update(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public int delete(String code) {
		try {
			return facultyDAL.delete(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public List<Faculty> fillter(String sequenceFilter) {
		try {
			return facultyDAL.fillter(sequenceFilter);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Faculty>();
	}

	@Override
	public StringBuilder getStringBuilderFromList(List<Faculty> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean display(List<Faculty> list) {
		// TODO Auto-generated method stub
		return false;
	}
}
