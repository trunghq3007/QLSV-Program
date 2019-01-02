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
        // System.out.println(courseDAL.getAll());
        return courseDAL.getAll();

    }

    public Course getByCode(String code) {
        return courseDAL.getByCode(code);
    }

    public int insert(Course object) {
        if (courseDAL.insert(object) > 0) {
            System.out.println("them moi thanh cong: ");
        } else {
            System.out.println("khong them moi duoc: ");
        }
        return courseDAL.insert(object);
    }

    public int update(Course object) {
        if (courseDAL.update(object) > 0) {
            System.out.println("sua thanh cong: ");
        } else {
            System.out.println("khong sua duoc: ");
        }
        return courseDAL.update(object);
    }

    public int delete(String code) {
        if (courseDAL.delete(code) > 0) {
            System.out.println("xoa thanh cong: ");
        } else {
            System.out.println("khong xoa duoc: ");
        }
        return courseDAL.delete(code);
    }

    public List<Course> fillter(String sequenceFilter) {
        return null;
    }

    public String show() {
        Formatter formatter = new Formatter();
        formatter.format("%-20s%-20s\n",Constants.Course.COURSE_CODE,Constants.Course.COURSE_NAME);
        System.out.println(formatter);
        System.out.println(courseDAL.show());
        return courseDAL.show();
    }

    public StringBuilder showBuilder() {
        
        Formatter formatter = new Formatter();
        formatter.format("%-20s%-20s\n",Constants.Course.COURSE_CODE,Constants.Course.COURSE_NAME);
        System.out.println(formatter);
        System.out.println(courseDAL.showBuilder());
        return courseDAL.showBuilder();
    }

}
