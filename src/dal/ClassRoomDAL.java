package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.ClassRoom;
import utils.Constants;
import utils.DbConnection;

public class ClassRoomDAL implements BaseDAL<ClassRoom>{

	@Override
	public List<ClassRoom> getAll() {
		Connection conn = DbConnection.connect();
		Statement stmt = null;
		ResultSet rs = null;
		
		List<ClassRoom> listRoom = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(Constants.ClassRoom.SELECT_ALL);
			while(rs.next()) {
				ClassRoom room = new ClassRoom();
				room.setClassCode(rs.getString(Constants.ClassRoom.CLASS_CODE));
				room.setClassName(rs.getString(Constants.ClassRoom.CLASS_NAME));
				room.setDepartCode(rs.getString(Constants.ClassRoom.DEPT_CODE));
				room.setTypeoftrainningCode(rs.getString(Constants.ClassRoom.TYPETRAIN_CODE));
				room.setCourseCode(rs.getString(Constants.ClassRoom.COURSE_CODE));
				
				listRoom.add(room);
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
		return listRoom;
	}

	@Override
	public ClassRoom getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ClassRoom room) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.ClassRoom.INSERT_CLASS);
			stmt.setString(1, room.getClassCode());
			stmt.setString(2, room.getClassName());
			stmt.setString(3, room.getDepartCode());
			stmt.setString(4, room.getTypeoftrainningCode());
			stmt.setString(5, room.getCourseCode());
			
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
	public int update(ClassRoom room) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.ClassRoom.INSERT_CLASS);
			stmt.setString(5, room.getClassCode());
			stmt.setString(1, room.getClassName());
			stmt.setString(2, room.getDepartCode());
			stmt.setString(3, room.getTypeoftrainningCode());
			stmt.setString(4, room.getCourseCode());
			
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
	public int delete(String code) {
		Connection conn = DbConnection.connect();
		PreparedStatement stmt = null;
		
		int status = 0;
		try {
			stmt = conn.prepareStatement(Constants.ClassRoom.DELETE_CLASS);
			stmt.setString(1, code);
			
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
	public List<ClassRoom> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
