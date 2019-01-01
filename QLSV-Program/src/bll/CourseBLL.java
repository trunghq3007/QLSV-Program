/**
 * 
 */
package bll;

import java.util.List;

import dal.CourseDAL;
import entity.Course;

/**
 * Create by: NVDiem
 * Create date: Jan 1, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 1, 2019
 * Description: ....
 * Version 1.0
 */
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

	@Override
	public List<Course> getAll() {
		// System.out.println("List of Course");
		// System.out.println(courseDAL.getAll());
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
