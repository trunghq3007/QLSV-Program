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
public class Mark {
	// Attribute
	private String studentId; // student code
	private String subjectId; // subject code
	private int semester; // Semester
	private float mark_1st; // the mark of the first exam
	private float mark_2nd; // the mark of the first exam

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

	public float getMark_1st() {
		return mark_1st;
	}

	public void setMark_1st(float mark_1st) {
		this.mark_1st = mark_1st;
	}

	public float getMark_2nd() {
		return mark_2nd;
	}

	public void setMark_2nd(float mark_2nd) {
		this.mark_2nd = mark_2nd;
	}

	// Constructor
	public Mark() {
		super();
	}

	/**
	 * @param studentId
	 * @param subjectId
	 * @param semester
	 * @param mark_1st
	 * @param mark_2nd
	 */
	public Mark(String studentId, String subjectId, int semester, float mark_1st, float mark_2nd) {
		super();
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.semester = semester;
		this.mark_1st = mark_1st;
		this.mark_2nd = mark_2nd;
	}

	// toString
	@Override
	public String toString() {
		return String.format(Constants.ToStringFormatter.MARK, studentId, subjectId, semester, mark_1st, mark_2nd);
	}

}
