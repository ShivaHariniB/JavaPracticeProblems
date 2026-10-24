package Trees_DFS;

import java.util.ArrayList;
import java.util.List;

public class SimilarLeaf {
    public static void main(String args[]) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        System.out.println(leaf(root1, root2));
    }

    public static boolean leaf(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        collectValues(root1, list1);
        collectValues(root2, list2);
        return list1.equals(list2);
    }

    public static void collectValues(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        while (root.left == null && root.right == null) {
            list.add(root.val);
        }
        collectValues(root.left, list);
        collectValues(root.right, list);
    }
}
