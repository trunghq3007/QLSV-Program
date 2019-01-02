package bll;

import java.util.List;
import dal.CourseDAL;
import entity.Course;
import utils.ValidateInput;

public class CourseBLL implements BaseBLL<Course> {
    CourseDAL courseDAL;

    public CourseBLL() {
	courseDAL = new CourseDAL();
    }

    public void showCourseListChoice() throws Exception {
	Course courseInput = null;
	boolean isRunning = true;
	while (isRunning) {
	    System.out.println("-----------COURSE MANAGEMENT");
	    System.out.println("1. Get all course");
	    System.out.println("2. Insert course");
	    System.out.println("3. Update course information");
	    System.out.println("4. Delete course by code");
	    System.out.println("5. Search course by code");
	    System.out.println("6. Search course by any information");
	    System.out.println("7. Stop");
	    System.out.println("Your choice is: ");
	    int inputChoice = ValidateInput.getInt("", "Your input must between 0 ~ 7", 0, 7);
	    String inputCode = null;
	    List<Course> courses = null;
	    switch (inputChoice) {
	    // Show the list of course
	    case 1:
		courses = getAll();
		for (Course course : courses) {
		    System.out.println(course);
		}
		break;
	    case 2:
		// Add course to the database
		courses = getAll();
		String courseCode = ValidateInput.getString("Input courseCode: ",
			"The length of code must be between 0 ~15! Input again:  ",0, 50);
		String courseName = ValidateInput.getString("Input courseName: ",
			"The length of name must be between 0 ~50! Input again:  ", 0, 50);
		courseInput = new Course(courseCode, courseName);
		insert(courseInput);
		courses = getAll();
		for (Course course : courses) {
		    System.out.println(course);
		}
		break;
	    case 3:
		// Update a course
		courses = getAll();
		String courseCodeUpdate = ValidateInput.getCodeValidate(courses,"Input courseCode: ",
			"The length of code must be between 0 ~15! Input again:  ", 0, 15);
		String courseNameUpdate = ValidateInput.getString("Input courseName instead: ",
			"The length of name must be between 0 ~50! Input again:  ", 0, 20);
		courseInput = new Course(courseCodeUpdate, courseNameUpdate);
		update(courseInput);
		courses = getAll();
		for (Course course : courses) {
		    System.out.println(course);
		}
		break;
	    case 4:
		// Delete a course
		inputCode = ValidateInput.getCodeValidate(courses,"Input courseCode: ",
			"The length of code must be between 0 ~15! Input again:  ", 0, 15);
		delete(getByCode(inputCode));
		courses = getAll();
		for (Course course : courses) {
		    System.out.println(course);
		}
		break;
		
	    case 5:
		System.out.println("Search your course");
		inputCode = ValidateInput.getCodeValidate(courses,"Input courseCode: ",
			"The length of code must be between 0 ~15! Input again:  ", 0, 15);
		Course courses1 = getByCode(inputCode);
		System.out.println(courses1);
		break;
	    case 6:
		inputCode = ValidateInput.getString("Input courseCode: ",
			"The length of code must be between 0 ~50! Input again:  ", 0, 50);
		courses = filter(inputCode);
		for (Course course : courses) {
		    System.out.println(course);
		}
		break;
	    case 7:
		isRunning = false;
		break;
	    default:
		System.out.println("You didn't choose the right choice.");
	    }
	}
    }

    @Override
    public List<Course> getAll() throws Exception {
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
    public int update(Course course) throws Exception {
	// TODO Auto-generated method stub
	return courseDAL.update(course);
    }

    @Override
    public int delete(Course course) throws Exception {
	// TODO Auto-generated method stub
	return courseDAL.delete(course);
    }

    @Override
    public List<Course> filter(String sequenceFilter) throws Exception {
	// TODO Auto-generated method stub
	return courseDAL.filter(sequenceFilter);
    }

    @Override
    public String show() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public StringBuilder showBuilder() {
	// TODO Auto-generated method stub
	return null;
    }

    
}
