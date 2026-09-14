class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch :tasks)
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int count : map.values())
            maxHeap.add(count);

        int time=0;
        while(!maxHeap.isEmpty())
        {
            int cycle=n+1;
            int i=0;
            List<Integer> temp=new ArrayList<>();
            while(i<cycle && !maxHeap.isEmpty())
            {
                int count=maxHeap.poll();
                count--;

                if(count>0)
                    temp.add(count);
                time++;
                i++;
            }
            for(int r: temp)
            {
                maxHeap.add(r);
            }

            if(!maxHeap.isEmpty())
            {
                time+=(cycle-i);
            }
        }
        return time;
    }
}