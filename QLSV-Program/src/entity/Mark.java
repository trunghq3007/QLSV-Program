/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class Mark {
	// mã sinh viên
	private char studentID;
	// mã môn học
	private char subjectID;
	// học kì
	private int semester;
	// điểm lần 1
	private int firstMark;
	// điểm lần 2
	private int secondMark;

	public Mark() {
	}

	/**
	 * @param studentID
	 * @param subjectID
	 * @param semester
	 * @param firstMark
	 * @param secondMark
	 */
	public Mark(char studentID, char subjectID, int semester, int firstMark, int secondMark) {
		this.studentID = studentID;
		this.subjectID = subjectID;
		this.semester = semester;
		this.firstMark = firstMark;
		this.secondMark = secondMark;
	}

	public char getStudentID() {
		return studentID;
	}

	public void setStudentID(char studentID) {
		this.studentID = studentID;
	}

	public char getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(char subjectID) {
		this.subjectID = subjectID;
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

}
