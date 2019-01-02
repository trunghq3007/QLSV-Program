
/**
 * 
 */

package entity;

/**Course class.
 * @author HQTrung
 *
 */
public class Course {
  // Code of course
  private String courseCode;
  // Name of course
  private String courseName;

  /**course method.
   * 
   */
  public Course() {
  }

  /**
   * Create by: HQTrung - CMC
   * Create date: Dec 28, 2018
   * Modifier: HQTrung
   * Modified date: Dec 28, 2018
   * Description: ....
   * Version 1.0
   *
   */
  public Course(String courseCode, String courseName) {
    this.courseCode = courseCode;
    this.courseName = courseName;
  }

  @Override
  public String toString() {
    return "Course [courseCode=" + courseCode + ", courseName=" + courseName + "]";
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

}
