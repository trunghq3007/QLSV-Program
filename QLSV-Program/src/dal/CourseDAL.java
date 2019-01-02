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
import java.util.LinkedList;
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
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return courses;
	}

	@Override
	public Course getByCode(String code) {
		Connection connect = DbConnection.connect();
		Course course = null;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Course.SELECT_COURSE);
			ppstmt.setString(1, code);
			ResultSet rs = ppstmt.executeQuery();
			if (rs.next()) {
				course = new Course();
				course.setCourseCode(rs.getString(Constants.Course.COURSE_CODE));
				course.setCourseName(rs.getString(Constants.Course.COURSE_NAME));
			}
			rs.close();
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return course;
	}

	@Override
	public int insert(Course object) {
		Connection connect = DbConnection.connect();
		int rows = 0;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Course.INSERT_COURSE);
			ppstmt.setString(1, object.getCourseCode());
			ppstmt.setString(2, object.getCourseName());
			rows = ppstmt.executeUpdate();
			System.out.println("rows inpacted: " + rows);
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	@Override
	public int update(Course object) {
		Connection connect = DbConnection.connect();
		int rows = 0;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Course.UPDATE_COURSE);
			ppstmt.setString(1, object.getCourseName());
			ppstmt.setString(2, object.getCourseCode());
			rows = ppstmt.executeUpdate();
			System.out.println("rows inpacted: " + rows);
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	@Override
	public int delete(String code) {
		Connection connect = DbConnection.connect();
		int rows = 0;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Course.DELETE_COURSE);
			ppstmt.setString(1, code);
			rows = ppstmt.executeUpdate();
			System.out.println("rows inpacted: " + rows);
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	@Override
	public List<Course> filter(String sequenceFilter) {

		Connection connect = DbConnection.connect();
		List<Course> list = new ArrayList<Course>();
		String findtext = "%" + sequenceFilter + "%";
		System.out.println(findtext);
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Course.FILTER_COURSE);
			ppstmt.setString(1, findtext);
			ppstmt.setString(2, findtext);
			ResultSet resultSet = ppstmt.executeQuery();

			while (resultSet.next()) {
				Course course = new Course();
				course.setCourseCode(resultSet.getString(Constants.Course.COURSE_CODE));
				course.setCourseName(resultSet.getString(Constants.Course.COURSE_NAME));
				list.add(course);
			}
			resultSet.close();
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
