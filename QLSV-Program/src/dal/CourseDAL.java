package dal;

import java.sql.PreparedStatement;
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
	} 
	return courses;

    }

    @Override
    public Course getByCode(String code) {
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
	    statement.close();
            connect.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
      
	return returnValue;
    }

    @Override
    public int insert(Course course) {
	PreparedStatement statement = null;
	int result = 0;
	try {
	    Connection connect = (Connection) Dbconnection.connect();
            String query = "insert into KhoaHoc (MaKhoaHoc, TenKhoaHoc) values(?,?)";
            statement = connect.prepareStatement(query);
            statement.setString(1, course.getCourseCode());
            statement.setString(2, course.getCourseName());
            statement.executeUpdate();
            result = statement.executeUpdate();
            statement.close();
            connect.close();
            
	}
	catch(Exception ex) {
	    ex.printStackTrace();
	}
	return result;
    }

    @Override
    public int update(Course object) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int delete(String code){
	PreparedStatement statement = null;
        try {
            Connection connect = (Connection) Dbconnection.connect();
            String query = utils.Constants.Course.COURSE_CODE;
            statement = connect.prepareStatement(query);
            statement.setString(1, code);
            statement.execute();
            connect.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	return 0; 
           
    }

    @Override
    public List<Course> filter(String sequenceFilter) {
	// TODO Auto-generated method stub
	return null;
    }

}
