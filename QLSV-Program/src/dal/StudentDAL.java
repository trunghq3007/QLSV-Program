package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Statement;

import entity.Student;
import utils.Dbconnection;

public class StudentDAL implements BaseDAL<Student> {

    @Override
    public List<Student> getAll() throws Exception {
	Connection connect = null;
	Statement statement = null;
	List<Student> students = new ArrayList<Student>();
	try {
	    connect = (Connection) Dbconnection.connect();
	    // Statement creation
	    statement = (Statement) connect.createStatement();
	    // ResultSet creation
	    ResultSet resultSet = statement.executeQuery(utils.Constants.Students.SELECT_ALL);
	    while (resultSet.next()) {
		Student student = new Student();
		student.setStudentCode(resultSet.getString(utils.Constants.Students.STUDENT_CODE));
		student.setStudentName(resultSet.getString(utils.Constants.Students.STUDENT_NAME));
		student.setStudentSex(resultSet.getBoolean(utils.Constants.Students.STUDENT_SEX));
		student.setDateOfBirth(resultSet.getString(utils.Constants.Students.STUDENT_DOB));
		student.setHomeTown(resultSet.getString(utils.Constants.Students.STUDENT_HOMETOWN));
		student.setClassCode(resultSet.getString(utils.Constants.Students.STUDENT_CLASSCODE));
		students.add(student);
	    }
	    statement.close();
	    connect.close();
	} catch (SQLException ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(null, null, statement);
	}
	return students;
    }

    @Override
    public Student getByCode(String code) throws Exception {
	PreparedStatement statement = null;
	Student returnValue = null;
	ResultSet resultSet = null;
	try {
	    Connection connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Students.GET_STUDENT_BY_CODE;
	    statement = connect.prepareStatement(query);
	    statement.setString(1, code);
	    resultSet = statement.executeQuery();
	    while (resultSet.next()) {
		returnValue = new Student(resultSet.getString(utils.Constants.Students.STUDENT_CODE),
			resultSet.getString(utils.Constants.Students.STUDENT_NAME),
			resultSet.getBoolean(utils.Constants.Students.STUDENT_SEX),
			resultSet.getString(utils.Constants.Students.STUDENT_DOB),
			resultSet.getString(utils.Constants.Students.STUDENT_HOMETOWN),
			resultSet.getString(utils.Constants.Students.STUDENT_CLASSCODE));
	    }

	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(statement, resultSet, null);
	}
	return returnValue;
    }

    @Override
    public int insert(Student student) throws Exception {
	Connection connect = null;
	PreparedStatement statement = null;
	int result = 0;
	try {
	    connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Students.INSERT_STUDENT;
	    statement = connect.prepareStatement(query);
	    statement.setString(1, student.getStudentCode());
	    statement.setString(2, student.getStudentName());
	    statement.setBoolean(3, student.isStudentSex());
	    statement.setString(4, student.getDateOfBirth());
	    statement.setString(5, student.getHomeTown());
	    statement.setString(6, student.getClassCode());
	    result = statement.executeUpdate();
	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(statement, null, null);
	}
	return result;

    }

    @Override
    public int update(Student student) throws Exception {
	int result = 0;
	Connection connect = null;
	PreparedStatement statement = null;
	try {
	    connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Students.UPDATE_STUDENT;
	    statement = connect.prepareStatement(query);
	    statement.setString(6, student.getStudentCode());
	    statement.setString(1, student.getStudentName());
	    statement.setBoolean(2, student.isStudentSex());
	    statement.setString(3, student.getDateOfBirth());
	    statement.setString(4, student.getHomeTown());
	    statement.setString(5, student.getClassCode());
	    result = statement.executeUpdate();
	} catch (Exception ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(statement, null, null);
	}
	return result;
    }

    @Override
    public int delete(Student student) throws Exception {
	PreparedStatement statement = null;
	int result = 0;
	try {
	    Connection connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Students.DELETE_STUDENT;
	    statement = connect.prepareStatement(query);
	    statement.setString(1, student.getStudentCode());
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
    public List<Student> filter(String sequenceFilter) throws Exception {
	List<Student> students = new ArrayList<Student>();
	PreparedStatement statement = null;
	ResultSet resultSet = null;
	try {
	    // Statement creation
	    Connection connect = (Connection) Dbconnection.connect();
	    String query = utils.Constants.Students.GET_STUDENT_BY_FILTER;
	    statement = connect.prepareStatement(query);
	    sequenceFilter = "%" + sequenceFilter + "%";
	    statement.setString(1, sequenceFilter);
	    statement.setString(2, sequenceFilter);
	    statement.setString(3, sequenceFilter);
	    statement.setString(4, sequenceFilter);
	    statement.setString(5, sequenceFilter);
	    statement.setString(6, sequenceFilter);
	    

	    // ResultSet creation
	    resultSet = statement.executeQuery();
	    while (resultSet.next()) {
		Student student = new Student();
		student.setStudentCode(resultSet.getString(utils.Constants.Students.STUDENT_CODE));
		student.setStudentName(resultSet.getString(utils.Constants.Students.STUDENT_NAME));
		student.setStudentSex(resultSet.getBoolean(utils.Constants.Students.STUDENT_SEX));
		student.setDateOfBirth(resultSet.getString(utils.Constants.Students.STUDENT_DOB));
		student.setHomeTown(resultSet.getString(utils.Constants.Students.STUDENT_HOMETOWN));
		student.setClassCode(resultSet.getString(utils.Constants.Students.STUDENT_CLASSCODE));
		
		students.add(student);

	    }

	} catch (SQLException ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(statement, null, null);
	}
	return students;
    }

}