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
	public static final String STUDENT_CODE = "MaSV";
	public static final String STUDENT_NAME = "TenSV";
	public static final String STUDENT_SEX = "GioiTinh";
	public static final String STUDENT_DOB = "NgaySinh";
	public static final String STUDENT_HOMETOWN = "QueQuan";
	public static final String STUDENT_CLASSCODE = "MaLop";
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
	public static final String COURSE_CODE = "MaKhoaHoc";
	public static final String COURSE_NAME = "TenKhoaHoc";
	public static final String SELECT_ALL ="select * from khoahoc";
    }
    
    interface Subject {
	public static final String SUBJECT_CODE = "MaMH";
	public static final String SUBJECT_NAME = "TenMH";
	public static final String SUBJECT_CREDITS = "SoTrinh";
    }
}
