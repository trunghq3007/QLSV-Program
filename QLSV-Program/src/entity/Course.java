/**
 * 
 */
package entity;

/**
 * @author User
 *
 */
public class Course {
    
    private String courseCode;
    
    private String courseName;

    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     */
    public Course() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param courseCode
     * @param courseName
     */
    public Course(String courseCode, String courseName) {
        super();
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
