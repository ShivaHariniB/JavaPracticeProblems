package Heap;

import java.util.PriorityQueue;

public class SmallestInfiniteSet {
    private int count;
    private PriorityQueue<Integer> minHeap;

    public static void main(String[] args) {
        SmallestInfiniteSet obj = new SmallestInfiniteSet();
        obj.addBack(2);  // Nothing to print
        System.out.println(obj.popSmallest()); // 1
        System.out.println(obj.popSmallest()); // 2 (we added it back)
        System.out.println(obj.popSmallest()); // 3
        obj.addBack(1);  // 1 was popped, so now added back
        System.out.println(obj.popSmallest()); // 1
        System.out.println(obj.popSmallest()); // 4
        System.out.println(obj.popSmallest()); // 5
    }

    public SmallestInfiniteSet() {
        count = 1;
        minHeap = new PriorityQueue<>();
    }

    public int popSmallest() {
        if (!minHeap.isEmpty()) {
            return minHeap.poll();
        } else {
            return count++;
        }
    }

    public void addBack(int num) {
        if (num < count && !minHeap.contains(num)) {
            minHeap.add(num);
        }
    }
}
