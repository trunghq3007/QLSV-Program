/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:40 PM
 */
package dal;

/**
 * Class: Khóa học
 */
public class Course {
    // Attribute
    private String courseId; //Mã khóa học
    private String name; // Tên khóa học

    // Getter and setter
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Constructor
    public Course(String courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return String.format("%5s %s", this.courseId, this.name);
    }
}
