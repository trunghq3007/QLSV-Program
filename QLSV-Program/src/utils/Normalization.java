package utils;

public class Normalization {

    public Normalization() {
    }

    public String removeSpace(String str) {
        str = str.replaceAll(" +", " ");
        str.trim();
        return str;
    }
    public String modifySpaceAfrerSign(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == '.' || sb.charAt(i) == ',' || sb.charAt(i) == ':') {
                if (sb.charAt(i + 1) != ' ') {
                    sb.insert(i + 1, ' ');
                }
            }
        }
        return sb.toString();
    }
    public String upperWordAfterDot(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == '.') {
                sb.setCharAt(i + 2, Character.toUpperCase(sb.charAt(i + 2)));
            }
        }
        return sb.toString();
    }
    public String removeSpaceInQuote(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean beginSign=true;        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '"') {
                if(beginSign==true){
                    if ( sb.charAt(i + 1) == ' ')
                         sb.deleteCharAt(i + 1);
                    beginSign=false;                              
                }
                else{
                    if ( sb.charAt(i - 1) == ' ')
                         sb.deleteCharAt(i - 1);
                    beginSign=true;
                }
            }
        }   
       return sb.toString();
    }
    public String upperFirstWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (Character.isAlphabetic(sb.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                break;
            }
        }
        return sb.toString();
    }   
    public String modifySpaceBeforeSign(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == '.' || sb.charAt(i) == ',') {
                if (sb.charAt(i - 1) == ' ') {
                    sb.deleteCharAt(i - 1);
                }
            }
        }
        return sb.toString();
    }
    public String setDotAtEnd(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.charAt(sb.length() - 1) != '.') {
            sb.append('.');
        }
        return sb.toString();
    }
    public String normalize(String str) {
        if (str.isEmpty()){
            return str;
        }
        str = removeSpace(str);
        str = modifySpaceAfrerSign(str);
        str = upperWordAfterDot(str);
        str = removeSpaceInQuote(str);
        str = upperFirstWord(str);
        str = modifySpaceBeforeSign(str);
        str = setDotAtEnd(str);
        str += "\r\n";
        return str;
    } 
}
