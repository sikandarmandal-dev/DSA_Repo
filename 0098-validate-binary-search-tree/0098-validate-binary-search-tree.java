/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && getMax(root.left) >= root.val) {
            return false;
        }

        if (root.right != null && getMin(root.right) <= root.val) {
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }

    private int getMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        return Math.max(root.val,
                Math.max(getMax(root.left), getMax(root.right)));
    }

    private int getMin(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        return Math.min(root.val,
                Math.min(getMin(root.left), getMin(root.right)));
    }
}