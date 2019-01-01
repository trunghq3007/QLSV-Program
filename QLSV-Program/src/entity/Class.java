package entity;

public class Class {
	private String classCode;
	private String className;
	private String facultyName;
	private String trainingSystemCode;
    private String courseCode;
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class(String classCode, String className, String facultyName, String trainingSystemCode, String courseCode) {
		super();
		this.classCode = classCode;
		this.className = className;
		this.facultyName = facultyName;
		this.trainingSystemCode = trainingSystemCode;
		this.courseCode = courseCode;
	}
	@Override
	public String toString() {
		return "Class [classCode=" + classCode + ", className=" + className + ", facultyName=" + facultyName
				+ ", trainingSystemCode=" + trainingSystemCode + ", courseCode=" + courseCode + "]";
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getTrainingSystemCode() {
		return trainingSystemCode;
	}
	public void setTrainingSystemCode(String trainingSystemCode) {
		this.trainingSystemCode = trainingSystemCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
