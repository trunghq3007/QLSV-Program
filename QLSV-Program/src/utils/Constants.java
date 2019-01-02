/**
 * 
 */
package utils;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public interface Constants {
    // constant for Student
    interface Student {
        public static final String STUDENT_CODE = "MaSV";
        public static final String SELECT_ALL = "select * from sinhvien";
        public static final String GET_BY_CODE = "select * from sinhvien where MaSV = ?;";
        public static final String ADD_ALL = "INSERT INTO sinhvien VALUES (?, ?, ?, ?, ?, ?);";
        public static final String UPDATE = "update sinhvien set TenSV = ?, GioiTinh = ?, NgaySinh = ?, QueQuan = ?, MaLop = ? where MaSV = ?;";
        public static final String DELETE = "delete from sinhvien where MaSV = ?;";
        public static final String SEARCH = "select * from sinhvien where TenSV like ?;";

    }

    interface Course {
        // query string select all
        public static final String SELECT_ALL = "select * from khoahoc";
        // column name
        public static final String COURSE_CODE = "maKhoaHoc";
        public static final String COURSE_NAME = "tenKhoaHoc";

        public static final String ADD_COURSE = "insert into khoahoc values (?, ?)";
        public static final String UPDATE_COURSE = "update khoahoc set TenKhoaHoc = ? where MaKhoaHoc = ?;";
        public static final String DELETE_COURSE = "delete from khoahoc where MaKhoaHoc = ?;";
        public static final String GET_BY_CODE = "select * from khoahoc where MaKhoaHoc = ?;";
        public static final String SEARCH = "select * from khoahoc where TenKhoaHoc like ?;";

    }

    interface TypeOfTrainning {

        public static final String SELECT_ALL = "select * from hedt;";
        public static final String GET_BY_CODE = "select * from hedt where MaHeDT = ?;";
        public static final String ADD_TYPE = "insert into hedt values (?, ?);";
        public static final String UPDATE_TYPE = "update hedt set TenHeDT = ? where MaHeDT = ?;";
        public static final String DETELE_TYPE = "delete from hedt where MaHeDT = ?;";
        public static final String SEARCH = "select * from hedt where TenHeDT like ?;";

    }

    interface Subject {

        public static final String SELECT_ALL = "select * from monhoc;";
        public static final String GET_BY_CODE = "select * from monhoc where MaMH = ?;";
        public static final String ADD_ALL = "insert into monhoc(MaMH, TenMH, SoTrinh) values(?, ?, ?);";
        public static final String UPDATE_ALL = "update from monhoc set TenMH = ?, SoTrinh = ? where MaMH = ?;";
        public static final String DELETE_ALL = "delete from monhoc where MaMH = ?;";
        public static final String SEARCH = "select * from monhoc where TenMH like ?;";

    }

    interface Mark {

        String SELECT_ALL = "select * from diem;";
        String GET_BY_CODE = "select * from diem where MaSV = ?";
        String ADD_ALL = "INSERT INTO diem VALUES (?, ?, ?, ?, ?)";
        String UPDATE_ALL = "update diem set HocKy = ?, DiemLan1 = ?, DiemLan2 = ? where MaSV = ? and MaMH = ? ;";

    }

    interface LOP {

        String SELECT_ALL = "select * from lop";
        String GET_BY_CODE = "select * from lop where MaLop = ?";
        String ADD_ALL = "insert into lop values (?, ?, ?, ?, ?)";
        String UPDATE_ALL = "update lop set TenLop = ?, MaKhoa = ?, MaHeDT = ?, MaKhoaHoc = ? where MaLop = ?;";
        String DELETE_ALL = "delete from lop where MaLop = ?";
        String SEARCH = "select * from lop where TenLop like ?;";

    }

    interface Faculty {

        String SELECT_ALL = "select * from khoa;";
        String GET_BY_CODE = "select * from khoa where MaKhoa = ?;";
        String ADD = "insert into khoa values (?, ?, ?, ?);";
        String UPDATE = "update khoa set TenKhoa = ?, DiaChi = ?, Phone = ? where MaKhoa = ?";
        String DELETE = "delete from khoa where MaKhoa = ?;";
        String SEARCH = "select * from khoa where TenKhoa like ?;";

    }

}

// constant for HeDT
