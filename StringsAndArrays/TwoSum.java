package StringsAndArrays;

import java.util.Arrays;
import java.util.HashMap;

// Leetcode 1. Two Sum
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] nums3 = {3,3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                return new int[]{i, hmap.get(nums[i])};
            }
            hmap.put(target - nums[i], i);
        }
        return new int[]{};
    }

}
