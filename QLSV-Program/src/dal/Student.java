/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:26 PM
 */

package dal;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Class: Sinh viên
 */
public class Student {
	// Attribute
	private String studentId; // Mã sinh viên
	private String name; // Tên sinh viên
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		this.name = name;
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
		String genderStr = gender ? "Nam" : "Nữ";
		return String.format("%5s %20s %3s %10s %30s %5s", studentId, name, genderStr, formatter.format(dateOfBirth),
				homeTown, classId);
	}

}
