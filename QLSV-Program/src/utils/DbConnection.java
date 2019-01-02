/**
 * 
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: handle connect to DBMS
 * Version 1.0
 */
public class DbConnection {
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
        static final String DRIVER = "com.mysql.cj.jdbc.Driver";
        // url
        static final String URL = "jdbc:mysql://localhost:3306/qlsv";
        // userName
        static final String USER_NAME = "user1";
        // passWord
        static final String PASSWORD = "123abc";

        /**
         * Create by: HQTrung - CMC
         * Create date: Nov 23, 2018
         * Modifier: HQTrung
         * Modified date: Nov 23, 2018
         * Description: ....
         * Version 1.0
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

}
