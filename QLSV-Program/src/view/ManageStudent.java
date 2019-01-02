/**
 * 
 */
package view;

import java.util.List;

import bll.CourseBLL;
import entity.Course;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public class ManageStudent {
    /**
     * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
     * date: Dec 28, 2018 Description: program manage student Version 1.0
     * 
     * @param args
     */
    public static void main(String[] args) throws Exception {
	// Show the list of choice
//	int choice = StudentController.showStudentListChoice();
//	switch (choice) {
//	// Show the list of student
//	case 1:
//	    StudentController.showListOfStudent();
//	    break;
//	case 2:
//	    // Add student to the database
//	    StudentController.addStudent();
//	    break;
//	case 3:
//	    // Delete a student
//	    StudentController.deleteStudent();
//	    break;
//	default:
//	    System.out.println();
	CourseBLL courseBLL = new CourseBLL();
	
	List<Course> courses = courseBLL.getAll();
	for(Course course : courses) {
	    System.out.println(course);
	}

    
//    
	System.out.println("List of course: ");
	Course courses1 = courseBLL.getByCode("K1");
	System.out.println(courses1);
//
	System.out.println("Search your course");
	List<Course> courses2 = courseBLL.filter("K2");
	for(Course course : courses2) {
	    System.out.println(course);
	}
	courseBLL.filter("K1");
    }
}
