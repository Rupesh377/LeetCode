class Solution {
    public int totalFruit(int[] fruits) {
        int ans=0;
        int last=-1;
        int secondlast=-1;
        int curr=0,laststreak=0;
        for(int fruit:fruits)
        {
            if(fruit == last || fruit == secondlast)
                curr++;
            else
                curr=laststreak+1;
            
            if(fruit == last)
                laststreak++;
            else
            {
                secondlast=last;
                last=fruit;
                laststreak=1;
            }
            ans=Math.max(ans , curr);
        }
        return ans;
    }
}