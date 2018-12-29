/**
 * 
 */
package entity;

/**
 * @author HQTrung
 * des: MonHoc
 */
public class Subject {
        private String subjectCode;
        private String subjectName;
        private int numberCredits;

        /**
         * 
         */
        public Subject() {
        }

        /**
         * @param maMH
         * @param tenMH
         * @param soTrinh
         */
        public Subject(String subjectCode, String subjectName, int numberCredits) {
                this.subjectCode = subjectCode;
                this.subjectName = subjectName;
                this.numberCredits = numberCredits;
        }

        @Override
        public String toString() {
                return "MonHoc [maMH=" + subjectCode + ", tenMH=" + subjectName + ", soTrinh=" + numberCredits + "]";
        }

		public String getSubjectCode() {
			return subjectCode;
		}

		public void setSubjectCode(String subjectCode) {
			this.subjectCode = subjectCode;
		}

		public String getSubjectName() {
			return subjectName;
		}

		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}

		public int getNumberCredits() {
			return numberCredits;
		}

		public void setNumberCredits(int numberCredits) {
			this.numberCredits = numberCredits;
		}

}
