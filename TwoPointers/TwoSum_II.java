package TwoPointers;
//LeetCode 167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;

public class TwoSum_II {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] numbers1 = {2, 3, 4};
        int target1 = 6;
        int[] numbers2 = {-1, 0};
        int target2 = -1;
        System.out.println(Arrays.toString(twoSum(numbers2, target2)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum > target) {
                right--;
            } else if (currentSum == target) {
                return new int[]{left+1, right+1};
            } else {
                left++;
            }
        }
        return new int[]{};
    }
}

