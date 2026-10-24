package Trees_DFS;

public class PeakElementBST {
    public static void main(String args[]) {
        int nums[] = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int right = nums.length - 1;
        int m;

        for (int left : nums) {
            while (left != right) {
                m = calculateMiddle(left, right);
                if (nums[m] > nums[m + 1]) {
                    right = m;
                    m = calculateMiddle(left, right);
                } else {
                    left = m + 1;
                    m = calculateMiddle(left, right);
                }
                if (left == right) {
                    return left;
                }
            }
        }
        return 0;
    }

    public static int calculateMiddle(int left, int right) {
        return (left + right) / 2;
    }
}
