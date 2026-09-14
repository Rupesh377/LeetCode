class Solution {
    public boolean isNStraightHand(int[] hand, int k) {
        if(hand.length %k!=0)
            return false;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:hand)
            map.put(i,map.getOrDefault(i,0)+1);

        Arrays.sort(hand);
        for(int i:hand)
        {
            if(map.get(i)!=0)
            {
                int el=i;
                int j=0;
                while(j<k)
                {
                    if(!map.containsKey(el) ||map.get(el)==0)
                        return false;
                    map.put(el, map.get(el)-1);
                    el++;
                    j++;
                }
            }
        }
        return true;
    }
}