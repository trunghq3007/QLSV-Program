package dal;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import entity.Student;
import utils.Dbconnection;
public class StudentDAL {
    private Connection connection;
    
    public List<Student> getStudents() throws Exception {
        List<Student> students = new ArrayList<>();
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            connection = (Connection) Dbconnection.connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * from" + utils.Constants.Students.STUDENT_CODE);
            while (resultSet.next()) {
                Student s = new Student(resultSet.getNString(utils.Constants.Students.STUDENT_CODE),
                	resultSet.getNString(utils.Constants.Students.STUDENT_NAME),
                	resultSet.getBoolean(utils.Constants.Students.STUDENT_SEX),
                	resultSet.getNString(utils.Constants.Students.STUDENT_DOB),
                	resultSet.getNString(utils.Constants.Students.STUDENT_HOMETOWN),
                	resultSet.getNString(utils.Constants.Students.STUDENT_CLASSCODE)
                	);
                students.add(s);
            }
            
            // private String studentCode;
        }
        catch (Exception ex) {
            
        }
        finally {
            
        }
	return students;
    }
}