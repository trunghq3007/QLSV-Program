/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:40 PM
 */
package entity;

import utils.Constants;

/**
 * Class: Khóa học
 */
public class Course {
	// Attribute
	private String courseId; // Mã khóa học
	private String courseName; // Tên khóa học

	// Getter and setter
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		this.courseName = name;
	}

	// Constructor
	public Course(String courseId, String name) {
		this.courseId = courseId;
		this.courseName = name;
	}

	// toString
	@Override
	public String toString() {
		return String.format(Constants.ToStringFormatter.COURSE, this.courseId, this.courseName);
	}
}
