package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import entity.Course;
import utils.Constants;
import utils.Dbconnection;

/**
 * Create by: thanh - CMC
 * Create date: Dec 28, 2018
 * Modifier: thanh
 * Modified date: Dec 28, 2018
 * Description: 
 * Version 1.0
 */
public class CourseDAL implements BaseDAL<Course> {

        @Override
        public List<Course> getAll() {
                List<Course> listCourse = new ArrayList<Course>();
                Connection conn = Dbconnection.getConnection();
                try {
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(Constants.Course.SELECT_ALL);
                        while (rs.next()) {
                                Course course = new Course();
                                course.setCourseCode(rs.getString(Constants.Course.COURSE_CODE));
                                course.setCourseName(rs.getString(Constants.Course.COURSE_NAME));
                                listCourse.add(course);
                        }
                        stmt.close();
                        conn.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return listCourse;
        }

        @Override
        public Course getByCode(String code) {
                Connection conn = Dbconnection.getConnection();
                Course course = null;
                try {
                        PreparedStatement prs = (PreparedStatement) conn
                                        .prepareStatement(Constants.Course.GET_BY_CODE_COURSE);
                        prs.setString(1, code);
                        ResultSet rs = prs.executeQuery();
                        while (rs.next()) {
                                course = new Course();
                                course.setCourseCode(rs.getString(Constants.Course.COURSE_CODE));
                                course.setCourseName(rs.getString(Constants.Course.COURSE_NAME));
                        }
                        prs.close();
                        conn.close();
                } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                }
                return course;
        }

        @Override
        public int insert(Course object) {
                Connection conn = Dbconnection.getConnection();
                int re = 0;
                try {
                        PreparedStatement prs = (PreparedStatement) conn
                                        .prepareStatement(Constants.Course.INSERT_COURSE);

                        prs.setString(1, object.getCourseCode());
                        prs.setString(2, object.getCourseName());
                        re = prs.executeUpdate();
                        // close connection
                        prs.close();
                        conn.close();
                } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                        re = -1;
                }
                return re;
        }

        @Override
        public int udpate(Course object) {
                Connection conn = Dbconnection.getConnection();
                int re = 0;
                try {
                        PreparedStatement prs = (PreparedStatement) conn
                                        .prepareStatement(Constants.Course.UPDATE_COURSE);
                        prs.setString(1, object.getCourseName());
                        prs.setString(2, object.getCourseCode());
                        re = prs.executeUpdate();
                        prs.close();
                        conn.close();
                } catch (Exception e) {
                        e.printStackTrace();
                        re = -1;
                }
                return re;
        }

        @Override
        public int delete(Course object) {
                Connection conn = Dbconnection.getConnection();
                int re = 0;
                try {
                        PreparedStatement prs = (PreparedStatement) conn
                                        .prepareStatement(Constants.Course.DELETE_COURSE);
                        prs.setString(1, object.getCourseCode());
                        re = prs.executeUpdate();
                        prs.close();
                        conn.close();
                } catch (Exception e) {
                        e.printStackTrace();
                        re = -1;
                }
                return re;
        }

        @Override
        public List<Course> fillter(String sequnceFillter) {
                List<Course> listCourse = new ArrayList<Course>();
                Connection conn = Dbconnection.getConnection();
                try {
                        PreparedStatement prs = (PreparedStatement) conn
                                        .prepareStatement(Constants.Course.FILLTER_COURSE);
                        sequnceFillter = "%" + sequnceFillter + "%";
                        prs.setString(1, sequnceFillter);
                        prs.setString(2, sequnceFillter);
                        ResultSet rs = prs.executeQuery();
                        while (rs.next()) {
                                Course course = new Course();
                                course.setCourseCode(rs.getString(Constants.Course.COURSE_CODE));
                                course.setCourseName(rs.getString(Constants.Course.COURSE_NAME));
                                listCourse.add(course);
                        }
                        prs.close();
                        conn.close();
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return listCourse;
        }

}
