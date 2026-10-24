package Mock;

//Given an array, print the Next Greater Element (NGE) for every element.
//The Next Greater Element for an element x is the first greater element on the right side of x in array.
//Elements for which no greater element exist, consider next greater element as -1.
//
//For any array, rightmost element always has Next Greater Element as -1.
//For an array which is sorted in decreasing order, all elements have Next Greater Element as -1.

import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    static Stack<Integer> unsolvedLocation;
    static int[] resultArray;

    public static void main(String args[]) {
        int[] input = {3, 1, 2, 6};
        System.out.println(Arrays.toString(Solution(input)));
    }

    public static int[] Solution(int[] input) {
        unsolvedLocation = new Stack<>();
        resultArray = new int[input.length];
        Arrays.fill(resultArray, -1);
        for (int i = 0; i < input.length; i++) {
            while (!unsolvedLocation.isEmpty() && input[unsolvedLocation.peek()] < input[i]) {
                int prevIndex = unsolvedLocation.pop();
                resultArray[prevIndex] = input[i];
            }
            unsolvedLocation.push(i);
        }
        return resultArray;
    }
}
