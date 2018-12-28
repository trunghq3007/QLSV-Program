/**
 * Project name: QLSV-Program 
 * File name: StudentDAL.java
 * Created by: Sanero
 * Created date: Dec 28, 2018
 * Created time: 2:25:38 PM
 */

package dal;

import java.sql.Connection;
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
		Student student = new Student();
		while (result.next()) {
			student.setStudentId(result.getString(Constants.Student.STUDENT_ID));
			student.setClassId(result.getString(Constants.Student.CLASS_ID));
			student.setDateOfBirth(result.getDate(Constants.Student.STUDENT_DATEOFBIRTH));
			student.setGender(result.getBoolean(Constants.Student.STUDENT_GENDER));
			student.setHometown(result.getString(Constants.Student.STUDENT_HOMETOWN));
		}

		result.close();
		stmt.close();
		DbConnection.releaseConnection(conn);
		return students;
	}

	@Override
	public Student getByCode(String code) throws SQLException {
		return null;
	}

	@Override
	public int insert(Student object) throws SQLException {
		return 0;
	}

	@Override
	public int update(Student object) throws SQLException {
		return 0;
	}

	@Override
	public int delete(String code) throws SQLException {
		return 0;
	}

	@Override
	public List<Student> fillter(String sequenceFilter) throws SQLException {
		return null;
	}

}
