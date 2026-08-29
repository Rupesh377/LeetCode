class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int s1=source[0];
        int s2=source[1];
        int d1=target[0];
        int d2=target[1];

        if(s1==d1 && s2==d2)
            return -1;

        if((s1+s2)%2 != (d1+d2)%2)
                return -1;

        if(Math.abs(s1-d1)==Math.abs(s2-d2))
            return 1;
        return 2;
    }
}