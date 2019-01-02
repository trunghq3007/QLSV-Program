package view;

import java.util.List;
import java.util.Scanner;

import bll.CourseBLL;
import bll.FacultyBLL;
import bll.LopBLL;
import bll.MarkBLL;
import bll.StudentBLL;
import bll.SubjectBLL;
import entity.Course;
import entity.Faculty;
import entity.Lop;
import entity.Mark;
import entity.Student;
import entity.Subject;

public class Menu {

    private static CourseBLL courseBLL = new CourseBLL();
    private static FacultyBLL facultyBLL = new FacultyBLL();
    private static LopBLL lopBLL = new LopBLL();
    private static MarkBLL markBLL = new MarkBLL();
    private static StudentBLL studentBLL = new StudentBLL();
    private static SubjectBLL subjectBLL = new SubjectBLL();
    private static Scanner scanner = new Scanner(System.in);

    public static void createMenu() {
        int i = 0, j;
        
        while(i == 0) {
            System.out.println("1 course table");
            System.out.println("2 faculty table");
            System.out.println("3 class table");
            System.out.println("4 mark table");
            System.out.println("5 student table");
            System.out.println("6 subject table");
            
            j = scanner.nextInt();
            switch (j) {
            case 1:
                menuCourse();
                break;
            case 2:
                menuFaculty();
                break;
            case 3:
                menuClass();
                break;
            case 4:
                menuMark();
                break;
            case 5:
                menuStudent();
                break;
            case 6:
                menuSubject();
                break;
            default:
                continue;
            }
            System.out.println("number 0 to continue menu");
            System.out.println("key other to out");
            i = scanner.nextInt();
        }
    }

    /**
     * 
     */
    public static void menuCourse() {
        int i = 0, j;

        while (i == 0) {
            System.out.println("1 get all course");
            System.out.println("2 get by code");
            System.out.println("3 insert course");
            System.out.println("4 update course by code");
            System.out.println("5 delete by code");
            System.out.println("6 search course name");
            j = scanner.nextInt();
            switch (j) {
            case 1:
                List<Course> all = courseBLL.getAll();
                courseBLL.display(all);
                break;
            case 2:
                Course byCode = courseBLL.getByCode();
                System.out.println(byCode);
                break;
            case 3:
                if (courseBLL.insert() > 0) {
                    System.out.println("insert success!");
                } else {
                    System.out.println("insert fail!");
                }
                break;
            case 4:
                if (courseBLL.update() > 0) {
                    System.out.println("update success!");
                } else {
                    System.out.println("update fail!");
                }
                break;
            case 5:
                if (courseBLL.delete() > 0) {
                    System.out.println("delete success!");
                } else {
                    System.out.println("delete fail!");
                }
                ;
                break;
            case 6:
                List<Course> fillter = courseBLL.fillter();
                courseBLL.display(fillter);
                break;
            default:
                continue;
            }
            System.out.println("number 0 to continue");
            System.out.println("key other to out");
            i = scanner.nextInt();
        }
    }

    /**
     * 
     */
    public static void menuFaculty() {
        int i = 0, j;

        while (i == 0) {
            System.out.println("1 get all faculty");
            System.out.println("2 get by code");
            System.out.println("3 insert faculty");
            System.out.println("4 update faculty by code");
            System.out.println("5 delete by code");
            System.out.println("6 search faculty name");
            j = scanner.nextInt();
            switch (j) {
            case 1:
                List<Faculty> all = facultyBLL.getAll();
                facultyBLL.display(all);
                break;
            case 2:
                Faculty byCode = facultyBLL.getByCode();
                System.out.println(byCode);
                break;
            case 3:
                if (facultyBLL.insert() > 0) {
                    System.out.println("insert success!");
                } else {
                    System.out.println("insert fail!");
                }
                break;
            case 4:
                if (facultyBLL.update() > 0) {
                    System.out.println("update success!");
                } else {
                    System.out.println("update fail!");
                }
                break;
            case 5:
                if (courseBLL.delete() > 0) {
                    System.out.println("delete success!");
                } else {
                    System.out.println("delete fail!");
                }
                ;
                break;
            case 6:
                List<Course> fillter = courseBLL.fillter();
                courseBLL.display(fillter);
                break;
            default:
                continue;
            }
            System.out.println("number 0 to continue");
            System.out.println("key other to out");
            i = scanner.nextInt();
        }
    }

    /**
     * 
     */
    public static void menuClass() {
        int i = 0, j;

        while (i == 0) {
            System.out.println("1 get all class");
            System.out.println("2 get by code");
            System.out.println("3 insert class");
            System.out.println("4 update class by code");
            System.out.println("5 delete by code");
            System.out.println("6 search class name");
            j = scanner.nextInt();
            switch (j) {
            case 1:
                List<Lop> all = lopBLL.getAll();
                lopBLL.display(all);
                break;
            case 2:
                Lop byCode = lopBLL.getByCode();
                System.out.println(byCode);
                break;
            case 3:
                if (lopBLL.insert() > 0) {
                    System.out.println("insert success!");
                } else {
                    System.out.println("insert fail!");
                }
                break;
            case 4:
                if (lopBLL.update() > 0) {
                    System.out.println("update success!");
                } else {
                    System.out.println("update fail!");
                }
                break;
            case 5:
                if (lopBLL.delete() > 0) {
                    System.out.println("delete success!");
                } else {
                    System.out.println("delete fail!");
                }
                ;
                break;
            case 6:
                List<Lop> fillter = lopBLL.fillter();
                lopBLL.display(fillter);
                break;
            default:
                continue;
            }
            System.out.println("number 0 to continue");
            System.out.println("key other to out");
            i = scanner.nextInt();
        }
    }

    /**
     * 
     */
    public static void menuMark() {
        int i = 0, j;

        while (i == 0) {
            System.out.println("1 get all class");
            System.out.println("2 insert class");
            System.out.println("3 update class by code");

            j = scanner.nextInt();
            switch (j) {
            case 1:
                List<Mark> all = markBLL.getAll();
                markBLL.display(all);
                break;
            case 2:
                if (markBLL.insert() > 0) {
                    System.out.println("insert success!");
                } else {
                    System.out.println("insert fail!");
                }
                break;
            case 3:
                if (markBLL.update() > 0) {
                    System.out.println("update success!");
                } else {
                    System.out.println("update fail!");
                }
                break;
            default:
                continue;
            }
            System.out.println("number 0 to continue");
            System.out.println("key other to out");
            i = scanner.nextInt();
        }
    }

    /**
     * 
     */
    public static void menuStudent() {
        int i = 0, j;

        while (i == 0) {
            System.out.println("1 get all student");
            System.out.println("2 get by code");
            System.out.println("3 insert student");
            System.out.println("4 update student by code");
            System.out.println("5 delete by code");
            System.out.println("6 search student name");
            j = scanner.nextInt();
            switch (j) {
            case 1:
                List<Student> all = studentBLL.getAll();
                studentBLL.display(all);
                break;
            case 2:
                Student byCode = studentBLL.getByCode();
                System.out.println(byCode);
                break;
            case 3:
                if (studentBLL.insert() > 0) {
                    System.out.println("insert success!");
                } else {
                    System.out.println("insert fail!");
                }
                break;
            case 4:
                if (studentBLL.update() > 0) {
                    System.out.println("update success!");
                } else {
                    System.out.println("update fail!");
                }
                break;
            case 5:
                if (studentBLL.delete() > 0) {
                    System.out.println("delete success!");
                } else {
                    System.out.println("delete fail!");
                }
                ;
                break;
            case 6:
                List<Student> fillter = studentBLL.fillter();
                studentBLL.display(fillter);
                break;
            default:
                continue;
            }
            System.out.println("number 0 to continue");
            System.out.println("key other to out");
            i = scanner.nextInt();
        }
    }
    
    /**
     * 
     */
    public static void menuSubject() {
        int i = 0, j;

        while (i == 0) {
            System.out.println("1 get all subject");
            System.out.println("2 get by code");
            System.out.println("3 insert subject");
            System.out.println("4 update subject by code");
            System.out.println("5 delete by code");
            System.out.println("6 search subject name");
            j = scanner.nextInt();
            switch (j) {
            case 1:
                List<Subject> all = subjectBLL.getAll();
                subjectBLL.display(all);
                break;
            case 2:
                Subject byCode = subjectBLL.getByCode();
                System.out.println(byCode);
                break;
            case 3:
                if (subjectBLL.insert() > 0) {
                    System.out.println("insert success!");
                } else {
                    System.out.println("insert fail!");
                }
                break;
            case 4:
                if (subjectBLL.update() > 0) {
                    System.out.println("update success!");
                } else {
                    System.out.println("update fail!");
                }
                break;
            case 5:
                if (subjectBLL.delete() > 0) {
                    System.out.println("delete success!");
                } else {
                    System.out.println("delete fail!");
                }
                ;
                break;
            case 6:
                List<Subject> fillter = subjectBLL.fillter();
                subjectBLL.display(fillter);
                break;
            default:
                continue;
            }
            System.out.println("number 0 to continue");
            System.out.println("key other to out");
            i = scanner.nextInt();
        }
    }
}
