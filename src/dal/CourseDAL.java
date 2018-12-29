/**
 * 
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Course;
import utils.Constants;
import utils.DbConnection;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: Version 1.0
 */
public class CourseDAL implements BaseDAL<Course> {

	@Override
	public List<Course> getAll() {

		Connection connect = DbConnection.connect();
		Statement statement = null;

		List<Course> courses = new ArrayList<Course>();

		try {
			// Statement creation
			statement = connect.createStatement();
			// for retrieve data
			ResultSet resultSet = statement.executeQuery(Constants.Course.SELECT_ALL);
			while (resultSet.next()) {
				Course course = new Course();
				course.setCourseCode(resultSet.getString(Constants.Course.COURSE_CODE));
				course.setCourseName(resultSet.getString(Constants.Course.COURSE_NAME));
				courses.add(course);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connect.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return courses;
	}

	@Override
	public Course getByCode(String code) {
		return null;
	}

	@Override
	public int insert(Course object) {
		Connection conn = DbConnection.connect();
		PreparedStatement statement = null;

		int status = 0;
		try {
			statement = conn.prepareStatement(Constants.Course.INSERT_COURSE);
			statement.setString(1, object.getCourseCode());
			statement.setString(2, object.getCourseName());

			status = statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				statement.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return status;
	}

	@Override
	public int update(Course object) {
		Connection conn = DbConnection.connect();
		PreparedStatement statement = null;
		
		int status = 0;
		try {
			statement = conn.prepareStatement(Constants.Course.UPDATE_COURSE);
			statement.setString(1, object.getCourseName());
			statement.setString(2, object.getCourseCode());
			
			status = statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				statement.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return status;
	}

	@Override
	public int delete(String nameCourse) {
		Connection conn = DbConnection.connect();
		PreparedStatement statement = null;
		
		int status = 0;
		try {
			statement = conn.prepareStatement(Constants.Course.DELETE_COURSE);
			statement.setString(1, nameCourse);
			
			status = statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				statement.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return status;
	}

	@Override
	public List<Course> fillter(String sequenceFilter) {
		return null;
	}

}
