/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:41 PM
 */
package entity;

import utils.Constants;

/**
 * Lớp môn học
 */
public class Subject {
	// Attribute
	private String subjectId; // subject code
	private String subjectName; // subject name
	private int numberOfCredit; // number of credit

	// Getter and setter

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String name) {
		this.subjectName = name;
	}

	public int getNumberOfCredit() {
		return numberOfCredit;
	}

	public void setNumberOfCredit(int numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}

	// Constructor
	/**
	 * @param subjectId
	 * @param name
	 * @param numberOfCredit
	 */
	public Subject(String subjectId, String name, int numberOfCredit) {
		super();
		this.subjectId = subjectId;
		this.subjectName = name;
		this.numberOfCredit = numberOfCredit;
	}

	public Subject() {
		super();
	}

	// toString
	@Override
	public String toString() {
		return String.format(Constants.ToStringFormatter.SUBJECT, subjectId, subjectName, numberOfCredit);
	}
}
