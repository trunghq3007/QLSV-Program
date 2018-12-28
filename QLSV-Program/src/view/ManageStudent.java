/**
 * 
 */
package view;

import java.sql.Connection;

import bll.CourseBLL;
import dal.CourseDAL;
import entity.Course;
import utils.Constants;

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
	 */
	public static void main(String[] args) {
		CourseBLL courseBLL = new CourseBLL();
		
		for (Course i:courseBLL.getAll()) {
			System.out.println(i.getCourseName());
		}
	}

}
