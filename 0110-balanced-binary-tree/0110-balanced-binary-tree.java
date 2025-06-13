/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    // Returns the height of the subtree if balanced, else -1
    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftH = checkHeight(node.left);
        if (leftH == -1) return -1;

        int rightH = checkHeight(node.right);
        if (rightH == -1) return -1;

        if (Math.abs(leftH - rightH) > 1) return -1;

        return 1 + Math.max(leftH, rightH);
    }
}
