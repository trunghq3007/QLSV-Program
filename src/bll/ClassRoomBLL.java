package bll;

import java.util.List;

import dal.ClassRoomDAL;
import entity.ClassRoom;

public class ClassRoomBLL implements BaseBLL<ClassRoom>{
	
	ClassRoomDAL classDAL = new ClassRoomDAL();
	
	public ClassRoomBLL() {
		classDAL = new ClassRoomDAL();
	}

	@Override
	public List<ClassRoom> getAll() {
		// TODO Auto-generated method stub
		return classDAL.getAll();
	}

	@Override
	public ClassRoom getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ClassRoom room) {
		// TODO Auto-generated method stub
		return classDAL.insert(room);
	}

	@Override
	public int update(ClassRoom room) {
		// TODO Auto-generated method stub
		return classDAL.update(room);
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return classDAL.delete(code);
	}

	@Override
	public List<ClassRoom> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
