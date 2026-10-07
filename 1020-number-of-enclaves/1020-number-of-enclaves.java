class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++)
        {
            dfs(i ,0 , grid);
            dfs(i,m-1,grid);
        }
        for(int i=0;i<m;i++)
        {
            dfs(0,i , grid);
            dfs(n-1,i,grid);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                count+=grid[i][j];
            }
        }
        return count;
    }
    public void dfs(int i ,int j ,int arr[][])
    {
        int n=arr.length;
        int m=arr[0].length;
        if(i<0 || j<0|| i>n-1 || j>m-1 || arr[i][j]==0)
            return ;
        arr[i][j]=0;
        dfs(i,j+1,arr);
        dfs(i,j-1,arr);
        dfs(i+1,j,arr);
        dfs(i-1,j,arr);
    }
}