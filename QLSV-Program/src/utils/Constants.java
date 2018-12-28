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
	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: interface student
	 * Version 1.0
	 */
	interface Student {
		public static final String STUDENT_CODE = "MaSV";
		public static final String STUDENT_NAME = "TenSV";
		public static final String STUDENT_BIRTH = "NgaySinh";
		public static final String STUDENT_QUEQUAN = "QueQuan";
		public static final String STUDENT_MALOP = "MaLop";
	}
	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: interface subject
	 * Version 1.0
	 */
	interface Subject {
		public static final String SUBJECT_CODE = "MaMH";
		public static final String SUBJECT_NAME = "TenMH";
		public static final String SUBJECT_NUMBER = "SoTrinh";
	}
	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: interface class
	 * Version 1.0
	 */
	interface Class {
		public static final String CLASS_CODE = "MaMH";
		public static final String CLASS_NAME = "TenMH";
		public static final String CLASS_CODE_FACULTI = "MaKhoa";
		public static final String CLASS_CODE_TRANNING = "MaHeDT";
		public static final String CLASS_CODE_COURSE = "MaKhoaHoc";
	}
	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: interface Course
	 * Version 1.0
	 */
	interface Course {
		public static final String COURSE_CODE = "MaKhoaHoc";
		public static final String COURSE_NAME = "TenKhoaHoc";
		public static final String SELECT_ALL = "select * from KhoaHoc";
	}/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: interface Faculti
	 * Version 1.0
	 */
	interface Faculti {
		public static final String FACULTI_CODE = "MaKhoa";
		public static final String FACULTI_NAME = "TenKhoa";
		public static final String FACULTI_ADDRESS = "DiaChi";
		public static final String FACULTI_PHONE = "DienThoai";
	}/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: interface class
	 * Version 1.0
	 */
	interface Tranning {
		public static final String TRANNING_CODE = "MaHeDT";
		public static final String TRANNING_NAME = "TenHeDT";
	}/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: interface class
	 * Version 1.0
	 */
	interface Mark {
		public static final String POINT_CODE_STUDENT = "MaSV";
		public static final String POINT_CODE_SUBJECT = "MaMH";
		public static final String POINT_LAST = "HocKy";
		public static final String POINT_1ST = "DiemLan1";
		public static final String POINT_2ND = "DiemLan2";
	}
}
