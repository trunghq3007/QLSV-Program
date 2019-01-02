package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import utils.Constants;
import utils.DbConnection;

public class StudentDAL implements BaseDAL<Student> {

	public List<Student> getAll() {
		List<Student> list = new ArrayList<Student>();
		Connection conn = DbConnection.connect();
		try {
			PreparedStatement ppstmt = conn.prepareStatement(Constants.Student.SELECT_ALL);
			ResultSet rs = ppstmt.executeQuery();
			while (rs.next()) {
				Student std = new Student();
				std.setStudentCode(rs.getString(Constants.Student.STUDENT_CODE));
				std.setStudentName(rs.getString(Constants.Student.STUDENT_NAME));
				std.setGender(rs.getBoolean(Constants.Student.STUDENT_GENDER));
				std.setDateOfBirth(rs.getDate(Constants.Student.STUDENT_DATEBIRTH));
				std.setHometown(rs.getString(Constants.Student.STUDENT_ADDRESS));
				std.setClassCode(rs.getString(Constants.Class.CLASS_CODE));
				list.add(std);
			}
			rs.close();
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != conn) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public Student getByCode(String code) {
		Connection conn = DbConnection.connect();
		Student std = null;
		try {
			PreparedStatement ppstmt = conn.prepareStatement(Constants.Student.SELECT_STUDENT);
			ppstmt.setString(1, code);
			ResultSet rs = ppstmt.executeQuery();
			if (rs.next()) {
				std = new Student();
				std.setStudentCode(rs.getString(Constants.Student.STUDENT_CODE));
				std.setStudentName(rs.getString(Constants.Student.STUDENT_CODE));
				std.setGender(rs.getBoolean(Constants.Student.STUDENT_GENDER));
				std.setDateOfBirth(rs.getDate(Constants.Student.STUDENT_DATEBIRTH));
				std.setHometown(rs.getString(Constants.Student.STUDENT_ADDRESS));
				std.setClassCode(rs.getString(Constants.Class.CLASS_CODE));
			}
			rs.close();
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != conn) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return std;
	}

	public int insert(Student object) {
		Connection connect = DbConnection.connect();
		int rows = 0;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Student.INSERT_STUDENT);
			ppstmt.setString(1, object.getStudentCode());
			ppstmt.setString(2, object.getStudentName());
			ppstmt.setBoolean(3, object.getGender());
			ppstmt.setDate(4, object.getDateOfBirth());
			ppstmt.setString(5, object.getHometown());
			ppstmt.setString(6, object.getClassCode());
			rows = ppstmt.executeUpdate();
			System.out.println("rows inpacted: " + rows);
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public int update(Student object) {

		Connection connect = DbConnection.connect();
		int rows = 0;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Student.UPDATE_STUDENT);
			ppstmt.setString(1, object.getStudentName());
			ppstmt.setBoolean(2, object.getGender());
			ppstmt.setDate(3, object.getDateOfBirth());
			ppstmt.setString(4, object.getHometown());
			ppstmt.setString(5, object.getClassCode());
			ppstmt.setString(6, object.getStudentCode());
			rows = ppstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public int delete(String code) {

		Connection connect = DbConnection.connect();
		int rows = 0;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Student.DELETE_STUDENT);
			ppstmt.setString(1, code);
			rows = ppstmt.executeUpdate();
			System.out.println("rows inpacted: " + rows);
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	public List<Student> filter(String sequenceFilter) {
		Connection connect = DbConnection.connect();
		List<Student> list = new ArrayList<Student>();
		String findtext = "%" + sequenceFilter + "%";
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Student.FILTER_STUDENT);
			ppstmt.setString(1, findtext);
			ppstmt.setString(2, findtext);
			ppstmt.setString(3, findtext);
			ppstmt.setString(4, findtext);
			ppstmt.setString(5, findtext);
			ppstmt.setString(6, findtext);
			ResultSet rs = ppstmt.executeQuery();
			while (rs.next()) {
				Student std = new Student();
				std.setStudentCode(rs.getString(Constants.Student.STUDENT_CODE));
				std.setStudentName(rs.getString(Constants.Student.STUDENT_NAME));
				std.setGender(rs.getBoolean(Constants.Student.STUDENT_GENDER));
				std.setDateOfBirth(rs.getDate(Constants.Student.STUDENT_DATEBIRTH));
				std.setHometown(rs.getString(Constants.Student.STUDENT_ADDRESS));
				std.setClassCode(rs.getString(Constants.Class.CLASS_CODE));
				list.add(std);
			}
			rs.close();
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
