/**
 * Project name: QLSV-Program 
 * File name: StudentDAL.java
 * Created by: Sanero
 * Created date: Dec 28, 2018
 * Created time: 2:25:38 PM
 */

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
import utils.DbConnection;

/**
 * @author a
 * Description: 
 */
public class StudentDAL implements BaseDAL<Student> {
	@Override
	public List<Student> getAll() throws SQLException {
		List<Student> students = new ArrayList<Student>();
		Connection conn = DbConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(Constants.Student.SELECT_ALL);

		while (result.next()) {
			Student student = new Student();
			student.setStudentId(result.getString(Constants.Student.STUDENT_ID));
			student.setClassId(result.getString(Constants.Student.CLASS_ID));
			student.setDateOfBirth(result.getDate(Constants.Student.STUDENT_DATEOFBIRTH));
			student.setGender(result.getBoolean(Constants.Student.STUDENT_GENDER));
			student.setHometown(result.getString(Constants.Student.STUDENT_HOMETOWN));
			student.setStudentName(result.getString(Constants.Student.STUDENT_NAME));
			students.add(student);
		}

		result.close();
		stmt.close();
		DbConnection.releaseConnection(conn);
		return students;
	}

	@Override
	public Student getByCode(String code) throws SQLException {
		Student student = new Student();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Student.SELECT_ONE);
		statement.setString(1, code);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			student.setStudentId(result.getString(Constants.Student.STUDENT_ID));
			student.setClassId(result.getString(Constants.Student.CLASS_ID));
			student.setDateOfBirth(result.getDate(Constants.Student.STUDENT_DATEOFBIRTH));
			student.setGender(result.getBoolean(Constants.Student.STUDENT_GENDER));
			student.setHometown(result.getString(Constants.Student.STUDENT_HOMETOWN));
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return student;
	}

	@Override
	public int insert(Student object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Student.INSERT);
		statement.setString(1, object.getStudentId());
		statement.setString(2, object.getStudentName());
		statement.setBoolean(3, object.isGender());
		statement.setDate(4, object.getDateOfBirth());
		statement.setString(5, object.getHometown());
		statement.setString(6, object.getClassId());

		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int update(Student object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Student.UPDATE);
		statement.setString(6, object.getStudentId());
		statement.setString(1, object.getStudentName());
		statement.setBoolean(2, object.isGender());
		statement.setDate(3, object.getDateOfBirth());
		statement.setString(4, object.getHometown());
		statement.setString(5, object.getClassId());

		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int delete(String code) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Student.DELETE);
		statement.setString(1, code);
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public List<Student> fillter(String sequenceFilter) throws SQLException {
		List<Student> students = new ArrayList<Student>();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Student.FILTER);
		sequenceFilter = "%" + sequenceFilter + "%";
		statement.setString(1, sequenceFilter);
		statement.setString(2, sequenceFilter);
		statement.setString(3, sequenceFilter);
		statement.setString(4, sequenceFilter);
		statement.setString(5, sequenceFilter);
		statement.setString(6, sequenceFilter);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			Student student = new Student();
			student.setStudentId(result.getString(Constants.Student.STUDENT_ID));
			student.setClassId(result.getString(Constants.Student.CLASS_ID));
			student.setDateOfBirth(result.getDate(Constants.Student.STUDENT_DATEOFBIRTH));
			student.setGender(result.getBoolean(Constants.Student.STUDENT_GENDER));
			student.setHometown(result.getString(Constants.Student.STUDENT_HOMETOWN));
			student.setStudentName(result.getString(Constants.Student.STUDENT_NAME));
			students.add(student);
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return students;
	}

	public List<Student> getListByClassId(String classId) throws SQLException {
		List<Student> students = new ArrayList<Student>();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Student.SELECT_BY_CLASS_ID);
		statement.setString(1, classId);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			Student student = new Student();
			student.setStudentId(result.getString(Constants.Student.STUDENT_ID));
			student.setClassId(result.getString(Constants.Student.CLASS_ID));
			student.setDateOfBirth(result.getDate(Constants.Student.STUDENT_DATEOFBIRTH));
			student.setGender(result.getBoolean(Constants.Student.STUDENT_GENDER));
			student.setHometown(result.getString(Constants.Student.STUDENT_HOMETOWN));
			student.setStudentName(result.getString(Constants.Student.STUDENT_NAME));
			students.add(student);
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return students;
	}
}
