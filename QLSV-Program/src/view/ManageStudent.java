/**
 * 
 */
package view;

import java.sql.Connection;
import java.util.Scanner;

import bll.CourseBLL;
import dal.CourseDAL;
import entity.Course;
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

	/**
	 * Create by: HQTrung - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: HQTrung
	 * Modified date: Dec 28, 2018
	 * Description: program manage student
	 * Version 1.0
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------Manage Student------");
		System.out.println("1. Course");
		System.out.println("2. Mark");
		System.out.println("3. Class");
		System.out.println("4. Subject");
		System.out.println("5. Student");
		System.out.println("6. Faculti");
		System.out.println("7. Tranning");
		System.out.println("Write 'quit' to exit.");
		System.out.println("--------------------------");
		System.out.println("Your choise: ");
		Scanner sc = new Scanner(System.in);

		String choise = "";
		choise = sc.nextLine();
		switch (choise) {
		case "1":
			course();
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		case "6":
			break;
		case "7":
			break;
		case "quit":
			main(args);
			break;
		default:
			main(args);
			break;
		}
	}

	public static void course() {
		System.out.println("------Course------");
		System.out.println("1. View all");
		System.out.println("2. Add new");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Fillter");
		System.out.println("6. Get by Id");
		System.out.println("Write 'quit' to exit.");
		System.out.println("--------------------------");
		System.out.println("Your choise: ");
		Scanner sc = new Scanner(System.in);
		String choise = "";
		choise = sc.nextLine();
		CourseBLL courseBLL = new CourseBLL();
		switch (choise) {
		case "1":
			for(Course i :courseBLL.getAll()) {
				System.out.println(i);
			}
			course();
			break;
		case "2":
			System.out.println("Nhap code: ");
			String code = sc.nextLine();
			System.out.println("Nhap ten: ");
			String name = sc.nextLine();
			Course object = new Course(code, name);
			courseBLL.insert(object);
			for(Course i :courseBLL.getAll()) {
				System.out.println(i);
			}
			course();
			break;
		case "3":
			System.out.println("Id course update: ");
			String codeupdate = sc.nextLine();
			String nameUpdate = sc.nextLine();
			Course object1 = new Course(codeupdate, nameUpdate);
			courseBLL.udpate(object1);
			for(Course i :courseBLL.getAll()) {
				System.out.println(i);
			}
			course();
			break;
		case "4":
			System.out.println("Nhap id muon xoa");
			String codeDel = sc.nextLine();
			courseBLL.delete(courseBLL.getByCode(codeDel));
			for(Course i :courseBLL.getAll()) {
				System.out.println(i);
			}
			course();
			break;
		case "5":
			System.out.println("Fillter: ");
			String nameFillter = sc.nextLine();
			for(Course i :courseBLL.fillter(nameFillter)) {
				System.out.println(i.getCourseName());
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
