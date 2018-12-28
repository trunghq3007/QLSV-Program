package entity;

public class Mark {
    private String StudentId;
    private String SubjectId;
    private int semester;
    private int mark1;
    private int mark2;
    public Student student;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String subjectId) {
        SubjectId = subjectId;
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

    public Mark(String studentId, String subjectId, int semester, int mark1, int mark2) {
        super();
        StudentId = studentId;
        SubjectId = subjectId;
        this.semester = semester;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    @Override
    public String toString() {
        return "Mark [StudentId=" + StudentId + ", SubjectId=" + SubjectId + ", semester=" + semester + ", mark1="
                + mark1 + ", mark2=" + mark2 + "]";
    }

}
