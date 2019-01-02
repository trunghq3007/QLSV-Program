package dal;

import java.sql.CallableStatement;
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

public class CourseDal implements BaseDAL<Course> {

    @Override
    public List<Course> getAll() {
        Connection connection = Dbconnection.connect();
        Statement statement = null;
        ResultSet resultSet = null;
        
        List<Course> courses = new ArrayList<>();
        Course course = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(Constants.Course.SELECT_ALL);
            
            while(resultSet.next()) {
                String courseCode = resultSet.getString(1);
                String courseName = resultSet.getString(2);
                course = new Course(courseCode, courseName);
                
                courses.add(course);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closeStatement(statement);
            Dbconnection.closeConnection(connection);
        }
        
        return courses;
    }

    @Override
    public Course getByCode(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        Course course = null;
        try {
            prepared = connection.prepareStatement(Constants.Course.GET_BY_CODE);
            prepared.setString(1, code);
            resultSet = prepared.executeQuery();
            
            if(resultSet.next()) {
                String courseName = resultSet.getString(2);
                course = new Course(code, courseName);
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return course;
    }

    @Override
    public int insert(Course object) {
        Connection connection = Dbconnection.connect();
        CallableStatement callable = null;
        int result = 0;
        try {
            callable = connection.prepareCall(Constants.Course.ADD_COURSE);
            callable.setString(1, object.getCourseCode());
            callable.setString(2, object.getCourseName());
            result = callable.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeCallable(callable);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    @Override
    public int update(Course object) {
        Connection connection = Dbconnection.connect();
        CallableStatement callable = null;
        int result = 0;
        
        try {
            callable = connection.prepareCall(Constants.Course.UPDATE_COURSE);
            callable.setString(1, object.getCourseName());
            callable.setString(2, object.getCourseCode());
            result = callable.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeCallable(callable);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    @Override
    public int delete(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        int result = 0;
        
        try {
            prepared = connection.prepareStatement(Constants.Course.DELETE_COURSE);
            prepared.setString(1, code);
            result = prepared.executeUpdate(); //ham can thiep, lam thay doi du lieu phai goi update k phai la goi excute query
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result = -1;
        } finally {
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    @Override
    public List<Course> fillter(String sequenceFilter) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        List<Course> list = new ArrayList<>();
        Course course = null;
        try {
            prepared = connection.prepareStatement(Constants.Course.SEARCH);
            prepared.setString(1, "%" + sequenceFilter + "%");
            resultSet = prepared.executeQuery();
            
            while(resultSet.next()) {
                String courseCode = resultSet.getString(1);
                String courseName = resultSet.getString(2);
                course = new Course(courseCode, courseName);
                
                list.add(course);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return list;
    }

    @Override
    public String show() {
        List<Course> courses = getAll();
        String stringData = "";
        
        for (Course course : courses) {
            stringData += course.getCourseCode() + "\t" + course.getCourseName() + "\t";
       
        }
        return stringData;
    }

    @Override
    public StringBuilder showBuilder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StringBuffer showBuffer() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
