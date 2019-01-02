package bll;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dal.MarkDAL;
import dal.StudentDAL;
import entity.Student;
import utils.Constants;
import utils.Validation;

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
	public boolean insert(Student object) {
		try {
			return studentDAL.insert(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public boolean update(Student object) {
		try {
			return studentDAL.update(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public int delete(String code) {
		try {
			new MarkDAL().deleteByStudentId(code);
			return studentDAL.delete(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public List<Student> fillter(String sequenceFilter) {
		try {
			return studentDAL.fillter(sequenceFilter);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("error filter");
		}
		return new ArrayList<Student>();
	}

	@Override
	public StringBuilder getStringBuilderFromList(List<Student> list) {
		StringBuilder builder = new StringBuilder();
		for (Student student : list) {
			builder.append(student.toString()).append("\r\n");
		}
		return builder;
	}

	/*
	 * @see bll.BaseBLL#display()
	 */
	@Override
	public boolean display(List<Student> list) {
		System.out.println(String.format(Constants.ToStringFormatter.STUDENT, "ID", "Name",
				"Gender", "DateofBirth", "HomeTown", "ClassID"));
		System.out.println(getStringBuilderFromList(list));
		return true;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - 
	 * Version 1.0
	 * @param id
	 * @return
	 */
	public boolean checkExistById(String id) {
		if (getByCode(id).getStudentId() == null)
			return false;
		return true;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - Input student information from keyboard 
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public Student inputStudent(Scanner sc) {
		System.out.println("Input student id:");
		String id = "";
		boolean check = false;
		do {
			id = Validation.validateId(sc);
			check = checkExistById(id);
			if (check)
				System.out.println("StudentId is exist. Input other id");
		} while (check);
		Student student = inputStudentInformationWithoutId(sc);
		student.setStudentId(id);
		return student;
	}

	public Student inputStudentInformationWithoutId(Scanner sc) {
		System.out.println("Input student name:");
		String name = sc.nextLine();
		System.out.println("Input gender (true:false):");
		boolean gender = Validation.validateGender(sc);
		System.out.println("Input hometown:");
		String address = sc.nextLine();
		System.out.println("Input date of birth: (dd/mm/yyyy)");
		Date dateOfBirth = Validation.validateDate(sc);
		boolean check = false;
		String classId = "";
		do {
			System.out.println("Input class id:");
			classId = Validation.validateId(sc);
			check = new ClassBLL().checkExistClassById(classId);
			if (!check)
				System.out.println("Class id is not exist.");
		} while (!check);

		Student student = new Student();
		student.setStudentName(name);
		student.setGender(gender);
		student.setHometown(address);
		student.setDateOfBirth(dateOfBirth);
		student.setClassId(classId);
		return student;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - 
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public String inputExistId(Scanner sc) {
		String id = "";
		System.out.println("Input id:");
		boolean check = false;
		do {
			id = Validation.validateId(sc);
			check = checkExistById(id);
			if (!check)
				System.out.println("StudentId is not exist. Input other id");
		} while (!check);
		return id;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - 
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public String inputNotExistId(Scanner sc) {
		String id = "";
		System.out.println("Input id:");
		boolean check = false;
		do {
			id = Validation.validateId(sc);
			check = checkExistById(id);
			if (check)
				System.out.println("StudentId is exist. Input other id");
		} while (check);
		return id;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - 
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public boolean showStudentGetById(Scanner sc) {
		String id = inputExistId(sc);
		System.out.println("Information of student has id: " + id);
		System.out.println(String.format(Constants.ToStringFormatter.STUDENT, "ID", "Name",
				"Gender", "DateofBirth", "HomeTown", "ClassID"));
		System.out.println(getByCode(id));
		return true;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - 
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public boolean filterByCharacter(Scanner sc) {
		System.out.println("Input character want to filter");
		String filterCharacter = sc.nextLine();
		List<Student> list = fillter(filterCharacter);
		return display(list);
	}

	public boolean updateInfo(Scanner sc) {
		String id = inputExistId(sc);
		Student student = inputStudentInformationWithoutId(sc);
		student.setStudentId(id);
		if (update(student))
			return true;
		return false;
	}
}
