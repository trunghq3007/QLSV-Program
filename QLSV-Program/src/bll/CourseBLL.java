package bll;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dal.CourseDAL;
import entity.Course;
import utils.Constants;
import utils.Dbconnection;

/**
 * Create by: thanh - CMC
 * Create date: Dec 28, 2018
 * Modifier: thanh
 * Modified date: Dec 28, 2018
 * Description: 
 * Version 1.0
 */
public class CourseBLL implements BaseBLL<Course> {

	CourseDAL couresDAL;

	public CourseBLL() {
		couresDAL = new CourseDAL();
	}

	@Override
	public List<Course> getAll() {

		return couresDAL.getAll();
		//
	}

	@Override
	public Course getByCode(String code) {
		Course course = null;
		if(couresDAL.getByCode(code)!=null) {
			return couresDAL.getByCode(code);			
		}else {
			System.out.println("Record not exits!");
			return course;
		}
	}

	@Override
	public int insert(Course object) {
		String code = object.getCourseCode().toString();
		String name = object.getCourseName().toString();
		if (code != null && code.length() < 5 && name != null && name.length() < 20) {
			return couresDAL.insert(object);
		} else {
			return -1;
		}
	}

	@Override
	public int udpate(Course object) {
		if (couresDAL.getByCode(object.getCourseCode()) != null) {
			String code = object.getCourseCode().toString();
			String name = object.getCourseName().toString();
			if (code != null && code.length() < 5 && name != null && name.length() < 20) {
				return couresDAL.udpate(object);
			} else {
				return -1;
			}
		} else {
			System.out.println("Record not exits!");
			return -1;
		}
	}

	@Override
	public int delete(Course object) {
		if (couresDAL.getByCode(object.getCourseCode()) != null) {
			return couresDAL.delete(object);
		} else {
			System.out.println("Record not exits!");
			return -1;
		}
	}

	@Override
	public List<Course> fillter(String sequnceFillter) {
		return couresDAL.fillter(sequnceFillter);
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StringBuffer stringBuffer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StringBuilder stringBuilder() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Course Code\tCourse\n");
		List<Course> listCourse = new ArrayList<Course>();
		for (Course i : couresDAL.getAll()) {
			stringBuilder.append(i.getCourseCode() + "\t" + i.getCourseName() + "\n");
		}
		return stringBuilder;
	}

}
