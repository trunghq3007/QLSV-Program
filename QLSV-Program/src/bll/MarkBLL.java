package bll;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dal.MarkDAL;
import entity.Mark;

public class MarkBLL {
	MarkDAL markDAL;

	public MarkBLL() {
		this.markDAL = new MarkDAL();
	}

	public List<Mark> getAll() {
		try {
			return markDAL.getAll();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Mark>();
	}

	public Mark getByKey(String studentId, String subjectId) {
		try {
			return markDAL.getByKey(studentId, subjectId);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new Mark();
	}

	public int insert(Mark object) {
		try {
			return markDAL.insert(object);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public int update(Mark object) {
		try {
			return markDAL.update(object);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public int deleteByKey(String studentId, String subjectId) {
		try {
			return markDAL.deleteByKey(studentId, subjectId);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public int deleteByStudentId(String studentId) {
		try {
			return markDAL.deleteByStudentId(studentId);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public int deleteBySubjectId(String subjectId) {
		try {
			return markDAL.deleteBySubjectId(subjectId);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public List<Mark> fillter(String sequenceFilter) {
		try {
			return markDAL.fillter(sequenceFilter);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ArrayList<Mark>();
	}
}
