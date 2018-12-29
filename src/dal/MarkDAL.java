package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Mark;
import utils.Constants;
import utils.DbConnection;

public class MarkDAL implements BaseDAL<Mark>{

	@Override
	public List<Mark> getAll() {
		Connection conn = DbConnection.connect();
		Statement stmt= null;
		ResultSet rs = null;
		
		List<Mark> listMark = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(Constants.Mark.SELECT_ALL);
			while(rs.next()) {
				Mark mark = new Mark();
				mark.setStudentCode(rs.getString(Constants.Mark.STUDENT_CODE));
				mark.setSubjectCode(rs.getString(Constants.Mark.SUBJECT_CODE));
				mark.setSemester(rs.getInt(Constants.Mark.SEMESTER));
				mark.setFirstMark(rs.getFloat(Constants.Mark.MARK_FIRST));
				mark.setSecondMark(rs.getFloat(Constants.Mark.MARK_SECONDE));
				
				listMark.add(mark);
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
		return listMark;
	}

	@Override
	public Mark getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Mark mark) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Mark.INSERT_DEPT);
			stmt.setString(1, mark.getStudentCode());
			stmt.setString(2, mark.getSubjectCode());
			stmt.setInt(3, mark.getSemester());
			stmt.setFloat(4, mark.getFirstMark());
			stmt.setFloat(5, mark.getSecondMark());
			
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
	public int update(Mark mark) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Mark.UPDATE_DEPT);
			stmt.setString(5, mark.getStudentCode());
			stmt.setString(1, mark.getSubjectCode());
			stmt.setInt(2, mark.getSemester());
			stmt.setFloat(3, mark.getFirstMark());
			stmt.setFloat(4, mark.getSecondMark());
			
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
	public int delete(String MaSV) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Mark.DELETE_DEPT);
			stmt.setString(1, MaSV);
			
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
	public List<Mark> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
