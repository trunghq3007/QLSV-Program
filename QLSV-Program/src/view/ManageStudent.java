/**
 * 
 */
package view;

import java.util.List;

import org.apache.log4j.Logger;

import bll.CourseBLL;
import entity.Course;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public class ManageStudent {
        /* Get actual class name to be printed on */
        static Logger log = Logger.getLogger(ManageStudent.class);

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
                log.debug(" Start main application");
                log.warn("Start main application");
                log.error("Start main application");
                log.info("Start main application");
                CourseBLL courseBLL = new CourseBLL();
                System.out.println(" List Course");
                List<Course> courses =  courseBLL.getAll();
                log.info("size of list courses : "+ courses.size());
                for (Course course : courses) {
                       System.out.println(course); 
                }
                
        }

}
