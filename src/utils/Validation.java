package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	private Pattern pattern1, pattern2, pattern3, pattern4;
	private Matcher matcher1, matcher2, matcher3, matcher4;
	
	public static final String Email = "^[A-Za-z0-9+_.-]+@(.+)$";
	public static final String Phone = "^[0]d{9,}";
	public static final String BirthDay = "^[1-2]d{3}[-/][0-1]d{0,1}[-/][0-2]d";
	public static final String Gender = "[0-1]{1,}";
	
	public Validation() {
		pattern1 = Pattern.compile(Email);
		pattern2 = Pattern.compile(Phone);
		pattern3 = Pattern.compile(BirthDay);
		pattern4 = Pattern.compile(Gender);
	}
	
	
	// validate Email()
	public boolean validateEmail(final String s) {
		matcher1 = pattern1.matcher(s);
		return matcher1.matches();
	}
	
	
	// validate Phone()
	public boolean validatePhone(final String s) {
		matcher2 = pattern2.matcher(s);
		return matcher2.matches();
	}
	
	
	// validate BirthDay()
	public boolean validateBirthDay(final String s) {
		matcher3 = pattern3.matcher(s);
		return matcher3.matches();
	}
	
	
	
	public boolean validateGender(final String s) {
		matcher4 = pattern4.matcher(s);
		return matcher4.matches();
	}
}
