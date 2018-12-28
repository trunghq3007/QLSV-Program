/**
 * 
 */
package view;

import java.util.List;

import bll.CourseBLL;
import entity.Course;

/**
 * Create by: minhanh - CMC
 * Create date: Dec 28, 2018
 * Modifier: minhanh
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public class ManageStudent {

        /**
         * Create by: minhanh - CMC
         * Create date: Dec 28, 2018
         * Modifier: minhanh
         * Modified date: Dec 28, 2018
         * Description: program manage student
         * Version 1.0
         * @param args
         */
        public static void main(String[] args) {
             
                CourseBLL courseBLL = new CourseBLL();
                System.out.println(" List Course");
                List<Course> courses =  courseBLL.getAll();
                for (Course course : courses) {
                       System.out.println(course); 
                }
                
        }

}
