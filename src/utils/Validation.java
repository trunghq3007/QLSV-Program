package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by: 
 * Create date: 
 * Create modifier: 
 * Discription: 
 * Version: 1.0
 */

public class Validation {
	
	private Pattern pattern1, pattern2, pattern3, pattern4, pattern5;
	private Matcher matcher1, matcher2, matcher3, matcher4, matcher5;
	
	public static final String Email = "^[A-Za-z0-9+_.-]+@(.+)$";
	public static final String Phone = "^[0]d{9,}";
	public static final String BirthDay = "^\\d{4}-\\d{2}-\\d{2}$";
	public static final String Gender = "[0-1]{1}";
	public static final String Code = "^\b{3}$";
	
	public Validation() {
		pattern1 = Pattern.compile(Email);
		pattern2 = Pattern.compile(Phone);
		pattern3 = Pattern.compile(BirthDay);
		pattern4 = Pattern.compile(Gender);
		pattern5 = Pattern.compile(Code);
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
	
	
	public boolean validateCode(String s) {
		matcher5 = pattern5.matcher(s);
		return matcher5.matches();
	}
}
