package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Lop;
import utils.Constants;
import utils.Dbconnection;

public class LopDal implements BaseDAL<Lop>{

    @Override
    public List<Lop> getAll() {
        Connection connection = Dbconnection.connect();
        Statement statement = null;
        ResultSet resultSet = null;
        
        List<Lop> list = new ArrayList<>();
        Lop lop = null;
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(Constants.LOP.SELECT_ALL);
            
            while(resultSet.next()) {
                String classCode = resultSet.getString(1);
                String className = resultSet.getString(2);
                String facultyCode = resultSet.getString(3);
                String totCode = resultSet.getString(4);
                String subjectCode = resultSet.getString(5);
                
                lop = new Lop(classCode, className, facultyCode, totCode, subjectCode);
                list.add(lop);
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
    public Lop getByCode(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        
        Lop lop = null;
        try {
            prepared = connection.prepareStatement(Constants.LOP.GET_BY_CODE);
            prepared.setString(1, code);
            resultSet = prepared.executeQuery();
            
            if(resultSet.next()) {
                String classCode = resultSet.getString(1);
                String className = resultSet.getString(2);
                String facultyCode = resultSet.getString(3);
                String totCode = resultSet.getString(4);
                String subjectCode = resultSet.getString(5);
                
                lop = new Lop(classCode, className, facultyCode, totCode, subjectCode);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return lop;
    }

    @Override
    public int insert(Lop object) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        
        int result = 0;
        
        try {
            prepared = connection.prepareStatement(Constants.LOP.ADD_ALL);
            prepared.setString(1, object.getClassCode());
            prepared.setString(2, object.getClassName());
            prepared.setString(3, object.getFacultyCode());
            prepared.setString(4, object.getSubjectCode());
            prepared.setString(5, object.getTotCode());
            
            result = prepared.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    @Override
    public int update(Lop object) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        
        int result = 0;
        
        try {
            prepared = connection.prepareStatement(Constants.LOP.UPDATE_ALL);
            prepared.setString(5, object.getClassCode());
            prepared.setString(1, object.getClassName());
            prepared.setString(2, object.getFacultyCode());
            prepared.setString(3, object.getSubjectCode());
            prepared.setString(4, object.getTotCode());
            
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
            prepared = connection.prepareStatement(Constants.LOP.DELETE_ALL);
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
    public List<Lop> fillter(String sequenceFilter) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        
        List<Lop> list = new ArrayList<>();
        Lop lop = null;
        
        try {
            prepared = connection.prepareStatement(Constants.LOP.SEARCH);
            prepared.setString(1, sequenceFilter);
            resultSet = prepared.executeQuery();
            
            while(resultSet.next()) {
                String classCode = resultSet.getString(1);
                String className = resultSet.getString(2);
                String facultyCode = resultSet.getString(3);
                String totCode = resultSet.getString(4);
                String subjectCode = resultSet.getString(5);
                
                lop = new Lop(classCode, className, facultyCode, totCode, subjectCode);
                list.add(lop);
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
