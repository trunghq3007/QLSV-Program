/**
 * 
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: handle connect to DBMS
 * Version 1.0
 */
public class Dbconnection {
	private static String DB_URL = "jdbc:mysql://192.168.10.51:3306/qlsv";
	private static String USER_NAME = "remote";
	private static String PASSWORD = "123456"; 
//	private static String DB_URL = "jdbc:mysql://localhost:3306/day3_sqllop";
//	private static String USER_NAME = "root";
//	private static String PASSWORD = "root"; 

//	public static void main(String[] args) {
//		try {
//			// connnect to database 'testdb'
//			Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
//			// crate statement
//			Statement stmt = conn.createStatement();
//			// get data from table 'student'
//			ResultSet rs = stmt.executeQuery("select * from SinhVien");
//			// show data
//			while (rs.next()) {
//				System.out.println(rs.getString(1));
//			}
//			// close connection
//			conn.close();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//
//	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("connect successfully!");
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}

}
