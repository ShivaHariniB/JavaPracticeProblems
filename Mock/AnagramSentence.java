package Mock;

// Inputs: A sentence, a list of words
// Question*: Replace all the words in the sentence by their anagram from the list.
// Example:
// List = ["dog", "world", "dear", "god", "the", "read", "ighh", "ogd"]
// Sentence = The dog read the world high.
// Output = The god dear the world ighh

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramSentence {
    public static void main(String args[]) {
        List<String> listwords = Arrays.asList("dog", "world", "dear", "god", "the", "read", "ighh", "ogd");
        String sentence = "The dog read the world high.";
        System.out.println(Result(sentence, listwords));
    }

    public static String Result(String input, List<String> listwords) {

        HashMap<String, String> anagrampMap = new HashMap<>();
        for (String word : listwords) {
            String sortedKey = sortChars(word.toLowerCase());
            if (!anagrampMap.containsKey(sortedKey)) {
                anagrampMap.put(sortedKey, word);
            }
        }
        String[] words=input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            String punctuation = word.replaceAll("[a-zA-Z]", "");
            String sortedKey = sortChars(cleanWord.toLowerCase());

            if (anagrampMap.containsKey(sortedKey)) {
                String replacement = anagrampMap.get(sortedKey);
                if (Character.isUpperCase(cleanWord.charAt(0))) {
                    replacement = Character.toUpperCase(replacement.charAt(0)) + replacement.substring(1);
                }
                result.append(replacement).append(punctuation).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String sortChars(String word) {
        char[] arr1 = word.toCharArray();
        Arrays.sort(arr1);
        return new String(arr1);
    }

}
