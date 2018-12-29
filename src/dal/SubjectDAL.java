package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Subject;
import utils.Constants;
import utils.DbConnection;

public class SubjectDAL implements BaseDAL<Subject>{

	@Override
	public List<Subject> getAll() {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		List<Subject> listSubject = new ArrayList<>();
		try {
			stmt = conn.prepareStatement(Constants.Subject.SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				Subject sub = new Subject();
				sub.setSubjectCode(rs.getString(Constants.Subject.SUBJECT_CODE));
				sub.setSubjectName(rs.getString(Constants.Subject.SUBJECT_NAME));
				sub.setNumberCredits(rs.getInt(Constants.Subject.NUMBER_CREDIT));
				
				listSubject.add(sub);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return listSubject;
	}

	@Override
	public Subject getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Subject sub) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Subject.INSERT_SUBJECT);
			stmt.setString(1, sub.getSubjectCode());
			stmt.setString(2, sub.getSubjectName());
			stmt.setInt(3, sub.getNumberCredits());
			
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
	public int update(Subject sub) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Subject.UPDATE_SUBJECT);
			stmt.setString(1, sub.getSubjectName());
			stmt.setInt(2, sub.getNumberCredits());
			stmt.setString(3, sub.getSubjectCode());
			
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
	public int delete(String name) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Subject.DELETE_SUBJECT);
			stmt.setString(1, name);
			
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
	public List<Subject> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}
}
