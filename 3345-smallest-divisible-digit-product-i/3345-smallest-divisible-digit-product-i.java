class Solution {
    public int smallestNumber(int n, int t) {
        while(!Check(n,t))
            n++;
        return n;   
    }
    private boolean Check(int n ,int t)
    {
        int p=1;
        while(n>0)
        {
            p*=n%10;
            n=n/10;
            if(p==0)
                break;
        }
        return p%t==0;
    }
}