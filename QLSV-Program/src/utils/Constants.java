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
        // constant for Student
        interface Student {
                public static final String STUDENT_CODE = "MaSV";
        }

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
            // column name
            public static final String TrainingSystem_CODE = "MaHeDT";
            public static final String TrainingSystem_NAME = "TenHDT";
            
        }

        // constant for HeDT
        //

}
