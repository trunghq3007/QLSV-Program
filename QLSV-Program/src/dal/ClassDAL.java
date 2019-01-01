package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Class;
import entity.Point;
import utils.Constants;
import utils.DbConnection;

public class ClassDAL implements BaseDAL<Class>{

	@Override
	public List<Class> getAll() {
		 Connection connect = DbConnection.connect();
         List<Class> classs = new ArrayList<Class>();

         try {
                 // Statement creation
                 Statement statement = connect.createStatement();
                 // for retrieve data
                 ResultSet resultSet = statement.executeQuery(Constants.Class.SELECT_ALLLOP);
                 while (resultSet.next()) {
                	 Class classss = new Class();
                	 classss.setClassCode(resultSet.getString(Constants.Class.classCode));
                	 classss.setClassName(resultSet.getString(Constants.Class.className));
                	 classss.setFacultyName(resultSet.getString(Constants.Class.facultyName));
                         classss.setTrainingSystemCode(resultSet.getString(Constants.Class.trainingSystemCode));
                         classss.setCourseCode(resultSet.getString(Constants.Class.courseCode));
                         classs.add(classss);
                 }
                 statement.close();
                 connect.close();
         } catch (SQLException e) {
                 e.printStackTrace();
         }
         return classs;		
	}

	@Override
	public Class getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Class object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Class object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Class> fillter(String sequenceFillter) {
		// TODO Auto-generated method stub
		return null;
	}

}
