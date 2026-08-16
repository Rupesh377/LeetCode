class Solution {
    public int longestSubsequence(int[] nums) {
        int ans=0;
        boolean check=true;

        for(int i:nums)
        {
            ans^=i;
            if(ans>0)
                check=false;
        }
        if(ans>0)
            return nums.length;
        
        if(check)
            return 0;
        return nums.length-1;
    }
}