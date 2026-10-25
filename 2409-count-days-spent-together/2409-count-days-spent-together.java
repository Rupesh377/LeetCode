class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int dates[]={31,28,31,30,31,30,31,31,30,31,30,31};

        int prefix[]=new int[13];
        for(int i=0;i<12;i++)
        {
            prefix[i+1]=prefix[i]+dates[i];
        }

        int arrAl=CalculateDays(arriveAlice,prefix);
        int levAl=CalculateDays(leaveAlice,prefix);
        int arrbo=CalculateDays(arriveBob,prefix);
        int levbo=CalculateDays(leaveBob,prefix);

        return Math.max(0 , Math.min(levAl , levbo) -Math.max(arrAl , arrbo)+1);
    }
    private int CalculateDays(String day, int[] prefixSum) {
        int month = Integer.parseInt(day.substring(0, 2));
        int date = Integer.parseInt(day.substring(3));
        return prefixSum[month - 1] + date;
    }
}