/**
 * 
 */
package entity;

/**
 * @author pvhao
 *
 */
public class Khoa {
        // mã khoa
        private String maKhoa;
        // tên khoa
        private String tenKhoa;
        // địa chỉ
        private String diaChi;
        // điện thoại
        private String dienThoai;

        /**
         * @param maKhoa
         * @param tenKhoa
         * @param diaChi
         * @param dienThoai
         */
        public Khoa(String maKhoa, String tenKhoa, String diaChi, String dienThoai) {
                this.maKhoa = maKhoa;
                this.tenKhoa = tenKhoa;
                this.diaChi = diaChi;
                this.dienThoai = dienThoai;
        }

        /**
         * 
         */
        public Khoa() {
        }

        @Override
        public String toString() {
                return "Khoa [maKhoa=" + maKhoa + ", tenKhoa=" + tenKhoa + ", diaChi=" + diaChi + ", dienThoai="
                                + dienThoai + "]";
        }

        public String getMaKhoa() {
                return maKhoa;
        }

        public void setMaKhoa(String maKhoa) {
                this.maKhoa = maKhoa;
        }

        public String getTenKhoa() {
                return tenKhoa;
        }

        public void setTenKhoa(String tenKhoa) {
                this.tenKhoa = tenKhoa;
        }

        public String getDiaChi() {
                return diaChi;
        }

        public void setDiaChi(String diaChi) {
                this.diaChi = diaChi;
        }

        public String getDienThoai() {
                return dienThoai;
        }

        public void setDienThoai(String dienThoai) {
                this.dienThoai = dienThoai;
        }

}
