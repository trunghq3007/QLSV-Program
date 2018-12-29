/**
 * 
 */
package bll;

import java.util.List;

import dal.CourseDAL;
import entity.Course;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: 
 * Version 1.0
 */
public class CourseBLL implements BaseBLL<Course> {
        // courseDAL
        CourseDAL courseDAL;

        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
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
                return courseDAL.insert(object);
        }

        @Override
        public int update(Course object) {
                return courseDAL.update(object);
        }

        @Override
        public int delete(String nameCourse) {
                return courseDAL.delete(nameCourse);
        }

        @Override
        public List<Course> fillter(String sequenceFilter) {
                return null;
        }

}
