// class Solution {
//     public String shortestBeautifulSubstring(String s, int k) {
//         int total=0;
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)=='1')
//                 total++;
//         }
//         if(total<k)
//             return "";

//         int l=0,r=0;
//         int count=0;
//         String ans=s;

//         for(r=0;r<s.length();r++)
//         {
//             if(s.charAt(r)=='1')
//                 count++;
//             while(count>k || s.charAt(l)=='0')
//             {
//                 count-=s.charAt(l++)-'0';
                
//                 if(count==k)
//                 {
//                     String t=s.substring(l,r+1);
//                     if(t.length()<ans.length()||(t.length()==ans.length() &&
//                      t.compareTo(ans)<0)){
//                         ans=t;}
//                 }
//             }
//         }
//         return ans;
//     }
// }
class Solution {

    public String shortestBeautifulSubstring(String s, int k) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) total += s.charAt(i) - '0';
        if (total < k) return "";
        String ans = s;
        int cnt = 0,
            left = 0;
        for (int right = 0; right < s.length(); right++) {
            cnt += s.charAt(right) - '0';
            while (cnt > k || s.charAt(left) == '0') {
                cnt -= s.charAt(left++) - '0';
            }
            if (cnt == k) {
                String t = s.substring(left, right + 1);
                if (
                    t.length() < ans.length() ||
                    (t.length() == ans.length() && t.compareTo(ans) < 0)
                ) {
                    ans = t;
                }
            }
        }
        return ans;
    }
}