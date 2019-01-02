package entity;

/**
 * Create by: thanh - CMC
 * Create date: Jan 2, 2019
 * Modifier: thanh
 * Modified date: Jan 2, 2019
 * Description: 
 * Version 1.0
 */
public class Subject {
	private String subjectCode;
	private String subjectName;
	private String subjectNumber;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String subjectCode, String subjectName, String subjectNumber) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectNumber = subjectNumber;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectNumber() {
		return subjectNumber;
	}

	public void setSubjectNumber(String subjectNumber) {
		this.subjectNumber = subjectNumber;
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectNumber="
				+ subjectNumber + "]";
	}
}
