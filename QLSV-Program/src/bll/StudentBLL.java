package bll;

import java.util.List;

import dal.StudentDAL;
import entity.Student;
import utils.Constants;

public class StudentBLL implements BaseBLL<Student> {

	StudentDAL studentDAL;

	/**
	 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
	 * date: Dec 28, 2018 Description: .... Version 1.0
	 * 
	 * @param courseDAL
	 */
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
		if (null == object) {
			System.out.println("object is null. Can't be inserted");
			return 0;
		}
		Student c = null;
		c = getByCode(object.getStudentCode());
		if (null != c) {
			System.out.println("object already exist. Can't insert!");
			return 0;
		}
		return studentDAL.insert(object);
	}

	@Override
	public int update(Student object) {
		if (null == object) {
			System.out.println("object is null. Can't be updated");
			return 0;
		}
		return studentDAL.update(object);
	}

	@Override
	public int delete(String code) {
		return studentDAL.delete(code);
	}

	@Override
	public List<Student> filter(String sequenceFilter) {
		return studentDAL.filter(sequenceFilter);
	}

	@Override
	public void show(List<Student> list) {
		if (null == list) {
			System.out.println("empty result");
		}
		System.out.println(Constants.Student.STUDENT_CODE + "\t" + Constants.Student.STUDENT_NAME
				+ "\t" + Constants.Student.STUDENT_GENDER + "\t" + Constants.Student.STUDENT_DATEBIRTH
				+ "\t" + Constants.Student.STUDENT_ADDRESS + "\t" + Constants.Class.CLASS_CODE);
		for (Student iter : list) {
			System.out.println(iter.getStudentCode() + "\t\t" + iter.getStudentName()
			+ "\t\t" + (iter.getGender() ? "1" : "0") + "\t\t" + iter.getDateOfBirth() 
			+ "\t\t" + iter.getHometown() + "\t\t" + iter.getClassCode());
		}
	}
}
