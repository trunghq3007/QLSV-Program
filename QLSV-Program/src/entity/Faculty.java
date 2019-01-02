package entity;

public class Faculty {
    @Override
    public String toString() {
	return "Faculty [facultyAddress=" + facultyAddress + ", facultyCode=" + facultyCode + ", facultyName="
		+ facultyName + ", facultyTel=" + facultyTel + "]";
    }

    private String facultyAddress;
    private String facultyCode;
    private String facultyName;
    private String facultyTel;

    public Faculty() {
	
    }
    public Faculty(String facultyAddress, String facultyCode, String facultyName, String facultyTel) {
	super();
	this.facultyAddress = facultyAddress;
	this.facultyCode = facultyCode;
	this.facultyName = facultyName;
	this.facultyTel = facultyTel;
    }

    public String getFacultyAddress() {
	return facultyAddress;
    }

    public void setFacultyAddress(String facultyAddress) {
	this.facultyAddress = facultyAddress;
    }

    public String getFacultyCode() {
	return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
	this.facultyCode = facultyCode;
    }

    public String getFacultyName() {
	return facultyName;
    }

    public void setFacultyName(String facultyName) {
	this.facultyName = facultyName;
    }

    public String getFacultyTel() {
	return facultyTel;
    }

    public void setFacultyTel(String facultyTel) {
	this.facultyTel = facultyTel;
    }

}
