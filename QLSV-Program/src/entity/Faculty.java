package entity;

public class Faculty {
	private String facultyCode;
	private String faultyName;
	private String address;
	private int phone;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(String facultyCode, String faultyName, String address, int phone) {
		super();
		this.facultyCode = facultyCode;
		this.faultyName = faultyName;
		this.address = address;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Faculty [facultyCode=" + facultyCode + ", faultyName=" + faultyName + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	public String getFacultyCode() {
		return facultyCode;
	}
	public void setFacultyCode(String facultyCode) {
		this.facultyCode = facultyCode;
	}
	public String getFaultyName() {
		return faultyName;
	}
	public void setFaultyName(String faultyName) {
		this.faultyName = faultyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
