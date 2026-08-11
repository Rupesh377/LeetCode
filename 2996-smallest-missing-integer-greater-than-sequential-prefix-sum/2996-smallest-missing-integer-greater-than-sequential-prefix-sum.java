class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;

        HashSet<Integer> check=new HashSet<>();
        for(int i:nums)
        {
                check.add(i);
        }
        int sum=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1]+1)
                sum+=nums[i];
            else
                break;
        }
       while(check.contains(sum))
            sum++;
        return sum;
    }
}