package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Course;
import entity.HeDT;
import utils.Constants;

import utils.Dbconnection;

public class HeDTdal implements BaseDAL<HeDT> {

	public List<HeDT> getAll() {
		Connection connect = Dbconnection.connect();
		List<HeDT> dsHeDT = new ArrayList<HeDT>();

		try {
			// Statement creation
			Statement statement = connect.createStatement();
			// for retrieve data
			ResultSet resultSet = statement.executeQuery(Constants.HeDT.SELECT_ALL);
			while (resultSet.next()) {
				HeDT heDT = new HeDT();
				heDT.setMaHeDT(resultSet.getString(Constants.HeDT.HEDT_MA));
				heDT.setTenHeDT(Constants.HeDT.HEDT_TEN);
				dsHeDT.add(heDT);
			}
			statement.close();
			connect.close();
		} catch (SQLException e) {
			// e.printStackTrace();
		} finally {
			try {
				connect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
		return dsHeDT;

	}

	public HeDT getByCode(String code) {
		Connection connect = Dbconnection.connect();
		HeDT heDT = new HeDT();
		try {
			// Statement creation
			PreparedStatement preparedStatement = connect.prepareStatement(Constants.HeDT.SELLECT_BY_CODE);
			preparedStatement.setString(1, code);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				heDT.setMaHeDT(Constants.HeDT.HEDT_MA);
				heDT.setTenHeDT(Constants.HeDT.HEDT_TEN);
				preparedStatement.close();
			}
			connect.close();
		} catch (SQLException e) {
			// e.printStackTrace();
		} finally {
			try {
				connect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
		return heDT;
	}

	public int insert(HeDT object) {
		Connection connect = Dbconnection.connect();
		int resultQuery = 0;
		try {
			// Statement creation
			PreparedStatement preparedStatement = connect.prepareStatement(Constants.HeDT.INSERT);
			preparedStatement.setString(1, object.getMaHeDT());
			preparedStatement.setString(2, object.getTenHeDT());
			resultQuery = preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			// e.printStackTrace();
		} finally {
			try {
				connect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
		return resultQuery;
	}

	public int update(HeDT object) {
		Connection connect = Dbconnection.connect();
		int resultQuery = 0;
		try {
			// Statement creation
			PreparedStatement preparedStatement = connect.prepareStatement(Constants.HeDT.UPDATE);
			preparedStatement.setString(1, object.getTenHeDT());
			preparedStatement.setString(2, object.getMaHeDT());
			resultQuery = preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			// e.printStackTrace();
		} finally {
			try {
				connect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
		return resultQuery;
	}

	public int delete(String code) {
		// TODO Auto-generated method stub
		Connection connect = Dbconnection.connect();
		int resultQuery = 0;
		try {
			// Statement creation
			PreparedStatement preparedStatement = connect.prepareStatement(Constants.HeDT.DELETE);
			preparedStatement.setString(1, code);
			resultQuery = preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			// e.printStackTrace();
		} finally {
			try {
				connect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
		return resultQuery;
	}

	public List<HeDT> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
