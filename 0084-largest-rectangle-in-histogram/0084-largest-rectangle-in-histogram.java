class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<=n;i++)
        {
            int c= i<n? heights[i]:0;
            while(!st.isEmpty() && heights[st.peek()]>=c)
            {
                int h= heights[st.pop()];
                int w=st.isEmpty()? i: i-st.peek()-1;
                maxArea=Math.max(maxArea , w*h);
            }
            st.push(i);
        }
        return maxArea;
    }
}