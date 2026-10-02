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
class BSTIterator {

    private ArrayList<Integer> sortedTree;
    private int idx;

    public void Inorder(TreeNode root)
    {
        if(root==null)
            return;
        
        Inorder(root.left);
        sortedTree.add(root.val);
        Inorder(root.right);
    }
    public BSTIterator(TreeNode root) {
        sortedTree=new ArrayList<>();
        idx=0;
        Inorder(root);
    }
    
    public int next() {
        int a=sortedTree.get(idx);
        idx++;
        return a;
    }
    
    public boolean hasNext() {
        return idx < sortedTree.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */