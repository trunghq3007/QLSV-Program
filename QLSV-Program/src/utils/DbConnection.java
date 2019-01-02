/**
 * 
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    /*
     * // driver static final String DRIVER =
     * "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // url static final
     * String URL =
     * "jdbc:sqlserver://localhost:1433;instance=SQLEXPRESS;databaseName=QLSV;integratedSecurity=true;";
     * // userName static final String USER_NAME = ""; // passWord static final
     * String PASSWORD = "";
     */

    // MySQL driver
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    // url
    static final String URL = "jdbc:mysql://localhost:3306/qlsv";
    // userName
    static final String USER_NAME = "root";
    // passWord
    static final String PASSWORD = "1234";

    /**
     * Create by: NVDIEM
     * Create date: Jan 2, 2019
     * Modifier: NVDIEM
     * Modified date: Jan 2, 2019
     * Description: ....
     * Version 1.0
     * @return
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
}
