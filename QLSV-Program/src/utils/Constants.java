package utils;

/**
 * Create by: NVDiem
 * Create date: Jan 1, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 1, 2019
 * Description: ....
 * Version 1.0
 */
public interface Constants {
	// constant for mark
	interface Mark {
		// column name
		public static final String STUDENT_ID = "MaSV";
		public static final String SUBJECT_ID = "MaMH";
		public static final String SEMESTER = "HocKy";
		public static final String FIRST_MARK = "DiemLan1";
		public static final String SECOND_MARK = "DiemLan2";

		// query

		// insert mark
		public static final String INSERT_MARK = "insert into diem values(?,?,?,?,?)";

		// update mark
		public static final String UPDATE_STUDENT_BY_ID = "update diem set " + SEMESTER + "=?, " + FIRST_MARK + "=?, "
				+ SECOND_MARK + "=? where " + STUDENT_ID + "=? and " + SUBJECT_ID + "=?";

		// delete mark
		public static final String DELETE_STUDENT = "delete from student where " + STUDENT_ID + "=? and " + SUBJECT_ID
				+ "=?";
	}

	// constant for type of training
	interface TypeOfTraining {
		// column name
		public static final String TYPE_OF_TRAINING_ID = "MaKhoaHoc";
		public static final String TYPE_OF_TRAINING_NAME = "TenKhoaHoc";

		// select all type of training
		public static final String SELECT_ALL = "select * from hedt";

		// insert type of training
		public static final String INSERT_TYPE_OF_TRAINING = "insert into hedt values(?,?)";

		// update type of training
		public static final String UPDATE_TYPE_OF_TRAINING_BY_ID = "update hedt set " + TYPE_OF_TRAINING_NAME
				+ "=? where " + TYPE_OF_TRAINING_ID + "=?";

		// delete type of training by id
		public static final String DELETE_TYPE_OF_TRAINING_BY_BY_ID = "delete from student where " + TYPE_OF_TRAINING_ID
				+ "=?";

		// get type of training by id
		public static final String GET_TYPE_OF_TRAINING_BY_BY_ID = "select * from sinhvien where " + TYPE_OF_TRAINING_ID
				+ "=?";

	}

	// constant for Student
	interface Student {
		// column name
		public static final String STUDENT_ID = "MaSV";
		public static final String STUDENT_NAME = "TenSV";
		public static final String GENDER = "GioiTinh";
		public static final String BIRTH_DAY = "NgaySinh";
		public static final String ADDRESS = "QueQuan";
		public static final String CLASS_ID = "MaLop";

		// query

		// select all student
		public static final String SELECT_ALL = "select * from sinhvien";

		// insert student
		public static final String INSERT_STUDENT = "insert into sinhvien values(?,?,?,?,?,?)";

		// update student
		public static final String UPDATE_STUDENT_BY_ID = "update sinhvien set " + STUDENT_NAME + "=?, " + GENDER
				+ "=?, " + BIRTH_DAY + "=?, " + ADDRESS + "=?, " + CLASS_ID + "=?, where" + STUDENT_ID + "=?";

		// delete student by id
		public static final String DELETE_STUDENT = "delete from student where " + STUDENT_ID + "=?";

		// get student by id
		public static final String GET_STUDENT_BY_ID = "select * from sinhvien where " + STUDENT_ID + "=?";

	}

	// constant for course
	interface Course {
		// column name
		public static final String COURSE_ID = "MaKhoaHoc";
		public static final String COURSE_NAME = "TenKhoaHoc";

		// select all course
		public static final String SELECT_ALL = "select * from khoahoc";

		// insert course
		public static final String INSERT_COURSE = "insert into khoahoc values(?,?)";

		// update course
		public static final String UPDATE_COURSE_BY_ID = "update khoahoc set " + COURSE_NAME + "=? where " + COURSE_ID
				+ "=?";

		// delete course by id
		public static final String DELETE_COURSE_BY_ID = "delete from student where " + COURSE_ID + "=?";

		// get course by id
		public static final String GET_COURSE_BY_ID = "select * from sinhvien where " + COURSE_ID + "=?";

	}
}
