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
    int maxCount = 0;
    int count = 0;
    public int maxDepth(TreeNode root) {
        dfs(root);
        return maxCount;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            maxCount = Math.max(maxCount, count);
            return;
        }
        count++;

        dfs(root.left);
        dfs(root.right);
        count--;
    }
}
