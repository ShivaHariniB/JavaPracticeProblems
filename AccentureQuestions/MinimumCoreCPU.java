package AccentureQuestions;

import java.util.Arrays;

public class MinimumCoreCPU {
    public static void main(String[] args) {
        int[][] processes = {{0, 30}, {5, 10}, {15, 20}};
        int[][] processes1 = {{1, 4}, {2, 3}, {3, 5}};
        System.out.println("Minimum CPU Cores Needed: " + minCPUCores(processes1));
    }

    public static int minCPUCores(int[][] intervals) {

        if (intervals.length == 0 || intervals == null) {
            return 0;
        }
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];

        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);
        int maxCores = 0;
        int activeCores = 0;
        int endIndex = 0;
        for (int i = 0; i < n; i++) {
            if (starts[i] <= ends[endIndex]) {
                activeCores++;
            } else {
                endIndex++;
            }
            maxCores = Math.max(maxCores, activeCores);
        }

        return maxCores;
    }
}
