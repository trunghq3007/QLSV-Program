package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.TypeOfTrainning;
import utils.Constants;
import utils.Dbconnection;

public class TypeOfTrainningDal implements BaseDAL<TypeOfTrainning>{

    @Override
    public List<TypeOfTrainning> getAll() {
        Connection connection = Dbconnection.connect();
        Statement statement = null;
        ResultSet resultSet = null;
        
        List<TypeOfTrainning> list = new ArrayList<>();
        TypeOfTrainning trainning = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(Constants.TypeOfTrainning.SELECT_ALL);
            
            while(resultSet.next()) {
                String totCode = resultSet.getString(1);
                String totName = resultSet.getString(2);
                
                trainning = new TypeOfTrainning(totCode, totName);
                list.add(trainning);
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
    public TypeOfTrainning getByCode(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        TypeOfTrainning trainning = null;
        
        try {
            prepared = connection.prepareStatement(Constants.TypeOfTrainning.GET_BY_CODE);
            prepared.setString(1, code);
            resultSet = prepared.executeQuery();
            
            if(resultSet.next()) {
                String totCode = resultSet.getString(1);
                String totName = resultSet.getString(2);
                
                trainning = new TypeOfTrainning(totCode, totName);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return trainning;
    }

    @Override
    public int insert(TypeOfTrainning object) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        
        int result = 0;
        try {
            prepared = connection.prepareStatement(Constants.TypeOfTrainning.ADD_TYPE);
            prepared.setString(1, object.getTotCode());
            prepared.setString(2, object.getTotName());
            
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
    public int update(TypeOfTrainning object) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        
        int result = 0;
        try {
            prepared = connection.prepareStatement(Constants.TypeOfTrainning.UPDATE_TYPE);
            prepared.setString(2, object.getTotCode());
            prepared.setString(1, object.getTotName());
            
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
            prepared = connection.prepareStatement(Constants.TypeOfTrainning.DETELE_TYPE);
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
    public List<TypeOfTrainning> fillter(String sequenceFilter) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        
        List<TypeOfTrainning> list = new ArrayList<>();
        TypeOfTrainning trainning = null;
        
        try {
            prepared = connection.prepareStatement(Constants.TypeOfTrainning.SEARCH);
            prepared.setString(1, "%" + sequenceFilter + "%");
            resultSet = prepared.executeQuery();
            
            while(resultSet.next()) {
                String totCode = resultSet.getString(1);
                String totName = resultSet.getString(2);
                
                trainning = new TypeOfTrainning(totCode, totName);
                list.add(trainning);
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

}
