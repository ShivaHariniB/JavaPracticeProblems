package Heap;

import java.util.PriorityQueue;

public class TotalCost {
    public static void main(String[] args) {
        int[] costs = new int[]{1, 2, 4, 1};
        System.out.println("Function " + Solution(costs, 3, 3));
    }

    public static long Solution(int[] costs, int k, int candidates) {
        int i = 0;
        int j = costs.length - 1;
        long totalHours = 0;
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>();
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();

        while (k-- > 0) {
            while (leftHeap.size() < candidates && i <= j) {
                leftHeap.add(costs[i++]);
            }
            while (rightHeap.size() < candidates && i <= j) {
                rightHeap.add(costs[j--]);
            }
            int t1 = leftHeap.size() > 0 ? leftHeap.peek() : Integer.MAX_VALUE;
            int t2 = rightHeap.size() > 0 ? rightHeap.peek() : Integer.MAX_VALUE;
            if (t1 > t2) {
                totalHours += rightHeap.poll();
            } else {
                totalHours += leftHeap.poll();
            }
        }

        return totalHours;
    }
}
