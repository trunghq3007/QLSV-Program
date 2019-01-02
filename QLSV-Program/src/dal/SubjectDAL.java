package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.MonHoc;
import utils.Constants;
import utils.DbConnection;

public class SubjectDAL implements BaseDAL<MonHoc> {

	public List<MonHoc> getAll() {
		List<MonHoc> list = new ArrayList<MonHoc>();
		Connection conn = DbConnection.connect();
		try {
			PreparedStatement ppstmt = conn.prepareStatement(Constants.Subject.SELECT_ALL);
			ResultSet rs = ppstmt.executeQuery();
			while (rs.next()) {
				MonHoc subject = new MonHoc();
				subject.setMaMH(rs.getString(Constants.Subject.SUBJECT_CODE));
				subject.setTenMH(rs.getString(Constants.Subject.SUBJECT_NAME));
				subject.setSoTrinh(rs.getInt(Constants.Subject.SUBJECT_VOLUME));
				list.add(subject);
			}
			rs.close();
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != conn) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public MonHoc getByCode(String code) {
		Connection conn = DbConnection.connect();
		MonHoc subject = null;
		try {
			PreparedStatement ppstmt = conn.prepareStatement(Constants.Subject.SELECT_SUBJECT);
			ppstmt.setString(1, code);
			ResultSet rs = ppstmt.executeQuery();
			if (rs.next()) {
				subject = new MonHoc();
				subject.setMaMH(rs.getString(Constants.Subject.SUBJECT_CODE));
				subject.setTenMH(rs.getString(Constants.Subject.SUBJECT_NAME));
				subject.setSoTrinh(rs.getInt(Constants.Subject.SUBJECT_VOLUME));
			}
			rs.close();
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != conn) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return subject;
	}

	public int insert(MonHoc object) {
		Connection connect = DbConnection.connect();
		int rows = 0;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Subject.INSERT_SUBJECT);
			ppstmt.setString(1, object.getMaMH());
			ppstmt.setString(2, object.getTenMH());
			ppstmt.setInt(3, object.getSoTrinh());
			rows = ppstmt.executeUpdate();
			System.out.println("rows inpacted: " + rows);
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public int update(MonHoc object) {

		Connection connect = DbConnection.connect();
		int rows = 0;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Subject.UPDATE_SUBJECT);
			ppstmt.setString(1, object.getTenMH());
			ppstmt.setInt(2, object.getSoTrinh());
			ppstmt.setString(3, object.getMaMH());
			rows = ppstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public int delete(String code) {

		Connection connect = DbConnection.connect();
		int rows = 0;
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Subject.DELETE_SUBJECT);
			ppstmt.setString(1, code);
			rows = ppstmt.executeUpdate();
			System.out.println("rows inpacted: " + rows);
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	public List<MonHoc> filter(String sequenceFilter) {
		Connection connect = DbConnection.connect();
		List<MonHoc> list = new ArrayList<MonHoc>();
		String findtext = "%" + sequenceFilter + "%";
		try {
			PreparedStatement ppstmt = connect.prepareStatement(Constants.Subject.FILTER_SUBJECT);
			ppstmt.setString(1, findtext);
			ppstmt.setString(2, findtext);
			ppstmt.setString(3, findtext);
			ppstmt.setString(4, findtext);
			ppstmt.setString(5, findtext);
			ppstmt.setString(6, findtext);
			ResultSet rs = ppstmt.executeQuery();
			while (rs.next()) {
				MonHoc subject = new MonHoc();
				subject.setMaMH(rs.getString(Constants.Subject.SUBJECT_CODE));
				subject.setTenMH(rs.getString(Constants.Subject.SUBJECT_NAME));
				subject.setSoTrinh(rs.getInt(Constants.Subject.SUBJECT_VOLUME));
				list.add(subject);
			}
			rs.close();
			ppstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
