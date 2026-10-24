package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsPhone {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println("Solution " + Solution(digits));
    }

    public static List<String> Solution(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        HashMap<Character, String> digitsLetters = new HashMap<>();
        digitsLetters.put('2', "abc");
        digitsLetters.put('3', "def");
        digitsLetters.put('4', "ghi");
        digitsLetters.put('5', "jkl");
        digitsLetters.put('6', "mno");
        digitsLetters.put('7', "pqrs");
        digitsLetters.put('8', "tuv");
        digitsLetters.put('9', "wxyz");

        backTrack(0, new StringBuilder(), digits, result, digitsLetters);

        return result;
    }

    public static void backTrack(int idx, StringBuilder comb, String digits, List<String> result, HashMap<Character, String> digitsLetters) {
        if (idx == digits.length()) {
            result.add(comb.toString());
            return;
        }
        String letters = digitsLetters.get(digits.charAt(idx));
        for (char c : letters.toCharArray()) {
            comb.append(c);
            backTrack(idx + 1, comb, digits, result, digitsLetters);
            comb.deleteCharAt(comb.length()-1);
        }

    }
}
