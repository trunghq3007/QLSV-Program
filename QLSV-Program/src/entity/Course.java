/**
 * 
 */
package entity;

/**
 * Create by: NVDiem
 * Create date: Jan 1, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 1, 2019
 * Description: ....
 * Version 1.0
 */
public class Course {
	// Code of course
	private String courseID;
	// Name of course
	private String courseName;

	/**
	 * 
	 */
	public Course() {
	}

	public Course(String courseID, String courseName) {
		this.courseID = courseID;
		this.courseName = courseName;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + "]";
	}

}
