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
    // public int maxDepth(TreeNode root) {
    //     if (root == null)
    //         return 0;
    //     return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    // }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        Deque<Map.Entry<TreeNode, Integer>> stack = new ArrayDeque<>();
        stack.push(Map.entry(root, 1));
        
        int res = 0;

        while (!stack.isEmpty()) {
            Map.Entry<TreeNode, Integer> current = stack.pop();
            TreeNode node = current.getKey();
            int depth = current.getValue();
            res = Math.max(res, depth);

            if (node != null) {
                if (node.left != null)
                    stack.push( Map.entry(node.left, depth + 1));
                if (node.right != null)
                    stack.push( Map.entry(node.right, depth + 1));
            }
        }

        return res;


    }
}
