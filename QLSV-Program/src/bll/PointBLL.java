package bll;

import java.util.List;

import dal.PointDAL;
import entity.Point;

public class PointBLL implements BaseBLL<Point>{
	PointDAL pointDAL;
	
	public PointBLL()
	{
		pointDAL = new PointDAL();
	}	
	@Override
	public List<Point> getAll() {
		
		return pointDAL.getAll();
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
	public List<Point> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
