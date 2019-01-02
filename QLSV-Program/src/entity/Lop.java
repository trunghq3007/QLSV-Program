package entity;

public class Lop {
  private String classCode;
  private String className;
  private String facultyCode;
  private String totCode;
  private String subjectCode;

  public Lop() {
    super();
  }

  /**
   *Constructor using fields.
   */
  public Lop(String classCode, String className, String facultyCode, 
      String totCode, String subjectCode) {
    super();
    this.classCode = classCode;
    this.className = className;
    this.facultyCode = facultyCode;
    this.totCode = totCode;
    this.subjectCode = subjectCode;
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

  public String getFacultyCode() {
    return facultyCode;
  }

  public void setFacultyCode(String facultyCode) {
    this.facultyCode = facultyCode;
  }

  public String getTotCode() {
    return totCode;
  }

  public void setTotCode(String totCode) {
    this.totCode = totCode;
  }

  public String getSubjectCode() {
    return subjectCode;
  }

  public void setSubjectCode(String subjectCode) {
    this.subjectCode = subjectCode;
  }

  @Override
  public String toString() {
    return "Lop [classCode=" + classCode + ", className=" 
        + className + ", facultyCode=" + facultyCode + ", totCode="
        + totCode + ", subjectCode=" + subjectCode + "]";
  }

}
