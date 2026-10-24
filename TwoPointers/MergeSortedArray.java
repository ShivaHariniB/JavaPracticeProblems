package TwoPointers;

// LeetCode 88. Merge Sorted Array

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {2, 5, 6};
//        int n = 3;
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums2[j] < nums1[i]) {
                nums1[k--] = nums2[i--];
            } else {
                nums1[k--] = nums1[j--];
            }
        }
    }
}
