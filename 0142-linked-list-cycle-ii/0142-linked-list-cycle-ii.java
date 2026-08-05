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

        HashSet<ListNode> check=new HashSet<>();
        ListNode temp=head;
        int index=0;
        while(temp!=null)
        {
            if(check.contains(temp))
                return temp;
            check.add(temp);
            temp=temp.next;
            index++;
        }
        return null;
    }
}