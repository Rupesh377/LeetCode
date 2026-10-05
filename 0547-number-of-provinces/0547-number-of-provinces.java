class Solution {
    public int findCircleNum(int[][] arr) {
        int n=arr.length;
        boolean vis[]=new boolean[n];
        int count=0;

        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                count++;
                dfs(i , arr , vis);
            }
        }
        return count;
    }
    public void dfs(int ind , int arr[][] , boolean[] vis)
    {
        vis[ind]=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[ind][i]==1 && !vis[i])
                dfs(i , arr , vis);
        }
    }
}