class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
         boolean vis[]=new boolean[adj.size()];
        ArrayList<Integer> res=new ArrayList<>();
         DFS(adj,0,vis,res);
         return res;
        
    }
    public static void DFS(ArrayList<ArrayList<Integer>> adj,int u,boolean vis[],ArrayList<Integer> res){
        if(vis[u]) return ;
        vis[u]=true;
        res.add(u);
        for(int v:adj.get(u)){
            if(!vis[v]){
                DFS(adj,v,vis,res);
            }
        }
    }
}