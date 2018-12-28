package entity;

public class Subject {
    private String SubjectId;
    private String SubjectName;
    private int NumberOfCredit;
    public String getSubjectId() {
        return SubjectId;
    }
    public void setSubjectId(String subjectId) {
        SubjectId = subjectId;
    }
    public String getSubjectName() {
        return SubjectName;
    }
    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }
    public int getNumberOfCredit() {
        return NumberOfCredit;
    }
    public void setNumberOfCredit(int numberOfCredit) {
        NumberOfCredit = numberOfCredit;
    }
    public Subject(String subjectId, String subjectName, int numberOfCredit) {
        super();
        SubjectId = subjectId;
        SubjectName = subjectName;
        NumberOfCredit = numberOfCredit;
    }
    @Override
    public String toString() {
        return "Subject [SubjectId=" + SubjectId + ", SubjectName=" + SubjectName + ", NumberOfCredit=" + NumberOfCredit
                + "]";
    }
    
    

}
