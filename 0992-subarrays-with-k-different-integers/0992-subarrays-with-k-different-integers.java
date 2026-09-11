class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int subWithMaxK = Most(nums, k);
        int reducedSubWithMaxK = Most(nums, k - 1);
        return subWithMaxK - reducedSubWithMaxK;
        
    }
    public int Most(int nums[] , int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                    map.remove(nums[l]);
                l++;
            }
            count+=i-l+1;
        }
        return count;
    }
}