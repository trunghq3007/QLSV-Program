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
	}

	interface Course {
		// query string select all
		public static final String SELECT_ALL = "select * from khoahoc";
		// query string select one by code
		public static final String SELECT_ONE = "select * from khoahoc where makhoahoc = ?";
		// insert into khoahoc
		public static final String INSERT_COURSE = "insert into khoahoc values (?,?)";
		// delete khoahoc
		public static final String DELETE_COURSE = "delete from khoahoc where makhoahoc= ?";
		// update khoahoc
		public static final String UPDATE_COURSE = "update KhoaHoc set TenKhoaHoc=? where MaKhoaHoc=?";
		// filter khoahoc
		public static final String FILTER_COURSE = "select * from khoahoc where makhoahoc like ? or tenkhoahoc like ?";
		// column name
		public static final String COURSE_CODE = "maKhoaHoc";
		public static final String COURSE_NAME = "tenKhoaHoc";

	}

	interface Subject {
		// column name
		public static final String SUBJECT_CODE = "maMH";
		public static final String SUBJECT_NAME = "tenMH";
		public static final String SUBJECT_Credits = "soTrinh";
		// query string select all
		public static final String SELECT_ALL = "select * from monhoc";
		// query string select one by code
		public static final String SELECT_ONE = "select * from monhoc where maMH = ?";
		// insert into khoahoc
		public static final String INSERT_COURSE = "insert into monhoc values (?,?,?)";
		// delete khoahoc
		public static final String DELETE_COURSE = "delete from monhoc where maMH= ?";
		// update khoahoc
		public static final String UPDATE_COURSE = "update KhoaHoc set TenKhoaHoc=? where MaKhoaHoc=?";
		// filter khoahoc
		public static final String FILTER_COURSE = "select * from khoahoc where makhoahoc like ? or tenkhoahoc like ?";
		// column name
		public static final String COURSE_CODE = "maKhoaHoc";
		public static final String COURSE_NAME = "tenKhoaHoc";
	}
}
