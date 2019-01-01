/**
 * 
 */
package entity;

import java.util.Date;

/**
 * Create by: NVDiem
 * Create date: Jan 1, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 1, 2019
 * Description: ....
 * Version 1.0
 */
public class Student {
	// mã sinh viên
	private char studentID;
	// tên sinh viên
	private String studentName;
	// giới tính
	private String gender;
	// ngày sinh
	private Date dateOfBirth;
	// mã lớp
	private char classID;
	// quê quán
	private String hometown;

	/**
	 * @param studentCode
	 * @param studentName
	 * @param gender
	 * @param dateOfBirth
	 * @param classCode
	 * @param hometown
	 */
	public Student(char studentID, String studentName, String gender, Date dateOfBirth, char classID, String hometown) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.classID = classID;
		this.hometown = hometown;
	}

	public Student() {
	}

	public char getStudentID() {
		return studentID;
	}

	public void setStudentID(char studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public char getClassID() {
		return classID;
	}

	public void setClassID(char classID) {
		this.classID = classID;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", classID=" + classID + ", hometown=" + hometown + "]";
	}

}
