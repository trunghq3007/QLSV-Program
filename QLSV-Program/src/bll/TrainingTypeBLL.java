package bll;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dal.TrainingTypeDAL;
import entity.TrainingType;

public class TrainingTypeBLL implements BaseBLL<TrainingType> {
	TrainingTypeDAL trainingTypeDAL;

	public TrainingTypeBLL() {
		this.trainingTypeDAL = new TrainingTypeDAL();
	}

	@Override
	public List<TrainingType> getAll() {
		try {
			return trainingTypeDAL.getAll();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<TrainingType>();
	}

	@Override
	public TrainingType getByCode(String code) {
		try {
			return trainingTypeDAL.getByCode(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new TrainingType();
	}

	@Override
	public boolean insert(TrainingType object) {
		try {
			return trainingTypeDAL.insert(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public boolean update(TrainingType object) {
		try {
			return trainingTypeDAL.update(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public int delete(String code) {
		try {
			return trainingTypeDAL.delete(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public List<TrainingType> fillter(String sequenceFilter) {
		try {
			return trainingTypeDAL.fillter(sequenceFilter);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<TrainingType>();
	}

	@Override
	public StringBuilder getStringBuilderFromList(List<TrainingType> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean display(List<TrainingType> list) {
		// TODO Auto-generated method stub
		return false;
	}
}
