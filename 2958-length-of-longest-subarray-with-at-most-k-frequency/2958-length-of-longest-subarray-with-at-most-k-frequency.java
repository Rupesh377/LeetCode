class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans=0,start=-1;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            while(freq.get(nums[i])>k)
            {
                start++;
                freq.put(nums[start],freq.get(nums[start])-1);
            }
            ans=Math.max(ans , i-start);
        }
        return ans;

    }
}