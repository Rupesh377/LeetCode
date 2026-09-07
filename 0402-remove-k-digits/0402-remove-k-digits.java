class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();

        Stack<Character> ans=new Stack<>();

        for(int i=0;i<n;i++)
        {
            char ch=num.charAt(i);
            while(!ans.isEmpty() && k>0 && ans.peek()>ch)
            {
                k--;
                ans.pop();
            }
            ans.push(ch);
        }
        while(k>0)
        {
            k--;
            ans.pop();
        }
        if(ans.isEmpty())
            return "0";

        StringBuilder st= new StringBuilder();
        while(!ans.isEmpty())
        {
            st.append(ans.pop());
        }

        while(st.length()>0 && st.charAt(st.length()-1)=='0')
            st.deleteCharAt(st.length()-1);
        
        st.reverse();
        if (st.length() == 0) 
            return "0";
        return st.toString();
    }
}