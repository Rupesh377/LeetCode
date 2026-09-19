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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();

        if(root==null)
            return ans;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean check=true;

        while(!q.isEmpty())
        {
            int size=q.size();
            Integer[] lvl=new Integer[size];

            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                int idx= check? i:size-i-1;

                lvl[idx]=node.val;
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            check = !check;
            ans.add(Arrays.asList(lvl));
        }
        return ans;
    }
}