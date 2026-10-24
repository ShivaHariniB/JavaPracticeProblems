package Trees_DFS;

import java.util.Arrays;

public class KokoBanana {

    public static void main(String args[]) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();

        while (left <= right) {
            int mid = (left + right) / 2;
            int sum = canEatTime(mid, piles);
            System.out.println("caneat time " + sum);
            if (sum <= h) {
                right = mid-1;
                System.out.println("if condition " + right);
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int canEatTime(int mid, int[] piles) {
        int hours=0;
        for (int i : piles) {
            hours += (int) Math.ceil((double) i / mid);
        }
        return hours;
    }
}
