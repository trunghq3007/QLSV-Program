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
    public List<Course> getAll() throws Exception{
	System.out.println("List of course: ");
	return courseDAL.getAll();
    }

    @Override
    public Course getByCode(String code) throws Exception {
	return courseDAL.getByCode(code);
    }

    @Override
    public int insert(Course course) throws Exception {
	// TODO Auto-generated method stub
	return courseDAL.insert(course);
    }

    @Override
    public int update(Course course) throws Exception{
	// TODO Auto-generated method stub
	return courseDAL.update(course);
    }

    @Override
    public int delete(String code) throws Exception {
	// TODO Auto-generated method stub
	return courseDAL.delete(code);
    }

    @Override
    public List<Course> filter(String sequenceFilter) throws Exception{
	// TODO Auto-generated method stub
	return courseDAL.filter(sequenceFilter);
    }

}
