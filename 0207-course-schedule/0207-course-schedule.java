class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        boolean vis[]=new boolean[numCourses];
        boolean pathVis[]=new boolean[numCourses];
        for(int node=0;node<numCourses;node++)
        {
            if(!vis[node])
            {
                if(dfs(node, vis, pathVis, prerequisites))
                    return false; 
            }
        }
        return true;
    }
     public boolean dfs(int node, boolean vis[], boolean pathVis[], int[][] prerequisites)
    {
        vis[node] = true;
        pathVis[node] = true;
        for(int i=0; i<prerequisites.length; i++)
        {
            if (prerequisites[i][1]==node) {
                int neighbour = prerequisites[i][0];
                if (!vis[neighbour])
                {
                    if (dfs(neighbour, vis, pathVis, prerequisites))
                        return true;
                }
                else if (pathVis[neighbour])
                    return true;
            }
        }
        pathVis[node] = false;
        return false;
    }
}