package entity;

public class Student {
  private String StudentCode;
  private String StudentName;
  private String gender;
  private String dateOfBirth;
  private String hometown;
  private String classCode;

  public Student() {
    super();
  }

  /**
   * Constructor using fields.
   */
  public Student(String studentCode, String studentName,
      String gender, String dateOfBirth, String hometown,
      String classCode) {
    super();
    StudentCode = studentCode;
    StudentName = studentName;
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
    this.hometown = hometown;
    this.classCode = classCode;
  }

  public String getStudentCode() {
    return StudentCode;
  }

  public void setStudentCode(String studentCode) {
    StudentCode = studentCode;
  }

  public String getStudentName() {
    return StudentName;
  }

  public void setStudentName(String studentName) {
    StudentName = studentName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getHometown() {
    return hometown;
  }

  public void setHometown(String hometown) {
    this.hometown = hometown;
  }

  public String getClassCode() {
    return classCode;
  }

  public void setClassCode(String classCode) {
    this.classCode = classCode;
  }

  @Override
  public String toString() {
    return "Student [StudentCode=" + StudentCode + ", StudentName=" 
        + StudentName + ", gender=" + gender
        + ", dateOfBirth=" + dateOfBirth + ", hometown=" + hometown 
        + ", classCode=" + classCode + "]";
  }

}
