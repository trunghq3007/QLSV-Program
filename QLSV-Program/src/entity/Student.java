/**
 * 
 */
package entity;

/**
 * @author User
 *
 */
public class Student {
    private String studentCode ;
    private String studentName;
    private Boolean sex;
    private String birthDay;
    private String country;
    private String classCode;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentCode, String studentName, Boolean sex, String birthDay, String country,
			String classCode) {
		super();
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.sex = sex;
		this.birthDay = birthDay;
		this.country = country;
		this.classCode = classCode;
	}
	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", studentName=" + studentName + ", sex=" + sex + ", birthDay="
				+ birthDay + ", country=" + country + ", classCode=" + classCode + "]";
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
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
    
  
   
}
