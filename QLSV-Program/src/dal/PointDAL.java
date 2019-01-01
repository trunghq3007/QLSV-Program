package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Point;
import utils.Constants;
import utils.DbConnection;

public class PointDAL implements BaseDAL<Point> {

	@Override
	public List<Point> getAll() {
		 Connection connect = DbConnection.connect();
         List<Point> points = new ArrayList<Point>();

         try {
                 // Statement creation
                 Statement statement = connect.createStatement();
                 // for retrieve data
                 ResultSet resultSet = statement.executeQuery(Constants.Point.SELECT_ALLDIEM);
                 while (resultSet.next()) {
                         Point point = new Point();
                         point.setStudentCode(resultSet.getString(Constants.Point.student_Code));
                         point.setSubjectsCode(resultSet.getString(Constants.Point.subjects_Code));
                         point.setSemester(resultSet.getInt(Constants.Point.semester));
                         point.setPointOne(resultSet.getInt(Constants.Point.pointOne));
                         point.setPointTwo(resultSet.getInt(Constants.Point.pointTwo));
                         points.add(point);
                 }
                 statement.close();
                 connect.close();
         } catch (SQLException e) {
                 e.printStackTrace();
         }
         return points;		
	}

	@Override
	public Point getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Point object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Point object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Point> fillter(String sequenceFillter) {
		// TODO Auto-generated method stub
		return null;
	}

}
