/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:26 PM
 */

package entity;

import java.sql.Date;
import java.text.SimpleDateFormat;

import utils.Constants;

/**
 * Class: Sinh viên
 */
public class Student {
	// Attribute
	private String studentId; // Mã sinh viên
	private String studentName; // Tên sinh viên
	private boolean gender; // Giới tính
	private Date dateOfBirth; // Ngày sinh
	private String homeTown; // Quê quán
	private String classId; // Mã lơp

	// Getter and Setter
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		this.studentName = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	// Constructor
	/**
	 * @param studentId
	 * @param name
	 * @param gender
	 * @param dateOfBirth
	 * @param homeTown
	 * @param classId
	 */
	public Student(String studentId, String name, boolean gender, Date dateOfBirth, String homeTown, String classId) {
		super();
		this.studentId = studentId;
		this.studentName = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.homeTown = homeTown;
		this.classId = classId;
	}

	public Student() {
		super();
	}

	// toString
	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String genderStr = gender ? Constants.Common.MALE : Constants.Common.FEMALE;
		return String.format(Constants.ToStringFormatter.STUDENT, studentId, studentName, genderStr,
				formatter.format(dateOfBirth), homeTown, classId);
	}

}
