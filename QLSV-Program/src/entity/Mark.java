package entity;

public class Mark {
  private String studentCode;
  private String subjectCode;
  private int semester;
  private int firstMark;
  private int secondMark;

  public Mark() {
    super();
  }

  /**
   * Constructor using fields.
   */
  public Mark(String studentCode, String subjectCode, int semester, int firstMark, int secondMark) {
    super();
    this.studentCode = studentCode;
    this.subjectCode = subjectCode;
    this.semester = semester;
    this.firstMark = firstMark;
    this.secondMark = secondMark;
  }

  public String getStudentCode() {
    return studentCode;
  }

  public void setStudentCode(String studentCode) {
    this.studentCode = studentCode;
  }

  public String getSubjectCode() {
    return subjectCode;
  }

  public void setSubjectCode(String subjectCode) {
    this.subjectCode = subjectCode;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  public int getFirstMark() {
    return firstMark;
  }

  public void setFirstMark(int firstMark) {
    this.firstMark = firstMark;
  }

  public int getSecondMark() {
    return secondMark;
  }

  public void setSecondMark(int secondMark) {
    this.secondMark = secondMark;
  }

  @Override
  public String toString() {
    return "Mark [studentCode=" + studentCode + ", subjectCode=" 
        + subjectCode + ", semester=" + semester
        + ", firstMark=" + firstMark + ", secondMark=" + secondMark + "]";
  }

}
