class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;


        for(int i=0;i<n;i++)
        {
            HashMap<Character,Integer> freq=new HashMap<>();
            for(int j=i;j<n;j++)
            {
                freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);

                int maxx=Integer.MIN_VALUE;
                int minn=Integer.MAX_VALUE;

                for(int k:freq.values())
                {
                    maxx=Math.max(maxx ,k);
                    minn=Math.min(minn,k);
                }
                sum+=(maxx-minn);
            }
        }
        return sum;
    }
}