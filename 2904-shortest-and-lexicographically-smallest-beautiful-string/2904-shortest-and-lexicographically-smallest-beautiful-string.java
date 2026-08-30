class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int total=0;
        for(int i=0;i<s.length();i++)
        {
            total+=s.charAt(i)-'0';
        }
        if(total<k)
            return "";

        int l=0,r=0;
        int count=0;
        String ans=s;

        for(r=0;r<s.length();r++)
        {
            count+=s.charAt(r)-'0';
            while(count>k || s.charAt(l)=='0')
            {
                count-=s.charAt(l++)-'0';
            }
            if(count==k)
            {
                String t=s.substring(l,r+1);
                if(t.length()<ans.length()||(t.length()==ans.length() &&
                 t.compareTo(ans)<0)){
                    ans=t;}
            }
        }
        return ans;
    }
}