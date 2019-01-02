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
import utils.Dbconnection;


/**
 * Create by: pvhao- CMC Create date: Dec 28, 2018 Modifier: pvhao Modified
 * date: Dec 28, 2018 Description: Version 1.0
 */
public class CourseDAL implements BaseDAL<Course> {

	public List<Course> getAll() {
		Connection connect = Dbconnection.connect();
		List<Course> courses = new ArrayList<Course>();

		try {
			// Statement creation
			Statement statement = connect.createStatement();
			// for retrieve data
			ResultSet resultSet = statement.executeQuery(Constants.Course.SELECT_ALL);
			while (resultSet.next()) {
				Course course = new Course();
				course.setCourseCode(resultSet.getString(Constants.Course.COURSE_CODE));
				course.setCourseName(resultSet.getString(Constants.Course.COURSE_NAME));
				courses.add(course);
			}
			statement.close();
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return courses;
	}

	public Course getByCode(String code) {
		Connection connect = Dbconnection.connect();
		Course course = new Course();
		try {
			// Statement creation
			PreparedStatement preparedStatement = connect.prepareStatement(Constants.Course.SELLECT_BY_CODE);
			preparedStatement.setString(1, code);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				course.setCourseCode(resultSet.getString(Constants.Course.COURSE_CODE));
				course.setCourseName(resultSet.getString(Constants.Course.COURSE_NAME));
				preparedStatement.close();
			}

			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return course;

	}

	public int insert(Course object)  {
		Connection connect = Dbconnection.connect();
		int resultQuery = 0;
		try {
			// Statement creation
			PreparedStatement preparedStatement = connect.prepareStatement(Constants.Course.INSERT);
			preparedStatement.setString(1, object.getCourseCode());
			preparedStatement.setString(2, object.getCourseName());
			resultQuery = preparedStatement.executeUpdate();
			connect.close();
		} catch (SQLException e) {
			//e.printStackTrace();
		}finally {
			try {
				connect.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
			//	e2.printStackTrace();
			}
		}
		return resultQuery;
	}

	public int update(Course object) {
		Connection connect = Dbconnection.connect();
		int resultQuery = 0;
		try {
			// Statement creation
			PreparedStatement preparedStatement = connect.prepareStatement(Constants.Course.UPDATE);
			preparedStatement.setString(1, object.getCourseName());
			preparedStatement.setString(2, object.getCourseCode());
			resultQuery = preparedStatement.executeUpdate();
			connect.close();
		} catch (SQLException e) {
			//e.printStackTrace();
		}finally {
			try {
				connect.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
			//	e2.printStackTrace();
			}
		}
		return resultQuery;
	}

	public int delete(String code) {
		Connection connect = Dbconnection.connect();
		int resultQuery = 0;
		try {
			// Statement creation
			PreparedStatement preparedStatement = connect.prepareStatement(Constants.Course.DELETE);
			preparedStatement.setString(1, code);
			resultQuery = preparedStatement.executeUpdate();
			connect.close();
		} catch (SQLException e) {
			//e.printStackTrace();
		}finally {
			try {
				connect.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
			//	e2.printStackTrace();
			}
		}
		return resultQuery;
	}

	public List<Course> fillter(String sequenceFilter) {
		return null;
	}

}
