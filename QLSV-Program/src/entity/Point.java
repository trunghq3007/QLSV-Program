package entity;

public class Point {
	private String studentCode;
	private String subjectsCode;
	private int semester;
	private int pointOne;
	private int pointTwo;
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point(String studentCode, String subjectsCode, int semester, int pointOne, int pointTwo) {
		super();
		this.studentCode = studentCode;
		this.subjectsCode = subjectsCode;
		this.semester = semester;
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
	}
	@Override
	public String toString() {
		return "Point [studentCode=" + studentCode + ", subjectsCode=" + subjectsCode + ", semester=" + semester
				+ ", pointOne=" + pointOne + ", pointTwo=" + pointTwo + "]";
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getSubjectsCode() {
		return subjectsCode;
	}
	public void setSubjectsCode(String subjectsCode) {
		this.subjectsCode = subjectsCode;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getPointOne() {
		return pointOne;
	}
	public void setPointOne(int pointOne) {
		this.pointOne = pointOne;
	}
	public int getPointTwo() {
		return pointTwo;
	}
	public void setPointTwo(int pointTwo) {
		this.pointTwo = pointTwo;
	}
	
}
