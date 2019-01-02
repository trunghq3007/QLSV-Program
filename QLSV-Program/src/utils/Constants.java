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
        public static final String STUDENT_NAME = "TenSV";
        public static final String STUDENT_GENDER = "GioiTinh";
        public static final String STUDENT_DATEOFBIRTH = "NgaySinh";
        public static final String STUDENT_HOMETOWN = "QueQuan";
        public static final String STUDENT_SUBJECTCODE = "MaLop";
        // query string select all
        public static final String SELECT_ALL = "select * from SinhVien";
        public static final String SELLECT_BY_CODE = "select * from SinhVien" + " where " + STUDENT_CODE + " = ?";
        public static final String INSERT = " insert into Lop (" + STUDENT_CODE + "," + STUDENT_NAME + ","
                + STUDENT_GENDER + "," + STUDENT_DATEOFBIRTH + "," + STUDENT_HOMETOWN + "," + STUDENT_SUBJECTCODE
                + ")  values (?,?,?,?,?) ;";
        public static final String UPDATE = " update SinhVien set " + STUDENT_NAME + "= ? ," + STUDENT_GENDER + "= ? ,"
                + STUDENT_DATEOFBIRTH + " = ?, " + STUDENT_HOMETOWN + "=?," + STUDENT_SUBJECTCODE + "= ?  where "
                + STUDENT_CODE + "= ? ;";
        public static final String DELETE = "delete from  Lop  where MaKhoa = ? ;";
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
        public static final String DELETE = "delete from  Khoa  where Khoa = ? ;";
    }

    interface Lop {
        public static final String LOP_MA = "MaLop";
        public static final String LOP_TEN = "TenLop";
        public static final String LOP_MAKHOA = "MaKhoa";
        public static final String LOP_MAHEDT = "MaHeDT";
        public static final String LOP_MAKHOAHOC = "MaKhoaHoc";
        // query string select all
        public static final String SELECT_ALL = "select * from Lop";
        public static final String SELLECT_BY_CODE = "select * from Lop" + " where MaLop = ?";
        public static final String INSERT = " insert into Lop (" + LOP_MA + "," + LOP_TEN + "," + LOP_MAKHOA + ","
                + LOP_MAHEDT + "," + LOP_MAKHOAHOC + ")  values (?,?,?,?,?) ;";
        public static final String UPDATE = " update lop set TenLop = ?,MaKhoa = ?,MaHeDT = ?, MaKhoaHoc = ?  where MaLop = ? ;";
        public static final String DELETE = "delete from  Lop  where MaKhoa = ? ;";
    }

    interface Mark {
        public static final String MARK_MASV = "MaSV";
        public static final String MARK_MAMH = "MaMH";
        public static final String MARK_HOCKY = "HocKy";
        public static final String MARK_DIEMLAN1 = "DiemLan1";
        public static final String MARK_DIEMLAN2 = "DiemLan2";
        // query string select all
        public static final String SELECT_ALL = "select * from Lop";
        public static final String SELLECT_BY_CODE = "select * from Lop" + " where MaSV = ?";
        public static final String INSERT = " insert into Lop (" + MARK_MASV + "," + MARK_MAMH + "," + MARK_HOCKY + ","
                + MARK_DIEMLAN1 + "," + MARK_DIEMLAN2 + ")  values (?,?,?,?,?) ;";
        public static final String UPDATE = " update lop set " + MARK_HOCKY + "= ? ," + MARK_DIEMLAN1 + "= ? ,"
                + MARK_DIEMLAN2 + " = ? " + " where " + MARK_MASV + "= ? and " + MARK_MAMH + "= ?";
        public static final String DELETE = "delete from  Lop where " + MARK_MASV + "= ? and " + MARK_MAMH + "= ?";
    }

    interface MonHoc {
        public static final String MONHOC_MA = "MaMH";
        public static final String MONHOC_TEN = "TeMH";
        public static final String MONHOC_SOTRINH = "MonHoc";

        // query string select all
        public static final String SELECT_ALL = "select * from MonHoc";
        public static final String SELLECT_BY_CODE = "select * from MonHoc" + " where MaMH = ?";
        public static final String INSERT = " insert into MonHoc (" + MONHOC_MA + "," + MONHOC_TEN + ","
                + MONHOC_SOTRINH + ")  values (?,?,?,?,?) ;";
        public static final String UPDATE = " update MonHoc set " + MONHOC_TEN + "= ? ," + MONHOC_SOTRINH + " where "
                + MONHOC_MA + "= ? ;";
        public static final String DELETE = "delete from  MonHoc where " + MONHOC_MA + "= ? ;";
    }
}
