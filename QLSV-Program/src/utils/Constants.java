/**
 * 
 */
package utils;

/**
 * Create by: pvhao - CMC Create date: Dec 28, 2018 Modifier: pvhao Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public interface Constants {
    // constant for Student
    interface Student {
        public static final String STUDENT_CODE = "MaSV";
    }

    interface Course {

        // column name
        public static final String COURSE_CODE = "MaKhoaHoc";
        public static final String COURSE_NAME = "TenKhoaHoc";

        // query string select all
        public static final String SELECT_ALL = "select * from khoahoc";
        public static final String SELLECT_BY_CODE = "select * from khoahoc where MaKhoaHoc = ?";
        public static final String INSERT = " insert into KhoaHoc (" + COURSE_CODE + "," + COURSE_NAME
                + ")  values (?,?) ;";
        public static final String UPDATE = " update KhoaHoc set TenKhoaHoc = ? where MaKhoaHoc = ? ;";
        public static final String DELETE = "delete from  KhoaHoc  where MaKhoaHoc = ? ;";
    }

    // constant for HeDT
    interface HeDT {
        public static final String HEDT_MA = "MaHeDT";
        public static final String HEDT_TEN = "TenHeDT";

        // query string select all
        public static final String SELECT_ALL = "select * from hedt";
        public static final String SELLECT_BY_CODE = "select * from hedt where MaHeDT = ?";
        public static final String INSERT = " insert into hedt (" + HEDT_MA + "," + HEDT_TEN + ")  values (?,?) ;";
        public static final String UPDATE = " update HeDT set TenHeDT = ? where MaHeDT = ? ;";
        public static final String DELETE = "delete from  HeDT  where MaHeDT = ? ;";
    }

    // constant for Khoa
    interface Khoa {
        public static final String KHOA_MA = "MaKhoa";
        public static final String KHOA_TEN = "TenKhoa";
        public static final String KHOA_DIACHI = "DiaChi";
        public static final String KHOA_DIENTHOAI = "DienThoai";
        // query string select all
        public static final String SELECT_ALL = "select * from Khoa";
        public static final String SELLECT_BY_CODE = "select * from Khoa" + " where MaKhoa = ?";
        public static final String INSERT = " insert into Khoa (" + KHOA_MA + "," + KHOA_TEN + "," + KHOA_DIACHI + ","
                + KHOA_DIENTHOAI + ")  values (?,?,?,?) ;";
        public static final String UPDATE = " update Khoa set TenKhoa = ?,DiaChi = ?,DienThoai = ?  where MaHeDT = ? ;";
        public static final String DELETE = "delete from  HeDT  where MaKhoa = ? ;";
    }

}
