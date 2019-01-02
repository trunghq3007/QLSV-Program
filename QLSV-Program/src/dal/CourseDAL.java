package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Statement;

import entity.Course;
import utils.Dbconnection;

public class CourseDAL implements BaseDAL<Course> {

    @Override
    public List<Course> getAll() throws Exception {
	Connection connect = null;
	Statement statement = null;
	List<Course> courses = new ArrayList<Course>();
	try {
	    connect = (Connection) Dbconnection.connect();
	    // Statement creation
	    statement = (Statement) connect.createStatement();
	    // ResultSet creation
	    ResultSet resultSet = statement.executeQuery(utils.Constants.Course.SELECT_ALL);
	    while (resultSet.next()) {
		Course course = new Course();
		course.setCourseCode(resultSet.getString(utils.Constants.Course.COURSE_CODE));
		course.setCourseName(resultSet.getString(utils.Constants.Course.COURSE_NAME));
		courses.add(course);
	    }
	    statement.close();
	    connect.close();
	} catch (SQLException ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(null, null, statement);
	}
	return courses;

    }

    @Override
    public Course getByCode(String code) throws Exception {
	PreparedStatement statement = null;
	Course returnValue = null;
	ResultSet resultSet = null;
	try {
	    Connection connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Course.GET_COURSE_BY_CODE;
	    statement = connect.prepareStatement(query);
	    statement.setString(1, code);
	    resultSet = statement.executeQuery();
	    while (resultSet.next()) {
		returnValue = new Course(resultSet.getString(utils.Constants.Course.COURSE_CODE),
			resultSet.getString(utils.Constants.Course.COURSE_NAME));
	    }

	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(statement, resultSet, null);
	}
	return returnValue;
    }

    @Override
    public int insert(Course course) throws Exception {
	Connection connect = null;
	PreparedStatement statement = null;
	int result = 0;
	try {
	    connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Course.INSERT_COURSE;
	    statement = connect.prepareStatement(query);
	    statement.setString(1, course.getCourseCode());
	    statement.setString(2, course.getCourseName());
	    result = statement.executeUpdate();
	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(statement, null, null);
	}
	return result;
    }

    @Override
    // Why have to input all the course but the code?
    public int update(Course course) throws Exception {
	int result = 0;
	Connection connect = null;
	PreparedStatement statement = null;
	try {
	    connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Course.UPDATE_COURSE;
	    statement = connect.prepareStatement(query);
	    statement.setString(2, course.getCourseCode());
	    statement.setString(1, course.getCourseName());
	    result = statement.executeUpdate();
	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(statement, null, null);
	}
	return result;
    }

    @Override
    public int delete(Course course) throws Exception {
	PreparedStatement statement = null;
	int result = 0;
	try {
	    Connection connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Course.DELETE_COURSE;
	    statement = connect.prepareStatement(query);
	    statement.setString(1, course.getCourseCode());
	    result = statement.executeUpdate();
	} catch (Exception ex) {
	    ex.printStackTrace();
	    result = -1;
	} finally {
	    Dbconnection.close(statement, null, null);
	}
	return result;
                

    }

    @Override
    public List<Course> filter(String sequenceFilter) throws Exception {
	List<Course> courses = new ArrayList<Course>();
	PreparedStatement statement = null;
	ResultSet resultSet = null;
	try {
	    // Statement creation
	    Connection connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Course.GET_COURSE_BY_FILTER;
	    statement = connect.prepareStatement(query);
	    sequenceFilter = "%" + sequenceFilter + "%";
	    statement.setString(1, sequenceFilter );
	    statement.setString(2, sequenceFilter);
	  
	    // ResultSet creation
	    resultSet = statement.executeQuery();
	    while (resultSet.next()) {
		Course course = new Course();
		course.setCourseCode(resultSet.getString(utils.Constants.Course.COURSE_CODE));
		course.setCourseName(resultSet.getString(utils.Constants.Course.COURSE_NAME));
		courses.add(course);
	    }

	} catch (SQLException ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(statement, null, null);
	}
	return courses;
    }

}
