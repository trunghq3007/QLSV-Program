/**
 * 
 */
package view;

import java.util.List;
import java.util.Scanner;

import bll.CourseBLL;
import entity.Course;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public class ManageStudent {

	/**
	 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
	 * date: Dec 28, 2018 Description: program manage student Version 1.0
	 * 
	 * @param args
	 */

	public static void menu() {
		System.out.println("===============MENU==================");
		System.out.println("1.Quản lý Khoa");
		System.out.println("2.Quản lý Khóa học");
		System.out.println("3.Quản lý Hệ đào tạo");
		System.out.println("4.Quản lý Lớp");
		System.out.println("5.Quản lý Sinh Viên");
		System.out.println("6.Quản lý Điểm");
		System.out.println("7.Quản lý Môn học");
		System.out.println("8.Quản lý Khoa");
		System.out.println("0.Thoát");
	}

	public static void menuCourse() {
		System.out.println("1. Hiển thị danh sách khóa học");
		System.out.println("2. Thêm một khóa học");
		System.out.println("3. Xóa 1 khóa học");
		System.out.println("4. Tìm kiếm khóa học");
		System.out.println("5. Sửa một khóa học");
		System.out.println("0. Exit");
	}

	public static void manageCourse() {
		CourseBLL courseBLL = new CourseBLL();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n============== Menu Quản lý khoá học =============\n");
		menuCourse();

		int choiseCourse = -1;
		do {
			System.out.print("Nhap lua chon quan ly khoa hoc: ");
			choiseCourse = Integer.parseInt(scanner.nextLine());
			if (choiseCourse < 0 || choiseCourse > 5) {
				System.out.println("Vui lòng nhập lại");
			}
			switch (choiseCourse) {
			case 1:
				List<Course> courses = courseBLL.getAll();
				for (Course course : courses) {
					System.out.println(course);
				}
				break;
			case 2:
				Course course = new Course();
				System.out.print("Nhập mã khóa học: ");
				course.setCourseCode(scanner.nextLine());
				System.out.print("Nhập tên khóa học: ");
				course.setCourseName(scanner.nextLine());
				if (courseBLL.insert(course) == 0) {
					System.out.println("Thêm thất bại");
				} else {
					System.out.println("Thêm thành công");
				}
				break;
			case 3:
				System.out.print("Nhập khóa học cần xóa:");
				String code = scanner.nextLine();
				if (courseBLL.delete(code) == 0) {
					System.out.println("Không có khóa học tương ứng để xóa");
				} else {
					System.out.println("Xóa thành công");
				}
				break;

			default:
				System.out.println("default");
				break;
			}
		} while (choiseCourse < 0 || choiseCourse > 5);
		scanner.close();

	}

	public static void main(String[] args) {
		System.out.println("Thuan");
		Scanner scanner = new Scanner(System.in);
		int choise = -1;
		do {
			menu();
			System.out.print("Nhập lựa chọn của bạn: ");
			try {
				choise = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Error input: " + e.getMessage());
			}
			if (choise < 0 || choise > 8) {
				System.out.println("Vui lòng nhập lại lựa chọn");
			}
			switch (choise) {
			case 1:
				System.out.println("============== Menu Quản lý khoa =============");
				menu();
				break;
			case 2:
				manageCourse();
				break;
			case 0:
				System.out.println("Exit");
				break;
			default:
				break;
			}

		} while (choise < 0 || choise > 8);
		scanner.close();

	}

}
