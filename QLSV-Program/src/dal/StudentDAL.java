package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Class;
import entity.Student;
import utils.Constants;
import utils.DbConnection;

public class StudentDAL implements BaseDAL<Student>{

	@Override
	public List<Student> getAll() {
		 Connection connect = DbConnection.connect();
         List<Student> students = new ArrayList<Student>();

         try {
                 // Statement creation
                 Statement statement = connect.createStatement();
                 // for retrieve data
                 ResultSet resultSet = statement.executeQuery(Constants.Student.SELECT_ALLSinhVien);
                 while (resultSet.next()) {
                	 Student student = new Student();
                	 student.setStudentCode(resultSet.getString(Constants.Student.studentCode));
                	 student.setStudentName(resultSet.getString(Constants.Student.studentName));
                	 student.setSex(resultSet.getBoolean(Constants.Student.sex));
                	 student.setBirthDay(resultSet.getString(Constants.Student.birthDay));
                	 student.setCountry(resultSet.getString(Constants.Student.country));
                	 student.setClassCode(resultSet.getString(Constants.Student.classCode));
                         students.add(student);
                 }
                 statement.close();
                 connect.close();
         } catch (SQLException e) {
                 e.printStackTrace();
         }
         return students;		
	}

	@Override
	public Student getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Student object) {
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
	public List<Student> fillter(String sequenceFillter) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
