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
    public int insert(Course t) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int update(Course object) throws Exception{
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int delete(String code) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public List<Course> filter(String sequenceFilter) throws Exception{
	// TODO Auto-generated method stub
	return null;
    }

}
