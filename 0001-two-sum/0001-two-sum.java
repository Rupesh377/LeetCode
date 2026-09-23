class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> ans=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int s=target-nums[i];
            if(ans.containsKey(s))
                return new int[]{ans.get(s),i};

            else
                ans.put(nums[i],i);
        }
        return new int[]{};
    }
}