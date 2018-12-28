package bll;

import java.util.Scanner;

public class StudentController {
    private static Scanner scan;

    public static int showStudentListChoice() {
	scan = new Scanner(System.in);
	System.out.println("Student Management System");
	System.out.println("Choose the number that you want to ");
	System.out.println("Please input your choice: ");
	System.out.println("1. Show the list of student");
	System.out.println("2. Add student");
	System.out.println("3. DeleteStudent");
	int choice = Integer.parseInt(scan.nextLine());
	return choice;
    }

    public static void showListOfStudent() {
	System.out.println("List of student: ");
    }

    public static void addStudent() {
	
    }

    public static void deleteStudent() {

    }
}
