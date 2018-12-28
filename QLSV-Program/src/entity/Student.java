/**
 * 
 */
package entity;

/**
 * @author User
 *
 */
public class Student {
    private String MaSV ;
    private String TenSV;
    private Boolean GioiTinh;
    private String NgaySinh;
    private String QueQuan;
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param maSV
     * @param tenSV
     * @param gioiTinh
     * @param ngaySinh
     * @param queQuan
     */
    public Student(String maSV, String tenSV, Boolean gioiTinh, String ngaySinh, String queQuan) {
        super();
        MaSV = maSV;
        TenSV = tenSV;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
        QueQuan = queQuan;
    }
    public String getMaSV() {
        return MaSV;
    }
    public void setMaSV(String maSV) {
        MaSV = maSV;
    }
    public String getTenSV() {
        return TenSV;
    }
    public void setTenSV(String tenSV) {
        TenSV = tenSV;
    }
    public Boolean getGioiTinh() {
        return GioiTinh;
    }
    public void setGioiTinh(Boolean gioiTinh) {
        GioiTinh = gioiTinh;
    }
    public String getNgaySinh() {
        return NgaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }
    public String getQueQuan() {
        return QueQuan;
    }
    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }
   

   
}
