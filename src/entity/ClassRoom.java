/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class ClassRoom {

        private String classCode;
        private String className;
        private String departCode;
        private String typeoftrainningCode;
        private String courseCode;

        /**
         * 
         */
        public ClassRoom() {
        }

        /**
         * @param maLop
         * @param tenLop
         * @param maKhoa
         * @param maHeDT
         * @param maKhoaHoc
         */
        public ClassRoom(String classCode, String className, String departCode, String typeoftrainningCode, String courseCode) {
                this.classCode = classCode;
                this.className = className;
                this.departCode = departCode;
                this.typeoftrainningCode = typeoftrainningCode;
                this.courseCode = courseCode;
        }

        @Override
        public String toString() {
                return "Lop [maLop=" + classCode + ", tenLop=" + className + ", maKhoa=" + departCode + ", maHeDT=" + typeoftrainningCode
                                + ", maKhoaHoc=" + courseCode + "]";
        }

		public String getClassCode() {
			return classCode;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}

		public String getClassName() {
			return className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public String getDepartCode() {
			return departCode;
		}

		public void setDepartCode(String departCode) {
			this.departCode = departCode;
		}

		public String getTypeoftrainningCode() {
			return typeoftrainningCode;
		}

		public void setTypeoftrainningCode(String typeoftrainningCode) {
			this.typeoftrainningCode = typeoftrainningCode;
		}

		public String getCourseCode() {
			return courseCode;
		}

		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}
}
