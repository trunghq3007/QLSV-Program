/**
 * 
 */
package utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        public static void closeConnection(Connection connection) {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        public static void closeResultSet(ResultSet resultSet) {
            if (resultSet != null) {
              try {
                resultSet.close();
              } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }

          }

          /**close statement.
           *
           */
          public static void closeStatement(Statement statement) {
            if (statement != null) {
              try {
                statement.close();
              } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }

          }
          public static void closeCallable(CallableStatement callable) {
              if (callable != null) {
                try {
                  callable.close();
                } catch (SQLException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
                }
              }
            }

            /** close prepared statement.
             * 
             */
            public static void closePrepared(PreparedStatement prepared) {
              // TODO Auto-generated method stub
              if (prepared != null) {
                try {
                  prepared.close();
                } catch (SQLException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
                }
              }
            }

}
