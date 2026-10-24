package Trees_DFS;

public class searchInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(searchBST(root, 2));

    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            System.out.println("value "+root.val);
            return root;
        }
        searchBST(root.left, val);
        searchBST(root.right, val);
        return null;
    }
}
