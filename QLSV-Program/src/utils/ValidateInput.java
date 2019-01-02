package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import entity.Course;
import entity.Student;
import entity.Class;

public class ValidateInput {
    static Scanner scan = new Scanner(System.in);
    final static String DATE_FORMAT = "yyyy-MM-dd";

    static public double getDouble(String mess, String error, double min, double max) {
	String doubleNum;
	double num = 0;
	boolean check = false;
	while (!check) {
	    System.out.print(mess);
	    doubleNum = scan.nextLine();
	    try {
		num = Double.parseDouble(doubleNum);
	    } catch (NumberFormatException e) {
		System.out.println(error);
		continue;
	    }
	    if (num >= min && num <= max) {
		check = true;
	    } else {
		System.out.println(error);
	    }
	}
	return num;
    }

    static public int getInt(String mess, String error, int min, int max) {
	String intNum;
	int num = 0;
	boolean checked = false;
	while (!checked) {
	    System.out.print(mess);
	    intNum = scan.nextLine();
	    try {
		num = Integer.parseInt(intNum);
	    } catch (NumberFormatException e) {
		System.out.println(error);
		continue;
	    }
	    if (num >= min && num <= max) {
		checked = true;
	    } else {
		System.out.println(error);
	    }
	}
	return num;
    }

    static public String getPhone(String mess, String error, int minLength) {
	String phone = "";
	boolean checked = false;
	while (!checked) {
	    System.out.print(mess);
	    phone = scan.nextLine();
	    if (phone.matches("(?:\\(\\d{3}\\)|\\d{3}[-]*)\\d{3}[-]*\\d{4}") && phone.length() >= minLength)
		checked = true;
	    else
		System.out.println(error);
	}
	return phone;
    }

    static public String getEmail(String mess, String error) {
	String email = "";
	boolean checked = false;
	while (!checked) {
	    System.out.print(mess);
	    email = scan.nextLine();
	    if (email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"))
		checked = true;
	    else
		System.out.println(error);
	}
	return email;
    }

    static public String getName(String mess, String error) {
	String name = "";
	boolean checked = false;
	while (!checked) {
	    System.out.print(mess);
	    name = scan.nextLine();
	    if (name.matches("^[a-zA-Z\\s]+"))
		checked = true;
	    else
		System.out.println(error);
	}
	return name;
    }

    static public String getDOB(String mess, String error) {
	String stringDOB = null;
	boolean dateIsValid = false;
	while (!dateIsValid) {
	    System.out.print(mess);
	    stringDOB = scan.nextLine();
	    try {
		DateFormat df = new SimpleDateFormat(DATE_FORMAT);
		df.setLenient(false);
		df.parse(stringDOB);
		dateIsValid = true;
	    } catch (ParseException e) {
		System.out.println(error);
	    }
	}
	return stringDOB;
    }

    static public String getString(String mess, String error, int min, int max) {
	String string = null;
	boolean check = false;
	while (!check) {
	    System.out.print(mess);
	    string = scan.nextLine();
	    try {

	    } catch (NumberFormatException e) {
		System.out.println(error);
		continue;
	    }
	    if (string.length() >= min && string.length() <= max) {
		check = true;
	    } else {
		System.out.println(error);
	    }
	}
	return string;
    }

    static public boolean getSex(String mess, String error) {
	String sex = null;
	boolean returnValue;
	boolean check = false;
	while (!check) {
	    System.out.println(mess);
	    sex = scan.nextLine();
	    if ("Male".equals(sex) || "Female".equals(sex) || "male".equals(sex) || "female".equals(sex)) {
		check = true;
	    } else {
		System.out.println(error);
	    }
	}
	if ("Male".equals(sex) || "male".equals(sex)) {
	    returnValue = true;
	} else
	    returnValue = false;
	return returnValue;
    }

    static public String getCodeValidateCourse(List<Course> courses, String mess, String error, int min, int max) {
	String string = null;
	boolean check = true;

	while (check) {
	    System.out.println(mess);
	    string = scan.nextLine();

	    if (string.length() >= min && string.length() <= max) {
		check = false;
	    } else {
		System.out.println(error);
		break;
	    }
	    check = false;
	    for (Course x : courses) {
		if (string.equals(x.getCourseCode())) {
		    return string;
		}
	    }
	    System.out.println("Can't find in data!");
	    check = true;
	    continue;
	}
	return string;
    }

    static public boolean isDuplicateCodeCourse(List<Course> courses, String string) {
	for (Course x : courses) {
	    if (string.equals(x.getCourseCode())) {
		return true;
	    }
	}
	return false;
    }

    static public String getCodeValidateStudent(List<Student> students, String mess, String error, int min, int max) {
	String string = null;
	boolean check = true;

	while (check) {
	    System.out.println(mess);
	    string = scan.nextLine();

	    if (string.length() >= min && string.length() <= max) {
		check = false;
	    } else {
		System.out.println(error);
		break;
	    }
	    check = false;
	    for (Student x : students) {
		if (string.equals(x.getStudentCode())) {
		    return string;
		}
	    }
	    System.out.println("Can't find in data!");
	    check = true;
	    continue;
	}
	return string;
    }

    static public String getCodeValidateClass(List<Class> classes, String mess, String error, int min, int max) {
	String string = null;
	boolean check = true;

	while (check) {
	    System.out.println(mess);
	    string = scan.nextLine();

	    if (string.length() >= min && string.length() <= max) {
		check = false;
	    } else {
		System.out.println(error);
		break;
	    }
	    check = false;
	    for (Class x : classes) {
		if (x.getClassCode().equals(string)) {
		    return string;
		}
	    }
	    System.out.println("Can't find in data!");
	    check = true;
	    continue;
	}
	return string;
    }

}
