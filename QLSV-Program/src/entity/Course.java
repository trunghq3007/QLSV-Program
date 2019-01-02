package entity;

public class Course {
    private String courseCode;
    private String courseName;
    
    public Course() {
	
    }
    
    public Course(String courseCode, String courseName) {
	super();
	this.courseCode = courseCode;
	this.courseName = courseName;
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

    @Override
    public String toString() {
	return courseCode +"\t\t" + courseName;
    }

}
