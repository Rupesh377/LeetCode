class Solution {
    public int minMoves(int[] nums) {
        
        int minn=nums[0];
        for(int i:nums)
        {
            minn=Math.min(i,minn);
        }
        long moves=0;
        for(int i:nums)
            moves+=(long)(i-minn);
        return (int)moves;
    }
}