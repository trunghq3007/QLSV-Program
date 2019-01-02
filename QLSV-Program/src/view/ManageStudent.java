/**
 * 
 */
package view;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import bll.ClassBLL;
import bll.CourseBLL;
import bll.FacultyBLL;
import bll.PointBLL;
import bll.StudentBLL;
import bll.SubjectsBLL;
import bll.TrainingSystemBLL;
import entity.Class;
import entity.Course;
import entity.Faculty;
import entity.Point;
import entity.Student;
import entity.Subjects;
import entity.TrainingSystem;

/**
 * Create by: minhanh - CMC Create date: Dec 28, 2018 Modifier: minhanh Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public class ManageStudent {
    static Logger log = Logger.getLogger(ManageStudent.class);
	/**
	 * Create by: minhanh - CMC Create date: Dec 28, 2018 Modifier: minhanh Modified
	 * date: Dec 28, 2018 Description: program manage student Version 1.0
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*CourseBLL courseBLL = new CourseBLL();
		System.out.println(" List Course");
		List<Course> courses = courseBLL.getAll();
		log.info("Size of course:" + courses.size());
		for (Course course : courses) {
			System.out.println(course);
		}
		
		
		
		
		TrainingSystemBLL trainingsystemBLL = new TrainingSystemBLL();
		System.out.println("List Training System");
		List<TrainingSystem> trainingsystem = trainingsystemBLL.getAll();
		for (TrainingSystem trainingsystems : trainingsystem) {
			System.out.println(trainingsystems);
		}

		PointBLL pointBLL = new PointBLL();
		System.out.println("List Point");
		List<Point> point = pointBLL.getAll();
		for (Point points : point) {
			System.out.println(points);
		}

		FacultyBLL facultyBLL = new FacultyBLL();
		System.out.println("List Faculty");
		List<Faculty> faculty = facultyBLL.getAll();
		for (Faculty facultys : faculty) {
			System.out.println(facultys);
		}

		ClassBLL classBLL = new ClassBLL();
		System.out.println("List Class");
		List<Class> classs = classBLL.getAll();
		for (Class class1 : classs) {
			System.out.println(class1);
		}
*/
		/*StudentBLL studentBLL = new StudentBLL();*/
	/*	System.out.println("List Student");
		List<Student> student = studentBLL.getAll();
		for (Student student2 : student) {
			System.out.println(student2);
		}*/
	/*	System.out.println("-----");
		Student student = studentBLL.getByCode("77777");
        System.out.println(student);
		*/
		// studentBLL.insert(new Student("77777", "Minh Anh",true, "1995-07-20 00:00:00","Bac Giang", "MT3"));
//		studentBLL.update("77777", "Minh Anh",true, "1995-07-20 00:00:00","Bac Giang", "MT3");
		

		/*SubjectsBLL subjectsBLL = new SubjectsBLL();
		System.out.println("List Subject");
		List<Subjects> subjects = subjectsBLL.getAll();
		for (Subjects subjects2 : subjects) {
			System.out.println(subjects2);
		}*/
		
		
		Scanner sc = new Scanner(System.in);
		   StudentBLL studentBLL = new StudentBLL();
		System.out.println("Moi nhap vao lua chon cua ban ? "+"\n");
				
		System.out.println("-----1.hien bang--------------");
		System.out.println("-----2.them vao du lieu-------");
		System.out.println("-----3.cap nhat du lieu-------");
		System.out.println("-----4.xoa du lieu -----------");
		System.out.println("=========> Lua chon : ");
		int n = sc.nextInt();
		switch (n) {
        case 1:
                System.out.println("List Student");
                List<Student> student = studentBLL.getAll();
                for (Student student2 : student) {
                    System.out.println(student2);
                }

            break;
        case 2:
            Scanner scanner=new Scanner(System.in);            
            System.out.println("Nhap vao thong tin can nhap :");
            Student s = new Student();
            System.out.println("ma sinh vien : ");
            s.setStudentCode(scanner.nextLine());            
            System.out.println("ho ten : ");            
            s.setStudentName(scanner.nextLine());
            System.out.println("Gioi Tinh : ");
            s.setSex(sc.nextBoolean());
            System.out.println("Ngay sinh : ");
            s.setBirthDay(scanner.nextLine());
            System.out.println("Que Quan : ");
            s.setCountry(scanner.nextLine());
            System.out.println("Ma Lop");
            s.setClassCode(scanner.nextLine());
            if(studentBLL.insert(s)==0)
            {
                System.out.println("nhap lai nhe : ");
            }
            else {
                System.out.println("thanh cong roi :");
            }
                
            
            break;
        case 3: 
            
            break;
            
        default:
            break;
        }
	}
	
		

}
