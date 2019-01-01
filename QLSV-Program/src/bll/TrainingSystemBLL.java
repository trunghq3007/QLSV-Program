package bll;

import java.util.List;

import dal.TrainingSystemDAL;
import entity.TrainingSystem;

public class TrainingSystemBLL implements BaseBLL<TrainingSystem>{
	TrainingSystemDAL trainingsystemdal;
	
	
    public TrainingSystemBLL() {
    	trainingsystemdal = new TrainingSystemDAL();
}

	@Override
	public List<TrainingSystem> getAll() {
		// TODO Auto-generated method stub
		return trainingsystemdal.getAll();
	}

	@Override
	public TrainingSystem getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(TrainingSystem object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TrainingSystem object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TrainingSystem> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
