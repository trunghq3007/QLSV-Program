package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Statement;

import entity.TypeOfTrainning;
import utils.Constants;
import utils.DbConnection;

public class TypeOfTrainningDAL implements BaseDAL<TypeOfTrainning>{

	@Override
	public List<TypeOfTrainning> getAll() {
		Connection conn = DbConnection.connect();
		Statement stmt = null;
		
		List<TypeOfTrainning> list = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(Constants.TypeOfTrainning.SELECT_ALL);
			while(resultSet.next()) {
				TypeOfTrainning tp = new TypeOfTrainning();
				tp.setTypeTrainCode(resultSet.getString(Constants.TypeOfTrainning.TYPEOFTRAIN_CODE));
				tp.setTypeTrainName(resultSet.getString(Constants.TypeOfTrainning.TYPEOFTRAIN_CODE));
				
				list.add(tp);
			}
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
		return list;
	}

	@Override
	public TypeOfTrainning getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(TypeOfTrainning type) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.TypeOfTrainning.INSERT_TYPETRAIN);
			stmt.setString(1, type.getTypeTrainCode());
			stmt.setString(2, type.getTypeTrainName());
			
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
	public int update(TypeOfTrainning type) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.TypeOfTrainning.UPDATE_TYPETRAIN);
			stmt.setString(2, type.getTypeTrainCode());
			stmt.setString(1, type.getTypeTrainName());
			
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
			stmt = conn.prepareStatement(Constants.TypeOfTrainning.DELETE_TYPETRAIN);
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
	public List<TypeOfTrainning> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
