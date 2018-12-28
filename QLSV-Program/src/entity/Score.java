/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:40 PM
 */
package entity;

import utils.Constants;

/**
 * Class: Điểm
 */
public class Score {
	// Attribute
	private String studentId; // Mã sinh viên
	private String subjectId; // Tên sinh viên
	private int semester; // Học kỳ
	private float point_1st; // Điểm lần 1
	private float point_2nd; // Điêm lần 2

	// Getter and setter
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public float getPoint_1st() {
		return point_1st;
	}

	public void setPoint_1st(float point_1st) {
		this.point_1st = point_1st;
	}

	public float getPoint_2nd() {
		return point_2nd;
	}

	public void setPoint_2nd(float point_2nd) {
		this.point_2nd = point_2nd;
	}

	// Constructor
	/**
	 * @param studentId
	 * @param subjectId
	 * @param semester
	 * @param firstPoint
	 * @param secondPoint
	 */
	public Score(String studentId, String subjectId, int semester, float firstPoint, float secondPoint) {
		super();
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.semester = semester;
		this.point_1st = firstPoint;
		this.point_2nd = secondPoint;
	}

	public Score() {
		super();
	}

	// toString
	@Override
	public String toString() {
		return String.format(Constants.ToStringFormatter.SCORE, studentId, subjectId, semester, point_1st, point_2nd);
	}
}
