/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder ans=new StringBuilder();
        HelpSerialize(root , ans);
        return ans.toString();
    }
    public void HelpSerialize(TreeNode root , StringBuilder ans)
    {
        if(root == null)
        {
            ans.append("#,");
            return;
        }
        ans.append(root.val).append(",");
        HelpSerialize(root.left , ans);
        HelpSerialize(root.right , ans);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] token=data.split(",");
        int[] index={0};

        return HelpDeSerialize(token , index); 
    }
    public TreeNode HelpDeSerialize(String[] token , int[] index)
    {
        if(token[index[0]].equals("#"))
        {
            index[0]++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(token[index[0]++]));
        root.left=HelpDeSerialize(token , index);
        root.right=HelpDeSerialize(token , index);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));