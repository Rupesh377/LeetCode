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
    class Node {
        TreeNode node;
        int idx;
        Node(TreeNode node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(root ,0));
        int max=0;

        while(!q.isEmpty())
        {
            int size=q.size();
            int s=0;int e=0;
            for(int i=0;i<size;i++)
            {
                Node eachNode=q.remove();
                int index=eachNode.idx;
                if(i==0)
                    s=index;
                if(i==size-1)
                    e=index;

                if(eachNode.node.left!=null)
                    q.add(new Node(eachNode.node.left, 2*eachNode.idx));

                if(eachNode.node.right!=null)
                    q.add(new Node(eachNode.node.right, 2*eachNode.idx+1));
            }
            max=Math.max(max,e-s+1);
        }
        return max;
    }
}