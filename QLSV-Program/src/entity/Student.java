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
 * Class: Student
 */
public class Student {
	// Attribute
	private String studentId; // student code
	private String studentName; // name of student
	private boolean gender; // gender
	private Date dateOfBirth; // Date of birth
	private String hometown; // Hometown
	private String classId; // Class code

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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
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
	 * @param hometown
	 * @param classId
	 */
	public Student(String studentId, String name, boolean gender, Date dateOfBirth, String hometown, String classId) {
		this.studentId = studentId;
		this.studentName = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.hometown = hometown;
		this.classId = classId;
	}

	public Student() {
		super();
	}

	// toString
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String genderStr = gender ? Constants.Common.MALE : Constants.Common.FEMALE;
		return String.format(Constants.ToStringFormatter.STUDENT, studentId, studentName, genderStr,
				formatter.format(dateOfBirth), hometown, classId);
	}

}
