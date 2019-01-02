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

public class CourseDAL implements BaseDAL<Course> {

	@Override
	public List<Course> getAll() throws SQLException {
		List<Course> list = new ArrayList<Course>();
		Connection conn = DbConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(Constants.Course.SELECT_ALL);

		while (result.next()) {
			Course course = new Course();
			course.setCourseId(result.getString(Constants.Course.COURSE_ID));
			course.setCourseName(result.getString(Constants.Course.COURSE_NAME));
			list.add(course);
		}

		result.close();
		stmt.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

	@Override
	public Course getByCode(String code) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Course.SELECT_ONE);
		statement.setString(1, code);
		ResultSet result = statement.executeQuery();
		Course course = new Course();
		while (result.next()) {
			course.setCourseId(result.getString(Constants.Course.COURSE_ID));
			course.setCourseName(result.getString(Constants.Course.COURSE_NAME));
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return course;
	}

	@Override
	public int insert(Course object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Course.INSERT);
		statement.setString(1, object.getCourseId());
		statement.setString(2, object.getCourseName());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int update(Course object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Course.UPDATE);
		statement.setString(2, object.getCourseId());
		statement.setString(1, object.getCourseName());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int delete(String code) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Course.DELETE);
		statement.setString(1, code);
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public List<Course> fillter(String sequenceFilter) throws SQLException {
		List<Course> list = new ArrayList<Course>();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Course.FILTER);
		sequenceFilter = "%" + sequenceFilter + "%";
		statement.setString(1, sequenceFilter);
		statement.setString(2, sequenceFilter);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			Course course = new Course();
			course.setCourseId(result.getString(Constants.Course.COURSE_ID));
			course.setCourseName(result.getString(Constants.Course.COURSE_NAME));
			list.add(course);
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

}
