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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode gprev=dummy;
        while(true)
        {
            ListNode kth=getKthNode(gprev,k);
            if(kth==null)
                break;
            ListNode gNext = kth.next;
            ListNode prev = gNext;
            ListNode curr = gprev.next;

            for (int i = 0;i<k; i++) {
                ListNode temp= curr.next;
                curr.next= prev;
                prev =curr;
                curr =temp;
            }
            ListNode temp =gprev.next;
            gprev.next =kth;
            gprev =temp;
        }
        return dummy.next;
    }
    private ListNode getKthNode(ListNode curr, int k) {
        while (curr!= null && k>0) {
            curr =curr.next;
            k--;
        }
        return curr;
    }
}