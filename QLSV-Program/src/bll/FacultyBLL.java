package bll;

import java.util.List;
import java.util.Scanner;



import dal.FacultyDal;
import entity.Faculty;
import utils.Validator;

public class FacultyBLL implements BaseBLL<Faculty>{

	private FacultyDal facultyDal;
	private static Scanner scanner = new Scanner(System.in);
	
	
	public FacultyBLL() {
		facultyDal = new FacultyDal();
	}

	@Override
	public List<Faculty> Add() {
		
		return null;
	}

	@Override
	public List<Faculty> getAll() {
		// TODO Auto-generated method stub
		return facultyDal.getAll();
	}

	@Override
	public Faculty getByCode() {
		System.out.println("insert faculty code");
		String code = scanner.next();
		return facultyDal.getByCode(code);
	}

	@Override
	public int insert() {
		System.out.println("insert faculty code");
		String code = scanner.nextLine();
		System.out.println("insert faculty name");
		String name = scanner.nextLine();
		System.out.println("insert faculty address");
		String address = scanner.nextLine();
		System.out.println("insert faculty phone");
		String phone = scanner.nextLine();
		while(Validator.check_Phone(phone) == false) {
		    System.out.println("Invalid phone format, enter again: ");
		    phone = scanner.nextLine();
		}
		
		Faculty faculty = new Faculty(code, name, address, phone);
		
		return facultyDal.insert(faculty);
	}

	@Override
	public int update() {
		System.out.println("insert faculty code");
		String code = scanner.nextLine();
		System.out.println("insert faculty name");
		String name = scanner.nextLine();
		System.out.println("insert faculty address");
		String address = scanner.nextLine();
		System.out.println("insert faculty phone");
		String phone = scanner.nextLine();
		
		Faculty faculty = new Faculty(code, name, address, phone);
		
		return facultyDal.update(faculty);
	}

	@Override
	public int delete() {
		System.out.println("insert faculty code");
		String code = scanner.next();
		return facultyDal.delete(code);
	}

	@Override
	public List<Faculty> fillter() {
		System.out.println("insert string need search");
		String sequenceFilter = scanner.nextLine();
		return facultyDal.fillter(sequenceFilter);
	}

	@Override
	public void display(List<Faculty> list) {
		if(list == null || list.isEmpty()) {
			System.out.println("array null");
		} else {
			for (Faculty faculty : list) {
				System.out.println(faculty);
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
