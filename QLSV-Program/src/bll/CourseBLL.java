/**
 * 
 */
package bll;

import java.util.List;

import dal.CourseDAL;
import entity.Course;
import utils.Constants;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: Version 1.0
 */
public class CourseBLL implements BaseBLL<Course> {
    CourseDAL courseDAL;

    /**
     * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
     * date: Dec 28, 2018 Description: .... Version 1.0
     * 
     * @param courseDAL
     */
    public CourseBLL() {
        courseDAL = new CourseDAL();
    }

    @Override
    public List<Course> getAll() {
        return courseDAL.getAll();

    }

    @Override
    public Course getByCode(String code) {
        return courseDAL.getByCode(code);
    }

    @Override
    public int insert(Course object) {
        if (null == object) {
            System.out.println("object is null. Can't be inserted");
            return 0;
        }
        return courseDAL.insert(object);
    }

    @Override
    public int update(Course object) {
        if (null == object) {
            System.out.println("object is null. Can't be updated");
            return 0;
        }
        return courseDAL.update(object);
    }

    @Override
    public int delete(String code) {
        return courseDAL.delete(code);
    }

    @Override
    public List<Course> filter (String sequenceFilter) {
    	return courseDAL.filter(sequenceFilter);
    }
    
    @Override
    public void show(List<Course> list) {
        if (null == list) {
            System.out.println("empty result");
        }
        System.out.println(Constants.Course.COURSE_CODE + "\t" + Constants.Course.COURSE_NAME);
        for (Course iter : list) {
           System.out.println(iter.getCourseCode() + "\t" + iter.getCourseName());
        }
    }

}
