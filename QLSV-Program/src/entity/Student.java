package entity;

import java.util.Date;

public class Student {
    private String studentID;
    private String studentName;
    private String gender;
    private Date birthday;
    private String classID;
    private String homeTown;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Student(String studentID, String studentName, String gender, Date birthday, String classID, String homeTown) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gender = gender;
        this.birthday = birthday;
        this.classID = classID;
        this.homeTown = homeTown;
    }

    public Student() {
    }
}
