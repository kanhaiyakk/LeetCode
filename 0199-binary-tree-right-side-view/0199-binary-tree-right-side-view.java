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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        rightView(root, list,0);
        return list;
         
    }
    public static void rightView(TreeNode curr, List<Integer> list, int maxDepth){
        if(curr==null) return;
        if(maxDepth == list.size()){
            list.add(curr.val);
        }
        rightView(curr.right, list,maxDepth+1);
        rightView(curr.left, list, maxDepth+1);
    }
}