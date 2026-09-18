package StringsAndArrays;

// Leetcode 242. Valid Anagram

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!hmap.containsKey(ch) || hmap.get(ch) == 0) {
                return false;
            }
            hmap.put(ch, hmap.getOrDefault(ch, 0) - 1);
        }
        return true;
    }
}
