package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
public class CourseDAL implements BaseDAL<Course> {

	@Override
	public List<Course> getAll() {
		List<Course> listCourse = new ArrayList<Course>();
		Connection conn = Dbconnection.getConnection();
		try {
			Statement stmt = conn.createStatement();
			// get data from table 'student'
			ResultSet rs = stmt.executeQuery(Constants.Course.SELECT_ALL);
			// show data
			while (rs.next()) {
				Course course = new Course();
				course.setCourseCode(rs.getString(Constants.Course.COURSE_CODE));
				course.setCourseName(rs.getString(Constants.Course.COURSE_NAME));
				listCourse.add(course);
			}
			// close connection
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			// ex.printStackTrace();
		}
		return listCourse;
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
