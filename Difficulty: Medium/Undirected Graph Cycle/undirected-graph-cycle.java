class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int pair[]:edges){
            int u=pair[0];
            int v=pair[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(DFS(adj,i,vis,-1)) return true;
            }
        }
        return false;
    }
    public static boolean DFS(ArrayList<ArrayList<Integer>> adj,int u,boolean vis[],int parent){
        if(vis[u]) return false;
        vis[u]=true;
        for(int v:adj.get(u)){
            if(!vis[v]){
               if(DFS(adj,v,vis,u)) return true;
            }
            else if(v!=parent) return true;
        }
        return false;
    }
}