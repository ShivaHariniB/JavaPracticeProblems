package Trees_DFS;

import java.util.HashMap;

public class PathSum {
    static int count = 0;

    public static void main(String args[]) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        System.out.println(TargetSum(root, 8));
    }

    public static int TargetSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        count = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        dfs(root, 0, targetSum, hmap);
        return count;
    }

    public static void dfs(TreeNode root, int runningSum, int targetSum, HashMap<Integer, Integer> hmap) {
        if (root == null) {
            return;
        }
        runningSum += root.val;
        hmap.put(runningSum, hmap.getOrDefault(runningSum, 0) + 1);
        if (targetSum == runningSum) {
            count++;
        }
        if (hmap.containsKey(runningSum - targetSum)) {
            count += hmap.get(runningSum - targetSum);
        }
        dfs(root.left, runningSum, targetSum, hmap);
        dfs(root.right, runningSum, targetSum, hmap);
        hmap.put(runningSum, hmap.get(runningSum) - 1);
    }
}
