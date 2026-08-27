class Solution {
    public int missingMultiple(int[] nums, int k) {

        int i=1;
        while(i!=0)
        {
            int t=i*k;
            if(!Arrays.stream(nums).anyMatch(num->num == t))
                return t;
            i++;
        }
        return i*k;
    }
}