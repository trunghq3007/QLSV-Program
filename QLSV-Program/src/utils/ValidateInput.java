package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import entity.Course;
import entity.Student;

public class ValidateInput {
    static Scanner scan = new Scanner(System.in);

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
	    if (phone.matches("\\d+") && phone.length() >= minLength)
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
	    if (email.matches("[A-Za-z0-9]+(.[A-Za-z0-9]+)*@[A-Za-z0-9]+(.[A-Za-z0-9]+)+"))
		checked = true;
	    else
		System.out.println(error);
	}
	return email;
    }

    static public String getName(String mess, String error) {// get name with only 1 word
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

    
    final static String DATE_FORMAT = "dd-MM-yyyy";
    static public String getDOB(String mess, String error) {
	String DOB = "";
	boolean dateIsValid = false;
	while (!dateIsValid) {
	    try {
		DateFormat df = new SimpleDateFormat(DATE_FORMAT);
		df.setLenient(false);
		df.parse(DOB);
		dateIsValid = true;
	    } catch (ParseException e) {
		System.out.println(error);
	    }
	}
	return DOB;
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
//		check = false;
	    System.out.println("Can't find in data!");
	    check = true;
	    continue;
	}
	return string;
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
//   		check = false;
   	    System.out.println("Can't find in data!");
   	    check = true;
   	    continue;
   	}
   	return string;
       }
}
