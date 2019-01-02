package utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author a
 * Description: Class for validate purpose
 */
public class Validation {
	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - Validate input id
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public static String validateId(Scanner sc) {
		String str = "";
		do {
			str = sc.nextLine();
			if (str.length() <= 0 || str.length() > Constants.Validation.MAX_LENGTH_ID)
				System.out.println("Invalid id. Reinput:");
		} while (str.length() <= 0 || str.length() > Constants.Validation.MAX_LENGTH_ID);
		return str;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - Validate input gender
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public static boolean validateGender(Scanner sc) {
		boolean gender = false;
		boolean check = false;
		do {
			try {
				check = sc.nextBoolean();
				sc.nextLine();
				check = true;
			} catch (InputMismatchException e) {
				System.out.println("Input invalid.");
				sc.nextLine();
				check = false;
			}
		} while (!check);
		return gender;
	}

	/**
	 * Created by: Sanero
	 * Created date: Jan 2, 2019
	 * Modified: Sanero
	 * Modified date: Jan 2, 2019
	 * Description: TODO - Validate input date
	 * Version 1.0
	 * @param sc
	 * @return
	 */
	public static Date validateDate(Scanner sc) {
		boolean check = false;
		String date = "";
		do {
			try {
				date = sc.nextLine();
				Pattern pattern = Pattern.compile(Constants.Validation.DATE_REGEX);
				Matcher matcher = pattern.matcher(date);
				check = matcher.matches();
				if (!check)
					System.out.println("u must input date in format dd/MM/yyyy");
			} catch (InputMismatchException e) {
				System.out.println("Input invalid.");
				check = false;
			}
		} while (!check);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date parseDate = new java.util.Date();
		try {
			parseDate = formatter.parse(date);
		} catch (ParseException ex) {
			System.out.println(ex.getMessage());
		}
		return new Date(parseDate.getTime());
	}
}
