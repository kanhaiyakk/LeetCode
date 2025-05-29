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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        List<Integer> oddIndex=new ArrayList<>();
        List<Integer> evenIndex=new ArrayList<>();
        ListNode temp=head;
        int index=1;
        while(temp!=null){
            if(index%2==1){
                oddIndex.add(temp.val);
            }else{
                evenIndex.add(temp.val);
            }
            temp=temp.next;
            index++;
        }
        int i=0;
        temp=head;
        for(int num:oddIndex){
            temp.val=num;
            temp=temp.next;
        }
        for(int num:evenIndex){
            temp.val=num;
            temp=temp.next;
        }
            return head;
    }
}