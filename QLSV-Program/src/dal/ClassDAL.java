package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Class;
import utils.Constants;
import utils.DbConnection;

public class ClassDAL implements BaseDAL<Class> {

	@Override
	public List<Class> getAll() throws SQLException {
		List<Class> list = new ArrayList<Class>();
		Connection conn = DbConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(Constants.Class.SELECT_ALL);

		while (result.next()) {
			Class c = new Class();
			c.setClassId(result.getString(Constants.Class.CLASS_ID));
			c.setClassName(result.getString(Constants.Class.CLASS_NAME));
			c.setCourseId(result.getString(Constants.Class.COURSE_ID));
			c.setFacultyId(result.getString(Constants.Class.FACULTY_ID));
			c.setFacultyId(result.getString(Constants.Class.FACULTY_ID));
			list.add(c);
		}

		result.close();
		stmt.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

	@Override
	public Class getByCode(String code) throws SQLException {
		Class c = new Class();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Class.SELECT_ONE);
		statement.setString(1, code);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			c.setClassId(result.getString(Constants.Class.CLASS_ID));
			c.setClassName(result.getString(Constants.Class.CLASS_NAME));
			c.setCourseId(result.getString(Constants.Class.COURSE_ID));
			c.setFacultyId(result.getString(Constants.Class.FACULTY_ID));
			c.setFacultyId(result.getString(Constants.Class.FACULTY_ID));
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return c;
	}

	@Override
	public int insert(Class object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Class.INSERT);
		statement.setString(1, object.getClassId());
		statement.setString(2, object.getClassName());
		statement.setString(3, object.getFacultyId());
		statement.setString(4, object.getTrainningTypeId());
		statement.setString(5, object.getCourseId());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int update(Class object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Class.UPDATE);
		statement.setString(5, object.getClassId());
		statement.setString(1, object.getClassName());
		statement.setString(2, object.getFacultyId());
		statement.setString(3, object.getTrainningTypeId());
		statement.setString(4, object.getCourseId());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int delete(String code) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Class.DELETE);
		statement.setString(1, code);
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public List<Class> fillter(String sequenceFilter) throws SQLException {
		List<Class> list = new ArrayList<Class>();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Class.FILTER);
		sequenceFilter = "%" + sequenceFilter + "%";
		statement.setString(1, sequenceFilter);
		statement.setString(2, sequenceFilter);
		statement.setString(3, sequenceFilter);
		statement.setString(4, sequenceFilter);
		statement.setString(5, sequenceFilter);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			Class c = new Class();
			c.setClassId(result.getString(Constants.Class.CLASS_ID));
			c.setClassName(result.getString(Constants.Class.CLASS_NAME));
			c.setCourseId(result.getString(Constants.Class.COURSE_ID));
			c.setFacultyId(result.getString(Constants.Class.FACULTY_ID));
			c.setFacultyId(result.getString(Constants.Class.FACULTY_ID));
			list.add(c);
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

}
