class Solution {
    public int[][] insert(int[][] interval, int[] newInterval) {
        List<int []> result=new ArrayList<>();
        int i=0;
        int n=interval.length;
        int start=newInterval[0];
        int end=newInterval[1];

        while(i<n && start >interval[i][1])
        {
            result.add(interval[i]);
            i++;
        }
        while(i<n && end>=interval[i][0])
        {
            start=Math.min(start , interval[i][0]);
            end=Math.max(end,interval[i][1]);
            i++;
        }
        result.add(new int[]{start,end});
        while(i<n)
        {
            result.add(interval[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}