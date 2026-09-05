class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n];
        arr[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            arr[i]=Math.min(arr[i+1],nums[i]);
        }
        int maxx=0;
        for(int i=0;i<n;i++)
        {
            maxx=Math.max(maxx,nums[i]);
            if(maxx-arr[i]<=k)
                return i;
        }
        return -1;
    }
}