class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int maxLen = 0;

        if (n <= 1)
            return s;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    public boolean isPalindrome(String s, int i, int j) {
        int l = i;
        int r = j;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}