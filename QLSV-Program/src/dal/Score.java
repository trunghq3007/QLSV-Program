/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:40 PM
 */
package dal;

/**
 * Class: Điểm
 */
public class Score {
    // Attribute
    private String studentId; // Mã sinh viên
    private String subjectId; // Tên sinh viên
    private int semester; // Học kỳ
    private float firstPoint; // Điểm lần 1
    private float secondPoint; // Điêm lần 2

    //Getter and setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(float firstPoint) {
        this.firstPoint = firstPoint;
    }

    public float getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(float secondPoint) {
        this.secondPoint = secondPoint;
    }

    // Constructor
	/**
	 * @param studentId
	 * @param subjectId
	 * @param semester
	 * @param firstPoint
	 * @param secondPoint
	 */
	public Score(String studentId, String subjectId, int semester, float firstPoint, float secondPoint) {
		super();
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.semester = semester;
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
	}
	public Score() {
		super();
	}
    
    // toString
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%5s %5s %2d %3.2f %3.2f",	studentId, subjectId, semester, firstPoint, secondPoint);
	}
}
