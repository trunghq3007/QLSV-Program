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
        // constant for Student
        interface Student {
        	//query select all Student
        	public static final String SELECT_ALL = "select *from sinhvien";
        	// query insert into Student
        	public static final String INSERT_STUDENT = "insert into sinhvien values(?, ?, ?, ?, ?, ?)";
        	// query update a Student
        	public static final String UPDATE_STUDENT = "update sinhvien set TenSV = ?, GioiTinh = ?, NgaySinh =?, QueQuan = ?, "
        													+ "MaLop = ? where MaSV = ?";
        	// query delete a Student
        	public static final String DELETE_STUDENT = "delete sinhvien where MaSV = ?";
        	
        	// column name
            public static final String STUDENT_CODE = "MaSV";
            public static final String STUDENT_NAME = "TenSV";
            public static final String STUDENT_GENDER = "GioiTinh";
            public static final String STUDENT_DAYOFBIRTH = "NgaySinh";
            public static final String STUDENT_HOMETOWN = "QueQuan";
            public static final String CLASS_CODE = "MaLop";
        }

        interface Course {
                // query string select all
                public static final String SELECT_ALL = "select * from khoahoc";
                // query insert a new course
                public static final String INSERT_COURSE = "insert into khoahoc values(?, ?)";
                // query delete a course by name
                public static final String DELETE_COURSE = "delete from khoahoc where MaKhoaHoc = ?";
                // query update a course
                public static final String UPDATE_COURSE = "update khoahoc set tenKhoaHoc = ? where maKhoaHoc = ?";
                // column name
                public static final String COURSE_CODE = "maKhoaHoc";
                public static final String COURSE_NAME = "tenKhoaHoc";
        }
        
        interface Subject {
        	// query string select all
            public static final String SELECT_ALL = "select *from monhoc";
            // query insert a new course
            public static final String INSERT_SUBJECT = "insert into monhoc values(?, ?, ?)";
            // query delete a course by name
            public static final String DELETE_SUBJECT = "delete from monhoc where TenMH = ?";
            // query update a course
            public static final String UPDATE_SUBJECT = "update monhoc set TenMH = ?, soTrinh = ? where MaMH = ?";
            
            public static final String SUBJECT_CODE = "MaMH";
            public static final String SUBJECT_NAME = "TenMH";
            public static final String NUMBER_CREDIT = "SoTrinh";
             
        }
        
        interface TypeOfTrainning{
        	// query string select all
            public static final String SELECT_ALL = "select * from hedt";
            // query insert a new course
            public static final String INSERT_TYPETRAIN = "insert into hedt values(?, ?)";
            // query delete a course by name
            public static final String DELETE_TYPETRAIN = "delete from hedt where tenHeDT = ?";
            // query update a course
            public static final String UPDATE_TYPETRAIN = "update hedt set tenHeDT = ? where maHeDT = ?";
            
            public static final String TYPEOFTRAIN_CODE = "maHeDT";
            public static final String TYPOFTRAIN_NAME = "tenHeDT";
        }
        
        interface Depart {
        	// query string select all
            public static final String SELECT_ALL = "select *from khoa";
            // query insert a new course
            public static final String INSERT_DEPT = "insert into khoa values(?, ?, ?, ?)";
            // query delete a course by name
            public static final String DELETE_DEPT = "delete from khoa where tenKhoa = ?";
            // query update a course
            public static final String UPDATE_DEPT = "update khoa set tenKhoa = ?, DiaChi=?, DienThoai = ? where maKhoa = ?";
            
            public static final String DEPT_COED = "MaKhoa";
            public static final String DEPT_NAME = "TenKhoa";
            public static final String DEPT_ADDR = "DiaChi";
            public static final String DEPT_PHONE = "DienThoai";
        }

        interface Mark {
        	// query string select all
            public static final String SELECT_ALL = "select *from diem";
            // query insert a new course
            public static final String INSERT_DEPT = "insert into diem values(?, ?, ?, ?, ?)";
            // query delete a course by name
            public static final String DELETE_DEPT = "delete from diem where maSV = ?";
            // query update a course
            public static final String UPDATE_DEPT = "update khoa set MaMH=?, HocKy = ?, DiemLan1 = ?, DiemLan2 = ? where MaSV = ?";
            
            public static final String STUDENT_CODE = "MaSV";
            public static final String SUBJECT_CODE = "MaMH";
            public static final String SEMESTER = "HocKy";
            public static final String MARK_FIRST = "DiemLan1";
            public static final String MARK_SECONDE = "DiemLan2";
        }
        
        interface ClassRoom {
        	// query string select all
            public static final String SELECT_ALL = "select *from lop";
            // query insert
            public static final String INSERT_CLASS = "insert into lop values(?, ?, ?, ?, ?)";
            // query delete
            public static final String DELETE_CLASS = "delete from diem where MaLop = ?";
            // query update
            public static final String UPDATE_CLASS = "update khoa set TenLop=?, MaKhoa = ?, MaHeDT = ?, MaKhoaHoc = ? where MaLop = ?";
            
            public static final String CLASS_CODE = "MaLop";
            public static final String CLASS_NAME = "TenLop";
            public static final String DEPT_CODE = "MaKhoa";
            public static final String TYPETRAIN_CODE = "MaHeDT";
            public static final String COURSE_CODE = "MaKhoaHoc";
        }
        // constant for HeDT
        //

}
