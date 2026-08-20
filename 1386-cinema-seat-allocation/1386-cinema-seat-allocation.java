class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans=0;
        Arrays.sort(reservedSeats , (a,b)->
        {
            if(a[0]!=b[0])
                return Integer.compare(a[0],b[0]);
            else
                return Integer.compare(a[1],b[1]);
        });
        int row=0;
        int i=0;
        while(i<reservedSeats.length)
        {
            int r=reservedSeats[i][0];
            row+=1;

            boolean vis[]=new boolean[11];
            while(i<reservedSeats.length && reservedSeats[i][0]==r)
            {
                vis[reservedSeats[i][1]]=true;
                i++;
            }

            boolean a=true;
            boolean b=true;
            boolean c=true;

            for(int j=2;j<6;j++)
            {
                if(vis[j])
                    a=false;
            }
             for(int j=4;j<8;j++)
            {
                if(vis[j])
                    b=false;
            }
             for(int j=6;j<10;j++)
            {
                if(vis[j])
                    c=false;
            }
            if(a && c)
                ans+=2;
            else if(a || b || c)
                ans++;
        }

        row=n-row;
        ans+=(row*2);
        return ans;
    }
}