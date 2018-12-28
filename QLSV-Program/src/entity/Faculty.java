package entity;

public class Faculty {
    private String FacultyId;
    private String FacultyName;
    private String address;
    private String phoneNumber;

    public String getFacultyId() {
        return FacultyId;
    }

    public void setFacultyId(String facultyId) {
        FacultyId = facultyId;
    }

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String facultyName) {
        FacultyName = facultyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty(String facultyId, String facultyName, String address, String phoneNumber) {
        super();
        FacultyId = facultyId;
        FacultyName = facultyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Faculty [FacultyId=" + FacultyId + ", FacultyName=" + FacultyName + ", address=" + address
                + ", phoneNumber=" + phoneNumber + "]";
    }

}
