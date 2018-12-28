package entity;

public class Mark {
    private String studentID;
    private String subjectID;
    private int semester;
    private int mark1;
    private int mark2;

    public Student student;

    public Mark() {
    }

    public Mark(String studentID, String subjectID, int semester, int mark1, int mark2) {
        this.studentID = studentID;
        this.subjectID = subjectID;
        this.semester = semester;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }
}
