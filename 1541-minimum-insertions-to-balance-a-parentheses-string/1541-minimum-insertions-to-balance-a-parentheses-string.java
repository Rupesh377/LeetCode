class Solution {
    public int minInsertions(String s) {
        int insert=0;
        int left=0;
        int l=s.length();
        int i=0;

        while(i < l)
        {
            if(s.charAt(i)=='(')
            {
                left++;
                i++;
            }
            else
            {
                if(left>0)
                    left--;
                else
                    insert++;
                if(i < l-1 && s.charAt(i+1)==')')
                    i+=2;
                else
                {
                    insert++;
                    i++;
                }
            }
        }
        insert+=left*2;
        return insert;
    }
}