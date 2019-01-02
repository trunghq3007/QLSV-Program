/**
 * 
 */
package view;

import java.util.Scanner;

import org.apache.log4j.Logger;

import bll.CourseBLL;
import entity.Course;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public class ManageStudent {
	static Logger log = Logger.getLogger(ManageStudent.class);

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
		log.debug(" Start main application");
		log.warn("Start main application");
		log.error("Start main application");
		log.info("Start main application");
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
			System.out.println(courseBLL.stringBuilder());
			course();
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
				courseBLL.delete(courseBLL.getByCode(codeDel));
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
