package utils;

import java.util.Scanner;

public class ValidateInput {
	static Scanner scan = new Scanner(System.in);

	static public double getDouble(String mess, String error, double min, double max) {
		String doubleNum;
		double num = 0;
		boolean check = false;
		while (!check) {
			System.out.print(mess);
			doubleNum = scan.nextLine();
			try {
				num = Double.parseDouble(doubleNum);
			} catch (NumberFormatException e) {
				System.out.println(error);
				continue;
			}
			if (num >= min && num <= max) {
				check = true;
			} else {
				System.out.println(error);
			}
		}
		return num;
	}

	static public int getInt(String mess, String error, int min, int max) {
		String intNum;
		int num = 0;
		boolean checked = false;
		while (!checked) {
			System.out.print(mess);
			intNum = scan.nextLine();
			try {
				num = Integer.parseInt(intNum);
			} catch (NumberFormatException e) {
				System.out.println(error);
				continue;
			}
			if (num >= min && num <= max) {
				checked = true;
			} else {
				System.out.println(error);
			}
		}
		return num;
	}

	static public String getPhone(String mess, String error, int minLength) {
		String phone = "";
		boolean checked = false;
		while (!checked) {
			System.out.print(mess);
			phone = scan.nextLine();
			if (phone.matches("\\d+") && phone.length() >= minLength)
				checked = true;
			else
				System.out.println(error);
		}
		return phone;
	}

	static public String getEmail(String mess, String error) {
		String email = "";
		boolean checked = false;
		while (!checked) {
			System.out.print(mess);
			email = scan.nextLine();
			if (email.matches("[A-Za-z0-9]+(.[A-Za-z0-9]+)*@[A-Za-z0-9]+(.[A-Za-z0-9]+)+"))
				checked = true;
			else
				System.out.println(error);
		}
		return email;
	}

	static public String getName(String mess, String error) {// get name with only 1 word
		String name = "";
		boolean checked = false;
		while (!checked) {
			System.out.print(mess);
			name = scan.nextLine();
			if (name.matches("^[a-zA-Z\\s]+"))
				checked = true;
			else
				System.out.println(error);
		}
		return name;
	}
}
