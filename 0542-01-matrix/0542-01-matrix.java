class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        int arr[][]=new int[n][m];

        for (int i=0; i<n;i++) {
            Arrays.fill(arr[i], -1);
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    arr[i][j]=0;
                    q.offer(new int[]{i,j});
                }
            }
        }

        int []dx={-1,1,0,0};
        int []dy={0,0,-1,1};
        while(!q.isEmpty())
        {
            int cell[]=q.poll();
            int f=cell[0];
            int s=cell[1];
            for(int i=0;i<4;i++)
            {
                int x=f+dx[i];
                int y=s+dy[i];
                if (x>=0 && y>= 0 && x<n && y<m && arr[x][y]==-1) {
                    arr[x][y] = arr[f][s]+1;
                    q.offer(new int[]{x,y});
                }
            }
        }
        return arr;
    }
}