package bll;

import java.util.List;

import entity.Course;
import entity.Student;
import utils.ValidateInput;

public class StudentBLL implements BaseBLL<Student>{
    
    public void showStudentListChoice() throws Exception {
	Course courseInput = null;
	boolean isRunning = true;
	//while (isRunning) {
//	    System.out.println("-----------STUDENT MANAGEMENT");
//	    System.out.println("1. Get all course");
//	    System.out.println("2. Insert course");
//	    System.out.println("3. Update course information");
//	    System.out.println("4. Delete course by code");
//	    System.out.println("5. Search course by code");
//	    System.out.println("6. Search course by any information");
//	    System.out.println("7. Stop");
//	    System.out.println("Your choice is: ");
//	    int inputChoice = ValidateInput.getInt("", "Your input must between 0 ~ 7", 0, 7);
//	    String inputCode = null;
//	    List<Course> courses = null;
//	    switch (inputChoice) {
//	    // Show the list of course
//	    case 1:
//		courses = getAll();
//		for (Course course : courses) {
//		    System.out.println(course);
//		}
//		break;
//	    case 2:
//		// Add course to the database
//		String courseCode = ValidateInput.getString("Input courseCode: ",
//			"The length of code must be between 0 ~15! Input again:  ", 0, 15);
//		String courseName = ValidateInput.getString("Input courseName: ",
//			"The length of name must be between 0 ~50! Input again:  ", 0, 50);
//		courseInput = new Course(courseCode, courseName);
//		insert(courseInput);
//		courses = getAll();
//		for (Course course : courses) {
//		    System.out.println(course);
//		}
//		break;
//	    case 3:
//		// Update a course
//		String courseCodeUpdate = ValidateInput.getString("Input courseCode: ",
//			"The length of code must be between 0 ~15! Input again:  ", 0, 15);
//		String courseNameUpdate = ValidateInput.getString("Input courseName instead: ",
//			"The length of name must be between 0 ~50! Input again:  ", 0, 50);
//		courseInput = new Course(courseCodeUpdate, courseNameUpdate);
//		update(courseInput);
//		courses = getAll();
//		for (Course course : courses) {
//		    System.out.println(course);
//		}
//		break;
//	    case 4:
//		// Delete a course
//		inputCode = ValidateInput.getString("Input courseCode you want to delete: ",
//			"The length of code must be between 0 ~15! Input again:  ", 0, 15);
//		delete(getByCode(inputCode));
//		courses = getAll();
//		for (Course course : courses) {
//		    System.out.println(course);
//		}
//		break;
//		
//	    case 5:
//		System.out.println("Search your course");
//		System.out.println("Please input your code of course to find: ");
//		inputCode = ValidateInput.getString("Input courseCode: ",
//			"The length of code must be between 0 ~15! Input again:  ", 0, 15);
//		Course courses1 = getByCode(inputCode);
//		System.out.println(courses1);
//		break;
//	    case 6:
//		inputCode = ValidateInput.getString("Input courseCode: ",
//			"The length of code must be between 0 ~15! Input again:  ", 0, 15);
//		courses = filter(inputCode);
//		for (Course course : courses) {
//		    System.out.println(course);
//		}
//		break;
//	    case 7:
//		isRunning = false;
//		break;
//	    default:
//		System.out.println("You didn't choose the right choice.");
//	    }
//	}
    }

    @Override
    public List<Student> getAll() throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Student getByCode(String code) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int insert(Student t) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int update(Student object) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int delete(Student object) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public List<Student> filter(String sequenceFilter) throws Exception {
	// TODO Auto-generated method stub
	return null;
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
