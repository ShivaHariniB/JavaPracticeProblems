package StringsAndArrays;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
//        System.out.println("Palindrome check " + checkPalindrome());
//        System.out.println("Remove WhiteSpace with Replace " + removeSpace());
//        System.out.println("Remove SpecialChar with Regex " + removeSpecialcharacters());
//        System.out.println("TitleCase " + convertToTitleCase());
//        System.out.println(reverseWords());
        System.out.println(compress());
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    public static int compress() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int read = 0, write = 0;
        while (read < chars.length) {
            int count = 0;
            while (chars[read] == chars[read - 1]) {
                read++;
                count++;
            }
        }

        return chars.length;
    }

    public static Boolean checkPalindrome() {
        String str1 = "madam";
        StringBuilder sb = new StringBuilder(str1);

        String str2 = sb.reverse().toString();
        return (str1.equals(str2));

    }

    public static String removeSpace() {
        String str1 = "Ja va Pro gram m in g";
        return str1.replace(" ", "");
    }

    public static String removeSpecialcharacters() {
        String str1 = "Special@123!* characters^$ remove@ with Regex++";
        return str1.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String convertToTitleCase() {
        String str1 = "java programming language";
        String[] words = str1.split(" ");
        System.out.println("checking words " + Arrays.toString(words));
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
        }
        return sb.toString();
    }

    public static String reverseWords() {
        String s = "bye  the sky is blue";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0)
                sb.append(" ");
        }
        return sb.toString();
    }
    public static int largestAltitude(int[] gain) {
        int[] prefix=new int[gain.length+1];
        prefix[0]=0;
        for(int i=1;i<gain.length+1;i++){
            prefix[i]=prefix[i-1]+gain[i-1];
            System.out.println("individual values"+ prefix[i]);
        }
        return Arrays.stream(prefix).max().getAsInt();
    }


}
