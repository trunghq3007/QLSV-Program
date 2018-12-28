/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:41 PM
 */
package dal;

/**
 * Lớp môn học
 */
public class Subject {
	// Attribute
	private String subjectId; // Mã môn học
	private String name; // Tên môn học
	private int numberOfCredit; // Số tín chỉ

	// Getter and setter

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		this.name = name;
		this.numberOfCredit = numberOfCredit;
	}

	public Subject() {
		super();
	}

	// toString
	@Override
	public String toString() {
		return String.format("%5s %20s %d", subjectId, name, numberOfCredit);
	}
}
