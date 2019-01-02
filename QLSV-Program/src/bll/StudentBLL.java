package bll;

import java.util.List;
import dal.StudentDAL;
import entity.Student;
import entity.Class;
import utils.ValidateInput;
import bll.ClassBLL;

public class StudentBLL implements BaseBLL<Student> {
    StudentDAL studentDAL;
    static String inputCode = null;
    
    public StudentBLL() {
	studentDAL = new StudentDAL();
    }

    public void showStudentListChoice() throws Exception {
	Student studentInput = null;
	boolean isRunning = true;
	ClassBLL classBLL = new ClassBLL();
	try {
	    while (isRunning) {
		System.out.println("-----------STUDENT MANAGEMENT");
		System.out.println("1. Get all student");
		System.out.println("2. Insert student");
		System.out.println("3. Update student information");
		System.out.println("4. Delete student by code");
		System.out.println("5. Search student by code");
		System.out.println("6. Search student by any information");
		System.out.println("7. Stop");
		System.out.println("Your choice is: ");
		int inputChoice = ValidateInput.getInt("", "Your input must between 0 ~ 7", 0, 7);
		List<Student> students = null;
		List<Class> classes = null;
		switch (inputChoice) {
		// Show the list of course
		case 1:
		    students = getAll();
		    for (Student course : students) {
			System.out.println(course);
		    }
		    break;
		case 2:
		    // Add course to the database
		    students = getAll();
		    String studentCode = ValidateInput.getString("Input studentCode: ",
			    "The length of code must be between 0 ~15! Input again:  ", 0, 50);
		    String studentName = ValidateInput.getName("Input studentName: ", "You must input a name!");
		    boolean studentSex = ValidateInput.getSex("Input studentSex (Male/Female): ", "Must be (Male/Female):  ");
		    String dateOfBirth = ValidateInput.getDOB("Input date of birth (yyyy-MM-dd): ",
			    "You must input a date of birth follow the form (yyyy-MM-dd): ");
		    String homeTown = ValidateInput.getString("Input homeTown :",
			    "The length of name must be between 0 ~50! Input again:  ", 0, 50);
		    String classCode = ValidateInput.getString("Input classCode: ",
			    "The length of name must be between 0 ~50! Input again:  ", 0, 50);

		    studentInput = new Student(studentCode, studentName, studentSex, dateOfBirth, homeTown, classCode);
		    insert(studentInput);
		    students = getAll();
		    for (Student course : students) {
			System.out.println(course);
		    }
		    break;
		case 3:
		    // Update a student record by code
		    students = getAll();
		    classes = classBLL.getAll();
		    String studentCodeUpdate = ValidateInput.getCodeValidateStudent(students, "Input studentCode: ",
			    "The length of code must be between 0 ~15! Input again:  ", 0, 15);
		    String studentNameUpdate = ValidateInput.getName("Input studentName: ", "You must input a name!");
		    boolean studentSexUpdate = ValidateInput.getSex("Input studentSex (Nam/Nu): ",
			    "Must be (Nam/Nu):  ");
		    String dateOfBirthUpdate = ValidateInput.getDOB("Input date of birth: ",
			    "You must input a date of birth: ");
		    String homeTownUpdate = ValidateInput.getString("Input homeTown ",
			    "The length of name must be between 0 ~50! Input again:  ", 0, 50);
//chua validate classCodeUpdate (phai trung class Code)
		    String classCodeUpdate = ValidateInput.getCodeValidateClass(classes,"Input classCode: ",
			    "The length of name must be between 0 ~15! Input again:  ", 0, 15);
		    studentInput = new Student(studentCodeUpdate, studentNameUpdate, studentSexUpdate,
			    dateOfBirthUpdate, homeTownUpdate, classCodeUpdate);
		    update(studentInput);
		    students = getAll();
		    for (Student x : students) {
			System.out.println(x);
		    }
		    break;
		case 4:
		    // Delete a student record by code
		    students = getAll();
		    inputCode = ValidateInput.getCodeValidateStudent(students, "Input studentCode: ",
			    "The length of code must be between 0 ~15! Input again:  ", 0, 15);
		    delete(getByCode(inputCode));
		    students = getAll();
		    for (Student x : students) {
			System.out.println(x);
		    }
		    break;

		case 5:
		    students = getAll();
		    System.out.println("Search your course");
		    inputCode = ValidateInput.getCodeValidateStudent(students, "Input studentCode: ",
			    "The length of code must be between 0 ~15! Input again:  ", 0, 15);
		    Student courses1 = getByCode(inputCode);
		    System.out.println(courses1);
		    break;
		case 6:
		    inputCode = ValidateInput.getString("Input which you want to search: ",
			    "The length of code must be between 0 ~50! Input again:  ", 0, 50);
		    students = filter(inputCode);
		    for (Student course : students) {
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
	} catch (Exception ex) {
	    ex.printStackTrace();
	}

    }

    @Override
    public List<Student> getAll() throws Exception {
	return studentDAL.getAll();
    }

    @Override
    public Student getByCode(String code) throws Exception {
	return studentDAL.getByCode(code);
    }

    @Override
    public int insert(Student student) throws Exception {
	return studentDAL.insert(student);
    }

    @Override
    public int update(Student student) throws Exception {
	return studentDAL.update(student);
    }

    @Override
    public int delete(Student student) throws Exception {
	return studentDAL.delete(student);
    }

    @Override
    public List<Student> filter(String sequenceFilter) throws Exception {
	return studentDAL.filter(sequenceFilter);
    }

    @Override
    public String show() {
	return null;
    }

    @Override
    public StringBuilder showBuilder() {
	return null;
    }

}
