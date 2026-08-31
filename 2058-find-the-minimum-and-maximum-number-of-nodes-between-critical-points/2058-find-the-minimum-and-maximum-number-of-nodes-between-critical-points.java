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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int arr[]={-1,-1};

        ListNode prev=head;
        ListNode curr=head.next;
        int curridx=1;
        int previdx=0;
        int firstidx=0;
        int ans=Integer.MAX_VALUE;
        while(curr.next!=null)
        {
            if((curr.val<prev.val && curr.val<curr.next.val)||(curr.val>prev.val && curr.val> curr.next.val))
            {
                if(previdx==0)
                {
                    previdx=curridx;
                    firstidx=curridx;
                }
                else
                {
                    ans=Math.min(ans , curridx - previdx);
                    previdx=curridx;
                }
            }
            curridx++;
            prev=curr;
            curr=curr.next;
        }
        if(ans!=Integer.MAX_VALUE)
        {
            int maxx=previdx-firstidx;
            arr=new int[]{ans , maxx};
        }
        return arr;
    }
}