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
    public ListNode swapPairs(ListNode head) {
        
       ListNode temp=new ListNode(0,head);
       ListNode prev=temp , curr=head;

       while(curr!=null && curr.next!=null)
       {
            ListNode Future=curr.next.next;
            ListNode second=curr.next;

            second.next=curr;
            curr.next=Future;
            prev.next=second;

            prev=curr;
            curr=curr.next;
       }
       return temp.next; 
    }
}