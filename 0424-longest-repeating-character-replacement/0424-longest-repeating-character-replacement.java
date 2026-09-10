class Solution {
    public int characterReplacement(String s, int k) {
        
        int n=s.length();

        int freq[]=new int[26];
        int l=0,r=0,ans=0,count=0;

        for(r=0;r<n;r++)
        {
            freq[s.charAt(r)-'A']++;

            count=Math.max(count , freq[s.charAt(r)-'A']);

            while((r-l+1)-count > k){
                freq[s.charAt(l)-'A']--;
                l++;}

            ans=Math.max(ans , r-l+1);
        }
        return ans;
    }
}