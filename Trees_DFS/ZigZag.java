package Trees_DFS;

public class ZigZag {
    int maxCount = 0;

    public static void main(String args[]) {


        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(1);
        root.right.right.left.left = new TreeNode(1);
        root.right.right.left.left.right = new TreeNode(1);
        System.out.println(zigZag(root));

    }

    public static int zigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root.left, true, 1);
        dfs(root.right, false, 1);

        return 0;
//        return maxCount;
    }

    public static int dfs(TreeNode root, boolean direction, int count) {
        if (root == null) {
            return 0;
        }
//        maxCount= Math.max(maxCount,count);
        if (direction) {
            dfs(root.right, false, count + 1);
            dfs(root.left, true, 1);
        } else {
            dfs(root.left, true, count + 1);
            dfs(root.right, false, 1);
        }
return 0;
    }

}
