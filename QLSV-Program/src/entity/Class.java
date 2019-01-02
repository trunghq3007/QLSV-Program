package entity;

/**
 * Create by: thanh - CMC
 * Create date: Jan 2, 2019
 * Modifier: thanh
 * Modified date: Jan 2, 2019
 * Description: 
 * Version 1.0
 */
public class Class {
	private String classCode;
	private String className;
	private String classFacultiCode;
	private String classTrainingCode;
	private String classCourseCode;

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class(String classCode, String className, String classFacultiCode, String classTrainingCode,
			String classCourseCode) {
		super();
		this.classCode = classCode;
		this.className = className;
		this.classFacultiCode = classFacultiCode;
		this.classTrainingCode = classTrainingCode;
		this.classCourseCode = classCourseCode;
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

	public String getClassFacultiCode() {
		return classFacultiCode;
	}

	public void setClassFacultiCode(String classFacultiCode) {
		this.classFacultiCode = classFacultiCode;
	}

	public String getClassTrainingCode() {
		return classTrainingCode;
	}

	public void setClassTrainingCode(String classTrainingCode) {
		this.classTrainingCode = classTrainingCode;
	}

	public String getClassCourseCode() {
		return classCourseCode;
	}

	public void setClassCourseCode(String classCourseCode) {
		this.classCourseCode = classCourseCode;
	}

	@Override
	public String toString() {
		return "Class [classCode=" + classCode + ", className=" + className + ", classFacultiCode=" + classFacultiCode
				+ ", classTrainingCode=" + classTrainingCode + ", classCourseCode=" + classCourseCode + "]";
	}

}
