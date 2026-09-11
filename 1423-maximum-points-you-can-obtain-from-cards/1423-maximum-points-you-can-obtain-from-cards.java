class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int maxx=0,total=0;
        for(int i=0;i<k;i++)
            total+=arr[i];
        maxx=total;

        for(int i=0;i<k;i++)
        {
            total-=arr[k-1-i];
            total+=arr[n-i-1];

            maxx=Math.max(maxx , total);
        }
        return maxx;
    }
}