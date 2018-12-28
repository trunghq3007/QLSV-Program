package entity;

public class Class {
    private String classID;
    private String className;
    private String facultyID;
    private String typeOfTrainingID;
    private String courseID;

    public Class() {
    }

    public Class(String classID, String className, String facultyID, String typeOfTrainingID, String courseID) {
        this.classID = classID;
        this.className = className;
        this.facultyID = facultyID;
        this.typeOfTrainingID = typeOfTrainingID;
        this.courseID = courseID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    public String getTypeOfTrainingID() {
        return typeOfTrainingID;
    }

    public void setTypeOfTrainingID(String typeOfTrainingID) {
        this.typeOfTrainingID = typeOfTrainingID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

}
