package AccentureQuestions;

import java.util.ArrayList;
import java.util.List;

public class PasswordSanitizer {
    public static void main(String[] args) {
        String testInput = "abc 12345 password123 99999 my-pwd!";

        String result = sanitizePasswords(testInput);
        System.out.println("Valid Passwords: " + result);
    }

    public static String sanitizePasswords(String result) {
        if (result == null || result.trim().isEmpty()) {
            return "";
        }
        String[] words= result.trim().split("\\s+");
        List<String> validPasswords=new ArrayList<>();

        for(String pwd:words){
            if(pwd.length()<5){
                continue;
            }

            boolean onlyLetters=pwd.matches("^[a-zA-Z]+$");
            boolean onlyDigits=pwd.matches("^\\d+$");

            if(!onlyDigits && !onlyLetters){
                validPasswords.add(pwd);
            }
        }
        return String.join(" ",validPasswords);
    }
}
