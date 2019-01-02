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
                public static final String STUDENT_CODE = "MaSV";
        }

        interface Course {
                // query string select all
                public static final String SELECT_ALL = "select * from khoahoc";
                // query a course 
                public static final String SELECT_COURSE = "select * from khoahoc where MaKhoaHoc = ?";
                // insert a course
                public static final String INSERT_COURSE = "insert into khoahoc values (?,?)";
                // update a course
                public static final String UPDATE_COURSE = "update khoahoc set TenKhoaHoc = ? where MaKhoaHoc = ?";
                // delete a course
                public static final String DELETE_COURSE = "delete from khoahoc where MaKhoaHoc = ?";
                // filter by sequence
                public static final String FILTER_COURSE = "select * from khoahoc where MaKhoaHoc like ? or TenKhoaHoc like ?";
                // column name
                public static final String COURSE_CODE = "MaKhoaHoc";
                public static final String COURSE_NAME = "TenKhoaHoc";

        }

        // constant for HeDT
        //

}
