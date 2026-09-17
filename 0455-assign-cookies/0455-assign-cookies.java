class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;

        Arrays.sort(g);
        Arrays.sort(s);
        int st=0,ck=0;
        while(st<n && ck<m)
        {
            if(g[st]<=s[ck])
                st++;
            ck++;
        }
        return st;
    }
}