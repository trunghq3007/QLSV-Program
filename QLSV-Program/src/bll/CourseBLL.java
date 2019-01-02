package bll;

import java.util.List;
import java.util.Scanner;

import dal.CourseDAL;
import entity.Course;
import utils.ValidateInput;

public class CourseBLL implements BaseBLL<Course> {
    CourseDAL courseDAL;
    static Scanner scan = new Scanner(System.in);

    public CourseBLL() {
	courseDAL = new CourseDAL();
    }

    public void showCourseListChoice() throws Exception {
	Course courseInput = null;
	System.out.println("This is the menu of course management.");
	System.out.println("Choose 1 to get all the information of courses.");
	System.out.println("Choose 2 to insert course.");
	System.out.println("Choose 3 to update the information of courses.");
	System.out.println("Choose 4 to delete course by code.");
	System.out.println("Choose 5 to search course by code.");
	System.out.println("Choose 6 to search course by any information you have.");
	System.out.println("Choose 7 to stop.");
	boolean isRunning = true;
	while (isRunning) {
	    int inputChoice = ValidateInput.getInt("", "Your input must between 0 ~ 6", 0, 6);
	    String inputCode = null;

	    switch (inputChoice) {
	    // Show the list of student
	    case 1:
		List<Course> courses = getAll();
		for (Course course : courses) {
		    System.out.println(course);
		}
		break;
	    case 2:
		// Add student to the database
		insert(courseInput);
		break;
	    case 3:
		// Delete a student
		update(courseInput);
		break;
	    case 4:
		// Delete a student
		inputCode = scan.nextLine();
		delete(inputCode);
		break;
	    case 5:
		inputCode = scan.nextLine();
		getByCode(inputCode);
		break;
	    case 6:
		inputCode = scan.nextLine();
		filter(inputCode);
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
    public int update(Course course) throws Exception {
	// TODO Auto-generated method stub
	return courseDAL.update(course);
    }

    @Override
    public int delete(String code) throws Exception {
	// TODO Auto-generated method stub
	return courseDAL.delete(code);
    }

    @Override
    public List<Course> filter(String sequenceFilter) throws Exception {
	// TODO Auto-generated method stub
	return courseDAL.filter(sequenceFilter);
    }

}
