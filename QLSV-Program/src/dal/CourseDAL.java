/**
 * 
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import entity.Course;
import utils.Constants;
import utils.DbConnection;

/**
 * Create by: minhanh - CMC Create date: Dec 28, 2018 Modifier: minhanh Modified
 * date: Dec 28, 2018 Description: Version 1.0
 */
public class CourseDAL implements BaseDAL<Course> {

	@Override
	public List<Course> getAll() {

		Connection connect = DbConnection.connect();
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

	@Override
	public Course getByCode(String code) {
		Course course = new Course();
		Connection connection = DbConnection.connect();
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection
					.prepareStatement(Constants.Course.SELECT_ONE);
			preparedStatement.setString(1, code);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				course.setCourseCode(resultSet.getString(Constants.Course.COURSE_CODE));
				course.setCourseName(resultSet.getString(Constants.Course.COURSE_NAME));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return course;
	}

	@Override
	public int insert(Course object) {
		Connection connection = DbConnection.connect();
		int executeUpdate = 0;
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection
					.prepareStatement(Constants.Course.INSERT_COURSE);
			preparedStatement.setString(1, object.getCourseCode());
			preparedStatement.setString(2, object.getCourseName());
			executeUpdate = preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return executeUpdate;
	}

	@Override
	public int update(Course object) {
		Connection connection = DbConnection.connect();
		int executeUpdate = -1;
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection
					.prepareStatement(Constants.Course.UPDATE_COURSE);
			preparedStatement.setString(1, object.getCourseName());
			preparedStatement.setString(2, object.getCourseCode());
			executeUpdate = preparedStatement.executeUpdate();
			connection.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return executeUpdate;
	}

	@Override
	public int delete(String code) {
		Connection connection = DbConnection.connect();
		int executeUpdate = -1;
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection
					.prepareStatement(Constants.Course.DELETE_COURSE);
			preparedStatement.setString(1, code);
			executeUpdate = preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return executeUpdate;
	}

	@Override
	public List<Course> fillter(String sequenceFilter) {
		sequenceFilter = "%" + sequenceFilter + "%";
		Connection connection = DbConnection.connect();
		List<Course> courses = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection
					.prepareStatement(Constants.Course.FILTER_COURSE);
			preparedStatement.setString(1, sequenceFilter);
			preparedStatement.setString(2, sequenceFilter);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Course course = new Course();
				course.setCourseCode(resultSet.getString(Constants.Course.COURSE_CODE));
				course.setCourseName(resultSet.getString(Constants.Course.COURSE_NAME));
				courses.add(course);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return courses;
	}

}
