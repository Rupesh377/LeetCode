class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int ans[]=new int[n];

        for(int i=n*2-1 ;i>=0;i--)
        {
            int index=i%n;
            int curr=nums[index];

            while(!st.isEmpty()  && st.peek()<=curr)
                st.pop();
            if(i<n)
            {
                if(st.isEmpty())
                    ans[i]=-1;
                else
                    ans[i]=st.peek();
            }
            st.push(curr);
        }
        return ans;
    }
}