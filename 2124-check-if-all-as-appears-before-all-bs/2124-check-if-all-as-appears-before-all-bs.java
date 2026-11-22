class Solution {
    public boolean checkString(String s) {
        int Atotal=0;
        int Acount=0;
        int b=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')
            {
                Atotal++;
            }
        }
        if(Atotal==0)
            return true;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' && b==0)
            {
                Acount++;
            }
            else 
            {
                b++;
            }
        }
        if(Acount==Atotal)
            return true;
        else
            return false;
    }
}