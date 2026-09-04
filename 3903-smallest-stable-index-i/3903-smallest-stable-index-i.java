class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int mini=nums[i];
            int maxi=nums[i];
            for(int j=0;j<i;j++)
            {
                maxi=Math.max(maxi,nums[j]);
            }
            for(int j=i+1;j<n;j++)
            {
                mini=Math.min(mini,nums[j]);
            }
            int diff=maxi-mini;
            if(diff <= k)
                return i;
        }
        return -1;
    }
}