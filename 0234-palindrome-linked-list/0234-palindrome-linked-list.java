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

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        ListNode next=null;

        while(slow!=null)
        {
            next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }

        return CheckPalindrome(head , prev);
    }
    public Boolean CheckPalindrome(ListNode head,ListNode prev)
    {
        ListNode l1=head;
        ListNode l2=prev;

        while(l1!=null && l2!=null){
            if(l1.val!=l2.val)
                return false;
            l1=l1.next;
            l2=l2.next;
        }
        return true;
    }
}