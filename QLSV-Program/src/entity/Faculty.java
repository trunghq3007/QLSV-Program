package entity;

public class Faculty {
    private String facultyID;
    private String facultyName;
    private String facultyAddress;
    private String facultyPhone;

    public Faculty(String facultyID, String facultyName, String facultyAddress, String facultyPhone) {
        this.facultyID = facultyID;
        this.facultyName = facultyName;
        this.facultyAddress = facultyAddress;
        this.facultyPhone = facultyPhone;
    }

    public Faculty() {
    }

    public String getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyAddress() {
        return facultyAddress;
    }

    public void setFacultyAddress(String facultyAddress) {
        this.facultyAddress = facultyAddress;
    }

    public String getFacultyPhone() {
        return facultyPhone;
    }

    public void setFacultyPhone(String facultyPhone) {
        this.facultyPhone = facultyPhone;
    }
}
