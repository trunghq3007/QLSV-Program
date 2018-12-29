/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class Student {

        private String studentCode;
        private String studentName;
        private byte gender;
        private String dateOfBirth;
        private String hometown;
        private String classCode;

        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
         * Modified date: Dec 28, 2018
         * Description: ....
         * Version 1.0
         * @param studentCode
         * @param studentName
         * @param gender
         * @param dateOfBirth
         * @param classCode
         * @param hometown
         */
        public Student(String studentCode, String studentName, byte gender, String dateOfBirth, String classCode,
                        String hometown) {
                this.studentCode = studentCode;
                this.studentName = studentName;
                this.gender = gender;
                this.dateOfBirth = dateOfBirth;
                this.classCode = classCode;
                this.hometown = hometown;
        }

        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
         * Modified date: Dec 28, 2018
         * Description: ....
         * Version 1.0
         */
        public Student() {
        }

        @Override
        public String toString() {
                return "Student [studentCode=" + studentCode + ", studentName=" + studentName + ", gender=" + gender
                                + ", dateOfBirth=" + dateOfBirth + ", classCode=" + classCode + ", hometown=" + hometown
                                + "]";
        }

		public String getStudentCode() {
			return studentCode;
		}

		public void setStudentCode(String studentCode) {
			this.studentCode = studentCode;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public byte getGender() {
			return gender;
		}

		public void setGender(byte gender) {
			this.gender = gender;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getHometown() {
			return hometown;
		}

		public void setHometown(String hometown) {
			this.hometown = hometown;
		}

		public String getClassCode() {
			return classCode;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}
}
