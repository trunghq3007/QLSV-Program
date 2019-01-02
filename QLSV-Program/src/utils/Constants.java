/**
 * 
 */
package utils;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public interface Constants {

	// Constant for TableName
	interface TableNames {
		public static final String STUDENT = "sinhvien";
		public static final String SUBJECT = "monhoc";
		public static final String CLASS = "lop";
		public static final String COURSE = "khoahoc";
		public static final String FACULTY = "khoa";
		public static final String TRAININGTYPE = "hedt";
		public static final String MARK = "diem";
	}

	// constant for Student entity
	interface Student {
		public static final String SELECT_ALL = "Select * from sinhvien";
		public static final String SELECT_BY_CLASS_ID = "Select * from sinhvien where MaLop = ?";
		public static final String SELECT_ONE = "Select * from sinhvien where MaSV = ?";
		public static final String INSERT = "insert into sinhvien(MaSV, TenSV, GioiTinh, NgaySinh, QueQuan, MaLop) values(?,?,?,?,?,?)";
		public static final String UPDATE = "update sinhvien set TenSV = ?, GioiTinh = ?, NgaySinh = ?, "
				+ "QueQuan=?, MaLop = ? where MaSV = ?";
		public static final String DELETE = "delete from sinhvien where MaSV = ?";
		public static final String FILTER = "SELECT * FROM sinhvien where masv like ? "
				+ "or TenSV like ? or GioiTinh like ? or NgaySinh like ? or QueQuan like ? or maLop like ?;";

		// Column name
		public static final String STUDENT_ID = "MaSV";
		public static final String STUDENT_NAME = "TenSV";
		public static final String STUDENT_GENDER = "GioiTinh";
		public static final String STUDENT_DATEOFBIRTH = "NgaySinh";
		public static final String STUDENT_HOMETOWN = "QueQuan";
		public static final String CLASS_ID = "MaLop";
	}

	// Constant for Subject entity
	interface Subject {
		// query
		public static final String SELECT_ALL = "Select * from monhoc";
		public static final String SELECT_ONE = "Select * from monhoc where MaMH = ?";
		public static final String INSERT = "insert into monhoc(MaMH,TenMH, SoTrinh) values(?,?,?)";
		public static final String UPDATE = "update monhoc set TenMH = ?, SoTrinh = ? where MaMH = ?";
		public static final String DELETE = "delete from monhoc where MaMH = ?";
		public static final String FILTER = "Select * from monhoc where MaMH like ? or TenMH like ? or SoTrinh like ?";

		// column name
		public static final String SUBJECT_ID = "MaMH";
		public static final String SUBJECT_NAME = "TenMH";
		public static final String NUMBER_OF_CREDIT = "SoTrinh";
	}

	// Constant for Subject entity
	interface Class {
		// query
		public static final String SELECT_ALL = "Select * from lop";
		public static final String SELECT_ONE = "Select * from lop where MaLop = ?";
		public static final String INSERT = "insert into lop(MaLop,TenLop,MaKhoa,MaHeDT,MaKhoaHoc) values(?,?,?,?,?)";
		public static final String UPDATE = "update lop set TenLop = ?, MaKhoa = ?,MaHeDT = ?, MaKhoaHoc= ? where MaLop = ?";
		public static final String DELETE = "delete from lop where MaLop = ?";
		public static final String FILTER = "Select * from lop where TenLop like ? or MaKhoa like"
				+ " ? or MaKhoaHoc like ? or MaLop like ? or MaHeDT like ?";

		// column name
		public static final String CLASS_ID = "MaLop";
		public static final String CLASS_NAME = "TenLop";
		public static final String FACULTY_ID = "MaKhoa";
		public static final String TRAINING_TYPE_ID = "MaHeDT";
		public static final String COURSE_ID = "MaKhoaHoc";
	}

	// Constant for Course entity
	interface Course {
		// query
		public static final String SELECT_ALL = "Select * from khoahoc";
		public static final String SELECT_ONE = "Select * from khoahoc where MaKhoaHoc = ?";
		public static final String INSERT = "insert into khoahoc(MaKhoaHoc, TenKhoaHoc) values(?,?)";
		public static final String UPDATE = "update khoahoc set TenKhoaHoc = ? where MaKhoaHoc = ?";
		public static final String DELETE = "delete from khoahoc where MaKhoaHoc = ?";
		public static final String FILTER = "Select * from khoahoc where MaKhoaHoc like ? or TenKhoaHoc like ?";

		// column name
		public static final String COURSE_ID = "MaKhoaHoc";
		public static final String COURSE_NAME = "TenKhoaHoc";
	}

	// Constant for Subject entity
	interface Faculty {
		// query
		public static final String SELECT_ALL = "Select * from khoa";
		public static final String SELECT_ONE = "Select * from khoa where MaKhoaHoc = ?";
		public static final String INSERT = "insert into khoa(MaKhoa, TenKhoa, DiaChi, DienThoai) values(?,?,?,?)";
		public static final String UPDATE = "update khoa set TenKhoa = ?, DiaChi = ?, DienThoai = ? where MaKhoa = ?";
		public static final String DELETE = "delete from khoa where MaKhoa = ?";
		public static final String FILTER = "Select * from khoa where MaKhoa like ? or TenKhoa like ? "
				+ "or DiaChi like ? or DienThoai like ?";

		// column name
		public static final String FACULTY_ID = "MaKhoa";
		public static final String FACULTY_NAME = "TenKhoa";
		public static final String FACULTY_ADDRESS = "DiaChi";
		public static final String FACULTY_PHONENUMBER = "DienThoai";
	}

	// Constant for Training type entity
	interface TrainningType {
		public static final String SELECT_ALL = "Select * from hedt";
		public static final String SELECT_ONE = "Select * from hedt where MaHeDT = ?";
		public static final String INSERT = "insert into hedt(MaHeDT, TenHeDT) values(?,?)";
		public static final String UPDATE = "update hedt set TenHeDT = ? where MaHeDT = ?";
		public static final String DELETE = "delete from hedt where MaHeDT = ?";
		public static final String FILTER = "SELECT * FROM hedt where MaHeDT like ? or TenHeDT like ?";

		public static final String TRAINING_TYPE_ID = "MaHeDT";
		public static final String TRAINING_TYPE_NAME = "TenHeDT";
	}

	// Constant for Score entity
	interface Mark {
		public static final String SELECT_ALL = "Select * from diem";
		public static final String SELECT_ONE_BY_KEY = "Select * from diem where MaSV = ? and MaMH = ?";
		public static final String INSERT = "insert into diem(MaSV, MaMH, HocKy, DiemLan1, DiemLan2) values(?,?,?,?,?)";
		public static final String UPDATE = "update diem set HocKy = ?, DiemLan1 = ?, DiemLan2 = ? where MaSV = ? and MaMH = ?";
		public static final String DELETE_BY_KEY = "delete from diem where MaSV = ? and MaMH = ?";
		public static final String DELETE_BY_STUDENT_ID = "delete from diem where MaSV = ?";
		public static final String DELETE_BY_SUBJECT_ID = "delete from diem where MaMH = ?";
		public static final String FILTER = "SELECT * FROM diem where MaSV like ? or MaMH like ? or HocKy like ? or DiemLan1 like ?"
				+ "or DiemLan2 like ?";

		// column name
		public static final String STUDENT_ID = "MaSV";
		public static final String SUBJECT_ID = "MaMH";
		public static final String MARK_SEMESTER = "HocKy";
		public static final String MARK_1ST = "DiemLan1";
		public static final String MARK_2ND = "DiemLan2";
	}

	// Constant for Common purpose
	interface Common {
		public static final String MALE = "Nam";
		public static final String FEMALE = "Nữ";
	}

	// Constant for Format of toString method
	interface ToStringFormatter {
		public static final String STUDENT = "%-20s%-30s%-20s%-20s%-20s%-20s";
		public static final String SUBJECT = "%-20s%-20s%-20d";
		public static final String SUBJECT_FORMAT = "%-20s%-20s%-20s";
		public static final String CLASS = "%5s%20s%5s%5s%5s";
		public static final String COURSE = "%5s%s";
		public static final String FACULTY = "%5s%20s%20s%s";
		public static final String TRAININGTYPE = "%5s%s";
		public static final String MARK = "%5s%5s%2d%3.2f%3.2f";
		public static final String MARK_FORMAT = "%-20s%-20s%-20s%-20s%-20s";
	}

	/**
	 * @author a
	 * Description: final for validate information
	 */
	interface Validation {
		public static final Integer MAX_LENGTH_ID = 5;
		public static final Integer MAX_LENGTH_NAME = 255;
		public static final String DATE_REGEX = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)"; // dd/MM/yyyy
	}
}
