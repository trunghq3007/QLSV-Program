/**
 * 
 */
package bll;

import java.util.List;

import dal.CourseDAL;
import entity.Course;

/**
 * Create by: pvhao - CMC
 * Create date: Dec 28, 2018
 * Modifier: pvhao
 * Modified date: Dec 28, 2018
 * Description: 
 * Version 1.0
 */
public class CourseBLL implements BaseBLL<Course> {
        // courseDAL
        CourseDAL courseDAL;

        /**
         * Create by: pvhao - CMC
         * Create date: Dec 28, 2018
         * Modifier: pvhao
         * Modified date: Dec 28, 2018
         * Description: ....
         * Version 1.0
         * @param courseDAL
         */
        public CourseBLL() {
                courseDAL = new CourseDAL();
        }

        public List<Course> getAll() {
               // System.out.println("List of Course");
                //System.out.println(courseDAL.getAll());
                return courseDAL.getAll();

        }

        public Course getByCode(String code) {
                return courseDAL.getByCode(code);
        }

        public int insert(Course object) {
                return courseDAL.insert(object);
        }

        public int update(Course object) {
        	 return courseDAL.update(object);
        }

        public int delete(String code) {
        	 return courseDAL.delete(code);
        }

        public List<Course> fillter(String sequenceFilter) {
                return null;
        }

}
