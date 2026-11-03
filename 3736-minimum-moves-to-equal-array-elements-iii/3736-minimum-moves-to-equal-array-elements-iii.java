class Solution {
    public int minMoves(int[] nums) {
        int n=Arrays.stream(nums).max().orElseThrow(()-> new IllegalArgumentException("array"));
        int ans=0;
        for(int i : nums)
            ans+=n-i;
        return ans;
    }
}