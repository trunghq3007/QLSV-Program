/**
 * 
 */
package view;

import java.util.List;

import bll.ClassBLL;
import bll.CourseBLL;
import bll.FacultyBLL;
import bll.PointBLL;
import bll.StudentBLL;
import bll.SubjectsBLL;
import bll.TrainingSystemBLL;
import entity.Class;
import entity.Course;
import entity.Faculty;
import entity.Point;
import entity.Student;
import entity.Subjects;
import entity.TrainingSystem;

/**
 * Create by: minhanh - CMC Create date: Dec 28, 2018 Modifier: minhanh Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public class ManageStudent {

	/**
	 * Create by: minhanh - CMC Create date: Dec 28, 2018 Modifier: minhanh Modified
	 * date: Dec 28, 2018 Description: program manage student Version 1.0
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		CourseBLL courseBLL = new CourseBLL();
		System.out.println(" List Course");
		List<Course> courses = courseBLL.getAll();
		for (Course course : courses) {
			System.out.println(course);
		}

		TrainingSystemBLL trainingsystemBLL = new TrainingSystemBLL();
		System.out.println("List Training System");
		List<TrainingSystem> trainingsystem = trainingsystemBLL.getAll();
		for (TrainingSystem trainingsystems : trainingsystem) {
			System.out.println(trainingsystems);
		}

		PointBLL pointBLL = new PointBLL();
		System.out.println("List Point");
		List<Point> point = pointBLL.getAll();
		for (Point points : point) {
			System.out.println(points);
		}

		FacultyBLL facultyBLL = new FacultyBLL();
		System.out.println("List Faculty");
		List<Faculty> faculty = facultyBLL.getAll();
		for (Faculty facultys : faculty) {
			System.out.println(facultys);
		}

		ClassBLL classBLL = new ClassBLL();
		System.out.println("List Class");
		List<Class> classs = classBLL.getAll();
		for (Class class1 : classs) {
			System.out.println(class1);
		}

		StudentBLL studentBLL = new StudentBLL();
		System.out.println("List Student");
		List<Student> student = studentBLL.getAll();
		for (Student student2 : student) {
			System.out.println(student2);
		}
		
		
		SubjectsBLL subjectsBLL = new SubjectsBLL();
		System.out.println("List Subject");
		List<Subjects> subjects = subjectsBLL.getAll();
		for (Subjects subjects2 : subjects) {
			System.out.println(subjects2);
		}
	
	}
	
		

}
