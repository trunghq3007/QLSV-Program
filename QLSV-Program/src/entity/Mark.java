package entity;

public class Mark {
	private char studentCode;
	private char subjectCode;
	private int semester;
	private int firstMark;
	private int secondMark;
	public Mark() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mark(char studentCode, char subjectCode, int semester, int firstMark, int secondMark) {
		super();
		this.studentCode = studentCode;
		this.subjectCode = subjectCode;
		this.semester = semester;
		this.firstMark = firstMark;
		this.secondMark = secondMark;
	}
	public char getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(char studentCode) {
		this.studentCode = studentCode;
	}
	public char getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(char subjectCode) {
		this.subjectCode = subjectCode;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getFirstMark() {
		return firstMark;
	}
	public void setFirstMark(int firstMark) {
		this.firstMark = firstMark;
	}
	public int getSecondMark() {
		return secondMark;
	}
	public void setSecondMark(int secondMark) {
		this.secondMark = secondMark;
	}
	@Override
	public String toString() {
		return "Mark [studentCode=" + studentCode + ", subjectCode=" + subjectCode + ", semester=" + semester
				+ ", firstMark=" + firstMark + ", secondMark=" + secondMark + "]";
	}
	
}
