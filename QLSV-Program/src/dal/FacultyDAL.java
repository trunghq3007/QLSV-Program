package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Faculty;
import entity.Point;
import utils.Constants;
import utils.DbConnection;

public class FacultyDAL implements BaseDAL<Faculty>{

	@Override
	public List<Faculty> getAll() {
		 Connection connect = DbConnection.connect();
         List<Faculty> facultys = new ArrayList<Faculty>();

         try {
                 // Statement creation
                 Statement statement = connect.createStatement();
                 // for retrieve data
                 ResultSet resultSet = statement.executeQuery(Constants.Faculty.SELECT_ALLKHOA);
                 while (resultSet.next()) {
                	 Faculty faculty = new Faculty();
                	 faculty.setFacultyCode(resultSet.getString(Constants.Faculty.facultyCode));
                	 faculty.setFaultyName(resultSet.getString(Constants.Faculty.faultyName));
                	 faculty.setAddress(resultSet.getString(Constants.Faculty.address));
                	 faculty.setPhone(resultSet.getInt(Constants.Faculty.phone));
                	 facultys.add(faculty);
                 }
                 statement.close();
                 connect.close();
         } catch (SQLException e) {
                 e.printStackTrace();
         }
         return facultys;	
	}

	@Override
	public Faculty getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Faculty object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Faculty object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Faculty> fillter(String sequenceFillter) {
		// TODO Auto-generated method stub
		return null;
	}

}
