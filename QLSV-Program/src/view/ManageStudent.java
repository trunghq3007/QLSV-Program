/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:40 PM
 */
package view;

import bll.StudentBLL;
import entity.Student;
import utils.Constants;

public class ManageStudent {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		StudentBLL studentBLL = new StudentBLL();
		System.out.println(String.format(Constants.ToStringFormatter.STUDENT, "ID", "Name", "Gender", "DateofBirth",
				"HomeTown", "ClassID"));
		for (Student st : studentBLL.fillter("a")) {
			System.out.println(st);
		}
		

//		if (studentBLL.insert(new Student("123", "ABC", true, new java.sql.Date(1997, 2, 12), "HN", "MT2")) > 0) {
//			System.out.println("insert success");
//		}
//
//		if (studentBLL.update(new Student("123", "ABC", true, new java.sql.Date(1997, 2, 12), "HN", "MT2")) > 0) {
//			System.out.println("update success");
//		}
	}

}
