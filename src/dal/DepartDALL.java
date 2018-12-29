package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import entity.Depart;
import utils.Constants;
import utils.DbConnection;

public class DepartDALL implements BaseDAL<Depart>{

	@Override
	public List<Depart> getAll() {
		Connection conn = DbConnection.connect();
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		List<Depart> listDept = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			 rs = stmt.executeQuery(Constants.Depart.SELECT_ALL);
			while(rs.next()) {
				Depart dept = new Depart();
				dept.setDepartCode(rs.getString(Constants.Depart.DEPT_COED));
				dept.setDepartName(rs.getString(Constants.Depart.DEPT_NAME));
				dept.setAddress(rs.getString(Constants.Depart.DEPT_ADDR));
				dept.setPhone(rs.getString(Constants.Depart.DEPT_PHONE));
				
				listDept.add(dept);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return listDept;
	}

	@Override
	public Depart getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Depart dept) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Depart.INSERT_DEPT);
			stmt.setString(1, dept.getDepartCode());
			stmt.setString(2, dept.getDepartName());
			stmt.setString(3, dept.getAddress());
			stmt.setString(4, dept.getPhone());
			
			status = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return status;
	}

	@Override
	public int update(Depart dept) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Depart.UPDATE_DEPT);
			stmt.setString(4, dept.getDepartCode());
			stmt.setString(1, dept.getDepartName());
			stmt.setString(2, dept.getAddress());
			stmt.setString(3, dept.getPhone());
			
			status = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return status;
	}

	@Override
	public int delete(String name) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.Depart.DELETE_DEPT);
			stmt.setString(1, name);
			
			status = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return status;
	}

	@Override
	public List<Depart> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
