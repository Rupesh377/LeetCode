class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length %k!= 0)
            return false;
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i , map.getOrDefault(i,0)+1);
        }
        Arrays.sort(nums);
        for(int ele:nums){
            if(map.get(ele)!= 0){
                
                int cnt= ele;
                int i =0;
                while(i <k)
                {
                    if(!map.containsKey(cnt) || map.get(cnt) == 0)
                        return false;
                    map.put(cnt, map.get(cnt) - 1);
                    i++;
                    cnt++;
                }
            }
        }
        return true;
    }
}