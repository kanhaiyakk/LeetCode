/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode meet=checkCycle(head);
        if (meet == null) return null;
        ListNode start=head;
        while(start!=meet){
            start=start.next;
            meet=meet.next;
        }
        return start;

        }
     public ListNode checkCycle(ListNode head){
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return slow;
                }
            }
            return null;
}
}