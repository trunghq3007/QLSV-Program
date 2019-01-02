package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Faculty;
import utils.Constants;
import utils.Dbconnection;

public class FacultyDal implements BaseDAL<Faculty> {

    @Override
    public List<Faculty> getAll() {
        Connection connection = Dbconnection.connect();
        Statement statement = null;
        ResultSet resultSet = null;

        List<Faculty> list = new ArrayList<>();
        Faculty faculty = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(Constants.Faculty.SELECT_ALL);

            while (resultSet.next()) {
                String facultyCode = resultSet.getString(1);
                String facultyName = resultSet.getString(2);
                String address = resultSet.getString(3);
                String phone = resultSet.getString(4);

                faculty = new Faculty(facultyCode, facultyName, address, phone);
                list.add(faculty);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closeStatement(statement);
            Dbconnection.closeConnection(connection);
        }

        return list;
    }

    @Override
    public Faculty getByCode(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        Faculty faculty = null;
        
        try {
            prepared = connection.prepareStatement(Constants.Faculty.GET_BY_CODE);
            prepared.setString(1, code);
            resultSet = prepared.executeQuery();
            
            if(resultSet.next()) {
                String facultyCode = resultSet.getString(1);
                String facultyName = resultSet.getString(2);
                String address = resultSet.getString(3);
                String phone = resultSet.getString(4);

                faculty = new Faculty(facultyCode, facultyName, address, phone);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return faculty;
    }

    @Override
    public int insert(Faculty object) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        
        int result = 0;
        
        try {
            prepared = connection.prepareStatement(Constants.Faculty.ADD);
            prepared.setString(1, object.getFacultyCode());
            prepared.setString(2, object.getFacultyName());
            prepared.setString(3, object.getAddress());
            prepared.setString(4, object.getPhone());
            
            result = prepared.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    @Override
    public int update(Faculty object) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        
        int result = 0;
        
        try {
            prepared = connection.prepareStatement(Constants.Faculty.UPDATE);
            prepared.setString(4, object.getFacultyCode());
            prepared.setString(1, object.getFacultyName());
            prepared.setString(2, object.getAddress());
            prepared.setString(3, object.getPhone());
            
            result = prepared.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    @Override
    public int delete(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        
        int result = 0;
        
        try {
            prepared = connection.prepareStatement(Constants.Faculty.DELETE);
            prepared.setString(1, code);
            
            result = prepared.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    @Override
    public List<Faculty> fillter(String sequenceFilter) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;

        List<Faculty> list = new ArrayList<>();
        Faculty faculty = null;
        
        try {
            prepared = connection.prepareStatement(Constants.Faculty.SEARCH);
            prepared.setString(1, "%" + sequenceFilter + "%");
            resultSet = prepared.executeQuery();
            
            while(resultSet.next()) {
                String facultyCode = resultSet.getString(1);
                String facultyName = resultSet.getString(2);
                String address = resultSet.getString(3);
                String phone = resultSet.getString(4);

                faculty = new Faculty(facultyCode, facultyName, address, phone);
                list.add(faculty);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return list;
    }

    @Override
    public String show() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StringBuilder showBuilder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StringBuffer showBuffer() {
        // TODO Auto-generated method stub
        return null;
    }

}
