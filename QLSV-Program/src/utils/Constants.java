/**
 * 
 */
package utils;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public interface Constants {
	
	// Constant for TableName
	interface TableNames {
		public static final String STUDENT = "sinhvien";
		public static final String SUBJECT = "monhoc";
		public static final String CLASS = "lop";
		public static final String COURSE = "khoahoc";
		public static final String FACULTY = "khoa";
		public static final String TRAINTYPE = "hedt";
		public static final String MARK = "diem";
	}
	
	// constant for Student
	interface Student {
		
		public static final String STUDENT_CODE = "MaSV";
		public static final String STUDENT_NAME = "TenSV";
		public static final String STUDENT_GENDER = "GioiTinh";
		public static final String STUDENT_DATEBIRTH = "NgaySinh";
		public static final String STUDENT_ADDRESS = "QueQuan";

		// query string select all
		public static final String SELECT_ALL = "select * from sinhvien";
		// query a student
		public static final String SELECT_STUDENT = "select * from sinhvien where MaSV = ?";
		// insert a student
		public static final String INSERT_STUDENT = "insert into sinhvien values (?,?,?,?,?,?)";
		// update a student
		public static final String UPDATE_STUDENT = "update sinhvien set (TenSV = ?, GioiTinh = ?, NgaySinh = ?, QueQuan = ?, MaLop = ?) where MaSV = ?";
		// delete a student
		public static final String DELETE_STUDENT = "delete from sinhvien where MaSV = ?";
		// filter by sequence
		public static final String FILTER_STUDENT = "select * from sinhvien where (MaSV like ?) or (TenSV like ?) or (GioiTinh like ?) or (NgaySinh like ?) or (QueQuan like ?) or (MaLop like ?)";

	}

	// constant for Course
	interface Course {
		// query string select all
		public static final String SELECT_ALL = "select * from khoahoc";
		// query a course
		public static final String SELECT_COURSE = "select * from khoahoc where MaKhoaHoc = ?";
		// insert a course
		public static final String INSERT_COURSE = "insert into khoahoc values (?,?)";
		// update a course
		public static final String UPDATE_COURSE = "update khoahoc set TenKhoaHoc = ? where MaKhoaHoc = ?";
		// delete a course
		public static final String DELETE_COURSE = "delete from khoahoc where MaKhoaHoc = ?";
		// filter by sequence
		public static final String FILTER_COURSE = "select * from khoahoc where MaKhoaHoc like ? or TenKhoaHoc like ?";
		// column name
		public static final String COURSE_CODE = "MaKhoaHoc";
		public static final String COURSE_NAME = "TenKhoaHoc";

	}

	// constant for Subject
	interface Subject {
		public static final String SUBJECT_CODE = "MaMH";
		public static final String SUBJECT_NAME = "TenMH";
		public static final String SUBJECT_VOLUME = "SoTrinh";

		// query string select all
		public static final String SELECT_ALL = "select * from monhoc";
		// query a subject
		public static final String SELECT_SUBJECT = "select * from monhoc where MaMH = ?";
		// insert a subject
		public static final String INSERT_SUBJECT = "insert into monhoc values (?,?,?)";
		// update a subject
		public static final String UPDATE_SUBJECT = "update monhoc set (TenMH = ?, SoTrinh = ?) where MaMH = ?";
		// delete a subject
		public static final String DELETE_SUBJECT = "delete from monhoc where MaMH = ?";
		// filter by sequence
		public static final String FILTER_SUBJECT= "select * from monhoc where (MaMH like ?) or (TenMH like ?) or (SoTrinh like ?)";


	}

	interface Class {
		public static final String CLASS_CODE = "MaLop";
		public static final String CLASS_NAME = "TenLop";
		
		// query string select all
		public static final String SELECT_ALL = "select * from lop";
		// query a Class
		public static final String SELECT_CLASS = "select * from lop where MaLop = ?";
		// insert a Class
		public static final String INSERT_CLASS = "insert into lop values (?,?,?,?,?)";
		// update a Class
		public static final String UPDATE_CLASS = "update lop set (TenLop = ?, MaKhoa = ?, MaHeDT = ?, MaKhoaHoc = ?) where MaLop = ?";
		// delete a Class
		public static final String DELETE_CLASS = "delete from lop where MaLop = ?";
		// filter by sequence
		public static final String FILTER_CLASS = "select * from lop where (MaLop like ?) or (TenLop like ?) or (MaKhoa like ?) or (MaHeDT like ?) or (MaKhoaHoc like ?)";
	}

	interface Faculty {
		public static final String FACULTY_CODE = "MaKhoa";
		public static final String FACULTY_NAME = "TenKhoa";
		public static final String FACULTY_ADDRESS = "DiaChi";
		public static final String FACULTY_PHONE = "DienThoai";
		
		// query string select all
		public static final String SELECT_ALL = "select * from khoa";
		// query a Faculty
		public static final String SELECT_FACULTY = "select * from khoa where MaKhoa = ?";
		// insert a Faculty
		public static final String INSERT_FACULTY = "insert into khoa values (?,?,?,?)";
		// update a Faculty
		public static final String UPDATE_FACULTY = "update khoa set (TenKhoa = ?, DiaChi = ?, DienThoai = ?) where MaKhoa = ?";
		// delete a Faculty
		public static final String DELETE_FACULTY = "delete from khoa where MaKhoa = ?";
		// filter by sequence
		public static final String FILTER_FACULTY = "select * from khoa where (MaKhoa like ?) or (TenKhoa like ?) or (DiaChi like ?) or (DienThoai like ?)";
	}

	interface TrainType {
		public static final String TRAINTYPE_CODE = "MaHeDT";
		public static final String TRAINTYPE_NAME = "TenHeDT";
		
		// query string select all
		public static final String SELECT_ALL = "select * from hedt";
		// query a TrainType
		public static final String SELECT_TRAINTYPE = "select * from hedt where MaHeDT = ?";
		// insert a TrainType
		public static final String INSERT_TRAINTYPE = "insert into hedt values (?,?)";
		// update a TrainType
		public static final String UPDATE_TRAINTYPE = "update hedt set TenHeDT = ? where MaHeDT = ?";
		// delete a TrainType
		public static final String DELETE_TRAINTYPE = "delete from hedt where MaHeDT = ?";
		// filter by sequence
		public static final String FILTER_TRAINTYPE = "select * from hedt where (MaHeDT like ?) or (TenHeDT like ?)";
	}

	interface Mark {
		public static final String MARK_SEMESTER = "HocKy";
		public static final String MARK_1ST = "DiemLan1";
		public static final String MARK_2ND = "DiemLan2";
		
		// query string select all
		public static final String SELECT_ALL = "select * from diem";
		// query a Mark
		public static final String SELECT_MARK = "select * from diem where MaSV = ?";
		// insert a Mark
		public static final String INSERT_MARK = "insert into diem values (?,?,?,?,?)";
		// update a Mark
		public static final String UPDATE_MARK = "update diem set (MaMH = ?, HocKy = ?, DiemLan1 = ?, DiemLan2 = ?) where MaSV = ?";
		// delete a Mark
		public static final String DELETE_MARK = "delete from diem where MaSV = ?";
		// filter by sequence
		public static final String FILTER_MARK = "select * from diem where (MaSV like ?) or (MaMH like ?)  or (HocKy like ?)  or (DiemLan1 like ?)  or (DiemLan2 like ?)";
	}

}
