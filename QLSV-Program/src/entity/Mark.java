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

}
