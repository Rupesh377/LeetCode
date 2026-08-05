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
    public boolean hasCycle(ListNode head) {
    HashMap<ListNode , Boolean> check=new HashMap<>();

    ListNode temp=head;
    while(temp!=null)
    {
        if(check.containsKey(temp))
            return true;
        check.put(temp , true);
        temp=temp.next;
    }
    return false;
    }
}