package dal;

import entity.Mark;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utils.Constants;
import utils.Dbconnection;

public class MarkDal implements BaseDal<Mark> {

  @Override
  public List<Mark> getAll() {
    Connection connection = Dbconnection.connect();
    Statement statement = null;
    ResultSet resultSet = null;

    List<Mark> list = new ArrayList<>();
    Mark mark = null;

    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery(Constants.Mark.SELECT_ALL);

      while (resultSet.next()) {
        String studentCode = resultSet.getString(1);
        String subjectCode = resultSet.getString(2);
        int semester = resultSet.getInt(3);
        int firstMark = resultSet.getInt(4);
        int secondMark = resultSet.getShort(5);

        mark = new Mark(studentCode, subjectCode, semester, firstMark, secondMark);
        list.add(mark);
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
  public Mark getByCode(String code) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int insert(Mark object) {
    Connection connection = Dbconnection.connect();
    PreparedStatement prepared = null;

    int result = 0;

    try {
      prepared = connection.prepareStatement(Constants.Mark.ADD_ALL);
      prepared.setString(1, object.getStudentCode());
      prepared.setString(2, object.getSubjectCode());
      prepared.setInt(3, object.getSemester());
      prepared.setInt(4, object.getFirstMark());
      prepared.setInt(5, object.getSecondMark());

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
  public int update(Mark object) {
    Connection connection = Dbconnection.connect();
    PreparedStatement prepared = null;

    int result = 0;
    try {
      prepared = connection.prepareStatement(Constants.Mark.UPDATE_ALL);
      prepared.setString(4, object.getStudentCode());
      prepared.setString(5, object.getSubjectCode());
      prepared.setInt(1, object.getSemester());
      prepared.setInt(2, object.getFirstMark());
      prepared.setInt(3, object.getSecondMark());

      result = prepared.executeUpdate();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return result;
  }

  @Override
  public int delete(String code) {
    return 0;
  }

  @Override
  public List<Mark> fillter(String sequenceFilter) {
    // TODO Auto-generated method stub
    return null;
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
