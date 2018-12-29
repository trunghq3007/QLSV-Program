/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class Mark {

        private String studentCode;
        private String subjectCode;
        private int semester;
        private float firstMark;
        private float secondMark;

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
        public Mark(String maSV, String maMH, int hocKi, float diemLan1, float diemLan2) {
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

		public String getStudentCode() {
			return studentCode;
		}

		public void setStudentCode(String studentCode) {
			this.studentCode = studentCode;
		}

		public String getSubjectCode() {
			return subjectCode;
		}

		public void setSubjectCode(String subjectCode) {
			this.subjectCode = subjectCode;
		}

		public int getSemester() {
			return semester;
		}

		public void setSemester(int semester) {
			this.semester = semester;
		}

		public float getFirstMark() {
			return firstMark;
		}

		public void setFirstMark(float firstMark) {
			this.firstMark = firstMark;
		}

		public float getSecondMark() {
			return secondMark;
		}

		public void setSecondMark(float secondMark) {
			this.secondMark = secondMark;
		}
}
