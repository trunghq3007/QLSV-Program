/**
 * Project name: QLSV-Program 
 * File name: App.java
 * Created by: Sanero
 * Created date: Dec 28, 2018
 * Created time: 11:17:13 AM
 */

package view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import bll.StudentBLL;
import entity.Student;

/**
 * @author a
 * Description: 
 */
public class App {
	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - display main menu
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public int showMainMenu(Scanner sc) {
		System.out.println("------Manage Student------");
		System.out.println("1. Course");
		System.out.println("2. Mark");
		System.out.println("3. Class");
		System.out.println("4. Subject");
		System.out.println("5. Student");
		System.out.println("6. Faculty");
		System.out.println("7. Training Type");
		System.out.println("8. Quit");
		System.out.println("--------------------------");

		int choose = validateChoosenMenu(sc);
		return choose;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - Validate choosen menu
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	private int validateChoosenMenu(Scanner sc) {
		int choose = -1;
		do {
			try {
				System.out.print("Your choise (1-8): ");
				choose = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Input invalid. Please input a Integer value between 1 and 8.");
				sc.next();
				choose = -1;
			}
		} while (choose < 1 || choose > 8);
		return choose;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - Display child menu
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public int showChildMenu(Scanner sc) {
		System.out.println("1. View all");
		System.out.println("2. Add new");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Filter");
		System.out.println("6. Get by Id");
		System.out.println("7. Back to main menu");
		System.out.println("8. Exit program");
		System.out.println("--------------------------");
		int choose = validateChoosenMenu(sc);
		return choose;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - Run main menu
	 * Version 1.0
	 */
	public void runMainMenu() {
		Scanner sc = new Scanner(System.in);
		int choosen = -1;
		while (true) {
			choosen = showMainMenu(sc);
			sc.nextLine();
			switch (choosen) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				runStudent(sc);
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				exit(sc);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - run child menu: Student
	 * Version 1.0
	 * @param sc
	 */
	private void runStudent(Scanner sc) {
		StudentBLL studentBLL = new StudentBLL();
		int choose = -1;
		do {
			choose = showChildMenu(sc);
			sc.nextLine();
			if (choose == 7)
				break;
			switch (choose) {
			case 1:
				List<Student> list = studentBLL.getAll();
				studentBLL.display(list);
				break;
			case 2:
				Student student = studentBLL.inputStudent(sc);
				if (studentBLL.insert(student))
					System.out.println("Insert successfully");
				else
					System.out.println("Something wrong in progress insert student");
				break;
			case 3:
				if (studentBLL.updateInfo(sc))
					System.out.println("Update successfully");
				else
					System.out.println("Something wrong in progress update student");
				break;
			case 4:
				String id = studentBLL.inputExistId(sc);
				if (studentBLL.delete(id) > 0)
					System.out.println("Delete successfully");
				else
					System.out.println("Something wrong in progress delete student");
				break;
			case 5:
				studentBLL.filterByCharacter(sc);
				break;
			case 6:
				studentBLL.showStudentGetById(sc);
				break;
			case 8:
				exit(sc);
				break;
			default:
				break;
			}
			boolean isContinue = isContinous(sc);
			if (!isContinue)
				break;
		} while (choose != 7);
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - question to exit system
	 * Version 1.0
	 * @param sc
	 */
	private void exit(Scanner sc) {
		String result = "";
		while (!("y".equalsIgnoreCase(result)) && !("n".equalsIgnoreCase(result))) {
			System.out.println("Do u want to exit system? (Y/N)");
			result = sc.nextLine();
			if (!("y".equalsIgnoreCase(result)) && !("n".equalsIgnoreCase(result)))
				System.out.println("Invalid choosen");
		}

		if ("y".equalsIgnoreCase(result)) {
			sc.close();
			System.exit(0);
		}
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - question for continous
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	private boolean isContinous(Scanner sc) {
		String result = "";
		while (!("y".equalsIgnoreCase(result)) && !("n".equalsIgnoreCase(result))) {
			System.out.println("Do u want to continue? (Y/N):");
			result = sc.nextLine();
			if (!("y".equalsIgnoreCase(result)) && !("n".equalsIgnoreCase(result)))
				System.out.println("Invalid choosen");
		}

		if ("y".equalsIgnoreCase(result)) {
			return true;
		}
		return false;
	}
}
