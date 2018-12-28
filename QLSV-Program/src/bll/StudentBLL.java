package bll;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dal.StudentDAL;
import entity.Student;

public class StudentBLL implements BaseBLL<Student> {

	StudentDAL studentDAL;

	public StudentBLL() {
		this.studentDAL = new StudentDAL();
	}

	@Override
	public List<Student> getAll() {
		try {
			return studentDAL.getAll();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Student>();
	}

	@Override
	public Student getByCode(String code) {
		try {
			return studentDAL.getByCode(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new Student();
	}

	@Override
	public int insert(Student object) {
		try {
			return studentDAL.insert(object);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public int update(Student object) {
		try {
			return studentDAL.update(object);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public int delete(String code) {
		try {
			return studentDAL.delete(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public List<Student> fillter(String sequenceFilter) {
		
		return null;
	}

}
