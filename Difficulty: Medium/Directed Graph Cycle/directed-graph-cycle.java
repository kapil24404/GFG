class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        boolean vis[]=new boolean[V];
        boolean rec[]=new boolean[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int []pair:edges){
           int u=pair[0];
           int v=pair[1];
           adj.get(u).add(v);
        }
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(DFS(adj,i,vis,rec)) return true;
            }
        }
        return false;
        
    }
    public boolean DFS(ArrayList<ArrayList<Integer>> adj,int u,boolean []vis,boolean[] rec){
     vis[u]=true;
     rec[u]=true;
     for(int v:adj.get(u)){
         if(!vis[v]){
            if(DFS(adj,v,vis,rec)) return true;
         }
         else if (rec[v]) return true;
     }
     rec[u] = false;
     return false;
    }
    
}