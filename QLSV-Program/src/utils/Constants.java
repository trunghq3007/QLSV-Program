/**
 * 
 */
package utils;

/**
 * Create by: minhanh - CMC
 * Create date: Dec 28, 2018
 * Modifier: minhanh
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public interface Constants {
   
        interface Course {
                // query string select all khoahoc
                public static final String SELECT_ALL = "select * from khoahoc";
                // column name
                public static final String COURSE_CODE = "maKhoaHoc";
                public static final String COURSE_NAME = "tenKhoaHoc";
                
               

        }
        
        interface TrainingSystem{
            // query string select all hedt
            public static final String SELECT_ALLHEDT = "select * from hedt";
            // column MaHeDT
            public static final String TrainingSystem_CODE = "MaHeDT";
         // column TenHeDT
            public static final String TrainingSystem_NAME = "TenHeDT";
            
        }
        
        interface Point{
        	 // query string select all diem
            public static final String SELECT_ALLDIEM = "select * from diem";
            // column MaSV
            public static final String student_Code = "MaSV";
            // column MaMH
            public static final String subjects_Code = "MaMH";
            // column HocKy
            public static final String semester = "HocKy";
            // column DiemLan1
            public static final String pointOne = "DiemLan1";
            // column DiemLan2
            public static final String pointTwo = "DiemLan2";
        }
        
        
        interface Faculty{
       	   // query string select all khoa
           public static final String SELECT_ALLKHOA = "select * from khoa";
           // column MaKhoa
           public static final String facultyCode = "MaKhoa";
           // column TenKhoa
           public static final String faultyName = "TenKhoa";
           // column DiaChi
           public static final String address = "DiaChi";
           // column DienThoai
           public static final String phone = "DienThoai";
        }
        
        interface Class{
        	// query string select all lop
            public static final String SELECT_ALLLOP = "select * from lop";
            // column MaLop
            public static final String classCode = "MaLop";
            // column TenLop
            public static final String className = "TenLop";
            // column MaKhoa
            public static final String facultyName = "MaKhoa";
            // column MaHeDT
            public static final String trainingSystemCode = "MaHeDT";
            // column MaKhoaHoc
            public static final String courseCode = "MaKhoaHoc";
        }
        
        interface Student{
        	// query string select all sinhvien
            public static final String SELECT_ALLSinhVien = "select * from sinhvien";
            // column MaSV
            public static final String studentCode = "MaSV";
            // column TenSV
            public static final String studentName = "TenSV";
            // column GioiTinh
            public static final String sex = "GioiTinh";
            // column NgaySinh
            public static final String birthDay = "NgaySinh";
            // column QueQuan
            public static final String country = "QueQuan";
            // column MaLop
            public static final String classCode = "MaLop";
        }
        
        interface Subjects{
        	// query string select all monhoc
            public static final String SELECT_ALLMonHoc = "select * from monhoc";
            // column MaMH
            public static final String subjectsCode = "MaMH";
            // column TenMH
            public static final String subjectsName = "TenMH";
            // column SoTrinh
            public static final String numberOfPeriods = "SoTrinh";
        }

}
