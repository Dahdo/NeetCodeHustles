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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (isSameTree(node, subRoot))
                return true;
            if (node != null) {
                q.offer(node.left);
                q.offer(node.right);
            }
        }

        return false;
    }

    boolean isSameTree(TreeNode p, TreeNode q) {
        // my previous solution for Same Tree problem

        Queue<TreeNode> pQ = new LinkedList<>();
        Queue<TreeNode> qQ = new LinkedList<>();

        pQ.offer(p);
        qQ.offer(q);

        while (!pQ.isEmpty() || !qQ.isEmpty()) {
            TreeNode pNode = pQ.poll();
            TreeNode qNode = qQ.poll();

            if (pNode == null && qNode == null)
                continue;
            else if (!(pNode != null && qNode != null))
                return false;
            else {
                if (pNode.val != qNode.val)
                    return false;
                pQ.offer(pNode.left);
                pQ.offer(pNode.right);
                qQ.offer(qNode.left);
                qQ.offer(qNode.right);
            }
        }

        return true;
    }
}
