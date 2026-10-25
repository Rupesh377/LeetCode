class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean vis[][]=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0 && !vis[i][j] && bfs(i , j , grid , n ,m , vis))
                    count++;
            }
        }
        return count;
    }
    public boolean bfs(int x , int y , int arr[][] , int n , int m , boolean vis[][])
    {
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{x,y});
        vis[x][y]=true;
        boolean isClosed=true;

        int dx[]={0,1,0,-1};
        int dy[]={-1,0,1,0};

        while(!q.isEmpty())
        {
            int curr[]=q.poll();
            x=curr[0];
            y=curr[1];
            for(int i=0;i<4;i++)
            {
                int r=x+dx[i];
                int s=y+dy[i];
                if(r<0 || r>=n || s<0 || s>=m)
                {
                    isClosed=false;
                }else if(arr[r][s]==0 && !vis[r][s])
                {
                    q.offer(new int[]{r,s});
                    vis[r][s]=true;
                }
            }
        }
        return isClosed;
    }
}