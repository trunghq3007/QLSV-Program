package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Faculty;
import utils.Constants;
import utils.DbConnection;

public class FacultyDAL implements BaseDAL<Faculty> {

	@Override
	public List<Faculty> getAll() throws SQLException {
		List<Faculty> list = new ArrayList<Faculty>();
		Connection conn = DbConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(Constants.Faculty.SELECT_ALL);

		while (result.next()) {
			Faculty faculty = new Faculty();
			faculty.setFacultyId(result.getString(Constants.Faculty.FACULTY_ID));
			faculty.setAddress(result.getString(Constants.Faculty.FACULTY_ADDRESS));
			faculty.setName(result.getString(Constants.Faculty.FACULTY_NAME));
			faculty.setPhoneNumber(result.getString(Constants.Faculty.FACULTY_PHONENUMBER));
			list.add(faculty);
		}

		result.close();
		stmt.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

	@Override
	public Faculty getByCode(String code) throws SQLException {
		Faculty faculty = new Faculty();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Faculty.SELECT_ONE);
		statement.setString(1, code);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			faculty.setFacultyId(result.getString(Constants.Faculty.FACULTY_ID));
			faculty.setAddress(result.getString(Constants.Faculty.FACULTY_ADDRESS));
			faculty.setName(result.getString(Constants.Faculty.FACULTY_NAME));
			faculty.setPhoneNumber(result.getString(Constants.Faculty.FACULTY_PHONENUMBER));
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return faculty;
	}

	@Override
	public int insert(Faculty object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Faculty.INSERT);
		statement.setString(1, object.getFacultyId());
		statement.setString(2, object.getName());
		statement.setString(3, object.getAddress());
		statement.setString(4, object.getPhoneNumber());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int update(Faculty object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Faculty.UPDATE);
		statement.setString(4, object.getFacultyId());
		statement.setString(1, object.getName());
		statement.setString(2, object.getAddress());
		statement.setString(3, object.getPhoneNumber());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int delete(String code) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Faculty.DELETE);
		statement.setString(1, code);
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public List<Faculty> fillter(String sequenceFilter) throws SQLException {
		List<Faculty> list = new ArrayList<Faculty>();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.Faculty.FILTER);
		sequenceFilter = "%" + sequenceFilter + "%";
		statement.setString(1, sequenceFilter);
		statement.setString(2, sequenceFilter);
		statement.setString(3, sequenceFilter);
		statement.setString(4, sequenceFilter);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			Faculty faculty = new Faculty();
			faculty.setFacultyId(result.getString(Constants.Faculty.FACULTY_ID));
			faculty.setAddress(result.getString(Constants.Faculty.FACULTY_ADDRESS));
			faculty.setName(result.getString(Constants.Faculty.FACULTY_NAME));
			faculty.setPhoneNumber(result.getString(Constants.Faculty.FACULTY_PHONENUMBER));
			list.add(faculty);
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

}
