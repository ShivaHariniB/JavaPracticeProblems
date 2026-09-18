package StringsAndArrays;

import java.util.HashSet;

// Leetcode 3. Longest Substring Without Repeating Characters
public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        HashSet<Character> hmap = new HashSet<>();
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (hmap.contains(s.charAt(right))) {
                while (hmap.contains(s.charAt(right))) {
                    hmap.remove(s.charAt(left));
                    left++;
                }
            }
            hmap.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
