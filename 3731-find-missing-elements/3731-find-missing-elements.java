class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int small=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(nums[i]);
            small=Math.min(small , nums[i]);
            largest=Math.max(largest,nums[i]);
        }

        List<Integer> ans=new ArrayList<>();
        for(int i=small;i<=largest;i++)
        {
            if(!a.contains(i))
                ans.add(i);
        }
        return ans;
    }
}