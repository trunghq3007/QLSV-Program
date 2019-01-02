/**
 * 
 */
package entity;

/**
 * @author HQTrung
 * des: MonHoc
 */
public class MonHoc {
        // mã môn học
        private String maMH;
        // tên môn học
        private String tenMH;
        // số trình
        private int soTrinh;

        /**
         * 
         */
        public MonHoc() {
        }

        /**
         * @param maMH
         * @param tenMH
         * @param soTrinh
         */
        public MonHoc(String maMH, String tenMH, int soTrinh) {
                this.maMH = maMH;
                this.tenMH = tenMH;
                this.soTrinh = soTrinh;
        }

        @Override
        public String toString() {
                return "MonHoc [maMH=" + maMH + ", tenMH=" + tenMH + ", soTrinh=" + soTrinh + "]";
        }

        public String getMaMH() {
                return maMH;
        }

        public void setMaMH(String maMH) {
                this.maMH = maMH;
        }

        public String getTenMH() {
                return tenMH;
        }

        public void setTenMH(String tenMH) {
                this.tenMH = tenMH;
        }

        public int getSoTrinh() {
                return soTrinh;
        }

        public void setSoTrinh(int soTrinh) {
                this.soTrinh = soTrinh;
        }

}
