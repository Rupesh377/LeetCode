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

        int diff=Diff(headA , headB);

        if(diff<0)
        {
            while(diff++ !=0)
                headB=headB.next;
        }
        else
        {
            while(diff-- !=0)
                headA=headA.next;
        }
        while(headA!=null)
        {
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
     public int Diff(ListNode head1, ListNode head2) {
        int len1=0,len2=0;
        while (head1 !=null ||head2 !=null) {
            if (head1!=null) {
                len1++;
                head1=head1.next;
            }
            if (head2!=null) {
                len2++;
                head2=head2.next;
            }
        }
        return len1-len2;
    }
}