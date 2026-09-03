class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd=Integer.MAX_VALUE;
        int minEven=Integer.MAX_VALUE;

        for(int i:nums1)
        {
            if(i%2==0 )
            {
                minEven=Math.min(minEven , i);
            }
            else
            {
                minOdd=Math.min(minOdd , i);
            }
        }
        if(minOdd ==Integer.MAX_VALUE )
            return true;

        return minOdd < minEven;
    }
}