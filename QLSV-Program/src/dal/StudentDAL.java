package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import utils.Constants;
import utils.Dbconnection;

public class StudentDAL implements BaseDAL<Student> {

    @Override
    public List<Student> getAll() {
        Connection connect = Dbconnection.connect();
        List<Student> listStudent = new ArrayList<Student>();

        try {
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(Constants.Student.SELECT_ALL);
            while (resultSet.next()) {
                Student student = new Student();
                student.setStudentID(resultSet.getString(Constants.Student.STUDENT_ID));
                student.setStudentName(resultSet.getString(Constants.Student.STUDENT_NAME));
                student.setGender(resultSet.getString(Constants.Student.STUDENT_GENDER));
                student.setBirthday(resultSet.getDate(Constants.Student.STUDENT_BIRTHDAY));
                student.setHomeTown(resultSet.getString(Constants.Student.STUDENT_HOMETOWN));
                student.setClassID(resultSet.getString(Constants.Student.STUDENT_CLASSID));
                listStudent.add(student);
            }
            // statement.close();
            // connect.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return listStudent;
    }

    @Override
    public Student getByCode(String studentID) {
        Connection connect = Dbconnection.connect();
        Student student = new Student();

        try {
            PreparedStatement statement = connect.prepareStatement("SELECT * FROM sinhvien WHERE MaSV = ?");
            statement.setString(1, studentID);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                student.setStudentID(resultSet.getString(Constants.Student.STUDENT_ID));
                student.setStudentName(resultSet.getString(Constants.Student.STUDENT_NAME));
                student.setGender(resultSet.getString(Constants.Student.STUDENT_GENDER));
                student.setBirthday(resultSet.getDate(Constants.Student.STUDENT_BIRTHDAY));
                student.setHomeTown(resultSet.getString(Constants.Student.STUDENT_HOMETOWN));
                student.setClassID(resultSet.getString(Constants.Student.STUDENT_CLASSID));
            }
            // statement.close();
            // connect.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return student;
    }

    @Override
    public int insert(Student student) {
        Connection connect = Dbconnection.connect();
        String sql = "insert into sinhvien Values(?, ?, ?, ?, ?, ?)";

        try {
            // connect.setAutoCommit(true);
            PreparedStatement prepare = connect.prepareStatement(sql);

            prepare.setString(1, student.getStudentID());
            prepare.setString(2, student.getStudentName());
            prepare.setString(3, student.getGender());
            prepare.setDate(4, (Date) student.getBirthday());
            prepare.setString(5, student.getHomeTown());
            prepare.setString(6, student.getClassID());
            prepare.executeUpdate();
            // connect.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        } finally {
            try {
                connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int update(Student object) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(Student object) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Student> filter(String sequencefilter) {
        // TODO Auto-generated method stub
        return null;
    }

}
