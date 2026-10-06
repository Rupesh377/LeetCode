class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    traverse(grid,i,j,m,n);
                }
            }
        }
        return count;
    }
    public void traverse(char [][]arr , int i , int j , int m ,int n)
    {
        if(i>=n || j>=m || i<0 || j<0 || arr[i][j]=='0')
            return;
        
        arr[i][j]='0';
        traverse(arr , i , j+1 , m ,n);
        traverse(arr, i+1 , j , m , n);
        traverse(arr , i , j-1 , m ,n);
        traverse(arr, i-1 , j , m , n);
    }
}