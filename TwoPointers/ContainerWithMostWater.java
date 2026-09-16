package TwoPointers;
//LeetCode 11. Container With Most Water

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};
        System.out.println(maxArea(height2));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            if (height[left] < height[right]) {
                left++;
            }
            else{
                right--;
            }
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}


