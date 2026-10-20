class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int freq[]=new int[100001];
        int maxdiff=0;
        long totalDiff=0;

        for(int i=0;i<nums1.length;i++)
        {
            int diff=Math.abs(nums1[i]-nums2[i]);
            freq[diff]++;
            totalDiff+=diff;
            maxdiff=Math.max(maxdiff , diff);
        }
        long k=(long)k1+k2;
        if(totalDiff <=k)
            return 0;
        
        for(int i=maxdiff ;i>0 && k>0 ;i--)
        {
            long move=Math.min(k,freq[i]);
            freq[i]-=move;
            freq[i-1]+=move;
            k-=move;
        }
        long ans=0;
        for(int i=0;i<=maxdiff; i++)
        {
            ans+=(long) i*i*freq[i];
        }
        return ans;
    }
}