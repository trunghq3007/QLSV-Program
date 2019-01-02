/**
 * 
 */
package bll;

import java.util.List;
import java.util.Scanner;

import dal.CourseDal;
import entity.Course;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: Version 1.0
 */
public class CourseBLL implements BaseBLL<Course> {
	
	// courseDAL
	private CourseDal courseDAL;
	private static Scanner scanner = new Scanner(System.in);
	/**
	 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
	 * date: Dec 28, 2018 Description: .... Version 1.0
	 * 
	 * @param courseDAL
	 */
	public CourseBLL() {
		courseDAL = new CourseDal();
	}

	@Override
	public List<Course> getAll() {
		return courseDAL.getAll();

	}

	@Override
	public List<Course> Add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getByCode() {
		System.out.println("insert course code");
		String code = scanner.next();
		return courseDAL.getByCode(code);
	}

	@Override
	public int insert() {
		System.out.println("insert course code");
		String code = scanner.nextLine();
		System.out.println("insert cpurse name");
		String name = scanner.nextLine();
		
		Course course = new Course(code, name);
		return courseDAL.insert(course);
	}

	@Override
	public int update() {
		System.out.println("insert course code");
		String code = scanner.nextLine();
		System.out.println("insert course name");
		String name = scanner.nextLine();
		
		Course course = new Course(code, name);
		return courseDAL.update(course);
	}

	@Override
	public int delete() {
		System.out.println("insert course code");
		String code = scanner.next();
		return courseDAL.delete(code);
	}

	@Override
	public List<Course> fillter() {
		System.out.println("insert string need search");
		String sequenceFilter = scanner.nextLine();
		return courseDAL.fillter(sequenceFilter);
	}
	
	@Override
	public void display(List<Course> list) {
		if(list == null || list.isEmpty()) {
			System.out.println("array null");
		} else {
			for (Course course : list) {
				System.out.println(course);
			}
		}
	}

	
	

}
