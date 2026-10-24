package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class dailyTemperature {
    public static void main(String[] args){
        int[] temperature={73,74,75,71,69,72,76,73};
        System.out.println("answer "+ Arrays.toString(Solution(temperature)));
    }
    public static int[] Solution(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prevIndex=st.pop();
                result[prevIndex] = i - prevIndex;
            }
                st.push(i);
        }
        return result;
    }
}
