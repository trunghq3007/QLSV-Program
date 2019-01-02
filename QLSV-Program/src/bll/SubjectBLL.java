package bll;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dal.MarkDAL;
import dal.SubjectDAL;
import entity.Subject;

public class SubjectBLL implements BaseBLL<Subject> {
	SubjectDAL subjectDAL;

	public SubjectBLL() {
		this.subjectDAL = new SubjectDAL();
	}

	@Override
	public List<Subject> getAll() {
		try {
			return subjectDAL.getAll();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Subject>();
	}

	@Override
	public Subject getByCode(String code) {
		try {
			return subjectDAL.getByCode(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new Subject();
	}

	@Override
	public boolean insert(Subject object) {
		try {
			return subjectDAL.insert(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public boolean update(Subject object) {
		try {
			return subjectDAL.update(object) > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	@Override
	public int delete(String code) {
		try {
			new MarkDAL().deleteBySubjectId(code);
			return subjectDAL.delete(code);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public List<Subject> fillter(String sequenceFilter) {
		try {
			return subjectDAL.fillter(sequenceFilter);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Subject>();
	}

	@Override
	public StringBuilder getStringBuilderFromList(List<Subject> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean display(List<Subject> list) {
		// TODO Auto-generated method stub
		return false;
	}

}
