/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA=headA;
        ListNode currB=headB;
        Map<ListNode,Integer> map=new HashMap<>();
        while(currA!=null){
            map.put(currA,map.getOrDefault(currA,0)+1);
            currA=currA.next;
        }
        while(currB!=null){
            if(map.containsKey(currB)){
                return currB;
            }
            currB=currB.next;
        }
        return null;
    }
}