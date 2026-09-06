class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n=arr.length;

        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
                ans.add(arr[i]);
            else
            {
                while(!ans.isEmpty() && ans.get(ans.size()-1)>0 &&
                    ans.get(ans.size()-1)<Math.abs(arr[i]))
                {
                    ans.remove(ans.size()-1);
                }
                if(!ans.isEmpty() && ans.get(ans.size()-1)== Math.abs(arr[i]))
                    ans.remove(ans.size()-1);
                else if(ans.isEmpty() || ans.get(ans.size()-1)<0)
                    ans.add(arr[i]);
            }
        }
        int an[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
            an[i]=ans.get(i);
        return an;
    }
}