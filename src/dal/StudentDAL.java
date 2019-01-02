package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Statement;

import entity.Student;
import utils.Constants;
import utils.DbConnection;

public class StudentDAL implements BaseDAL<Student>{

	@Override
	public List<Student> getAll() {
		Connection conn = DbConnection.connect();
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Student> listStudent = new ArrayList<Student>();
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(Constants.Student.SELECT_ALL);
			while(rs.next()) {
				Student st = new Student();
				st.setStudentCode(rs.getString(1));
				st.setStudentName(rs.getString(2));
				st.setGender(rs.getByte(3));
				st.setDateOfBirth(rs.getString(4));
				st.setHometown(rs.getString(5));
				st.setClassCode(rs.getString(6));
				
				listStudent.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.commit();
				conn.setAutoCommit(true);
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return listStudent;
	}

	@Override
	public Student getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Student st) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Student.INSERT_STUDENT);
			stmt.setString(1, st.getStudentCode());
			stmt.setString(2, st.getStudentName());
			byte gender = st.getGender();
			stmt.setByte(3, gender);
			stmt.setString(4, st.getDateOfBirth());
			stmt.setString(5, st.getHometown());
			stmt.setString(6, st.getClassCode());
			
			status = stmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return status;
	}

	@Override
	public int update(Student st) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Student.UPDATE_STUDENT);
			stmt.setString(1, st.getStudentName());
			stmt.setByte(2, st.getGender());
			stmt.setString(3, st.getDateOfBirth());
			stmt.setString(4, st.getHometown());
			stmt.setString(5, st.getClassCode());
			stmt.setString(6, st.getStudentCode());
			
			status = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return status;
	}

	@Override
	public int delete(String nameStudent) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Student.DELETE_STUDENT);
			stmt.setString(1, nameStudent);
			
			status = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return status;
	}

	@Override
	public List<Student> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
