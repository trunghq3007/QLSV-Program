package bll;

import java.util.List;

import dal.TypeOfTrainningDAL;
import entity.TypeOfTrainning;

public class TypeOfTrainningBLL implements BaseBLL<TypeOfTrainning>{
	
	TypeOfTrainningDAL typeOfTrainningDAL;
	
	public TypeOfTrainningBLL() {
		typeOfTrainningDAL = new TypeOfTrainningDAL();
	}

	@Override
	public List<TypeOfTrainning> getAll() {
		// TODO Auto-generated method stub
		return typeOfTrainningDAL.getAll();
	}

	@Override
	public TypeOfTrainning getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(TypeOfTrainning type) {
		// TODO Auto-generated method stub
		return typeOfTrainningDAL.insert(type);
	}

	@Override
	public int update(TypeOfTrainning type) {
		// TODO Auto-generated method stub
		return typeOfTrainningDAL.update(type);
	}

	@Override
	public int delete(String name) {
		// TODO Auto-generated method stub
		return typeOfTrainningDAL.delete(name);
	}

	@Override
	public List<TypeOfTrainning> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}

}
