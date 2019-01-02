package bll;

import java.util.List;

import dal.SubjectDAL;
import entity.MonHoc;
import utils.Constants;

public class SubjectBLL implements BaseBLL<MonHoc>{

	SubjectDAL subjectDAL;

	/**
	 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
	 * date: Dec 28, 2018 Description: .... Version 1.0
	 * 
	 * @param courseDAL
	 */
	public SubjectBLL() {
		subjectDAL = new SubjectDAL();
	}

	@Override
	public List<MonHoc> getAll() {
		return subjectDAL.getAll();

	}

	@Override
	public MonHoc getByCode(String code) {
		return subjectDAL.getByCode(code);
	}

	@Override
	public int insert(MonHoc object) {
		if (null == object) {
			System.out.println("object is null. Can't be inserted");
			return 0;
		}
		MonHoc c = null;
		c = getByCode(object.getMaMH());
		if (null != c) {
			System.out.println("object already exist. Can't insert!");
			return 0;
		}
		return subjectDAL.insert(object);
	}

	@Override
	public int update(MonHoc object) {
		if (null == object) {
			System.out.println("object is null. Can't be updated");
			return 0;
		}
		return subjectDAL.update(object);
	}

	@Override
	public int delete(String code) {
		return subjectDAL.delete(code);
	}

	@Override
	public List<MonHoc> filter(String sequenceFilter) {
		return subjectDAL.filter(sequenceFilter);
	}

	@Override
	public void show(List<MonHoc> list) {
		if (null == list) {
			System.out.println("empty result");
		}
		System.out.println(Constants.Subject.SUBJECT_CODE + "\t" + Constants.Subject.SUBJECT_NAME
				+ "\t" + Constants.Subject.SUBJECT_VOLUME);
		for (MonHoc iter : list) {
			System.out.println(iter.getMaMH() + "\t\t" + iter.getTenMH()
			+ "\t\t" + iter.getSoTrinh());
		}
	}
}
