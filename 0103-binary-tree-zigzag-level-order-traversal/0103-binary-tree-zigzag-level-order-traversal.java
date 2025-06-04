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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean leftToRight=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>(size);
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                if(leftToRight){
                    list.add(curr.val); //add at the lase of the list
                }else{
                    list.add(0,curr.val); // add at the begenning of list so it will be reversed
                }
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            result.add(list);
            leftToRight= !leftToRight;
        }
        return result;
    }
}