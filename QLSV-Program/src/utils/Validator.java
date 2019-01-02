package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {
    public static final String VALIDATE_EMAIL = "\"^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$\"";
    public static final String VALIDATE_PHONE = "^[0]d{9,}";
    
    public static final String VALIDATE_GENDER = "male|female";
    public static final String VALIDATE_BIRTHDATE = "^\\d{4}-\\d{2}-\\d{2}$";
    /**
     * @param id
     * @return
     */
    public static boolean check_Email(String email){
        Pattern pattern = Pattern.compile(VALIDATE_EMAIL);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    
    /**
     * @param id
     * @return
     */
    public static boolean check_Phone(String phone){
        Pattern pattern = Pattern.compile(VALIDATE_PHONE);
        Matcher matcher = pattern.matcher(phone);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    
    /**
     * @param id
     * @return
     */
    public static boolean check_Gender(String gender) {
        Pattern pattern = Pattern.compile(VALIDATE_GENDER);
        Matcher matcher = pattern.matcher(gender);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    
    public static boolean check_Birthdate(String date){
        Pattern pattern = Pattern.compile(VALIDATE_BIRTHDATE);
        Matcher matcher = pattern.matcher(date);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    
}