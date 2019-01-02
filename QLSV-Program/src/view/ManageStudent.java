/**
 * 
 */
package view;

import org.apache.log4j.Logger;

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
    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(ManageStudent.class);
	public static void main(String[] args) {
	    log.debug("Start application - debug");
	    log.warn("Start main application");
	    log.error("Start main application");
	    log.info("Start main application");
	    
		Menu.createMenu();
		
	}

}
