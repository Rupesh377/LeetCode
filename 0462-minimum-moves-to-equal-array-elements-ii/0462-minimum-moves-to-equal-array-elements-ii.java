class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int m=nums[nums.length/2];
        long ans=0;
        for(int num:nums)
            ans+=Math.abs(num-m);
        return (int) ans;
    }
}