package bll;

import java.util.List;

import dal.StudentDAL;
import entity.Student;

public class StudentBLL implements BaseBLL<Student>{
	
	StudentDAL studentDAL;
	
	public StudentBLL() {
		studentDAL = new StudentDAL();
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentDAL.getAll();
	}

	@Override
	public Student getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Student st) {
		// TODO Auto-generated method stub
		return studentDAL.insert(st);
	}

	@Override
	public int update(Student st) {
		// TODO Auto-generated method stub
		return studentDAL.update(st);
	}

	@Override
	public int delete(String st) {
		// TODO Auto-generated method stub
		return studentDAL.delete(st);
	}

	@Override
	public List<Student> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
