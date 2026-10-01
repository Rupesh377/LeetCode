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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        Inorder(root , values);
        int ans=values.get(k-1);
        return ans;

    }
    public void Inorder(TreeNode node , List<Integer> values)
    {
        if(node !=null){
        Inorder(node.left, values);
        values.add(node.val);
        Inorder(node.right, values);
        }
    }
}