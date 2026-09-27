class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Integer> st=new Stack<>();
        StringBuilder ans=new StringBuilder();

        for(char ch : s.toCharArray())
        {
            if(ch=='(')
                st.push(ans.length());
            else if(ch== ')')
            {
                int start=st.pop();
                Reverse(ans , start , ans.length()-1);
            }
            else
                ans.append(ch);
        }
        return ans.toString();
    }
    public void Reverse(StringBuilder s , int start , int end)
    {
        while(start<end)
        {
            char t=s.charAt(start);
            s.setCharAt(start++ , s.charAt(end));
            s.setCharAt(end-- , t);
        }
    }
}