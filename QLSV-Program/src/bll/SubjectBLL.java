package bll;

import java.util.List;
import java.util.Scanner;

import dal.SubjectDal;
import entity.Subject;

public class SubjectBLL implements BaseBLL<Subject> {

	private SubjectDal subjectDal;
	private static Scanner scanner = new Scanner(System.in);

	public SubjectBLL() {
		subjectDal = new SubjectDal();
	}

	@Override
	public List<Subject> Add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getAll() {
		// TODO Auto-generated method stub
		return subjectDal.getAll();
	}

	@Override
	public Subject getByCode() {
		System.out.println("insert subject code");
		String code = scanner.next();
		return subjectDal.getByCode(code);
	}

	@Override
	public int insert() {
		System.out.println("insert subject code");
		String subjectCode = scanner.nextLine();
		System.out.println("insert subject name");
		String subjectName = scanner.nextLine();
		System.out.println("insert subject credit number");
		int creditsNumber = scanner.nextInt();
		
		Subject subject = new Subject(subjectCode, subjectName, creditsNumber);
				
		return subjectDal.insert(subject);
	}

	@Override
	public int update() {
		System.out.println("insert subject code");
		String subjectCode = scanner.nextLine();
		System.out.println("insert subject name");
		String subjectName = scanner.nextLine();
		System.out.println("insert subject credit number");
		int creditsNumber = scanner.nextInt();
		
		Subject subject = new Subject(subjectCode, subjectName, creditsNumber);
				
		return subjectDal.update(subject);
	}

	@Override
	public int delete() {
		System.out.println("insert subject code");
		String code = scanner.next();
		return subjectDal.delete(code);
	}

	@Override
	public List<Subject> fillter() {
		System.out.println("insert string need search");
		String sequenceFilter = scanner.nextLine();
		return subjectDal.fillter(sequenceFilter);
	}

	@Override
	public void display(List<Subject> list) {
		if(list == null || list.isEmpty()) {
			System.out.println("array null");
		} else {
			for (Subject subject : list) {
				System.out.println(subject);
			}
		}
	}

}
