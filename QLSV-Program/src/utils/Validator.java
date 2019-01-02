package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
  public static final String VALIDATE_EMAIL = "\"^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$\"";
  public static final String VALIDATE_PHONE = "^[0]d{9,}";

  public static final String VALIDATE_GENDER = "male|female";
  public static final String VALIDATE_BIRTHDATE = "^\\d{4}-\\d{2}-\\d{2}$";

  /**
   * check email.
   */
  public static boolean check_Email(String email) {
    Pattern pattern = Pattern.compile(VALIDATE_EMAIL);
    Matcher matcher = pattern.matcher(email);
    if (matcher.matches()) {
      return true;
    }
    return false;
  }

  /**
   * check phone.
   */
  public static boolean check_Phone(String phone) {
    Pattern pattern = Pattern.compile(VALIDATE_PHONE);
    Matcher matcher = pattern.matcher(phone);
    if (matcher.matches()) {
      return true;
    }
    return false;
  }

  /**
   * check gender.
   */
  public static boolean check_Gender(String gender) {
    Pattern pattern = Pattern.compile(VALIDATE_GENDER);
    Matcher matcher = pattern.matcher(gender);
    if (matcher.matches()) {
      return true;
    }
    return false;
  }

  /**
   * Create by: Yen Trinh - CMC
   * Create date: Jan 2, 2019
   * Modifier: User
   * Modified date: Jan 2, 2019
   * Description: check birthdate.
   * Version 1.0
   * 
   */
  public static boolean check_Birthdate(String date) {
    Pattern pattern = Pattern.compile(VALIDATE_BIRTHDATE);
    Matcher matcher = pattern.matcher(date);
    if (matcher.matches()) {
      return true;
    }
    return false;
  }

}