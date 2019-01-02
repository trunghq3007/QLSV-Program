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
    interface Students {
	public static final String STUDENT = "SinhVien";
	public static final String STUDENT_CODE = "MaSV";
	public static final String STUDENT_NAME = "TenSV";
	public static final String STUDENT_SEX = "GioiTinh";
	public static final String STUDENT_DOB = "NgaySinh";
	public static final String STUDENT_HOMETOWN = "QueQuan";
	public static final String STUDENT_CLASSCODE = "MaLop";
	public static final String SELECT_ALL = "SELECT * FROM " + STUDENT;
	public static final String GET_STUDENT_BY_CODE = "SELECT * FROM " + STUDENT + " WHERE " + STUDENT_CODE + " = ?";
	public static final String INSERT_STUDENT = "INSERT INTO " + STUDENT
		+ " (MaSV, TenSV, GioiTinh, NgaySinh, QueQuan, MaLop) values(?,?,?,?,?,?)";
	public static final String UPDATE_STUDENT = "update sinhvien set TenSV = ?, GioiTinh = ?, NgaySinh = ?, "
		+ "QueQuan=?, MaLop = ? where MaSV = ?";

	public static final String GET_STUDENT_BY_FILTER = "SELECT * FROM " + STUDENT + " WHERE " + STUDENT_CODE
		+ " LIKE ? OR " + STUDENT_NAME + " LIKE ? OR " + STUDENT_SEX + " LIKE ? OR " + STUDENT_DOB
		+ " LIKE ? OR " + STUDENT_HOMETOWN + " LIKE ? OR " + STUDENT_CLASSCODE + " LIKE ? ";
	public static final String DELETE_STUDENT = "delete from " + STUDENT + " where " + STUDENT_CODE + " = ?";
    }

    // constant for HeDT
    interface TrainingSystem {
	public static final String TS_CODE = "MaHeDT";
	public static final String TS_NAME = "TenHeDT";
    }

    // constant for Point
    interface Point {
	public static final String STUDENT_CODE = "MaSV";
	public static final String SUBJECT_CODE = "MaMH";
	public static final String SEMESTER = "HocKy";
	public static final String MARK = "DiemLan1";
	public static final String RETAKE_MARK = "DiemLan2";
    }

    // constant for Faculty
    interface Faculty {
	public static final String FACULTY_CODE = "MaKhoa";
	public static final String FACULTY_NAME = "TenKhoa";
	public static final String FACULTY_ADDRESS = "DiaChi";
	public static final String FACULTY_TEL = "DienThoai";
    }

    // constant for Class
    interface Class {
	public static final String CLASS_CODE = "MaLop";
	public static final String CLASS_NAME = "TenLop";
	public static final String FACULTY_CODE = "MaKhoa";
	public static final String TS_CODE = "MaHeDT";
	public static final String COURSE_CODE = "MaKhoaHoc";
    }

    // constant for Course
    interface Course {
	public static final String COURSE = "KhoaHoc";
	public static final String COURSE_CODE = "MaKhoaHoc";
	public static final String COURSE_NAME = "TenKhoaHoc";
	public static final String SELECT_ALL = "SELECT * FROM " + COURSE;
	public static final String GET_COURSE_BY_CODE = "SELECT * FROM " + COURSE + " WHERE " + COURSE_CODE + " = ?";
	public static final String GET_COURSE_BY_FILTER = "SELECT * FROM " + COURSE + " WHERE " + COURSE_CODE
		+ " LIKE ? OR " + COURSE_NAME + " LIKE ?";
	public static final String INSERT_COURSE = "INSERT INTO KhoaHoc (MaKhoaHoc, TenKhoaHoc) values(?,?)";
	public static final String UPDATE_COURSE = "UPDATE KhoaHoc SET " + COURSE_NAME + " = ? WHERE " + COURSE_CODE
		+ " = ?";
	public static final String DELETE_COURSE = "delete from " + COURSE + " where " + COURSE_CODE + " = ?";
    }

    interface Subject {
	public static final String SUBJECT_CODE = "MaMH";
	public static final String SUBJECT_NAME = "TenMH";
	public static final String SUBJECT_CREDITS = "SoTrinh";
    }
}
