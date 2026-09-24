/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();

        if(root==null)
            return ans;
        Map<TreeNode , List<TreeNode>> graph = new HashMap<>();
        buildGraph(root , graph);

        Queue<TreeNode> nodeQueue=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();
        nodeQueue.offer(target);

        visited.add(target);
        int curr=0;
        while(!nodeQueue.isEmpty())
        {
            if(curr==k)
                break;
            int size=nodeQueue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=nodeQueue.poll();
                for(TreeNode neighbour : graph.getOrDefault(node ,Collections.emptyList()))
                {
                    if(!visited.contains(neighbour))
                    {
                        visited.add(neighbour);
                        nodeQueue.offer(neighbour);
                    }
                } 
            }
            curr++;
        }
        while(!nodeQueue.isEmpty())
        {
            ans.add(nodeQueue.poll().val);
        }
        return ans;
    }

    private void buildGraph(TreeNode node , Map<TreeNode,List<TreeNode>> graph)
    {
        if(node == null)
            return;
        if(node.left!=null)
        {
            graph.computeIfAbsent(node , key ->new ArrayList<>()).add(node.left);
            graph.computeIfAbsent(node.left , key ->new ArrayList<>()).add(node);
            buildGraph(node.left , graph);
        }
        if(node.right!=null)
        {
            graph.computeIfAbsent(node , key ->new ArrayList<>()).add(node.right);
            graph.computeIfAbsent(node.right , key ->new ArrayList<>()).add(node);
            buildGraph(node.right , graph);
        }
    }
}