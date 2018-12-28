<<<<<<< HEAD
<<<<<<< HEAD
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
        private char studentCode;
        // mã môn học
        private char subjectCode;
        // học kì
        private int semester;
        // điểm lần 1
        private int firstMark;
        // điểm lần 2
        private int secondMark;
        public Student sinhVien;

        /**
         * 
         */
        public Mark() {
        }

        /**
         * @param maSV
         * @param maMH
         * @param hocKi
         * @param diemLan1
         * @param diemLan2
         */
        public Mark(char maSV, char maMH, int hocKi, int diemLan1, int diemLan2) {
                this.studentCode = maSV;
                this.subjectCode = maMH;
                this.semester = hocKi;
                this.firstMark = diemLan1;
                this.secondMark = diemLan2;
        }

        @Override
        public String toString() {
                return "Diem [maSV=" + studentCode + ", maMH=" + subjectCode + ", hocKi=" + semester + ", diemLan1=" + firstMark
                                + ", diemLan2=" + secondMark + "]";
        }

        public char getMaSV() {
                return studentCode;
        }

        public void setMaSV(char maSV) {
                this.studentCode = maSV;
        }

        public char getMaMH() {
                return subjectCode;
        }

        public void setMaMH(char maMH) {
                this.subjectCode = maMH;
        }

        public int getHocKi() {
                return semester;
        }

        public void setHocKi(int hocKi) {
                this.semester = hocKi;
        }

        public int getDiemLan1() {
                return firstMark;
        }

        public void setDiemLan1(int diemLan1) {
                this.firstMark = diemLan1;
        }

        public int getDiemLan2() {
                return secondMark;
        }

        public void setDiemLan2(int diemLan2) {
                this.secondMark = diemLan2;
        }
=======
package entity;

public class Mark {
    private String StudentId;
    private String SubjectId;
    private int semester;
    private int mark1;
    private int mark2;
    public Student student;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String subjectId) {
        SubjectId = subjectId;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public Mark(String studentId, String subjectId, int semester, int mark1, int mark2) {
        super();
        StudentId = studentId;
        SubjectId = subjectId;
        this.semester = semester;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    @Override
    public String toString() {
        return "Mark [StudentId=" + StudentId + ", SubjectId=" + SubjectId + ", semester=" + semester + ", mark1="
                + mark1 + ", mark2=" + mark2 + "]";
    }
>>>>>>> branch 'tthyen' of https://github.com/trunghq3007/QLSV-Program.git
=======
package entity;

public class Mark {
    private String StudentId;
    private String SubjectId;
    private int semester;
    private int mark1;
    private int mark2;
    public Student student;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String subjectId) {
        SubjectId = subjectId;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public Mark(String studentId, String subjectId, int semester, int mark1, int mark2) {
        super();
        StudentId = studentId;
        SubjectId = subjectId;
        this.semester = semester;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    @Override
    public String toString() {
        return "Mark [StudentId=" + StudentId + ", SubjectId=" + SubjectId + ", semester=" + semester + ", mark1="
                + mark1 + ", mark2=" + mark2 + "]";
    }
>>>>>>> refs/remotes/origin/tthyen

}
