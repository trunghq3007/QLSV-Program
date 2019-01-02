/**
 * 
 */

package entity;

/**
 * Class subject.
 */
public class Subject {

  private String subjectCode;

  private String subjectName;

  private int creditsNumber;

  /**
   * Subject method.
   */
  public Subject() {
  }

  /**
   * Constructor using fields.
   */
  public Subject(String subjectCode, String subjectName, int creditsNumber) {
    super();
    this.subjectCode = subjectCode;
    this.subjectName = subjectName;
    this.creditsNumber = creditsNumber;
  }

  public String getSubjectCode() {
    return subjectCode;
  }

  public void setSubjectCode(String subjectCode) {
    this.subjectCode = subjectCode;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectsName(String subjectName) {
    this.subjectName = subjectName;
  }

  public int getCreditsNumber() {
    return creditsNumber;
  }

  public void setCreditsNumber(int creditsNumber) {
    this.creditsNumber = creditsNumber;
  }

  @Override
  public String toString() {
    return "Subject [subjectCode=" + subjectCode 
        + ", subjectName=" + subjectName + ", creditsNumber=" + creditsNumber
        + "]";
  }

}
