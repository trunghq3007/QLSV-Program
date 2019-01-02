package entity;

public class Class {
    private String classCode;
    private String className;
    private String courseCode;
    private String facultyCode;
    private String tsCode;

    public Class() {
	
    }
    public Class(String classCode, String className, String courseCode, String facultyCode, String tsCode) {
	super();
	this.classCode = classCode;
	this.className = className;
	this.courseCode = courseCode;
	this.facultyCode = facultyCode;
	this.tsCode = tsCode;
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

    public String getCourseCode() {
	return courseCode;
    }

    public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
    }

    public String getFacultyCode() {
	return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
	this.facultyCode = facultyCode;
    }

    public String getTsCode() {
	return tsCode;
    }

    public void setTsCode(String tsCode) {
	this.tsCode = tsCode;
    }
    @Override
    public String toString() {
	return "Class [classCode=" + classCode + ", className=" + className + ", courseCode=" + courseCode
		+ ", facultyCode=" + facultyCode + ", tsCode=" + tsCode + "]";
    }

}
