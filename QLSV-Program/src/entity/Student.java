package entity;


public class Student {
   
    private String studentCode;
    private String studentName;
    private String studentSex;
    private String dateOfBirth;
    private String homeTown;
    private String classCode;
    
    public Student() {
	
    }
    
    public Student(String studentCode, String studentName, String studentSex, String dateOfBirth, String homeTown,
	    String classCode) {
	super();
	this.studentCode = studentCode;
	this.studentName = studentName;
	this.studentSex = studentSex;
	this.dateOfBirth = dateOfBirth;
	this.homeTown = homeTown;
	this.classCode = classCode;
    }
   
    @Override
    public String toString() {
	return "Student [studentCode=" + studentCode + ", studentName=" + studentName + ", studentSex=" + studentSex
		+ ", dateOfBirth=" + dateOfBirth + ", homeTown=" + homeTown + ", classCode=" + classCode + "]";
    }
    public String getStudentCode() {
        return studentCode;
    }
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentSex() {
        return studentSex;
    }
    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getHomeTown() {
        return homeTown;
    }
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
    public String getClassCode() {
        return classCode;
    }
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }
   
  
}
