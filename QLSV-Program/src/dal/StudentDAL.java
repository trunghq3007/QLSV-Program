package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import entity.Class;
import entity.Student;
import utils.Constants;
import utils.DbConnection;

public class StudentDAL implements BaseDAL<Student> {

    @Override
    public List<Student> getAll() {
        Connection connect = DbConnection.connect();
        List<Student> students = new ArrayList<Student>();

        try {
            // Statement creation
            Statement statement = connect.createStatement();
            // for retrieve data
            ResultSet resultSet = statement.executeQuery(Constants.Student.SELECT_ALLSinhVien);
            while (resultSet.next()) {
                Student student = new Student();
                student.setStudentCode(resultSet.getString(Constants.Student.studentCode));
                student.setStudentName(resultSet.getString(Constants.Student.studentName));
                student.setSex(resultSet.getBoolean(Constants.Student.sex));
                student.setBirthDay(resultSet.getString(Constants.Student.birthDay));
                student.setCountry(resultSet.getString(Constants.Student.country));
                student.setClassCode(resultSet.getString(Constants.Student.classCode));
                students.add(student);
            }
            statement.close();
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public Student getByCode(String code) {
        Connection connect = DbConnection.connect();

        try {

            // Statement creation
            Statement statement = connect.createStatement();
            // for retrieve data
            ResultSet resultSet = statement.executeQuery(Constants.Student.SELECT_ONESinhVien + " = " + code);

            while (resultSet.next()) {
                Student student = new Student();
                student.setStudentCode(resultSet.getString(Constants.Student.studentCode));
                student.setStudentName(resultSet.getString(Constants.Student.studentName));
                student.setSex(resultSet.getBoolean(Constants.Student.sex));
                student.setBirthDay(resultSet.getString(Constants.Student.birthDay));
                student.setCountry(resultSet.getString(Constants.Student.country));
                student.setClassCode(resultSet.getString(Constants.Student.classCode));
                return student;
            }
            statement.close();
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insert(Student object) {
        // insert data base
        Connection connection = DbConnection.connect();
        int success = -1;
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection
                    .prepareStatement(Constants.Student.INSERT_SinhVien);
            preparedStatement.setString(1, object.getStudentCode());
            preparedStatement.setString(2, object.getStudentName());
            preparedStatement.setBoolean(3, object.getSex());
            preparedStatement.setString(4, object.getBirthDay());
            preparedStatement.setString(5, object.getCountry());
            preparedStatement.setString(6, object.getClassCode());
            success = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return success;
    }

    @Override
    public int update(Student object) {
        // update data
        Connection connection = DbConnection.connect();
        int success = -1;
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection
                    .prepareStatement(Constants.Student.UPDATE_SinhVien);
            preparedStatement.setString(1, object.getStudentCode());
            preparedStatement.setString(2, object.getStudentName());
            preparedStatement.setBoolean(3, object.getSex());
            preparedStatement.setString(4, object.getBirthDay());
            preparedStatement.setString(5, object.getCountry());
            preparedStatement.setString(6, object.getClassCode());
            success = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return success;
    }

    @Override
    public int delete(String code) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Student> fillter(String sequenceFillter) {
        // TODO Auto-generated method stub
        return null;
    }

}
