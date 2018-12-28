package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author a
 * Description: Get SQL connection 
 */
public class Dbconnection {
	// MySQL
	// driver
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	// URl
	public static final String DB_URL = "jdbc:mysql://192.168.10.51:3306/qlsv";
	// User
	public static final String USER = "remote";
	// Password
	public static final String PASS = "123456";

	/**
	 * Get mysql connection
	 *
	 * @return mySQL Connection
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			// Register JDBC driver
			Class.forName(JDBC_DRIVER);
			// Get Connection
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return conn;
	}

	/**
	 * Release sql connection
	 *
	 * @param conn SQL Connection
	 */
	public static void releaseConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		if (getConnection() != null)
			System.out.println("Success");
		Connection conn = getConnection();

		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery("select * from Diem");
//	            while(result.next()){
//	                System.out.println(result.getString(1));
//	            }

			ResultSetMetaData metaData = result.getMetaData();
			for (int i = 0; i < metaData.getColumnCount(); i++) {
				System.out.println(metaData.getColumnName(i + 1));
			}

			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		releaseConnection(conn);
	}

}
