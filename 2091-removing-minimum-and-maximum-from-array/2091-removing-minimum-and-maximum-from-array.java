class Solution {
    public int minimumDeletions(int[] nums) {
        
        int n=nums.length;
        if(n==1)
            return 1;

        int smallest=0, largest=0;
        int s=Integer.MAX_VALUE;
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<s)
            {
                s=nums[i];
                smallest=i;
            }
            if(nums[i]>l)
            {
                l=nums[i];
                largest=i;
            }
        }

        int la= Math.min(largest , smallest);
        int sa=Math.max(largest , smallest);

        return Math.min(Math.min(sa+1, n-la),la+1+n-sa);
    }
}