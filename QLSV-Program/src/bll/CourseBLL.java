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
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: Version 1.0
 */
public class CourseBLL implements BaseBLL<Course> {
	// courseDAL
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
		// System.out.println("List of Course");
		// System.out.println(courseDAL.getAll());
		return courseDAL.getAll();

	}

	@Override
	public Course getByCode(String code) {
		return courseDAL.getByCode(code);
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
	public int delete(String code) {
		return courseDAL.delete(code);
	}

	@Override
	public List<Course> fillter(String sequenceFilter) {
		return courseDAL.fillter(sequenceFilter);
	}

	@Override
	public StringBuilder showBuilder() {
		List<Course> courses = getAll();
		StringBuilder stringData = new StringBuilder();
		for (Course course : courses) {
			stringData.append(course.getCourseCode() + "\t" + course.getCourseName());
		}
		return stringData;
	}

	@Override
	public StringBuffer showBuffer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void show() {
		StringBuilder builder = new StringBuilder();
		Formatter formatter = new Formatter(builder);
		formatter.format("%-20s%-20s", Constants.Course.COURSE_CODE, Constants.Course.COURSE_NAME);
		List<Course> list = courseDAL.getAll();
		for (Course course : list) {
			builder.append("\n" + courseDAL.formatInfo(course));
		}
		System.out.println(builder.toString());
	}

}
