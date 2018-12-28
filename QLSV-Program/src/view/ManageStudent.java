/**
 * 
 */
package view;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import bll.StudentBLL;
import entity.Student;
import utils.Constants;
import utils.Dbconnection;

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
     * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException {
        StudentBLL studentBLL = new StudentBLL();
        /*List<Student> listStudent = studentBLL.getAll();
        for (Student item : listStudent) {
            System.out.println("Ma SV: " + item.getStudentID());
            System.out.println("Ten SV: " + item.getStudentName());
            System.out.println("Ngay sinh: " + item.getBirthday());
            System.out.println("Gioi tinh: " + item.getGender());
            System.out.println("Que quan: " + item.getHomeTown());
            System.out.println("Ma lop: " + item.getClassID());
            System.out.println("");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap StudentID can tim: ");
        String masv = scanner.next();
        Student student = studentBLL.getByCode(masv);
        System.out.println("Ma SV: " + student.getStudentID());
        System.out.println("Ten SV: " + student.getStudentName());
        System.out.println("Ngay sinh: " + student.getBirthday());
        System.out.println("Gioi tinh: " + student.getGender());
        System.out.println("Que quan: " + student.getHomeTown());
        System.out.println("Ma lop: " + student.getClassID());
        System.out.println("");*/
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Nhap ma sv: ");
        student.setStudentID(scanner.next());
        System.out.println("Nhap ten sv: ");
        student.setStudentName(scanner.next());
        System.out.println("Nhap gioi tinh: ");
        student.setGender(scanner.next());
        System.out.println("Nhap ngay sinh: ");
        Date birthday = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.next());
        System.out.println("Nhap que quan: ");
        student.setHomeTown(scanner.next());
        System.out.println("Nhap ma lop: ");
        student.setClassID(scanner.next());
        

    }

}
