package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import bll.CourseBLL;
import entity.Course;
import sun.applet.Main;

public class ManageCourse {
    static Logger log = Logger.getLogger(Main.class);
    static CourseBLL courseBLL = new CourseBLL();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        log.debug("start debug");
        log.warn("log warn");
        log.error("log error");
        log.info("log info");
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        int option = -1;
        while (check) {
            System.out.println("1. hien thi danh sach");
            System.out.println("2. them moi");
            System.out.println("3. sua");
            System.out.println("4. xoa");
            System.out.println("nhap bat ky de thoat ngoai cac ky tu tren");
            System.out.println("nhap lua chon: ");
           
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    getAll();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    check = false;
                    System.out.println("chuong trinh ket thuc !");
                    break;
            }
        }
        scanner.close();
    }

    public static void getAll() {
        System.out.println("danh sach khoa hoc: ");
        courseBLL.show();
    }

    public static void insert() {
        Course course = new Course();
        System.out.println("nhap code: ");
        Scanner sc = new Scanner(System.in);
        course.setCourseCode(sc.nextLine());
        System.out.println("nhap ten: ");
        course.setCourseName(sc.nextLine());
        courseBLL.insert(course);
        
    }

    public static void update() {
        Course course = new Course();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma khoa hoc can sua : ");
        course.setCourseCode(sc.nextLine());
        System.out.println("nhap ten te khoa hoc: ");
        course.setCourseName(sc.nextLine());
        courseBLL.update(course);
        //sc.close();
    }

    public static void delete() {
        System.out.println("nhap ma khoa hoc can xoa : ");
        Scanner sc = new Scanner(System.in);
        courseBLL.delete(sc.nextLine());
        //sc.close();
    }

}
