package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Mark;
import utils.Constants;
import utils.DbConnection;

public class MarkDAL {

	public List<Mark> getAll() throws SQLException {
		List<Mark> list = new ArrayList<Mark>();
		Connection conn = DbConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(Constants.Mark.SELECT_ALL);

		while (result.next()) {
			Mark mark = new Mark();
			mark.setStudentId(result.getString(Constants.Mark.STUDENT_ID));
			mark.setSubjectId(result.getString(Constants.Mark.SUBJECT_ID));
			mark.setSemester(result.getInt(Constants.Mark.MARK_SEMESTER));
			mark.setMark_1st(result.getFloat(Constants.Mark.MARK_1ST));
			mark.setMark_2nd(result.getFloat(Constants.Mark.MARK_2ND));
			list.add(mark);
		}

		result.close();
		stmt.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

	public Mark getByKey(String studentId, String subjectId) throws SQLException {
		Connection conn = DbConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(Constants.Mark.SELECT_ONE_BY_KEY);

		Mark mark = new Mark();
		while (result.next()) {
			mark.setStudentId(result.getString(Constants.Mark.STUDENT_ID));
			mark.setSubjectId(result.getString(Constants.Mark.SUBJECT_ID));
			mark.setSemester(result.getInt(Constants.Mark.MARK_SEMESTER));
			mark.setMark_1st(result.getFloat(Constants.Mark.MARK_1ST));
			mark.setMark_2nd(result.getFloat(Constants.Mark.MARK_2ND));
		}

		result.close();
		stmt.close();
		DbConnection.releaseConnection(conn);
		return mark;
	}

	public int insert(Mark object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Mark.INSERT);
		statement.setString(1, object.getStudentId());
		statement.setString(2, object.getSubjectId());
		statement.setInt(3, object.getSemester());
		statement.setFloat(4, object.getMark_1st());
		statement.setFloat(5, object.getMark_2nd());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	public int update(Mark object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Mark.UPDATE);
		statement.setString(4, object.getStudentId());
		statement.setString(5, object.getSubjectId());
		statement.setInt(1, object.getSemester());
		statement.setFloat(2, object.getMark_1st());
		statement.setFloat(3, object.getMark_2nd());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	public int deleteByKey(String studentId, String subjectId) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Mark.DELETE_BY_KEY);
		statement.setString(1, studentId);
		statement.setString(2, subjectId);
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	public int deleteByStudentId(String studentId) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Mark.DELETE_BY_STUDENT_ID);
		statement.setString(1, studentId);
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	public int deleteBySubjectId(String subjectId) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Mark.DELETE_BY_SUBJECT_ID);
		statement.setString(1, subjectId);
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	public List<Mark> fillter(String sequenceFilter) throws SQLException {
		List<Mark> list = new ArrayList<Mark>();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Course.FILTER);
		sequenceFilter = "%" + sequenceFilter + "%";
		statement.setString(1, sequenceFilter);
		statement.setString(2, sequenceFilter);
		statement.setString(3, sequenceFilter);
		statement.setString(4, sequenceFilter);
		statement.setString(5, sequenceFilter);
		ResultSet result = statement.executeQuery();

		while (result.next()) {
			Mark mark = new Mark();
			mark.setStudentId(result.getString(Constants.Mark.STUDENT_ID));
			mark.setSubjectId(result.getString(Constants.Mark.SUBJECT_ID));
			mark.setSemester(result.getInt(Constants.Mark.MARK_SEMESTER));
			mark.setMark_1st(result.getFloat(Constants.Mark.MARK_1ST));
			mark.setMark_2nd(result.getFloat(Constants.Mark.MARK_2ND));
			list.add(mark);
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

}
