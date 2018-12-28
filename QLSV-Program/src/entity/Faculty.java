/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:40 PM
 */
package entity;

import utils.Constants;

/**
 * Class: Faculty
 */
public class Faculty {
	// Attribute
	private String facultyId; // faculty code
	private String name; // faculty name
	private String address; // faculty address
	private String phoneNumber; // phoneNumber of faculty

	// Getter and setter
	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	// Constructor
	/**
	 * @param facultyId
	 * @param name
	 * @param address
	 * @param phoneNumber
	 */
	public Faculty(String facultyId, String name, String address, String phoneNumber) {
		super();
		this.facultyId = facultyId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Faculty() {
		super();
	}

	// toString
	@Override
	public String toString() {
		return String.format(Constants.ToStringFormatter.FACULTY, facultyId, name, address, phoneNumber);
	}
}
