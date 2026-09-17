class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        int minn=0;
        int maxx=0;

        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                maxx++;
                minn++;
            }
            else if(ch==')')
            {
                maxx--;
                minn--;
            }
            else
            {
                maxx++;
                minn--;
            }
            if(maxx<0)
                return false;
            if(minn < 0)
                minn=0; 
        }
        if(minn == 0)
            return true;
        return false;
    }
}