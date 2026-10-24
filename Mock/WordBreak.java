package Mock;

//You are given a potentially large list of words.
// Some of these are compounds, where all parts are also in the list.
// Identify all combinations where one words can be composed of two or more words of the same list and print or return them.
//Example
//        Input:
//        [rockstar, rock, star, rocks, tar, stars, rockstars, super, highway, high, way, superhighway]
//        Output:
//        rockstar -> rock + star
//        superhighway -> super + highway
//        superhighway -> super + high + way
//        If returning, the output would be a list of lists, e.g.
//        [[rock, star], [super, highway], [super, high, way],...]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isWord = false;
}

public class WordBreak {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("rockstar", "rock", "star", "rocks", "tar", "stars", "rockstars", "super", "highway", "high", "way", "superhighway");
        System.out.println(wordGenerator(input));
        System.out.println("mid value " + 9/2);
    }

    static TrieNode root = new TrieNode();

    public static void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.children[i] == null) {
                node.children[i] = new TrieNode();
            }
            node = node.children[i];
        }
        node.isWord = true;
    }

    public static List<List<String>> wordGenerator(List<String> words) {
        for (String word : words) {
            insert(word);
        }
        List<List<String>> result = new ArrayList<>();

        for (String word : words) {
            List<String> path = new ArrayList<>();
            if (dfs(word, 0, path, 0)) {
                result.add(new ArrayList<>(path));
            }
        }
        return result;
    }

    public static boolean dfs(String word, int index, List<String> path, int count) {
        if (index == word.length()) {
            return count >= 2;
        }
        TrieNode node = root;

        for (int i = index; i < word.length(); i++) {
            int j = word.charAt(i) - 'a';
            if (node.children[j] == null) {
                break;
            }
            node = node.children[j];
            if (node.isWord) {
                path.add(word.substring(index, i + 1));
                if (dfs(word, i + 1, path, count + 1)) {
                    return true;
                }
                path.remove(path.size() - 1);
            }
        }
        return false;
    }
}
