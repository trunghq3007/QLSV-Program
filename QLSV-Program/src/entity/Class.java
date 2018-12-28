/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:32 PM
 */
package entity;

import utils.Constants;

/**
 * Class: Lớp học
 */
public class Class {
	// Attribute
	private String classId; // Mã lớp
	private String className; // Tên lớp học
	private String facultyId; // Mã khoa
	private String trainningTypeId; // Mã hệ đào tạo
	private String courseId; // Mã khóa học

	// Getter and setter
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String name) {
		this.className = name;
	}

	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getTrainningTypeId() {
		return trainningTypeId;
	}

	public void setTrainningTypeId(String trainningTypeId) {
		this.trainningTypeId = trainningTypeId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	// Constructor
	/**
	 * @param classId
	 * @param name
	 * @param facultyId
	 * @param trainningTypeId
	 * @param courseId
	 */
	public Class(String classId, String name, String facultyId, String trainningTypeId, String courseId) {
		super();
		this.classId = classId;
		this.className = name;
		this.facultyId = facultyId;
		this.trainningTypeId = trainningTypeId;
		this.courseId = courseId;
	}

	public Class() {
		super();
	}

	// toString
	@Override
	public String toString() {
		return String.format(Constants.ToStringFormatter.CLASS, classId, className, facultyId, trainningTypeId,
				courseId);
	}
}
