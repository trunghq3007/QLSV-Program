package bll;

import java.util.List;
import java.util.Scanner;

import dal.MarkDal;
import entity.Mark;

public class MarkBLL implements BaseBLL<Mark>{

	private MarkDal markDal;
	private static Scanner scanner = new Scanner(System.in);
	
	
	
	public MarkBLL() {
		markDal = new MarkDal();
	}

	@Override
	public List<Mark> Add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mark> getAll() {
		
		return markDal.getAll();
	}

	@Override
	public Mark getByCode() {
		return null;
	}

	@Override
	public int insert() {
		System.out.println("insert student code");
		String studentCode = scanner.next();
		System.out.println("insert subject code");
		String subjectCode = scanner.next();
		System.out.println("insert semester code");
		int semester = scanner.nextInt();
		System.out.println("insert first mark code");
		int firstMark = scanner.nextInt();
		System.out.println("insert second mark code");
		int secondMark = scanner.nextInt();
		
		Mark mark = new Mark(studentCode, subjectCode, semester, firstMark, secondMark);
		
		return markDal.insert(mark);
	}

	@Override
	public int update() {
		System.out.println("insert student code");
		String studentCode = scanner.next();
		System.out.println("insert subject code");
		String subjectCode = scanner.next();
		System.out.println("insert semester code");
		int semester = scanner.nextInt();
		System.out.println("insert first mark code");
		int firstMark = scanner.nextInt();
		System.out.println("insert second mark code");
		int secondMark = scanner.nextInt();
		
		Mark mark = new Mark(studentCode, subjectCode, semester, firstMark, secondMark);
		
		return markDal.update(mark);
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Mark> fillter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(List<Mark> list) {
		if(list == null || list.isEmpty()) {
			System.out.println("array null");
		} else {
			for (Mark mark : list) {
				System.out.println(mark);
			}
		}
	}

}
