package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Subject;
import utils.Constants;
import utils.DbConnection;

public class SubjectDAL implements BaseDAL<Subject> {

	@Override
	public List<Subject> getAll() throws SQLException {
		List<Subject> list = new ArrayList<Subject>();
		Connection conn = DbConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(Constants.Subject.SELECT_ALL);

		while (result.next()) {
			Subject subject = new Subject();
			subject.setSubjectId(result.getString(Constants.Subject.SUBJECT_ID));
			subject.setSubjectName(result.getString(Constants.Subject.SUBJECT_NAME));
			subject.setNumberOfCredit(result.getInt(Constants.Subject.NUMBER_OF_CREDIT));
			list.add(subject);
		}

		result.close();
		stmt.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

	@Override
	public Subject getByCode(String code) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Subject.SELECT_ONE);
		statement.setString(1, code);
		ResultSet result = statement.executeQuery();
		Subject subject = new Subject();
		while (result.next()) {
			subject.setSubjectId(result.getString(Constants.Subject.SUBJECT_ID));
			subject.setSubjectName(result.getString(Constants.Subject.SUBJECT_NAME));
			subject.setNumberOfCredit(result.getInt(Constants.Subject.NUMBER_OF_CREDIT));
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return subject;
	}

	@Override
	public int insert(Subject object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Subject.INSERT);
		statement.setString(1, object.getSubjectId());
		statement.setString(2, object.getSubjectName());
		statement.setInt(3, object.getNumberOfCredit());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int update(Subject object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Subject.UPDATE);
		statement.setString(3, object.getSubjectId());
		statement.setString(1, object.getSubjectName());
		statement.setInt(2, object.getNumberOfCredit());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int delete(String code) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Subject.DELETE);
		statement.setString(1, code);
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public List<Subject> fillter(String sequenceFilter) throws SQLException {
		List<Subject> list = new ArrayList<Subject>();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Subject.FILTER);
		sequenceFilter = "%" + sequenceFilter + "%";
		statement.setString(1, sequenceFilter);
		statement.setString(2, sequenceFilter);
		statement.setString(3, sequenceFilter);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			Subject subject = new Subject();
			subject.setSubjectId(result.getString(Constants.Subject.SUBJECT_ID));
			subject.setSubjectName(result.getString(Constants.Subject.SUBJECT_NAME));
			subject.setNumberOfCredit(result.getInt(Constants.Subject.NUMBER_OF_CREDIT));
			list.add(subject);
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

}
