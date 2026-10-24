package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        System.out.println("Solution " + Solution(3, 7));
    }

    public static List<List<Integer>> Solution(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int sum = 0;
        backTrack(1, path, sum, k, n, result);
        return result;
    }

    public static void backTrack(int start, List<Integer> path, int sum, int k, int n, List<List<Integer>> result) {
        if (path.size() == k && sum == n) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (sum > n || path.size() > k) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            path.add(i);
            sum += i;
            backTrack(i + 1, path, sum, k, n, result);
            path.remove(path.size() - 1);
            sum -= i;
        }
    }
}


class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return profit(0, 1, prices, fee, dp);

    }

    public int profit(int idx, int buy, int[] prices, int fee, int[][] dp) {
        int profitAmount = 0;
        if (idx == prices.length)
            return 0;
        if (dp[idx][buy] != -1) {
            return dp[idx][buy];
        }
        if (buy == 1) {
            profitAmount = Math.max(-prices[idx] + profit(idx + 1, 0, prices, fee, dp),
                    0 + profit(idx + 1, 1, prices, fee, dp));
        } else {
            profitAmount = Math.max((prices[idx] - fee) + profit(idx + 1, 1, prices, fee, dp),
                    0 + profit(idx + 1, 0, prices, fee, dp));
        }
        return dp[idx][buy] = profitAmount;
    }
}
