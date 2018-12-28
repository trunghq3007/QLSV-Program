package entity;

public class Subject {
    private String subjectID;
    private String subjectName;
    private int numberOfCredits;

    public Subject() {
    }

    public Subject(String subjectID, String subjectName, int numberOfCredits) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.numberOfCredits = numberOfCredits;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

}
