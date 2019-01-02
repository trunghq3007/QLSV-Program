/**
 * 
 */
package view;

import org.apache.log4j.Logger;

import bll.CourseBLL;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: .... Version 1.0
 */
public class ManageStudent {
    /**
     * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
     * date: Dec 28, 2018 Description: program manage student Version 1.0
     * 
     * @param args
     */
    static Logger Log = Logger.getLogger(ManageStudent.class);
    public static void main(String[] args) throws Exception {
	CourseBLL courseBLL = new CourseBLL();
	courseBLL.showCourseListChoice();



    }
}
