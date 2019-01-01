/**
 * 
 */
package entity;

/**
 * Create by: NVDiem
 * Create date: Jan 1, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 1, 2019
 * Description: ....
 * Version 1.0
 */
public class Faculty {
	// mã khoa
	private char facultyID;
	// tên khoa
	private String facultyName;
	// địa chỉ
	private String address;
	// điện thoại
	private String phoneNumber;

	/**
	 * @param maKhoa
	 * @param tenKhoa
	 * @param diaChi
	 * @param dienThoai
	 */
	public Faculty(char facultyID, String facultyName, String address, String phoneNumber) {
		this.facultyID = facultyID;
		this.facultyName = facultyName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 
	 */
	public Faculty() {
	}

	public char getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(char facultyID) {
		this.facultyID = facultyID;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Faculty [facultyID=" + facultyID + ", facultyName=" + facultyName + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}

}
