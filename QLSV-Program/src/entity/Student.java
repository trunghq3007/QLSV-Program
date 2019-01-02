/**
 * 
 */
package entity;

import java.sql.Date;

/**
 * @author HQTrung
 *
 */
public class Student {
        // mã sinh viên
        private String studentCode;
        // tên sinh viên
        private String studentName;
        // giới tính
        private boolean gender;
        // ngày sinh
        private Date dateOfBirth;
        // quê quán
        private String hometown;
        // mã lớp
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
        public Student(String studentCode, String studentName, boolean gender, String dateOfBirth,
        		String hometown,String classCode) {
                this.studentCode = studentCode;
                this.studentName = studentName;
                this.gender = gender;
                this.dateOfBirth = java.sql.Date.valueOf(dateOfBirth);
                this.hometown = hometown;
                this.classCode = classCode;
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

        public String getStudentCode() {
                return studentCode;
        }

        @Override
        public String toString() {
                return "Student [studentCode=" + studentCode + ", studentName=" + studentName + ", gender=" + gender
                                + ", dateOfBirth=" + dateOfBirth + ", classCode=" + classCode + ", hometown=" + hometown
                                + "]";
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

        public boolean getGender() {
                return gender;
        }

        public void setGender(boolean gender) {
                this.gender = gender;
        }

        public Date getDateOfBirth() {
                return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
        }

        public String getClassCode() {
                return classCode;
        }

        public void setClassCode(String classCode) {
                this.classCode = classCode;
        }

        public String getHometown() {
                return hometown;
        }

        public void setHometown(String hometown) {
                this.hometown = hometown;
        }

}
