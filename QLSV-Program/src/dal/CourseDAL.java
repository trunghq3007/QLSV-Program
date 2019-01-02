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
import java.util.Formatter;
import java.util.List;

import org.apache.log4j.Logger;

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
@SuppressWarnings("resource")
public class CourseDAL implements BaseDAL<Course> {
    private Logger logger;

    public CourseDAL() {
        logger = Logger.getLogger(CourseDAL.class);
    }

    public List<Course> getAll() {
        Connection connect = DbConnection.connect();
        List<Course> courses = new ArrayList<Course>();

        try {
            // Statement creation
            Statement statement = connect.createStatement();
            // for retrieve data
            ResultSet resultSet = statement
                    .executeQuery(Constants.Course.SELECT_ALL);
            while (resultSet.next()) {
                Course course = new Course();
                course.setCourseID(
                        resultSet.getString(Constants.Course.COURSE_ID));
                course.setCourseName(
                        resultSet.getString(Constants.Course.COURSE_NAME));
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
        Connection connection = DbConnection.connect();
        Course course = null;
        try {
            PreparedStatement statement = connection
                    .prepareStatement(Constants.Course.GET_COURSE_BY_ID);
            statement.setString(1, code);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                course = new Course(
                        resultSet.getString(Constants.Course.COURSE_ID),
                        resultSet.getString(Constants.Course.COURSE_NAME));
            }
            statement.close();
            connection.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return course;
    }

    public int insert(Course object) {
        Connection connection = DbConnection.connect();
        int success = 0;
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection
                    .prepareStatement(Constants.Course.INSERT_COURSE);
            preparedStatement.setString(1, object.getCourseID());
            preparedStatement.setString(2, object.getCourseName());
            success = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return success;
    }

    public int update(Course object) {
        int success = 0;
        Connection connection = DbConnection.connect();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection
                    .prepareStatement(Constants.Course.UPDATE_COURSE_BY_ID);
            preparedStatement.setString(1, object.getCourseName());
            preparedStatement.setString(2, object.getCourseID());
            success = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return success;
    }

    public int delete(String code) {
        int success = 0;
        Connection connection = DbConnection.connect();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection
                    .prepareStatement(Constants.Course.DELETE_COURSE_BY_ID);
            preparedStatement.setString(1, code);
            success = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return success;
    }

    public List<Course> fillter(String sequenceFilter) {
        List<Course> list = new ArrayList<Course>();
        Connection connection = DbConnection.connect();
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection
                    .prepareStatement(Constants.Course.COURSE_FILTER + "'%"
                            + sequenceFilter + "%'");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Course course = new Course(
                        resultSet.getString(Constants.Course.COURSE_ID),
                        resultSet.getString(Constants.Course.COURSE_NAME));
                list.add(course);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }

    public String formatInfo(Course object) {
        StringBuilder builder = new StringBuilder();
        Formatter formatter = new Formatter(builder);
        formatter.format("%-20s%-20s", object.getCourseID(),
                object.getCourseName());
        return builder.toString();
    }
}
