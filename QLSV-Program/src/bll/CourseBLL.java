package bll;

import java.util.List;

import dal.CourseDAL;
import entity.Course;

public class CourseBLL implements BaseBLL<Course> {
    CourseDAL courseDAL;
    
    public CourseBLL() {
	courseDAL = new CourseDAL();
    }
    @Override
    public List<Course> getAll() {
	System.out.println("List of course: ");
	return courseDAL.getAll();
    }

    @Override
    public Course getByCode(String code) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int insert(Course t) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int update(Course object) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int delete(String code) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public List<Course> filter(String sequenceFilter) {
	// TODO Auto-generated method stub
	return null;
    }

}
