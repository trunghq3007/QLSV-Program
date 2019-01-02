package bll;

import java.util.List;

import dal.StudentDAL;
import entity.Student;

public class StudentBLL implements BaseBLL<Student> {
	StudentDAL studentDAL;
	
	public StudentBLL() {
		studentDAL = new StudentDAL();
	}
	@Override
	public List<Student> getAll() {
		return studentDAL.getAll();
	}

	@Override
	public Student getByCode(String code) {
		return studentDAL.getByCode(code);
	}

	@Override
	public int insert(Student object) {
		return studentDAL.insert(object);
	}

	@Override
	public int update(Student object) {
		return studentDAL.update(object);
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
