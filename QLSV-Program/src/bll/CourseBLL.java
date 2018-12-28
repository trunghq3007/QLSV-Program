package bll;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	}

	@Override
	public Course getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Course object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int udpate(Course object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Course object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Course> fillter(String sequnceFillter) {
		// TODO Auto-generated method stub
		return null;
	}

}
