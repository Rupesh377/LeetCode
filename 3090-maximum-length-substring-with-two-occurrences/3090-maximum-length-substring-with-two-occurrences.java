class Solution {
    public int maximumLengthSubstring(String s) {
        int  n=s.length();
        int arr[]=new int[26];
        int j=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int a=s.charAt(i)-'a';
            arr[a]++;
            while(arr[a]>2)
            {
                int b=s.charAt(j)-'a';
                arr[b]--;
                j++;
            }
            ans=Math.max(ans , i-j+1);
        }
        return ans;
    }
}