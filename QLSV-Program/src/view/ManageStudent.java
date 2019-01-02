/**
 * 
 */
package view;

import java.util.List;

import org.apache.log4j.Logger;

import bll.CourseBLL;
import entity.Course;
import sun.applet.Main;

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
    static Logger Log = Logger.getLogger(ManageStudent.class);
    public static void main(String[] args) throws Exception {
	Log.debug("Start main application - Debuging");
	Log.warn("Start main application - Warning");
	Log.error("Start main application - Error");
	Log.info("Start main application - Info");
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
	courseBLL.showCourseListChoice();
//	List<Course> courses = courseBLL.getAll();
//	for(Course course : courses) {
//	    System.out.println(course);
//	}
//
//    
////    
//	System.out.println("List of course: ");
//	Course courses1 = courseBLL.getByCode("K1");
//	System.out.println(courses1);
////
//	System.out.println("Search your course");
//	List<Course> courses2 = courseBLL.filter("K2");
//	for(Course course : courses2) {
//	    System.out.println(course);
//	}

    }
}
