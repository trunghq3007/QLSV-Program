package bll;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dal.CourseDAL;
import entity.Course;

public class CourseBLL implements BaseBLL<Course> {
	CourseDAL courseDAL;

	public CourseBLL() {
		this.courseDAL = new CourseDAL();
	}

	@Override
	public List<Course> getAll() {
		try {
			return courseDAL.getAll();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Course>();
	}

	@Override
	public Course getByCode(String code) {
		try {
			return courseDAL.getByCode(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new Course();
	}

	@Override
	public boolean insert(Course object) {
		try {
			return courseDAL.insert(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public boolean update(Course object) {
		try {
			return courseDAL.update(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public int delete(String code) {
		try {
			return courseDAL.delete(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public List<Course> fillter(String sequenceFilter) {
		try {
			return courseDAL.fillter(sequenceFilter);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Course>();
	}

	@Override
	public StringBuilder getStringBuilderFromList(List<Course> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean display(List<Course> list) {
		// TODO Auto-generated method stub
		return false;
	}
}
