class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int count=0;
        int sum=0;
        HashMap<Integer , Integer> check=new HashMap<>();
        check.put(0,1);

        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(check.containsKey(sum-goal))
                count+=check.get(sum-goal);
            check.put(sum ,check.getOrDefault(sum , 0)+1);
        }
        return count;
    }
}