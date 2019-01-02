/**
 * 
 */
package view;

import java.util.List;

import bll.CourseBLL;
import bll.StudentBLL;
import entity.Course;
import entity.Student;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public class ManageStudent {

//	static Logger logger = Logger.getLogger(ManageStudent.class);

	/**
	 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
	 * date: Dec 28, 2018 Description: program manage student Version 1.0
	 * 
	 * @param args
	 */
	
	  public static void main(String[] args) {
	  
	  
	  StudentBLL studentBLL = new StudentBLL(); System.out.println("List Student");
	  
	  Student c = new Student("0241060928", "Nguyễn Văn Tùng", true, "1995-12-20",
			  					"Saigon", "MT3");
	  System.out.println(c.getGender());
	  studentBLL.insert(c); 
	  List<Student> courses = studentBLL.getAll();
	  studentBLL.show(courses); 
	  // logger.info("Hello"); //
//	  System.out.println("==============================");
//	  System.out.println("Chuong trinh quan ly sinh vien");
//	  System.out.println("==============================");
	  
	  
	  
	  }
	 

}
