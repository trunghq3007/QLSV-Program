/**
 * 
 */
package entity;


/**
 * @author haopham
 *
 */
public class HeDT {
        // mã hệ đào tạo
        private String maHeDT;
        // tên hệ đào tạo
        private String tenHeDT;

        /**
         * 
         */
        public HeDT() {
        }

        /**
         * @param maHeDT
         * @param tenHeDT
         */
        public HeDT(String maHeDT, String tenHeDT) {
                this.maHeDT = maHeDT;
                this.tenHeDT = tenHeDT;
        }

        @Override
        public String toString() {
                return "HeDT [maHeDT=" + maHeDT + ", tenHeDT=" + tenHeDT + "]";
        }

        public String getMaHeDT() {
                return maHeDT;
        }

        public void setMaHeDT(String maHeDT) {
                this.maHeDT = maHeDT;
        }

        public String getTenHeDT() {
                return tenHeDT;
        }

        public void setTenHeDT(String tenHeDT) {
                this.tenHeDT = tenHeDT;
        }

}
