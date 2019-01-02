package entity;

/**
 * Create by: thanh - CMC
 * Create date: Jan 2, 2019
 * Modifier: thanh
 * Modified date: Jan 2, 2019
 * Description: 
 * Version 1.0
 */
public class Faculti {
	private String facultiCode;
	private String facultiName;
	private String facultiAddress;
	private String facultiPhone;

	public Faculti() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculti(String facultiCode, String facultiName, String facultiAddress, String facultiPhone) {
		super();
		this.facultiCode = facultiCode;
		this.facultiName = facultiName;
		this.facultiAddress = facultiAddress;
		this.facultiPhone = facultiPhone;
	}

	public String getFacultiCode() {
		return facultiCode;
	}

	public void setFacultiCode(String facultiCode) {
		this.facultiCode = facultiCode;
	}

	public String getFacultiName() {
		return facultiName;
	}

	public void setFacultiName(String facultiName) {
		this.facultiName = facultiName;
	}

	public String getFacultiAddress() {
		return facultiAddress;
	}

	public void setFacultiAddress(String facultiAddress) {
		this.facultiAddress = facultiAddress;
	}

	public String getFacultiPhone() {
		return facultiPhone;
	}

	public void setFacultiPhone(String facultiPhone) {
		this.facultiPhone = facultiPhone;
	}

	@Override
	public String toString() {
		return "Faculti [facultiCode=" + facultiCode + ", facultiName=" + facultiName + ", facultiAddress="
				+ facultiAddress + ", facultiPhone=" + facultiPhone + "]";
	}

}
