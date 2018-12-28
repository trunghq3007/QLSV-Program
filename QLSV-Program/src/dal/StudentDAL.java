package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.Constants;
import com.mysql.jdbc.Connection;
import entity.Student;
import utils.Dbconnection;
public class StudentDAL implements BaseDAL<Student> {

    @Override
    public List<Student> getAll() {
	Connection connect = (Connection) Dbconnection.connect();
	List<Student> student = new ArrayList<Student>();
	try {
	    // Statement creation
	    Statement statement = (Statement) connect.createStatement();
	    ResultSet resultSet = statement.executeQuery(Constants.Course.SELECT_ALL);
	    while (resultSet.next()) {
		Student students = new Student();
		students.setStudentCode(resultSet.getString(Constants.Students.STUDENT_CODE));
		students.setStudentName(resultSet.getString(Constants.Students.STUDENT_NAME));
		students.setStudentSex(resultSet.getBoolean(Constants.Students.STUDENT_SEX));
		students.setDateOfBirth(resultSet.getString(Constants.Students.STUDENT_DOB));
		students.setHomeTown(resultSet.getString(Constants.Students.STUDENT_HOMETOWN));
		students.setClassCode(resultSet.getString(Constants.Students.STUDENT_CLASSCODE));
		student.add(students);
	    }
	    statement.close();
            connect.close();
	} catch (SQLException ex) {
	    ex.printStackTrace();
	} 
	return student;
    }

    @Override
    public Student getByCode(String code) {
	Connection connect = (Connection) Dbconnection.connect();

	return null;
    }

    @Override
    public int insert(Student t) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int update(Student object) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int delete(String code) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public List<Student> filter(String sequenceFilter) {
	// TODO Auto-generated method stub
	return null;
    }
    
}