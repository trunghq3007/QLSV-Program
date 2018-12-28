package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import entity.Course;
import utils.Dbconnection;

public class CourseDAL implements BaseDAL<Course> {

    @Override
    public List<Course> getAll() {
	Connection connect = (Connection) Dbconnection.connect();
	List<Course> courses = new ArrayList<Course>();
	try {
	    // Statement creation
	    Statement statement = (Statement) connect.createStatement();
	    ResultSet resultSet = statement.executeQuery(utils.Constants.Course.SELECT_ALL);
	    while (resultSet.next()) {
		Course course = new Course();
		course.setCourseCode(resultSet.getString(utils.Constants.Course.COURSE_CODE));
		course.setCourseCode(resultSet.getString(utils.Constants.Course.COURSE_NAME));
		courses.add(course);
	    }
	} catch (SQLException ex) {
	    ex.printStackTrace();
	} finally {
	    
	}
	return courses;

    }

    @Override
    public Course getByCode(String code) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int insert(Course t) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int update(Course object) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int delete(String code) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public List<Course> filter(String sequenceFilter) {
	// TODO Auto-generated method stub
	return null;
    }

}
