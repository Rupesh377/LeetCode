class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;

        for(int i=0;i<nums.size();i++)
        {
            HashSet<Integer> count=new HashSet<>();
            for(int j=i;j<nums.size();j++)
            {
                count.add(nums.get(j));
                ans+=(int)Math.pow(count.size(),2);
            }
        }
        return ans;
    }
}