class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String st="";
        int l=0;
        for(int i=0;i<n-1;i++)
        {
           char ch=s.charAt(i);
            if(ch=='(')
            {
                if(l>0)
                    st+='(';
                l++;
            }
            else
            {
                l--;
                if(l>0)
                    st+=')';
            }
        }
        return st;
    }
}