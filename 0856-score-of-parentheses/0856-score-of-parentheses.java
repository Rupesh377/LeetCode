class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int count=0;
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(0);
            }
            else
            {
                int c=st.pop();
                st.push(st.pop()+Math.max(1,2*c));
            }
        }
        return st.peek();
    }
}