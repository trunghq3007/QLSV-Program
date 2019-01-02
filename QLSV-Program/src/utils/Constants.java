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
	 * Create date: Jan 1, 2019
	 * Modifier: thanh
	 * Modified date: Jan 1, 2019
	 * Description: 
	 * Version 1.0
	 */
	interface TableQLSV {
		public static final String TABLE_STUDENT = "SinhVien";
		public static final String TABLE_SUBJECT = "MonHoc";
		public static final String TABLE_CLASS = "Lop";
		public static final String TABLE_COURSE = "KhoaHoc";
		public static final String TABLE_FACULTI = "Khoa";
		public static final String TABLE_TRAINING = "HeDT";
		public static final String TABLE_MARK = "Diem";
	}

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
		public static final String STUDENT_ADDRESS = "QueQuan";
		public static final String STUDENT_CLASS_CODE = "MaLop";
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
		public static final String CLASS_FACULTI_CODE = "MaKhoa";
		public static final String CLASS_TRAINING_CODE = "MaHeDT";
		public static final String CLASS_COURSE_CODE = "MaKhoaHoc";
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
		public static final String INSERT_COURSE = "insert into KhoaHoc values (?,?)";
		public static final String UPDATE_COURSE = "update KhoaHoc set TenKhoaHoc=? where MaKhoaHoc=?";
		public static final String DELETE_COURSE = "delete from KhoaHoc where MaKhoaHoc=?";
		public static final String GET_BY_CODE_COURSE = "select * from KhoaHoc where MaKhoaHoc=?";
		public static final String FILLTER_COURSE = "select * from KhoaHoc where TenKhoaHoc like'%?%'";
	}

	/**
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
	}

	/**
	* Create by: thanh - CMC
	* Create date: Dec 28, 2018
	* Modifier: thanh
	* Modified date: Dec 28, 2018
	* Description: interface class
	* Version 1.0
	*/
	interface Training {
		public static final String TRAINING_CODE = "MaHeDT";
		public static final String TRAINING_NAME = "TenHeDT";
	}

	/**
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
