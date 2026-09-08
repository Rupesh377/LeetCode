class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length ==0)
            return 0;

        int m=matrix[0].length;
        int height[]=new int[m];
        int maxArea=0;

        for(char row[] : matrix)
        {
            for(int i=0;i<m;i++)
            {
                if(row[i]=='1')
                    height[i]++;
                else 
                    height[i]=0;
            }
            maxArea=Math.max(maxArea , LargestRectangle(height));
        }
        return maxArea;
    }
    public int LargestRectangle(int height[])
    {
        Stack<Integer> st=new Stack();
        int newheight[]=Arrays.copyOf(height , height.length+1);
        int n=newheight.length;
        int maxArea=0;
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && newheight[st.peek()] >newheight[i])
            {
                int h=newheight[st.pop()];
                int width= st.isEmpty() ? i: i-st.peek()-1;
                maxArea=Math.max(maxArea , width*h); 
            }
            st.push(i);
        }
        return maxArea;
    }
}