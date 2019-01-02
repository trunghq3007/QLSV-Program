/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:40 PM
 */

package view;

import org.apache.log4j.Logger;

/**
 * @author a
 * Description: Main - Start first in program
 */
public class ManageStudent {
	static Logger log = Logger.getLogger(ManageStudent.class);

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Description: TODO - main function
	 * @param args
	 */
	public static void main(String[] args) {
		 new App().runMainMenu();
	}
}
