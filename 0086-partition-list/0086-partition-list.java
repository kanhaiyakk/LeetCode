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
    public ListNode partition(ListNode head, int x) {
        ListNode beforeX=new ListNode(0);
        ListNode afterX=new ListNode(0);

        ListNode before=beforeX;
        ListNode after=afterX;
        while(head!=null){
            if(head.val<x){
                before.next=head;
                before=before.next;
            }else{
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
        after.next=null;
        before.next=afterX.next;

        return beforeX.next;
    }
}