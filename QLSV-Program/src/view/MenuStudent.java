package view;

import java.util.Scanner;

import bll.CourseBLL;
import bll.StudentBLL;
import entity.Course;

public class MenuStudent {
	public static void menuStudent() {
		System.out.println("------Student------");
		System.out.println("1. View all");
		System.out.println("2. Add new");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Fillter");
		System.out.println("6. Get by Id");
		System.out.println("Write 'quit' to exit.");
		System.out.println("--------------------------");
		System.out.println("Your choise: ");
		
		StudentBLL studentBLL = new StudentBLL();
		Scanner sc = new Scanner(System.in);
		String choise = "";
		choise = sc.nextLine();
		
		switch (choise) {
		case "1":
			System.out.println(courseBLL.stringBuilder());
			menuStudent();
			break;
		case "2":
			System.out.println("Nhap code: ");
			String code = sc.nextLine();
			System.out.println("Nhap ten: ");
			String name = sc.nextLine();
			Course object = new Course(code, name);
			if (courseBLL.insert(object)==1) {
				System.out.println("OK");
			} else {
				System.out.println("Fails!");
			}
			System.out.println(courseBLL.stringBuilder());
			course();
			break;
		case "3":
			System.out.println("Id course update: ");
			String codeupdate = sc.nextLine();
			System.out.println("name course update: ");
			String nameUpdate = sc.nextLine();
			Course object1 = new Course(codeupdate, nameUpdate);
			if (courseBLL.udpate(object1) != -1) {
				System.out.println("OK!");
			} else {
				System.out.println("Fails!");
			}

			System.out.println(courseBLL.stringBuilder());
			course();
			break;
		case "4":
			System.out.println("Id delete: ");
			String codeDel = sc.nextLine();
			if (courseBLL.delete(courseBLL.getByCode(codeDel)) != -1) {
				System.out.println("OK!");
			} else {
				System.out.println("Fails!");
			}

			System.out.println(courseBLL.stringBuilder());
			course();
			break;
		case "5":
			System.out.println("Fillter: ");
			Scanner scannerFillter = new Scanner(System.in);
			String nameFillter = scannerFillter.nextLine();
			System.out.println(nameFillter);
			//
			for (Course i : courseBLL.fillter(nameFillter)) {
				System.out.println(i);
			}
			course();
			break;
		case "6":
			break;
		case "quit":
			main(null);
			return;
		default:
			break;
		}
	}
}
