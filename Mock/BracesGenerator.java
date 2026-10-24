package Mock;

//Curly braces can be used in programming to provide scope-limit.
//        Write a function to print all valid( properly opened and closed) combinations of n-pairs of curly braces.
//        * input: 1 output: {}
//        * input: 2 output: {}{}, {{}}
//        * input: 3 output: {}{}{}, {}{{}}, {{}}{}, {{}{}},
import java.util.ArrayList;
import java.util.List;

public class BracesGenerator {
    List<String> result;

    public BracesGenerator() {
        result = new ArrayList<>();
    }

    public List<String> generateBraces(int n) {
        generateHelper(n, 0, 0, "", result);
        return result;
    }

    public void generateHelper(int n, int open, int close, String current, List<String> result) {

        if (open == n && close == n) {
            result.add(current);
            return;
        }
        if (open < n) {
            generateHelper(n, open + 1, close, current + "{", result);
        }
        if (close < open) {
            generateHelper(n, open, close + 1, current + "}", result);
        }
    }
}
