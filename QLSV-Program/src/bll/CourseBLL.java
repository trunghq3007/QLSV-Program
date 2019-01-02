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
		return couresDAL.getByCode(code);
	}

	@Override
	public int insert(Course object) {
		return couresDAL.insert(object);
	}

	@Override
	public int udpate(Course object) {
		return couresDAL.udpate(object);
	}

	@Override
	public int delete(Course object) {
		return couresDAL.delete(object);
	}

	@Override
	public List<Course> fillter(String sequnceFillter) {
		return couresDAL.fillter(sequnceFillter);
	}

}
