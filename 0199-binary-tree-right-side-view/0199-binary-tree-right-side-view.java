/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        View(root , ans , 0);
        return ans;   
    }
    public void View(TreeNode root , List<Integer> ans,int depth)
    {
        if(root == null)
            return;
        if(depth==ans.size())
            ans.add(root.val);
        View(root.right , ans , depth+1);
        View(root.left , ans,depth+1);
    }
}