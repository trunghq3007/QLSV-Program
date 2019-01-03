/**
 * 
 */
package view;

import org.apache.log4j.Logger;
import utils.Normalization;
import utils.ValidateInput;
import bll.ClassBLL;
import bll.CourseBLL;
import bll.StudentBLL;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public class ManagementSystem {
    /**
     * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
     * date: Dec 28, 2018 Description: program manage student Version 1.0
     * 
     * @param args
     */
    static CourseBLL courseBLL = new CourseBLL();
    static ClassBLL classBLL = new ClassBLL();
    static StudentBLL studentBLL = new StudentBLL();
    static Normalization normalize = new Normalization();

    static Logger Log = Logger.getLogger(ManagementSystem.class);

    public static void main(String[] args) throws Exception {
	boolean isRunning = true;
	while (isRunning) {
	    System.out.println("----------- MANAGEMENT SYSTEM");
	    System.out.println("1. Course management system");
	    System.out.println("2. Student management system");
	    System.out.println("3. Class management system");
	    System.out.println("4. Faculty management system");
	    System.out.println("5. Mark management system");
	    System.out.println("6. Subject management system");
	    System.out.println("7. Training system management system");
	    System.out.println("8. Exit");
	    System.out.println("Your choice is: ");
	    int inputChoice = ValidateInput.getInt("", "Your input must between 0 ~ 8", 0, 8);
	    switch (inputChoice) {
	    // Show the list of course
	    case 1:
		courseBLL.showCourseListChoice();
		break;
	    case 2:
		studentBLL.showStudentListChoice();
		break;
	    case 3:
		classBLL.showClassListChoice();
		break;
	    case 4:
		break;
	    case 5:
		break;
	    case 6:
		break;
	    case 7:
		break;
	    case 8:
		isRunning = false;
		break;
	    default:

	    }
	}
    }
}
