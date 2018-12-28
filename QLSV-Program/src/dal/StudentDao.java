package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import utils.Dbconnection;


public class StudentDao {

    public List<Student> getEmployee(){
        Connection connection = Dbconnection.connect();
        List<Student> students = new ArrayList<Student>();
        Student student = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from sinhvien");
            
            
            while (resultSet.next()) {
                String studentId = resultSet.getString(1);
                String studentName = resultSet.getString(2);
                String gender = resultSet.getString(3);
                String birthDate = resultSet.getString(4);
                String homeTown = resultSet.getString(5);
                String classId = resultSet.getString(6);
                
                student = new Student(studentId, studentName, gender, birthDate, homeTown, classId);
                students.add(student);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeConnection(connection);
        }
        return students;
    }
}



