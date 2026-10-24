package Trees_DFS;

public class GoodNode {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);  // Left subtree
        root.right.left = new TreeNode(1); // Right subtree
        root.right.right = new TreeNode(5);

        System.out.println(nodeCount(root));
    }

    public static int nodeCount(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, root.val);
    }

    public static int dfs(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        max = Math.max(max, root.val);
        if (root.val >= max) {
            return 1 + dfs(root.left, max) + dfs(root.right, max);
        } else {
            return dfs(root.left, max) + dfs(root.right, max);
        }
    }
}
