/**
 * 
 */
package view;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import bll.CourseBLL;
import dal.CourseDAL;
import entity.Course;

/**
 * Create by: NVDIEM
 * Create date: Jan 2, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 2, 2019
 * Description: ....
 * Version 1.0
 */
public class ManageStudent {
    static Logger logger = Logger.getLogger(ManageStudent.class);

    /**
     * Create by: NVDIEM
     * Create date: Jan 2, 2019
     * Modifier: NVDIEM
     * Modified date: Jan 2, 2019
     * Description: ....
     * Version 1.0
     * @param args
     */
    public static void main(String[] args) {
        CourseBLL courseBLL = new CourseBLL();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("=================KHÓA HỌC====================");
            System.out.println("Các lựa chọn:");
            System.out.println("1: Lấy danh sách các khóa học.");
            System.out.println("2: Thêm một khóa học.");
            System.out.println("3: Sửa khóa học.");
            System.out.println("4: Xóa khóa học.");
            System.out.println("5: Nhập từ khóa để tìm khóa học.");
            System.out.println("0: Thoát.");

            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 0:
                    scanner.close();
                    return;
                case 1:
                    courseBLL.show();
                    break;
                case 2:
                    System.out.println("Mời nhập mã khóa học:");
                    String courseID = scanner.nextLine();
                    System.out.println("Mời nhập tên khóa học:");
                    String courseName = scanner.nextLine();
                    Course course = new Course(courseID, courseName);
                    if (courseBLL.insert(course)) {
                        System.out.println("Thêm thành công");
                    } else {
                        System.out.println("Mã khóa học có thể đã tồn tại.");
                    }
                    break;
                case 3:
                    System.out.println("Mời nhập mã khóa học: ");
                    String courseID2 = scanner.nextLine();
                    System.out.println("Mời nhập tên khóa học: ");
                    String courseName2 = scanner.nextLine();
                    Course course2 = new Course(courseID2, courseName2);
                    if (courseBLL.update(course2)) {
                        System.out.println("Sửa thành công.");
                    } else {
                        System.out.println("Khóa học không tồn tại.");
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã khóa học:");
                    String courseID3 = scanner.nextLine();
                    if (courseBLL.delete(courseID3)) {
                        System.out.println("Xóa thành công.");
                    } else {
                        System.out.println("Mã khóa học có thể không tồn tại.");
                    }
                    break;
                case 5:
                    System.out.println("Nhập từ khóa để tìm kiếm khóa học:");
                    String keyWord = scanner.nextLine();
                    List<Course> courseList = courseBLL.fillter(keyWord);
                    CourseDAL courseDAL = new CourseDAL();
                    for (Course course3 : courseList) {
                        System.out.println(courseDAL.formatInfo(course3));
                    }
                    break;

                default:
                    scanner.close();
                    return;
            }
        }
    }

}
