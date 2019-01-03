package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import entity.Class;
import utils.Dbconnection;

public class ClassDAL implements BaseDAL<Class>{

    @Override
    public List<Class> getAll() throws Exception {
	Connection connect = null;
	Statement statement = null;
	List<Class> classes = new ArrayList<Class>();
	try {
	    connect = (Connection) Dbconnection.connect();
	    // Statement creation
	    statement = (Statement) connect.createStatement();
	    // ResultSet creation
	    ResultSet resultSet = statement.executeQuery(utils.Constants.Class.SELECT_ALL);
	    while (resultSet.next()) {
		Class classs = new Class();
		
		classs.setClassCode(resultSet.getString(utils.Constants.Class.CLASS_CODE));
		classs.setClassName(resultSet.getString(utils.Constants.Class.CLASS_NAME));
		classs.setCourseCode(resultSet.getString(utils.Constants.Class.COURSE_CODE));
		classs.setFacultyCode(resultSet.getString(utils.Constants.Class.FACULTY_CODE));
		classs.setTsCode(resultSet.getString(utils.Constants.Class.TS_CODE));
	
		classes.add(classs);
	    }
	    statement.close();
	    connect.close();
	} catch (SQLException ex) {
	    ex.printStackTrace();
	} finally {
	    Dbconnection.close(null, null, statement);
	}
	return classes;
    }

    @Override
    public Class getByCode(String code) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int insert(Class t) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int update(Class object) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int delete(Class object) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public List<Class> filter(String sequenceFilter) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

}
