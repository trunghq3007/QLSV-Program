/**
 * 
 */
package entity;

/**
 * @author HQTrung des: MonHoc
 */
public class Subject {
	// code of subject
	private String subjectCode;
	// name of subject
	private String SubjectName;
	// creadits of subject
	private int subjectCredits;

	public Subject() {
	}

	public Subject(String subjectCode, String subjectName, int subjectCredits) {
		super();
		this.subjectCode = subjectCode;
		SubjectName = subjectName;
		this.subjectCredits = subjectCredits;
	}

	public Subject(String subjectName, int subjectCredits) {
		super();
		SubjectName = subjectName;
		this.subjectCredits = subjectCredits;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public int getSubjectCredits() {
		return subjectCredits;
	}

	public void setSubjectCredits(int subjectCredits) {
		this.subjectCredits = subjectCredits;
	}

	public void show() {

	}
}
