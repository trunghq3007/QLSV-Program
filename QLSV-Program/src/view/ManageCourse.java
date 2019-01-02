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
        insert();
        int choise = -1;
        // while (check) {
        // System.out.println("1. hien thi danh sach");
        // System.out.println("2. them moi");
        // System.out.println("3 . xoa");
        // System.out.println("nhap lua chon: ");
        // choise = scanner.nextInt();
        // switch (choise) {
        // case 1:
        // getAll();
        // break;
        // case 2:
        // insert();
        // break;
        // default:
        // check = false;
        // break;
        // }
        // }
        String s = "insert";
        
    }

    public static void getAll() {
        List<Course> courses = courseBLL.getAll();
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public static void insert() {
        Course course = new Course();
        System.out.println("nhap code: ");
        Scanner sc = new Scanner(System.in);
        course.setCourseCode(sc.nextLine());
        System.out.println("nhap ten: ");
        course.setCourseName(sc.nextLine());
        int result = courseBLL.insert(course);
        if (result > 0) {
            System.out.println("them thanh cong: ");
        } else {
            System.out.println("khong them duoc: ");
        }
        ArrayList<HashMap<Integer, String>> arrayList = new ArrayList<HashMap<Integer,String>>();
        //HashMap<K, V>
    }

}
