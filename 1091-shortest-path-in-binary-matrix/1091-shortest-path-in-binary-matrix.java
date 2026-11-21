class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1)
            return -1;

        Queue<int[]> q=new LinkedList<>();
        boolean[][]vis =new boolean[n][n];

        q.offer(new int[]{0 , 0 ,1});
        int[][] dirs = {{-1, -1},{-1, 0},{-1, 1},{0, -1},{0, 1},{1, -1},{1, 0},
        {1, 1}};

        while(!q.isEmpty())
        {
            int []cell=q.poll();
            int row=cell[0];
            int col=cell[1];
            int dist=cell[2];

            if (row==n-1 && col==n-1)
            return dist;
            
            for(int []d:dirs)
            {
                int nr=row+d[0];
                int nc=col+d[1];

                if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==0 && !vis[nr][nc])
                {
                    vis[nr][nc]=true;
                    q.offer(new int[]{nr,nc,dist+1});
                }
            }
        }
        return -1;
    }
}