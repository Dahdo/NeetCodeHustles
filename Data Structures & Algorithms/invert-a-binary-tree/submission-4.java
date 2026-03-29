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

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // 1. Recurse first and CAPTURE the returned values
        TreeNode invertedLeft = invertTree(root.left);
        TreeNode invertedRight = invertTree(root.right);

        // 2. Use those returned values to update the current root
        root.left = invertedRight;
        root.right = invertedLeft;

        // 3. Return the newly updated subtree back up the chain
        return root;
    }
}