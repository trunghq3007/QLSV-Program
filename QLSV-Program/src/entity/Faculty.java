package entity;

public class Faculty {
  private String facultyCode;
  private String facultyName;
  private String address;
  private String phone;

  public Faculty() {
    super();
  }

  /**
   * Faculty's fields.
   */
  public Faculty(String facultyCode, String facultyName, String address, String phone) {
    super();
    this.facultyCode = facultyCode;
    this.facultyName = facultyName;
    this.address = address;
    this.phone = phone;
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Faculty [facultyCode=" + facultyCode + ", facultyName=" 
        + facultyName + ", address=" + address + ", phone="
        + phone + "]";
  }

}
