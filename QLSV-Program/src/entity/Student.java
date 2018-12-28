package entity;

public class Student {
    private String StudentId;
    private String StudentName;
    private String gender;
    private String BirthDate;
    private String HomeTown;
    private String ClassId;
    public String getStudentId() {
        return StudentId;
    }
    public void setStudentId(String studentId) {
        StudentId = studentId;
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
    public String getBirthDate() {
        return BirthDate;
    }
    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }
    public String getHomeTown() {
        return HomeTown;
    }
    public void setHomeTown(String homeTown) {
        HomeTown = homeTown;
    }
    public String getClassId() {
        return ClassId;
    }
    public void setClassId(String classId) {
        ClassId = classId;
    }
    public Student(String studentId, String studentName, String gender, String birthDate, String homeTown,
            String classId) {
        super();
        StudentId = studentId;
        StudentName = studentName;
        this.gender = gender;
        BirthDate = birthDate;
        HomeTown = homeTown;
        ClassId = classId;
    }
    @Override
    public String toString() {
        return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", gender=" + gender
                + ", BirthDate=" + BirthDate + ", HomeTown=" + HomeTown + ", ClassId=" + ClassId + "]";
    }
    
    
    

}
