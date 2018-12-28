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
		public static final String SUBJECT_ID = "MaMH";
		public static final String SUBJECT_NAME = "TenMH";
		public static final String NUMBER_OF_CREDIT = "SoTrinh";
	}

	// Constant for Subject entity
	interface Class {
		public static final String CLASS_ID = "MaLop";
		public static final String CLASS_NAME = "TenLop";
	}

	// Constant for Course entity
	interface Course {
		public static final String COURSE_ID = "MaKhoaHoc";
		public static final String COURSE_NAME = "TenKhoaHoc";
	}

	// Constant for Subject entity
	interface Faculty {
		public static final String FACULTY_ID = "MaKhoa";
		public static final String FACULTY_NAME = "TenKhoa";
		public static final String FACULTY_ADDRESS = "DiaChi";
		public static final String FACULTY_PHONENUMBER = "DienThoai";
	}

	// Constant for Training type entity
	interface TrainningType {
		public static final String TRAINING_TYPE_ID = "MaHeDT";
		public static final String TRAINING_TYPE_NAME = "TenHeDT";
	}

	// Constant for Score entity
	interface Mark {
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
		public static final String STUDENT = "%5s %20s %3s %10s %30s %5s";
		public static final String SUBJECT = "%5s %20s %d";
		public static final String CLASS = "%5s %20s %5s %5s %5s";
		public static final String COURSE = "%5s %s";
		public static final String FACULTY = "%5s %20s %20s %s";
		public static final String TRAININGTYPE = "%5s %s";
		public static final String SCORE = "%5s %5s %2d %3.2f %3.2f";
	}
}
