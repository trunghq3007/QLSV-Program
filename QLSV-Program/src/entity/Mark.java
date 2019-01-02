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
        private String studentCode;
        // mã môn học
        private String subjectCode;
        // học kì
        private float semester;
        // điểm lần 1
        private float firstMark;
        // điểm lần 2
        private float secondMark;
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
        public Mark(String maSV, String maMH, float hocKi, float diemLan1, float diemLan2) {
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

        public String getMaSV() {
                return studentCode;
        }

        public void setMaSV(String maSV) {
                this.studentCode = maSV;
        }

        public String getMaMH() {
                return subjectCode;
        }

        public void setMaMH(String maMH) {
                this.subjectCode = maMH;
        }

        public float getHocKi() {
                return semester;
        }

        public void setHocKi(int hocKi) {
                this.semester = hocKi;
        }

        public float getDiemLan1() {
                return firstMark;
        }

        public void setDiemLan1(int diemLan1) {
                this.firstMark = diemLan1;
        }

        public float getDiemLan2() {
                return secondMark;
        }

        public void setDiemLan2(int diemLan2) {
                this.secondMark = diemLan2;
        }

}
