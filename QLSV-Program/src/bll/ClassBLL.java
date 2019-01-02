package bll;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dal.ClassDAL;
import dal.StudentDAL;
import entity.Class;
import entity.Student;

public class ClassBLL implements BaseBLL<Class> {

	ClassDAL classDAL;

	public ClassBLL() {
		this.classDAL = new ClassDAL();
	}

	@Override
	public List<Class> getAll() {
		try {
			return classDAL.getAll();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Class>();
	}

	@Override
	public Class getByCode(String code) {
		try {
			return classDAL.getByCode(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new Class();
	}

	@Override
	public boolean insert(Class object) {
		try {
			return classDAL.insert(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public boolean update(Class object) {
		try {
			return classDAL.update(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public int delete(String code) {
		try {
			StudentDAL studentDAL = new StudentDAL();
			List<Student> students = studentDAL.getListByClassId(code);
			for (Student student : students) {
				studentDAL.delete(student.getStudentId());
			}
			return classDAL.delete(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public List<Class> fillter(String sequenceFilter) {
		try {
			return classDAL.fillter(sequenceFilter);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("error filter");
		}
		return new ArrayList<Class>();
	}

	@Override
	public StringBuilder getStringBuilderFromList(List<Class> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean display(List<Class> list) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkExistClassById(String id) {
		try {
			Class c = classDAL.getByCode(id);
			if (c.getClassId() == null)
				return false;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}
