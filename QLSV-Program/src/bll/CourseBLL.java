/**
 * 
 */
package bll;

import java.util.Formatter;
import java.util.List;

import dal.CourseDAL;
import entity.Course;
import utils.Constants;

/**
 * Create by: NVDiem
 * Create date: Jan 1, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 1, 2019
 * Description: ....
 * Version 1.0
 */
@SuppressWarnings("resource")
public class CourseBLL implements BaseBLL<Course> {
    // courseDAL
    CourseDAL courseDAL;

    /**
     * Create by: NVDiem
     * Create date: Jan 1, 2019
     * Modifier: NVDIEM
     * Modified date: Jan 1, 2019
     * Description: ....
     * Version 1.0
     */
    public CourseBLL() {
        courseDAL = new CourseDAL();
    }

    public List<Course> getAll() {
        return courseDAL.getAll();
    }

    public Course getByCode(String code) {
        return courseDAL.getByCode(code);
    }

    public boolean insert(Course object) {
        if (courseDAL.getByCode(object.getCourseID()) == null) {
            return courseDAL.insert(object) != 0;
        }
        return false;
    }

    public boolean update(Course object) {
        return courseDAL.update(object) != 0;
    }

    public boolean delete(String code) {
        return courseDAL.delete(code) != 0;
    }

    public List<Course> fillter(String sequenceFilter) {
        return courseDAL.fillter(sequenceFilter);
    }

    public void show() {
        StringBuilder builder = new StringBuilder();
        Formatter formatter = new Formatter(builder);
        formatter.format("%-20s%-20s", Constants.Course.COURSE_ID,
                Constants.Course.COURSE_NAME);
        List<Course> list = courseDAL.getAll();
        for (Course course : list) {
            builder.append("\n" + courseDAL.formatInfo(course));
        }
        System.out.println(builder.toString());
    }

}
