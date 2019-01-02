package bll;

import java.util.List;
import java.util.Scanner;

import dal.StudentDal;
import entity.Student;
import utils.Validator;

public class StudentBLL implements BaseBLL<Student>{

	private StudentDal studentDal;
	private static Scanner scanner = new Scanner(System.in);
	
	
	public StudentBLL() {
		studentDal = new StudentDal();
	}

	@Override
	public List<Student> Add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentDal.getAll();
	}

	@Override
	public Student getByCode() {
		System.out.println("insert student code");
		String code = scanner.next();
		return studentDal.getByCode(code);
	}

	@Override
	public int insert() {
		System.out.println("insert student code");
		String studentCode = scanner.nextLine();
		System.out.println("insert student name");
		String studentName = scanner.nextLine();
		System.out.println("insert student gender: male or female");
		String gender = scanner.nextLine();
		
		System.out.println("insert student date of birth (yyyy-mm-dd)");
		String dateOfBirth = scanner.nextLine();
		while(Validator.check_Birthdate(dateOfBirth) == false) {
            System.out.println("Invalid date format, enter again: ");
            dateOfBirth = scanner.nextLine();
		}
		System.out.println("insert student hometown");
		String hometown = scanner.nextLine();
		System.out.println("insert student class code");
		String classCode = scanner.nextLine();
		
		Student student = new Student(studentCode, studentName, gender, dateOfBirth, hometown, classCode);
		return studentDal.insert(student);
	}

	@Override
	public int update() {
		System.out.println("insert student code");
		String studentCode = scanner.nextLine();
		System.out.println("insert student name");
		String studentName = scanner.nextLine();
		System.out.println("insert student gender: male or female");
		String gender = scanner.nextLine();
		System.out.println("insert student date of birth");
		String dateOfBirth = scanner.nextLine();
		System.out.println("insert student hometown");
		String hometown = scanner.nextLine();
		System.out.println("insert student class code");
		String classCode = scanner.nextLine();
		
		Student student = new Student(studentCode, studentName, gender, dateOfBirth, hometown, classCode);
		return studentDal.update(student);
	}

	@Override
	public int delete() {
		System.out.println("insert student code");
		String code = scanner.next();
		return studentDal.delete(code);
	}

	@Override
	public List<Student> fillter() {
		System.out.println("insert student name need search");
		String sequenceFilter = scanner.nextLine();
		return studentDal.fillter(sequenceFilter);
	}

	@Override
	public void display(List<Student> list) {
		if(list == null || list.isEmpty()) {
			System.out.println("array null");
		} else {
			for (Student student : list) {
				System.out.println(student);
			}
		}
		
	}

    @Override
    public StringBuilder showBuilder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StringBuffer showBuffer() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String show() {
        // TODO Auto-generated method stub
        return null;
    }

}
