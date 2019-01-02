/**
 * 
 */
package entity;

import java.util.Date;

/**
 * @author HQTrung
 *
 */
public class Student {
	// mã sinh viên
	private char studentCode;
	// tên sinh viên
	private String studentName;
	// giới tính
	private String gender;
	// ngày sinh
	private Date dateOfBirth;
	// mã lớp
	private char classCode;
	// quê quán
	private String hometown;

	/**
	 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
	 * date: Dec 28, 2018 Description: .... Version 1.0
	 * 
	 * @param studentCode
	 * @param studentName
	 * @param gender
	 * @param dateOfBirth
	 * @param classCode
	 * @param hometown
	 */
	public Student(char studentCode, String studentName, String gender, Date dateOfBirth, char classCode,
			String hometown) {
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.classCode = classCode;
		this.hometown = hometown;
	}

	/**
	 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
	 * date: Dec 28, 2018 Description: .... Version 1.0
	 */
	public Student() {
	}

	public char getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(char studentCode) {
		this.studentCode = studentCode;
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

	public char getClassCode() {
		return classCode;
	}

	public void setClassCode(char classCode) {
		this.classCode = classCode;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", studentName=" + studentName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", classCode=" + classCode + ", hometown=" + hometown + "]";
	}

}
