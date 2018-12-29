package bll;

import java.util.List;

import dal.DepartDALL;
import entity.Depart;

public class DepartBLL implements BaseBLL<Depart>{
	
	DepartDALL departDALL;
	public DepartBLL() {
		departDALL = new DepartDALL();
	}

	@Override
	public List<Depart> getAll() {
		// TODO Auto-generated method stub
		return departDALL.getAll();
	}

	@Override
	public Depart getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Depart dept) {
		// TODO Auto-generated method stub
		return departDALL.insert(dept);
	}

	@Override
	public int update(Depart dept) {
		// TODO Auto-generated method stub
		return departDALL.update(dept);
	}

	@Override
	public int delete(String name) {
		// TODO Auto-generated method stub
		return departDALL.delete(name);
	}

	@Override
	public List<Depart> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
