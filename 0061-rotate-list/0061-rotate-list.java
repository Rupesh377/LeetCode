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
    public ListNode rotateRight(ListNode head, int k) {

        if (head ==null||head.next ==null ||k==0) {
            return head;
        }

        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            temp=temp.next;
            n++;    
        }
        k=k%n;
        if(k==0)
            return head;
          
        ListNode reversed = reverse(head);
        ListNode first = reversed;

        for (int i=1; i<k;i++)
            first= first.next;

        ListNode second=first.next;
        first.next = null;

        first = reverse(reversed);
        second = reverse(second);

        ListNode tail = first;

        while (tail.next!=null)
            tail = tail.next;
        tail.next = second;
        return first;
    }

    private ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;

        while (curr!=null) {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}