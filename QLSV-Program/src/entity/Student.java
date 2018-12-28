package entity;

import java.util.Date;

import utils.Constants;

public class Student{
	private String studentCode;
	private String studentName;
	private int gender;
	private Date dateOfBirth;
	private String address;
	private int classCode;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentCode, String studentName, int gender, Date dateOfBirth, String address,
			int classCode) {
		super();
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.classCode = classCode;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getClassCode() {
		return classCode;
	}
	public void setClassCode(int classCode) {
		this.classCode = classCode;
	}
	
}
