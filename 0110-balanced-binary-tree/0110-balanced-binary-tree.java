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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        int left=Height(root.left);
        int right=Height(root.right);

        if(Math.abs(left-right)>1)
            return false;

        boolean lft=isBalanced(root.left);
        boolean rght=isBalanced(root.right);
        if(!lft || !rght)
            return false;
        return true;

    }
    public int Height(TreeNode root)
    {
        if(root==null)
            return 1;
        int left=Height(root.left);
        int right=Height(root.right);
        return 1+Math.max(left,right);
    }
}