/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode fast=head, slow=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=reverseHalf(slow);
        ListNode firstHalf=head;

        while(secondHalf!=null){
            if(firstHalf.val != secondHalf.val) return false;
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }
    public static ListNode reverseHalf(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }
}