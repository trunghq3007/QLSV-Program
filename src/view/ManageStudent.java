/**
 * 
 */
package view;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import bll.ClassRoomBLL;
import bll.CourseBLL;
import bll.DepartBLL;
import bll.MarkBLL;
import bll.StudentBLL;
import bll.SubjectBLL;
import bll.TypeOfTrainningBLL;
import entity.ClassRoom;
import entity.Course;
import entity.Depart;
import entity.Mark;
import entity.Student;
import entity.Subject;
import entity.TypeOfTrainning;
import utils.Constants;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public class ManageStudent {
		static Scanner sc = new Scanner(System.in);
		CourseBLL courseBLL = new CourseBLL();
		StudentBLL studentBLL = new StudentBLL();
		SubjectBLL subjectBLL = new SubjectBLL();
		TypeOfTrainningBLL typeOfTrainningBLL = new TypeOfTrainningBLL();
		DepartBLL departBLL = new DepartBLL();
		MarkBLL markBLL = new MarkBLL();
		ClassRoomBLL classRoomBLL = new ClassRoomBLL();

		final static Logger log = Logger.getLogger(ManageStudent.class);
		
		
		// Function menu()
        public void menu() {
        	System.out.println("---------------MENU------------------");
        	System.out.println("select 1: to manage Student" + 
								"\nSelect 2: to manage subjects" +
								"\nSelect 3: to manage class" +
								"\nSelect 4: to manage depart" +
								"\nSelect 5: to manage mark" +
								"\nSelect 6: to manage course" +
								"\nSelect 7: to manage training system" +
								"\nSelect exit: to exit program");
			System.out.println("-------------------------------------");
			System.out.print("Please choose: ");
        }
        
        // function to manage course table
        public void manageCourse() {
        	System.out.println("------------------------------------------");
        	System.out.println("Select 1: to insert a course" + 
        						"\nSelect 2: to delete a course" +
        						"\nSelect 3: to update a course" +
        						"\nSelect 4: to show all of course list" +
        						"\nSelect exit: to go to menu");
        	System.out.print("Please choose: ");
        	String select = sc.nextLine();
        	if("1".equals(select)) {
        		System.out.println("input information of coure to insert");
        		System.out.print(Constants.Course.COURSE_CODE + " = "); String courseCourse = sc.nextLine();
        		System.out.print(Constants.Course.COURSE_NAME + " = "); String courseName = sc.nextLine();
        		
        		Course course = new Course(courseCourse, courseName);
        		int status = courseBLL.insert(course);
        		if(status > 0) {
        			System.out.println("the addition successfully");
        			log.info("add a new course");
        		}else {
        			System.out.println("the addition is failed");
        		}
        		manageCourse();
        	}else if("2".equals(select)) {
        		System.out.print("input Name of course to delete"); String nameCourse = sc.nextLine();
        		
        		int status = courseBLL.delete(nameCourse);
        		if(status > 0) {
        			System.out.println("the delete is successfully");
        		}else {
        			System.out.println("the delete is failed");
        		}
        		manageCourse();
        	}else if("3".equals(select)) {
        		System.out.println("input new values of course to update");
        		System.out.print(Constants.Course.COURSE_CODE + " = "); String courseCourse = sc.nextLine();
        		System.out.print(Constants.Course.COURSE_NAME + " = "); String courseName = sc.nextLine();
        		
        		Course course = new Course(courseCourse, courseName);
        		int status = courseBLL.update(course);
        		if(status > 0) {
        			System.out.println("the update is successfully");
        		}else {
        			System.out.println("the update is failed");
        		}
        		manageCourse();
        	}else if("4".equals(select)) {
        		List<Course> listCourse = courseBLL.getAll();
        		for(Course course: listCourse) {
        			System.out.println(course.toString());
        		}
        		log.info("views a new course");
        		manageCourse();
        	}else if("exit".equals(select)) {
        		menu();
        	}
        }
        
        // function to manage Student object
        public void manageStudent() {
        	System.out.println("--------------Student---------------");
        	System.out.println("Select 1: to insert a student" + 
        						"\nSelect 2: to delete a student" +
        						"\nSelect 3: to update a student" +
        						"\nSelect 4: to show all of student list" +
        						"\nSelect exit: to go to menu");
        	System.out.print("Please choose: ");
        	String select = sc.nextLine();
        	if("1".equals(select)) {
        		System.out.println("input information of student to insert");
        		System.out.print("Student Code: "); String studentCode = sc.nextLine();
        		System.out.print("Student Name: "); String studentName = sc.nextLine();
        		System.out.print("Gender: "); byte gender = sc.nextByte();
        		sc.nextLine();
        		System.out.print("Day Of Birth: "); String dayofbirth = sc.nextLine();
        		System.out.print("Hometown: "); String hometown = sc.nextLine();
        		System.out.print("Class Code: "); String classcode = sc.nextLine();
        		
        		Student st = new Student(studentCode, studentName, gender, dayofbirth, hometown, classcode);
        		int status = studentBLL.insert(st);
        		if(status > 0) {
        			System.out.println("the insert is successfully");
        		}else {
        			System.out.println("the insert is failed");
        		}
        		manageStudent();
        	}else if("2".equals(select)) {
        		System.out.println("input Name of any Student that you want to delete");
        		System.out.print("Student Name: "); String studentName = sc.nextLine();
        		
        		int status = studentBLL.delete(studentName);
        		if(status > 0) {
        			System.out.println("the delete is successfully");
        		}else {
        			System.out.println("the delete is failed");
        		}
        		manageStudent();
        	}else if("3".equals(select)) {
        		System.out.println("input a new information of student to update");
        		System.out.print("Student Code: "); String studentCode = sc.nextLine();
        		System.out.print("Student Name: "); String studentName = sc.nextLine();
        		System.out.print("Gender: "); Byte gender = sc.nextByte();
        		sc.nextLine();
        		System.out.print("Day Of Birth: "); String dayofbirth = sc.nextLine();
        		System.out.print("Hometown: "); String hometown = sc.nextLine();
        		System.out.print("Class Code: "); String classcode = sc.nextLine();
        		
        		Student st = new Student(studentCode, studentName, gender, dayofbirth, hometown, classcode);
        		int status = studentBLL.update(st);
        		if(status > 0) {
        			System.out.println("the update is successfully");
        		}else {
        			System.out.println("the dapte is failed");
        		}
        		manageStudent();
        	}else if("4".equals(select)) {
        		List<Student> listStudent = studentBLL.getAll();
        		for(Student st: listStudent) {
        			System.out.println(st.toString());
        		}
        		manageStudent();
        	}else if("exit".equals(select)) {
        		menu();
        	}
        }
        
        // this task Function is manage Subject
        public void manageSubhect() {
        	System.out.println("--------------Subject---------------");
        	System.out.println("Select 1: to insert subject"+
        						"\nSelect 2: to delete subject" +
        						"\nSelect 3: to update subject" +
        						"\nSelect 4: to show a subject list" +
        						"\nSelect 5: to go to menu");
        	System.out.print("please choose (subject): ");
        	String select = sc.nextLine();
        	if("1".equals(select)) {
        		System.out.println("input information of subject which you want to insert");
        		System.out.print("Subject Code: "); String subjectCode = sc.nextLine();
        		System.out.print("Subject Name: "); String subjectName = sc.nextLine();
        		System.out.print("Number Credit: "); int numberCredit = sc.nextInt();
        		sc.nextLine();
        		
        		Subject sub = new Subject(subjectCode, subjectName, numberCredit);
        		int status = subjectBLL.insert(sub);
        		if(status > 0) {
        			System.out.println("the insert is succesfully");
        		}else {
        			System.out.println("the insert is failed");
        		}
        		manageSubhect();
        	}else if("2".equals(select)) {
        		System.out.println("input the name of subject which you want to delete");
        		System.out.print("Subject Name: ");
        		String nameSubject = sc.nextLine();
        		
        		int status = subjectBLL.delete(nameSubject);
        		if(status > 0) {
        			System.out.println("the delete is successfully");
        		}else {
        			System.out.println("the delete is failed");
        		}
        		manageSubhect();
        	}else if("3".equals(select)) {
        		System.out.println("input new information subject which you want to update");
        		System.out.print("Subject Code: "); String subjectCode = sc.nextLine();
        		System.out.print("Subject Name: "); String subjectName = sc.nextLine();
        		System.out.print("Number Credit: "); int numberCredit = sc.nextInt();
        		sc.nextLine();
        		
        		Subject sub = new Subject(subjectCode, subjectName, numberCredit);
        		
        		int status = subjectBLL.update(sub);
        		if(status > 0) {
        			System.out.println("the update is successfully");
        		}else {
        			System.out.println("the update is failed");
        		}
        		manageSubhect();
        	}else if("4".equals(select)) {
        		List<Subject> listSubjects = subjectBLL.getAll();
        		for(Subject subject: listSubjects) {
        			System.out.println(subject.toString());
        		}
        		manageSubhect();
        	}else if("4".equals(select)) {
        		menu();
        	}
        }
        
        public void manageTypeOfTrainning() {
        	System.out.println("--------------TypeTrain---------------");
        	System.out.println("Select 1: to insert a type of trainning" +
        						"\nSelect 2: to delete a type of trainning"+
        						"\nSelect 3: to update a type of trainning" +
        						"\nSelect 4: to show a type of trainning list"+
        						"\nSelect 5: to go to menu");
        	System.out.print("please choose(TypeOfTrainning): "); String select = sc.nextLine();
        	if("1".equals(select)) {
        		System.out.println("input the information of type of trainning to insert");
        		System.out.print("Type of Trainning's Code"); String typeCode = sc.nextLine();
        		System.out.print("Type of Trainning's Name: "); String typeName = sc.nextLine();
        		
        		TypeOfTrainning type = new TypeOfTrainning(typeCode, typeName);
        		int status = typeOfTrainningBLL.insert(type);
        		if(status > 0) {
        			System.out.println("the insert is successfully");
        		}else {
        			System.out.println("the insert is failed");
        		}
        		manageTypeOfTrainning();
        	}else if("2".equals(select)) {
        		System.out.println("input the name of type of trainning to delete");
        		System.out.println("Type of Trainning's Name"); String typeName = sc.nextLine();
        		
        		int status = typeOfTrainningBLL.delete(typeName);
        		if(status > 0) {
        			System.out.println("the delete is successfully");
        		}else {
        			System.out.println("the delete is failed");
        		}
        		manageTypeOfTrainning();
        	}else if("3".equals(select)) {
        		System.out.println("input new information of type of trainning to update");
        		System.out.println("Type of Trainning's Code"); String typeCode = sc.nextLine();
        		System.out.println("Type of Trainning's Name: "); String typeName = sc.nextLine();
        		
        		TypeOfTrainning type = new TypeOfTrainning(typeCode, typeName);
        		int status = typeOfTrainningBLL.update(type);
        		if(status > 0) {
        			System.out.println("the update is successfully");
        		}else {
        			System.out.println("the update is failed");
        		}
        		manageTypeOfTrainning();
        	}else if("4".equals(select)) {
        		List<TypeOfTrainning> list = typeOfTrainningBLL.getAll();
        		for(TypeOfTrainning type: list) {
        			System.out.println(type.toString());
        		}
        		manageTypeOfTrainning();
        	}else if("exit".equals(select)) {
        		menu();
        	}
        }
        
        public void manageDepart() {
        	System.out.println("--------------Depert---------------");
        	System.out.println("Select 1: to insert a new depart"+
        						"\nSelect 2: to delete a depart"+
        						"\nSelect 3: to update a depaer"+
        						"\nSelect 4: to show depart list"+
        						"\nSelect 5: to go to menu");
        	System.out.print("please choose: "); String select = sc.nextLine();
        	if("1".equals(select)) {
        		System.out.println("input informantion of depart which you want to insert");
        		System.out.print("Depart Code: "); String deptCode = sc.nextLine();
        		System.out.print("Depart Name: "); String deptName = sc.nextLine();
        		System.out.print("Address: "); String addr = sc.nextLine();
        		System.out.print("Phone: "); String phone = sc.nextLine();
        		
        		Depart dept = new Depart(deptCode, deptName, addr, phone);
        		int status = departBLL.insert(dept);
        		if(status > 0) {
        			System.out.println("the insert is successfully");
        		}else {
        			System.out.println("the insert is failed");
        		}
        		manageDepart();
        	}else if("2".equals(select)) {
        		System.out.println("input the name of depart which you wanto to remove");
        		System.out.print("Depart Name: "); String departName = sc.nextLine();
        		
        		int status = departBLL.delete(departName);
        		if(status > 0) {
        			System.out.println("the delete is successfully");
        		}else {
        			System.out.println("the delete is failed");
        		}
        		manageDepart();
        	}else if("3".equals(select)) {
        		System.out.println("input informantion of depart which you want to update");
        		System.out.print("Depart Code: "); String deptCode = sc.nextLine();
        		System.out.print("Depart Name: "); String deptName = sc.nextLine();
        		System.out.print("Address: "); String addr = sc.nextLine();
        		System.out.print("Phone: "); String phone = sc.nextLine();
        		
        		Depart dept = new Depart(deptCode, deptName, addr, phone);
        		int status = departBLL.update(dept);
        		if(status > 0) {
        			System.out.println("the update is successfully");
        		}else {
        			System.out.println("the update is failed");
        		}
        		manageDepart();
        	}else if("4".equals(select)){
        		List<Depart> listDept = departBLL.getAll();
        		for(Depart dept: listDept) {
        			System.out.println(dept.toString());
        		}
        		manageDepart();
        	}else if("exit".equals(select)) {
        		menu();
        	}
        }
        
        public void manageMark() {
        	System.out.println("--------------Mark---------------");
        	System.out.println("Select 1: to insert Mark of Student" +
        						"\nSelct 2: to delete Mark of Student"+
        						"\nSelect 3: to update Mark of Student"+
    							"\nSelect 4: to show list Mark of Students"+
        						"\nSelect 5: to go to menu");
        	System.out.print("Please choose: "); String select = sc.nextLine();
        	if("1".equals(select)) {
        		System.out.println("input new mark of a Student");
        		System.out.print("Student Code: "); String studentCode = sc.nextLine();
        		System.out.print("Subject Code: "); String subjecCode = sc.nextLine();
        		System.out.print("Semester: "); int semester = sc.nextInt();
        		System.out.print("First Mark: "); float firstMark = sc.nextFloat();
        		System.out.print("Second Code: "); float secondMark = sc.nextFloat();
        		sc.nextLine();
        		
        		Mark mark = new Mark(studentCode, subjecCode, semester, firstMark, secondMark);
        		int status = markBLL.insert(mark);
        		if(status > 0) {
        			System.out.println("the insert is succesfully");
        		}else {
        			System.out.println("the insert is failed");
        		}
        		manageMark();
        	}else if("2".equals(select)) {
        		System.out.println("input the mark of a Student to update");
        		System.out.print("Student Code: "); String studentCode = sc.nextLine();
        		System.out.print("Subject Code: "); String subjecCode = sc.nextLine();
        		System.out.print("Semester: "); int semester = sc.nextInt();
        		System.out.print("First Mark: "); float firstMark = sc.nextFloat();
        		System.out.print("Second Code: "); float secondMark = sc.nextFloat();
        		
        		Mark mark = new Mark(studentCode, subjecCode, semester, firstMark, secondMark);
        		int status = markBLL.update(mark);
        		if(status > 0) {
        			System.out.println("the update is succesfully");
        		}else {
        			System.out.println("the update is failed");
        		}
        		manageMark();
        	}else if("3".equals(select)) {
        		System.out.println("input Studen Code to remove one's mark");
        		System.out.print("Student Code"); String studentCode = sc.nextLine();
        		
        		int status = markBLL.delete(studentCode);
        		if(status > 0) {
        			System.out.println("the delete is succesfully");
        		}else {
        			System.out.println("the delete is failed");
        		}
        		manageMark();
        	}else if("4".equals(select)) {
        		List<Mark> listMark = markBLL.getAll();
        		for(Mark mark: listMark) {
        			System.out.println(mark.toString());
        		}
        		manageMark();
        	}else if("exit".equals(select)) {
        		menu();
        	}
        }
        
        
        // ////////////////////////////////////////////////
        public void manageClass() {
        	System.out.println("--------------Class---------------");
        	System.out.println("Select 1: to insert a new class" +
        						"\nSelect 2: to delete a class" +
        						"\nSelect 3: to update a class"+
        						"\nSelect 4: to show class list"+
        						"\nSelect exit: go to menu");
        	System.out.print("Please choose: "); String select = sc.nextLine();
        	if("1".equals(select)) {
        		System.out.println("input a class to insert");
        		System.out.print("Class Code: "); String classCode = sc.nextLine();
        		System.out.print("Class Name: "); String className = sc.nextLine();
        		System.out.print("Department Code: "); String deptCode = sc.nextLine();
        		System.out.println("Type Of Trainning: "); String typeTrain = sc.nextLine();
        		System.out.println("Course of Code: "); String courseCode = sc.nextLine();
        		
        		ClassRoom room = new ClassRoom(classCode, className, deptCode, typeTrain, courseCode);
        		int status = classRoomBLL.insert(room);
        		if(status > 0) {
        			System.out.println("the insert is successfully");
        		}else {
        			System.out.println("the insert is failed");
        		}
        		manageClass();
        	}else if("2".equals(select)) {
        		System.out.println("input class Code to remove: "); String classCode = sc.nextLine();
        		int status = classRoomBLL.delete(classCode);
        		if(status > 0) {
        			System.out.println("the delete is successfully");
        		}else {
        			System.out.println("the delete is failed");
        		}
        		manageClass();
        	}else if("3".equals(select)) {
        		System.out.println("input a class to update");
        		System.out.print("Class Code: "); String classCode = sc.nextLine();
        		System.out.print("Class Name: "); String className = sc.nextLine();
        		System.out.print("Department Code: "); String deptCode = sc.nextLine();
        		System.out.print("Type Of Trainning: "); String typeTrain = sc.nextLine();
        		System.out.print("Course of Code: "); String courseCode = sc.nextLine();
        		
        		ClassRoom room = new ClassRoom(classCode, className, deptCode, typeTrain, courseCode);
        		int status = classRoomBLL.update(room);
        		if(status > 0) {
        			System.out.println("the update is successfully");
        		}else {
        			System.out.println("the update is failed");
        		}
        		manageClass();
        	}else if("4".equals(select)) {
        		System.out.println("List ClassRoom");
        		List<ClassRoom> listClass = classRoomBLL.getAll();
        		for(ClassRoom room: listClass) {
        			System.out.println(room.toString());
        		}
        		manageClass();
        	}else if("exit".equals(select)) {
        		menu();
        	}
        }
        
        /// Main Method
        public static void main(String[] args) {
        	ManageStudent mn = new ManageStudent();
        	mn.menu();
        	while(true) {
        		String select = sc.nextLine(); 
        		if("1".equals(select)) {
        			mn.manageStudent();
        		}else if("2".equals(select)) {
        			mn.manageSubhect();
        		}else if("3".equals(select)) {
        			mn.manageClass();
        		}else if("4".equals(select)) {
        			mn.manageDepart();
        		}else if("5".equals(select)) {
        			mn.manageMark();
        		}else if("6".equals(select)) {
        			mn.manageCourse();
        		}else if("7".equals(select)) {
        			mn.manageTypeOfTrainning();
        		}
        		else if("exit".equals(select)) {
        			System.exit(0);
        		}
        	}
        }

}
