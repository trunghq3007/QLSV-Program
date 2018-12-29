/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class Depart {

        private String departCode;
        private String departName;
        private String address;
        private String phone;

        /**
         * @param maKhoa
         * @param tenKhoa
         * @param diaChi
         * @param dienThoai
         */
        public Depart(String departCode, String departName, String address, String phone) {
        	this.departCode = departCode;
        	this.departName = departName;
        	this.address = address;
        	this.phone = phone;
        }

        /**
         * 
         */
        public Depart() {
        }

        @Override
        public String toString() {
                return "Khoa [maKhoa=" + departCode + ", tenKhoa=" + departName + ", diaChi=" + address + ", dienThoai="
                                + phone + "]";
        }

		public String getDepartCode() {
			return departCode;
		}

		public void setDepartCode(String departCode) {
			this.departCode = departCode;
		}

		public String getDepartName() {
			return departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
}
