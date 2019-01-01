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

import entity.Course;
import utils.Constants;
import utils.DbConnection;

/**
 * Create by: NVDiem
 * Create date: Jan 1, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 1, 2019
 * Description: ....
 * Version 1.0
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
				course.setCourseID(resultSet.getString(Constants.Course.COURSE_ID));
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
		return null;
	}

	@Override
	public int insert(Course object) {
		return 0;
	}

	@Override
	public int update(Course object) {
		return 0;
	}

	@Override
	public int delete(String code) {
		return 0;
	}

	@Override
	public List<Course> fillter(String sequenceFilter) {
		return null;
	}

}
