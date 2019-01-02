package dal;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Subject;
import utils.Constants;
import utils.Dbconnection;

public class SubjectDal implements BaseDAL<Subject> {

    /*
     * (non-Javadoc)
     * 
     * @see dal.BaseDAL#getAll()
     */
    @Override
    public List<Subject> getAll() {
        Connection connection = Dbconnection.connect();
        Statement statement = null;
        ResultSet resultSet = null;

        List<Subject> list = new ArrayList<>();
        Subject Subject = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(Constants.Subject.SELECT_ALL);

            while (resultSet.next()) {
                String SubjectCode = resultSet.getString(1);
                String SubjectName = resultSet.getString(2);
                int creditsNumber = resultSet.getInt(3);

                Subject = new Subject(SubjectCode, SubjectName, creditsNumber);
                list.add(Subject);
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

    /*
     * (non-Javadoc)
     * 
     * @see dal.BaseDAL#getByCode(java.lang.String)
     */
    @Override
    public Subject getByCode(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        Subject Subject = null;
        try {
            prepared = connection.prepareStatement(Constants.Subject.GET_BY_CODE);
            prepared.setString(1, code);
            resultSet = prepared.executeQuery();

            if (resultSet.next()) {
                String SubjectName = resultSet.getString(2);
                int creditsNumber = resultSet.getInt(3);
                Subject = new Subject(code, SubjectName, creditsNumber);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeResultSet(resultSet);
            Dbconnection.closePrepared(prepared);
            Dbconnection.closeConnection(connection);
        }
        return Subject;
    }

    /*
     * (non-Javadoc)
     * 
     * @see dal.BaseDAL#insert(java.lang.Object)
     */
    @Override
    public int insert(Subject object) {
        Connection connection = Dbconnection.connect();
        CallableStatement callable = null;
        int result = 0;
        try {
            callable = connection.prepareCall(Constants.Subject.ADD_ALL);
            callable.setString(1, object.getSubjectCode());
            callable.setString(2, object.getSubjectName());
            callable.setInt(3, object.getCreditsNumber());
            result = callable.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeCallable(callable);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see dal.BaseDAL#update(java.lang.Object)
     */
    @Override
    public int update(Subject object) {
        Connection connection = Dbconnection.connect();
        CallableStatement callable = null;
        int result = 0;

        try {
            callable = connection.prepareCall(Constants.Subject.UPDATE_ALL);
            callable.setString(1, object.getSubjectName());
            callable.setInt(2, object.getCreditsNumber());
            callable.setString(3, object.getSubjectCode());
            result = callable.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbconnection.closeCallable(callable);
            Dbconnection.closeConnection(connection);
        }
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see dal.BaseDAL#delete(java.lang.String)
     */
    @Override
    public int delete(String code) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        int result = 0;

        try {
            prepared = connection.prepareStatement(Constants.Subject.DELETE_ALL);
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

    /*
     * (non-Javadoc)
     * 
     * @see dal.BaseDAL#fillter(java.lang.String)
     */
    @Override
    public List<Subject> fillter(String sequenceFilter) {
        Connection connection = Dbconnection.connect();
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        List<Subject> list = new ArrayList<>();
        Subject Subject = null;
        try {
            prepared = connection.prepareStatement(Constants.Subject.SEARCH);
            prepared.setString(1, "%" + sequenceFilter + "%");
            resultSet = prepared.executeQuery();

            while (resultSet.next()) {
                String SubjectCode = resultSet.getString(1);
                String SubjectName = resultSet.getString(2);
                int creditsNumber = resultSet.getInt(3);
                Subject = new Subject(SubjectCode, SubjectName, creditsNumber);

                list.add(Subject);
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
