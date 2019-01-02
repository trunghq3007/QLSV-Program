package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import utils.Constants;
import utils.Dbconnection;

public class StudentDal implements BaseDAL<Student> {

    /* (non-Javadoc)
     * @see dal.BaseDAL#getAll()
     */
    @Override
    public List<Student> getAll() {
        Connection connection = Dbconnection.connect();
        Statement statement = null;
        ResultSet resultSet = null;

        List<Student> list = new ArrayList<>();
        Student student = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(Constants.Student.SELECT_ALL);

            while (resultSet.next()) {
                String studentCode = resultSet.getString(1);
                String studentName = resultSet.getString(2);
                boolean checkGender = resultSet.getBoolean(3);
                String dateOfBirth = resultSet.getString(4);
                String hometown = resultSet.getString(5);
                String classCode = resultSet.getString(6);

                String gender = checkGender ? "male" : "female";
                student = new Student(studentCode, studentName, gender, dateOfBirth, hometown, classCode);
                list.add(student);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closeStatement(statement);
            Dbconnection.closeConnection(connection);
        }

        return list;
    }

    /* (non-Javadoc)
     * @see dal.BaseDAL#getByCode(java.lang.String)
     */
    @Override
    public Student getByCode(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;

        Student student = null;

        try {
            prepared = connection.prepareStatement(Constants.Student.GET_BY_CODE);
            prepared.setString(1, code);
            resultSet = prepared.executeQuery();

            if (resultSet.next()) {
                String studentCode = resultSet.getString(1);
                String studentName = resultSet.getString(2);
                boolean checkGender = resultSet.getBoolean(3);
                String dateOfBirth = resultSet.getString(4);
                String hometown = resultSet.getString(5);
                String classCode = resultSet.getString(6);

                String gender = checkGender ? "male" : "female";
                student = new Student(studentCode, studentName, gender, dateOfBirth, hometown, classCode);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }

        return student;
    }

    /* (non-Javadoc)
     * @see dal.BaseDAL#insert(java.lang.Object)
     */
    @Override
    public int insert(Student object) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;

        int result = 0;

        try {
            prepared = connection.prepareStatement(Constants.Student.ADD_ALL);
            prepared.setString(1, object.getStudentCode());
            prepared.setString(2, object.getStudentName());
            boolean checkGender = object.getGender() == "male" ? true : false;
            prepared.setBoolean(3, checkGender);
            prepared.setString(4, object.getDateOfBirth());
            prepared.setString(5, object.getHometown());
            prepared.setString(6, object.getClassCode());

            result = prepared.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    /* (non-Javadoc)
     * @see dal.BaseDAL#update(java.lang.Object)
     */
    @Override
    public int update(Student object) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;

        int result = 0;

        try {
            prepared = connection.prepareStatement(Constants.Student.UPDATE);
            prepared.setString(6, object.getStudentCode());
            prepared.setString(1, object.getStudentName());
            boolean checkGender = object.getGender() == "male" ? true : false;
            prepared.setBoolean(2, checkGender);
            prepared.setString(3, object.getDateOfBirth());
            prepared.setString(4, object.getHometown());
            prepared.setString(5, object.getClassCode());

            result = prepared.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    /* (non-Javadoc)
     * @see dal.BaseDAL#delete(java.lang.String)
     */
    @Override
    public int delete(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;

        int result = 0;

        try {
            prepared = connection.prepareStatement(Constants.Student.DELETE);
            prepared.setString(1, code);

            result = prepared.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    /* (non-Javadoc)
     * @see dal.BaseDAL#fillter(java.lang.String)
     */
    @Override
    public List<Student> fillter(String sequenceFilter) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;

        List<Student> list = new ArrayList<>();
        Student student = null;
        
        try {
            prepared = connection.prepareStatement(Constants.Student.SEARCH);
            prepared.setString(1, "%" + sequenceFilter +"%");
            resultSet = prepared.executeQuery();
            
            while (resultSet.next()) {
                String studentCode = resultSet.getString(1);
                String studentName = resultSet.getString(2);
                boolean checkGender = resultSet.getBoolean(3);
                String dateOfBirth = resultSet.getString(4);
                String hometown = resultSet.getString(5);
                String classCode = resultSet.getString(6);

                String gender = checkGender ? "male" : "female";
                student = new Student(studentCode, studentName, gender, dateOfBirth, hometown, classCode);
                list.add(student);
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

}
