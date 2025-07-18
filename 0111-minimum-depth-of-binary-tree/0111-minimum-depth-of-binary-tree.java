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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int lh=minDepth(root.left);
        int rh=minDepth(root.right);
        if (root.left == null || root.right == null) {
            return 1 + lh + rh;  // One of them is 0, so return the non-zero depth + 1
        }
        return 1+Math.min(lh,rh);
    }
}