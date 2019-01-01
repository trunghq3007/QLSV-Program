/**
 * 
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import com.mysql.jdbc.Statement;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: handle connect to DBMS Version 1.0
 */
public class Dbconnection {
	/*
	 * // driver static final String DRIVER =
	 * "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // url static final String
	 * URL =
	 * "jdbc:sqlserver://localhost:1433;instance=SQLEXPRESS;databaseName=QLSV;integratedSecurity=true;";
	 * // userName static final String USER_NAME = ""; // passWord static final
	 * String PASSWORD = "";
	 */
	// MySQL
	// driver
	static final String DRIVER = "com.mysql.jdbc.Driver";
	// url
	static final String URL = "jdbc:mysql://192.168.10.51/qlsv";
	// userName
	static final String USER_NAME = "remote";
	// passWord
	static final String PASSWORD = "123456";

	/**
	 * Create by: HQTrung - CMC Create date: Nov 23, 2018 Modifier: HQTrung Modified
	 * date: Nov 23, 2018 Description: .... Version 1.0
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection connect() {
		// load driver
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// get connection instance
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void close(PreparedStatement preparedStatement, ResultSet resultSet, Statement statement)
			throws ClassNotFoundException, SQLException, Exception {
		Connection connect = (Connection) Dbconnection.connect();
		if ((resultSet != null) && (!resultSet.isClosed())) {
			resultSet.close();
		}
		if ((statement != null) && (!statement.isClosed())) {
			statement.close();
		}
		if ((preparedStatement != null) && (!preparedStatement.isClosed())) {
			preparedStatement.close();
		}
		if ((connect != null) && (!connect.isClosed())) {
			connect.close();
		}
	}
}