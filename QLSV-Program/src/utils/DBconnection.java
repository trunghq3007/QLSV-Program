/**
 * 
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author User
 *
 */
public class DBconnection {
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://192.168.10.51:3306/qlsv?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return conn;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
