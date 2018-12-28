/**
 * 
 */
package bll;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dal.CourseDAL;
import entity.Course;
import utils.Constants;
import utils.DbConnection;

/**
 * Create by: minhanh - CMC
 * Create date: Dec 28, 2018
 * Modifier: minhanh
 * Modified date: Dec 28, 2018
 * Description: 
 * Version 1.0
 */
public class CourseBLL implements BaseBLL<Course> {
        // courseDAL
        CourseDAL courseDAL;

        /**
         * Create by: minhanh - CMC
         * Create date: Dec 28, 2018
         * Modifier: minhanh
         * Modified date: Dec 28, 2018
         * Description: ....
         * Version 1.0
         * @param courseDAL
         */
        public CourseBLL() {
                courseDAL = new CourseDAL();
        }

        @Override
        public List<Course> getAll() {
               // System.out.println("List of Course");
                //System.out.println(courseDAL.getAll());
                return courseDAL.getAll();

        }

        @Override
        public Course getByCode(String code) {
                return null;
        }

        @Override
        public int insert(Course object) {
                return 0;
        }

        @Override
        public int update(Course object) {
                return 0;
        }

        @Override
        public int delete(String code) {
                return 0;
        }

        @Override
        public List<Course> fillter(String sequenceFilter) {
                return null;
        }

}
