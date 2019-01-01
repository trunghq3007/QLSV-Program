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
public class Class {
	// mã lớp
	private char classID;
	// tên lớp
	private String className;
	// mã khoa
	private char falcultyID;
	// mã hệ đào tạo
	private char typeOfTrainingID;
	// mã khóa học
	private char courseID;

	public Class() {
	}

	public char getClassID() {
		return classID;
	}

	public void setClassID(char classID) {
		this.classID = classID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public char getFalcultyID() {
		return falcultyID;
	}

	public void setFalcultyID(char falcultyID) {
		this.falcultyID = falcultyID;
	}

	public char getTypeOfTrainingID() {
		return typeOfTrainingID;
	}

	public void setTypeOfTrainingID(char typeOfTrainingID) {
		this.typeOfTrainingID = typeOfTrainingID;
	}

	public char getCourseID() {
		return courseID;
	}

	public void setCourseID(char courseID) {
		this.courseID = courseID;
	}

	@Override
	public String toString() {
		return "Class [classID=" + classID + ", className=" + className + ", falcultyID=" + falcultyID
				+ ", typeOfTrainingID=" + typeOfTrainingID + ", courseID=" + courseID + "]";
	}

}
